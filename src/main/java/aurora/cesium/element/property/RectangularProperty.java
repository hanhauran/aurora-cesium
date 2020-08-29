package aurora.cesium.element.property;

import aurora.cesium.language.writer.Rectangular;
import aurora.cesium.language.writer.advanced.ICesiumCartesian2ValuePropertyWriter;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface RectangularProperty extends Property {

    static RectangularProperty from(Rectangular rectangular) {
        return newBuilder().withValue(rectangular).build();
    }

    static RectangularPropertyImpl.Builder newBuilder() {
        return RectangularPropertyImpl.Builder.newBuilder();
    }

    void dispatchWithoutClose(ICesiumCartesian2ValuePropertyWriter writer);
}
