package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultBoundingRectangleProperty extends SingleTimeBasedPropertyAdapter<BoundingRectangle, BoundingRectangleProperty> implements BoundingRectangleProperty {

    @Override
    public void dispatch(BoundingRectangleCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeBoundingRectangle, writer::writeBoundingRectangle, writer::writeBoundingRectangle);
            dispatchInterpolations(writer);
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
            dispatchReference(writer);
        }
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
    public List<BoundingRectangleProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<BoundingRectangleProperty> intervals) {
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
        protected List<JulianDate> dates;
        protected List<BoundingRectangle> values;
        protected Integer startIndex;
        protected Integer length;
        protected BoundingRectangle value;
        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<BoundingRectangleProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValues(List<JulianDate> dates, List<BoundingRectangle> values) {
            this.dates = dates;
            this.values = values;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<BoundingRectangle> values, Integer startIndex, Integer length) {
            this.dates = dates;
            this.values = values;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public Builder withValue(BoundingRectangle value) {
            this.value = value;
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

        public Builder withIntervals(List<BoundingRectangleProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public DefaultBoundingRectangleProperty build() {
            DefaultBoundingRectangleProperty defaultBoundingRectangleProperty = new DefaultBoundingRectangleProperty();
            defaultBoundingRectangleProperty.setDates(dates);
            defaultBoundingRectangleProperty.setValues(values);
            defaultBoundingRectangleProperty.setStartIndex(startIndex);
            defaultBoundingRectangleProperty.setLength(length);
            defaultBoundingRectangleProperty.setValue(value);
            defaultBoundingRectangleProperty.setInterpolations(interpolations);
            defaultBoundingRectangleProperty.setInterval(interval);
            defaultBoundingRectangleProperty.setIntervals(intervals);
            defaultBoundingRectangleProperty.setReference(reference);
            return defaultBoundingRectangleProperty;
        }
    }
}
