package aurora.cesium.element.property;

import aurora.cesium.language.writer.CartographicExtent;
import aurora.cesium.language.writer.RectangleCoordinatesCesiumWriter;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public class DefaultCartographicExtentProperty implements CartographicExtentProperty {

    private CartographicExtent extent;

    public DefaultCartographicExtentProperty(CartographicExtent extent) {
        this.extent = extent;
    }

    @Override
    public void dispatchWsen(RectangleCoordinatesCesiumWriter writer) {
        Optional.ofNullable(extent).ifPresent(writer::writeWsen);
    }

    @Override
    public void dispatchWsenDegrees(RectangleCoordinatesCesiumWriter writer) {
        Optional.ofNullable(extent).ifPresent(writer::writeWsenDegrees);
    }

    public CartographicExtent getExtent() {
        return extent;
    }

    public void setExtent(CartographicExtent extent) {
        this.extent = extent;
    }
}
