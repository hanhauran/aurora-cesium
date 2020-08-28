package aurora.cesium.element.property;

import aurora.cesium.language.writer.LineOffsetCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public class DefaultLineOffsetProperty extends PropertyAdapter<LineOffsetProperty> implements LineOffsetProperty {

    private RectangularProperty rectangular;

    @Override
    public void dispatch(LineOffsetCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getRectangular()).ifPresent(rectangularProperty -> rectangularProperty.dispatchWithoutClose(writer));
            dispatchInterpolations(writer);
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
            dispatchReference(writer);
        }
    }

    @Override
    public RectangularProperty getRectangular() {
        return rectangular;
    }

    public void setRectangular(RectangularProperty rectangular) {
        this.rectangular = rectangular;
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
    public List<LineOffsetProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<LineOffsetProperty> intervals) {
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
        private RectangularProperty rectangular;

        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<LineOffsetProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withRectangular(RectangularProperty rectangular) {
            this.rectangular = rectangular;
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

        public Builder withIntervals(List<LineOffsetProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public DefaultLineOffsetProperty build() {
            DefaultLineOffsetProperty defaultLineOffsetProperty = new DefaultLineOffsetProperty();
            defaultLineOffsetProperty.setRectangular(rectangular);
            defaultLineOffsetProperty.setInterpolations(interpolations);
            defaultLineOffsetProperty.setInterval(interval);
            defaultLineOffsetProperty.setIntervals(intervals);
            defaultLineOffsetProperty.setReference(reference);
            return defaultLineOffsetProperty;
        }
    }
}
