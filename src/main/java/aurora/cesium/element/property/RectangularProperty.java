package aurora.cesium.element.property;

import aurora.cesium.language.writer.Rectangular;
import aurora.cesium.language.writer.advanced.ICesiumCartesian2ValuePropertyWriter;

import java.util.function.Supplier;

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
