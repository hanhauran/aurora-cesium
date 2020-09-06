package aurora.cesium.element.property;

import cesiumlanguagewriter.RectangleCoordinatesCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
class RectangleCoordinatesPropertyImpl extends PropertyAdapter<RectangleCoordinatesProperty> implements RectangleCoordinatesProperty {

    private CartographicRectangleRadiansProperty wsen;

    private CartographicRectangleDegreesProperty wsenDegrees;

    @Override
    public void dispatch(Supplier<RectangleCoordinatesCesiumWriter> supplier) {
        try (RectangleCoordinatesCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getWsen()).ifPresent(cartographicRectangleRadiansProperty -> cartographicRectangleRadiansProperty.dispatchWithoutClose(writer));
            Optional.ofNullable(getWsenDegrees()).ifPresent(cartographicRectangleDegreesProperty -> cartographicRectangleDegreesProperty.dispatchWithoutClose(writer));

            dispatchDelete(writer);
            dispatchInterpolations(writer);
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
            dispatchReference(writer);
        }
    }

    @Override
    public CartographicRectangleRadiansProperty getWsen() {
        return wsen;
    }

    public void setWsen(CartographicRectangleRadiansProperty wsen) {
        this.wsen = wsen;
    }

    @Override
    public CartographicRectangleDegreesProperty getWsenDegrees() {
        return wsenDegrees;
    }

    public void setWsenDegrees(CartographicRectangleDegreesProperty wsenDegrees) {
        this.wsenDegrees = wsenDegrees;
    }

    @Override
    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
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

    public static final class Builder {
        private CartographicRectangleRadiansProperty wsen;
        private CartographicRectangleDegreesProperty wsenDegrees;

        private Boolean delete;
        private Interpolations interpolations;
        private TimeInterval interval;
        private List<RectangleCoordinatesProperty> intervals;
        private Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withWsen(CartographicRectangleRadiansProperty wsen) {
            this.wsen = wsen;
            return this;
        }

        public Builder withWsenDegrees(CartographicRectangleDegreesProperty wsenDegrees) {
            this.wsenDegrees = wsenDegrees;
            return this;
        }

        public Builder withDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }

        public Builder withInterpolations(Interpolations interpolations) {
            this.interpolations = interpolations;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<RectangleCoordinatesProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public RectangleCoordinatesPropertyImpl build() {
            RectangleCoordinatesPropertyImpl rectangleCoordinatesPropertyImpl = new RectangleCoordinatesPropertyImpl();
            rectangleCoordinatesPropertyImpl.setWsen(wsen);
            rectangleCoordinatesPropertyImpl.setWsenDegrees(wsenDegrees);
            rectangleCoordinatesPropertyImpl.setDelete(delete);
            rectangleCoordinatesPropertyImpl.setInterpolations(interpolations);
            rectangleCoordinatesPropertyImpl.setInterval(interval);
            rectangleCoordinatesPropertyImpl.setIntervals(intervals);
            rectangleCoordinatesPropertyImpl.setReference(reference);
            return rectangleCoordinatesPropertyImpl;
        }
    }
}
