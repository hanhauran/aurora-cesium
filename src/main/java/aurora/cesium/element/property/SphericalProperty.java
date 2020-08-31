package aurora.cesium.element.property;

import aurora.cesium.language.writer.Spherical;
import aurora.cesium.language.writer.advanced.ICesiumSphericalValuePropertyWriter;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public interface SphericalProperty extends Property<ICesiumSphericalValuePropertyWriter> {

    static SphericalProperty from(Spherical spherical) {
        return newBuilder().withValue(spherical).build();
    }

    static SphericalPropertyImpl.Builder newBuilder() {
        return SphericalPropertyImpl.Builder.newBuilder();
    }

    @Override
    void dispatchWithoutClose(ICesiumSphericalValuePropertyWriter iCesiumSphericalValuePropertyWriter);
}
