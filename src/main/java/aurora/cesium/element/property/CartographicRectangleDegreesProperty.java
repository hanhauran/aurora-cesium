package aurora.cesium.element.property;

import cesiumlanguagewriter.CartographicExtent;
import cesiumlanguagewriter.advanced.ICesiumCartographicRectangleDegreesValuePropertyWriter;

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
