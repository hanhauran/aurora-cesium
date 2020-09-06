package aurora.cesium.element.property;

import cesiumlanguagewriter.Rectangular;
import cesiumlanguagewriter.advanced.ICesiumCartesian2ValuePropertyWriter;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface RectangularProperty extends Property<ICesiumCartesian2ValuePropertyWriter> {

    static RectangularProperty from(Rectangular rectangular) {
        return newBuilder().withValue(rectangular).build();
    }

    static RectangularPropertyImpl.Builder newBuilder() {
        return RectangularPropertyImpl.Builder.newBuilder();
    }

    @Override
    void dispatchWithoutClose(ICesiumCartesian2ValuePropertyWriter writer);
}
