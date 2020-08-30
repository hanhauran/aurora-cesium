package aurora.cesium.element.property;

import aurora.cesium.language.writer.DoubleCesiumWriter;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DoublePropertyImpl extends SingleTimeBasedPropertyAdapter<Double, DoubleProperty> implements DoubleProperty {

    @Override
    public void dispatch(DoubleCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeNumber, writer::writeNumber, writer::writeNumber);
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
    public List<DoubleProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<DoubleProperty> intervals) {
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
        protected List<Double> values;
        protected Integer startIndex;
        protected Integer length;

        protected Double value;

        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<DoubleProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValues(List<JulianDate> dates, List<Double> instances) {
            this.dates = dates;
            this.values = instances;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<Double> instances, Integer startIndex, Integer length) {
            this.dates = dates;
            this.values = instances;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public Builder withValue(Double instance) {
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

        public Builder withIntervals(List<DoubleProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public DoublePropertyImpl build() {
            DoublePropertyImpl doublePropertyImpl = new DoublePropertyImpl();
            doublePropertyImpl.setDates(dates);
            doublePropertyImpl.setValues(values);
            doublePropertyImpl.setStartIndex(startIndex);
            doublePropertyImpl.setLength(length);
            doublePropertyImpl.setValue(value);
            doublePropertyImpl.setInterpolations(interpolations);
            doublePropertyImpl.setInterval(interval);
            doublePropertyImpl.setIntervals(intervals);
            doublePropertyImpl.setReference(reference);
            return doublePropertyImpl;
        }
    }
}
