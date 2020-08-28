package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultOrientationProperty extends SingleTimeBasedPropertyAdapter<UnitQuaternion, OrientationProperty> implements OrientationProperty {

    @Override
    public void dispatch(OrientationCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeUnitQuaternion, writer::writeUnitQuaternion, writer::writeUnitQuaternion);
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
    public List<OrientationProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<OrientationProperty> intervals) {
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
        protected List<UnitQuaternion> values;
        protected Integer startIndex;
        protected Integer length;

        protected UnitQuaternion value;

        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<OrientationProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValues(List<JulianDate> dates, List<UnitQuaternion> values) {
            this.dates = dates;
            this.values = values;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<UnitQuaternion> values, Integer startIndex, Integer length) {
            this.dates = dates;
            this.values = values;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public Builder withValue(UnitQuaternion value) {
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

        public Builder withIntervals(List<OrientationProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public DefaultOrientationProperty build() {
            DefaultOrientationProperty defaultOrientationProperty = new DefaultOrientationProperty();
            defaultOrientationProperty.setDates(dates);
            defaultOrientationProperty.setValues(values);
            defaultOrientationProperty.setStartIndex(startIndex);
            defaultOrientationProperty.setLength(length);
            defaultOrientationProperty.setValue(value);
            defaultOrientationProperty.setInterpolations(interpolations);
            defaultOrientationProperty.setInterval(interval);
            defaultOrientationProperty.setIntervals(intervals);
            defaultOrientationProperty.setReference(reference);
            return defaultOrientationProperty;
        }
    }
}
