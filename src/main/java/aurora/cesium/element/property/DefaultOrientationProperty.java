package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultOrientationProperty extends SingleTimeBasedPropertyAdapter<UnitQuaternion, OrientationProperty> implements OrientationProperty {

    public DefaultOrientationProperty() {
        super();
    }

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
        protected List<UnitQuaternion> instances;
        protected Integer startIndex;
        protected Integer length;

        protected UnitQuaternion instance;

        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<OrientationProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder with(List<JulianDate> dates, List<UnitQuaternion> instances) {
            this.dates = dates;
            this.instances = instances;
            return this;
        }

        public Builder with(List<JulianDate> dates, List<UnitQuaternion> instances, Integer startIndex, Integer length) {
            this.dates = dates;
            this.instances = instances;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public Builder with(UnitQuaternion instance) {
            this.instance = instance;
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
            defaultOrientationProperty.setInstances(instances);
            defaultOrientationProperty.setStartIndex(startIndex);
            defaultOrientationProperty.setLength(length);
            defaultOrientationProperty.setInstance(instance);
            defaultOrientationProperty.setInterpolations(interpolations);
            defaultOrientationProperty.setInterval(interval);
            defaultOrientationProperty.setIntervals(intervals);
            defaultOrientationProperty.setReference(reference);
            return defaultOrientationProperty;
        }
    }
}
