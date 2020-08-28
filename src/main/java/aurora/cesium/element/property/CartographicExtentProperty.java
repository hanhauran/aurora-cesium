package aurora.cesium.element.property;

import aurora.cesium.language.writer.CartographicExtent;
import aurora.cesium.language.writer.RectangleCoordinatesCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public interface CartographicExtentProperty extends Property {

    static CartographicExtentProperty from(CartographicExtent extent) {
        return newBuilder().withValue(extent).build();
    }

    static DefaultCartographicExtentProperty.Builder newBuilder() {
        return DefaultCartographicExtentProperty.Builder.newBuilder();
    }

    void dispatchWsen(RectangleCoordinatesCesiumWriter writer);

    void dispatchWsenDegrees(RectangleCoordinatesCesiumWriter writer);
}
