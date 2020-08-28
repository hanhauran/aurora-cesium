package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultPixelOffsetProperty extends SingleTimeBasedPropertyAdapter<Rectangular, PixelOffsetProperty> implements PixelOffsetProperty {

    @Override
    public void dispatch(PixelOffsetCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeCartesian2, writer::writeCartesian2, writer::writeCartesian2);
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
    public List<PixelOffsetProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<PixelOffsetProperty> intervals) {
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
        protected List<Rectangular> values;
        protected Integer startIndex;
        protected Integer length;

        protected Rectangular value;

        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<PixelOffsetProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValues(List<JulianDate> dates, List<Rectangular> values) {
            this.dates = dates;
            this.values = values;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<Rectangular> values, Integer startIndex, Integer length) {
            this.dates = dates;
            this.values = values;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public Builder withValue(Rectangular value) {
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

        public Builder withIntervals(List<PixelOffsetProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public DefaultPixelOffsetProperty build() {
            DefaultPixelOffsetProperty defaultPixelOffsetProperty = new DefaultPixelOffsetProperty();
            defaultPixelOffsetProperty.setDates(dates);
            defaultPixelOffsetProperty.setValues(values);
            defaultPixelOffsetProperty.setStartIndex(startIndex);
            defaultPixelOffsetProperty.setLength(length);
            defaultPixelOffsetProperty.setValue(value);
            defaultPixelOffsetProperty.setInterpolations(interpolations);
            defaultPixelOffsetProperty.setInterval(interval);
            defaultPixelOffsetProperty.setIntervals(intervals);
            defaultPixelOffsetProperty.setReference(reference);
            return defaultPixelOffsetProperty;
        }
    }
}
