package aurora.cesium.element.property;

import cesiumlanguagewriter.DoubleCesiumWriter;
import cesiumlanguagewriter.JulianDate;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
class DoublePropertyImpl extends SingleTimeBasedPropertyAdapter<Double, DoubleProperty> implements DoubleProperty {

    @Override
    public void dispatch(Supplier<DoubleCesiumWriter> supplier) {
        try (DoubleCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeNumber, writer::writeNumber, writer::writeNumber);

            dispatchDelete(writer);
            dispatchInterpolations(writer);
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
            dispatchReference(writer);
        }
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
        private List<JulianDate> dates;
        private List<Double> values;
        private Integer startIndex;
        private Integer length;

        private Double value;

        private Boolean delete;
        private Interpolations interpolations;
        private TimeInterval interval;
        private List<DoubleProperty> intervals;
        private Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(Double instance) {
            this.value = instance;
            return this;
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
            doublePropertyImpl.setDelete(delete);
            doublePropertyImpl.setInterpolations(interpolations);
            doublePropertyImpl.setInterval(interval);
            doublePropertyImpl.setIntervals(intervals);
            doublePropertyImpl.setReference(reference);
            return doublePropertyImpl;
        }
    }
}
