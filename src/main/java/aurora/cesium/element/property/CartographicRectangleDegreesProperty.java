package aurora.cesium.element.property;

import aurora.cesium.language.writer.CartographicExtent;
import aurora.cesium.language.writer.advanced.ICesiumCartographicRectangleDegreesValuePropertyWriter;

import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public interface CartographicRectangleDegreesProperty extends Property<ICesiumCartographicRectangleDegreesValuePropertyWriter> {

    static CartographicRectangleDegreesProperty from(CartographicExtent extent) {
        return newBuilder().withValue(extent).build();
    }

    static CartographicRectangleDegreesPropertyImpl.Builder newBuilder() {
        return CartographicRectangleDegreesPropertyImpl.Builder.newBuilder();
    }

    @Override
    void dispatchWithoutClose(ICesiumCartographicRectangleDegreesValuePropertyWriter writer);
}
