package aurora.cesium.element.property;

import aurora.cesium.language.writer.IntegerCesiumWriter;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultIntegerProperty extends SingleTimeBasedPropertyAdapter<Integer, IntegerProperty> implements IntegerProperty {

    @Override
    public void dispatch(IntegerCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeNumber);
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
    public List<IntegerProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<IntegerProperty> intervals) {
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
        protected List<Integer> values;
        protected Integer startIndex;
        protected Integer length;

        protected Integer value;

        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<IntegerProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder aDefaultIntegerProperty() {
            return new Builder();
        }

        public Builder withValues(List<JulianDate> dates, List<Integer> instances) {
            this.dates = dates;
            this.values = instances;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<Integer> instances, Integer startIndex, Integer length) {
            this.dates = dates;
            this.values = instances;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public Builder withValue(Integer instance) {
            this.value = instance;
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

        public Builder withIntervals(List<IntegerProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public DefaultIntegerProperty build() {
            DefaultIntegerProperty defaultIntegerProperty = new DefaultIntegerProperty();
            defaultIntegerProperty.setDates(dates);
            defaultIntegerProperty.setValues(values);
            defaultIntegerProperty.setStartIndex(startIndex);
            defaultIntegerProperty.setLength(length);
            defaultIntegerProperty.setValue(value);
            defaultIntegerProperty.setInterpolations(interpolations);
            defaultIntegerProperty.setInterval(interval);
            defaultIntegerProperty.setIntervals(intervals);
            defaultIntegerProperty.setReference(reference);
            return defaultIntegerProperty;
        }
    }
}
