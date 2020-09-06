package aurora.cesium.element.property;

import cesiumlanguagewriter.*;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
class DistanceDisplayConditionPropertyImpl extends SingleTimeBasedPropertyAdapter<Bounds, DistanceDisplayConditionProperty> implements DistanceDisplayConditionProperty {

    @Override
    public void dispatch(Supplier<DistanceDisplayConditionCesiumWriter> supplier) {
        try (DistanceDisplayConditionCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeDistanceDisplayCondition, writer::writeDistanceDisplayCondition, writer::writeDistanceDisplayCondition);

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
    public List<DistanceDisplayConditionProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<DistanceDisplayConditionProperty> intervals) {
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
        private List<Bounds> values;
        private Integer startIndex;
        private Integer length;

        private Bounds value;

        private Boolean delete;
        private Interpolations interpolations;
        private TimeInterval interval;
        private List<DistanceDisplayConditionProperty> intervals;
        private Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(Bounds instance) {
            this.value = instance;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<Bounds> instances) {
            this.dates = dates;
            this.values = instances;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<Bounds> instances, Integer startIndex, Integer length) {
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

        public Builder withIntervals(List<DistanceDisplayConditionProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public DistanceDisplayConditionPropertyImpl build() {
            DistanceDisplayConditionPropertyImpl distanceDisplayConditionPropertyImpl = new DistanceDisplayConditionPropertyImpl();
            distanceDisplayConditionPropertyImpl.setDates(dates);
            distanceDisplayConditionPropertyImpl.setValues(values);
            distanceDisplayConditionPropertyImpl.setStartIndex(startIndex);
            distanceDisplayConditionPropertyImpl.setLength(length);
            distanceDisplayConditionPropertyImpl.setValue(value);
            distanceDisplayConditionPropertyImpl.setDelete(delete);
            distanceDisplayConditionPropertyImpl.setInterpolations(interpolations);
            distanceDisplayConditionPropertyImpl.setInterval(interval);
            distanceDisplayConditionPropertyImpl.setIntervals(intervals);
            distanceDisplayConditionPropertyImpl.setReference(reference);
            return distanceDisplayConditionPropertyImpl;
        }
    }
}
