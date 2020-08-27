package aurora.cesium.element.property;

import aurora.cesium.language.writer.CartographicExtent;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.RectangleCoordinatesCesiumWriter;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public class DefaultCartographicExtentProperty extends SingleTimeBasedPropertyAdapter<CartographicExtent, CartographicExtentProperty> implements CartographicExtentProperty {

    public DefaultCartographicExtentProperty(CartographicExtent instance) {
        super(instance);
    }

    public DefaultCartographicExtentProperty(List<JulianDate> dates, List<CartographicExtent> instances) {
        super(dates, instances);
    }

    public DefaultCartographicExtentProperty(List<JulianDate> dates, List<CartographicExtent> instances, Integer startIndex, Integer length) {
        super(dates, instances, startIndex, length);
    }

    @Override
    public void dispatchWsen(RectangleCoordinatesCesiumWriter writer) {
        dispatchConsumer(writer::writeWsen, writer::writeWsen, writer::writeWsen);
    }

    @Override
    public void dispatchWsenDegrees(RectangleCoordinatesCesiumWriter writer) {
        dispatchConsumer(writer::writeWsenDegrees, writer::writeWsenDegrees, writer::writeWsenDegrees);
    }

    public CartographicExtent getExtent() {
        return instance;
    }

    public void setExtent(CartographicExtent extent) {
        this.instance = extent;
    }

    public List<CartographicExtent> getExtents() {
        return instances;
    }

    public void setExtents(List<CartographicExtent> extents) {
        this.instances = extents;
    }
}
