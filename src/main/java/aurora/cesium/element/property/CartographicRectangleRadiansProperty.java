package aurora.cesium.element.property;

import aurora.cesium.language.writer.CartographicExtent;
import aurora.cesium.language.writer.advanced.ICesiumCartographicRectangleRadiansValuePropertyWriter;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public interface CartographicRectangleRadiansProperty extends Property<ICesiumCartographicRectangleRadiansValuePropertyWriter> {

    static CartographicRectangleRadiansProperty from(CartographicExtent extent) {
        return newBuilder().withValue(extent).build();
    }

    static CartographicRectangleRadiansPropertyImpl.Builder newBuilder() {
        return CartographicRectangleRadiansPropertyImpl.Builder.newBuilder();
    }

    @Override
    void dispatchWithoutClose(ICesiumCartographicRectangleRadiansValuePropertyWriter writer);
}
