package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DistanceDisplayConditionPropertyImpl extends SingleTimeBasedPropertyAdapter<Bounds, DistanceDisplayConditionProperty> implements DistanceDisplayConditionProperty {

    @Override
    public void dispatch(DistanceDisplayConditionCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeDistanceDisplayCondition, writer::writeDistanceDisplayCondition, writer::writeDistanceDisplayCondition);
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
        protected List<JulianDate> dates;
        protected List<Bounds> values;
        protected Integer startIndex;
        protected Integer length;

        protected Bounds value;

        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<DistanceDisplayConditionProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
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

        public Builder withValue(Bounds instance) {
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
            distanceDisplayConditionPropertyImpl.setInterpolations(interpolations);
            distanceDisplayConditionPropertyImpl.setInterval(interval);
            distanceDisplayConditionPropertyImpl.setIntervals(intervals);
            distanceDisplayConditionPropertyImpl.setReference(reference);
            return distanceDisplayConditionPropertyImpl;
        }
    }
}
