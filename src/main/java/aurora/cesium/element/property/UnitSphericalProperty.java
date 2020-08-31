package aurora.cesium.element.property;

import aurora.cesium.language.writer.UnitSpherical;
import aurora.cesium.language.writer.advanced.ICesiumUnitSphericalValuePropertyWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface UnitSphericalProperty extends Property<ICesiumUnitSphericalValuePropertyWriter> {

    static UnitSphericalProperty from(UnitSpherical unitSpherical) {
        return newBuilder().withValue(unitSpherical).build();
    }

    static UnitSphericalPropertyImpl.Builder newBuilder() {
        return UnitSphericalPropertyImpl.Builder.newBuilder();
    }

    @Override
    void dispatchWithoutClose(ICesiumUnitSphericalValuePropertyWriter writer);
}
