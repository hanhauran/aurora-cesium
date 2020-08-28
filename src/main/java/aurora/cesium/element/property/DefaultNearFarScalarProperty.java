package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultNearFarScalarProperty extends SingleTimeBasedPropertyAdapter<NearFarScalar, NearFarScalarProperty> implements NearFarScalarProperty {

    public DefaultNearFarScalarProperty() {
        super();
    }

    @Override
    public void dispatch(NearFarScalarCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeNearFarScalar, writer::writeNearFarScalar, writer::writeNearFarScalar);
            dispatchInterpolations(writer);
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
            dispatchReference(writer);
        }
    }

    public NearFarScalar getNearFarScalar() {
        return instance;
    }

    public void setNearFarScalar(NearFarScalar nearFarScalar) {
        this.instance = nearFarScalar;
    }

    public List<NearFarScalar> getNearFarScalars() {
        return instances;
    }

    public void setNearFarScalar(List<NearFarScalar> nearFarScalars) {
        this.instances = nearFarScalars;
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
    public List<NearFarScalarProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<NearFarScalarProperty> intervals) {
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
        protected List<NearFarScalar> instances;
        protected Integer startIndex;
        protected Integer length;

        protected NearFarScalar instance;

        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<NearFarScalarProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder with(List<JulianDate> dates, List<NearFarScalar> instances) {
            this.dates = dates;
            this.instances = instances;
            return this;
        }

        public Builder with(List<JulianDate> dates, List<NearFarScalar> instances, Integer startIndex, Integer length) {
            this.dates = dates;
            this.instances = instances;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public Builder with(NearFarScalar instance) {
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

        public Builder withIntervals(List<NearFarScalarProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public DefaultNearFarScalarProperty build() {
            DefaultNearFarScalarProperty defaultNearFarScalarProperty = new DefaultNearFarScalarProperty();
            defaultNearFarScalarProperty.setDates(dates);
            defaultNearFarScalarProperty.setStartIndex(startIndex);
            defaultNearFarScalarProperty.setLength(length);
            defaultNearFarScalarProperty.setInterpolations(interpolations);
            defaultNearFarScalarProperty.setInterval(interval);
            defaultNearFarScalarProperty.setIntervals(intervals);
            defaultNearFarScalarProperty.setReference(reference);
            return defaultNearFarScalarProperty;
        }
    }
}
