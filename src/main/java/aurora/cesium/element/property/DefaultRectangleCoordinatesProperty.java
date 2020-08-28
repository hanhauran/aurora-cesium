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
public class DefaultRectangleCoordinatesProperty extends PropertyAdapter<RectangleCoordinatesProperty> implements RectangleCoordinatesProperty {

    private CartographicExtentProperty wsen;

    private CartographicExtentProperty wsenDegrees;

    @Override
    public void dispatch(RectangleCoordinatesCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getWsen()).ifPresent(cartographicExtentProperty -> cartographicExtentProperty.dispatchWsen(writer));
            Optional.ofNullable(getWsenDegrees()).ifPresent(cartographicExtentProperty -> cartographicExtentProperty.dispatchWsenDegrees(writer));
            dispatchInterpolations(writer);
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
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

    public static final class Builder {
        private CartographicExtentProperty wsen;
        private CartographicExtentProperty wsenDegrees;

        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<RectangleCoordinatesProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withWsen(CartographicExtentProperty wsen) {
            this.wsen = wsen;
            return this;
        }

        public Builder withWsenDegrees(CartographicExtentProperty wsenDegrees) {
            this.wsenDegrees = wsenDegrees;
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

        public DefaultRectangleCoordinatesProperty build() {
            DefaultRectangleCoordinatesProperty defaultRectangleCoordinatesProperty = new DefaultRectangleCoordinatesProperty();
            defaultRectangleCoordinatesProperty.setWsen(wsen);
            defaultRectangleCoordinatesProperty.setWsenDegrees(wsenDegrees);
            defaultRectangleCoordinatesProperty.setInterpolations(interpolations);
            defaultRectangleCoordinatesProperty.setInterval(interval);
            defaultRectangleCoordinatesProperty.setIntervals(intervals);
            defaultRectangleCoordinatesProperty.setReference(reference);
            return defaultRectangleCoordinatesProperty;
        }
    }
}
