package aurora.cesium.element.property;

import aurora.cesium.language.writer.RectangleCoordinatesCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public class DefaultRectangleCoordinatesProperty implements RectangleCoordinatesProperty {

    private CartographicExtentProperty wsen;

    private CartographicExtentProperty wsenDegrees;

    private Interpolations interpolations;

    private TimeInterval interval;

    private List<RectangleCoordinatesProperty> intervals;

    private Reference reference;

    @Override
    public void dispatch(RectangleCoordinatesCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getWsen()).ifPresent(cartographicExtentProperty -> cartographicExtentProperty.dispatchWsen(writer));
            Optional.ofNullable(getWsenDegrees()).ifPresent(cartographicExtentProperty -> cartographicExtentProperty.dispatchWsenDegrees(writer));
            dispatchInterpolations(writer);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    @Override
    public CartographicExtentProperty getWsen() {
        return wsen;
    }

    public void setWsen(CartographicExtentProperty wsen) {
        this.wsen = wsen;
    }

    @Override
    public CartographicExtentProperty getWsenDegrees() {
        return wsenDegrees;
    }

    public void setWsenDegrees(CartographicExtentProperty wsenDegrees) {
        this.wsenDegrees = wsenDegrees;
    }

    @Override
    public Interpolations getInterpolations() {
        return interpolations;
    }

    public void setInterpolations(Interpolations interpolations) {
        this.interpolations = interpolations;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<RectangleCoordinatesProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<RectangleCoordinatesProperty> intervals) {
        this.intervals = intervals;
    }

    @Override
    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }
}
