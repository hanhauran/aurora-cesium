package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultNearFarScalarProperty extends SingleTimeBasedPropertyAdapter<NearFarScalar, NearFarScalarProperty> implements NearFarScalarProperty {

    @Override
    public void dispatch(NearFarScalarCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeNearFarScalar, writer::writeNearFarScalar, writer::writeNearFarScalar);
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
        protected List<NearFarScalar> values;
        protected Integer startIndex;
        protected Integer length;

        protected NearFarScalar value;

        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<NearFarScalarProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValues(List<JulianDate> dates, List<NearFarScalar> values) {
            this.dates = dates;
            this.values = values;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<NearFarScalar> values, Integer startIndex, Integer length) {
            this.dates = dates;
            this.values = values;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public Builder withValue(NearFarScalar value) {
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
            defaultNearFarScalarProperty.setValues(values);
            defaultNearFarScalarProperty.setStartIndex(startIndex);
            defaultNearFarScalarProperty.setLength(length);
            defaultNearFarScalarProperty.setValue(value);
            defaultNearFarScalarProperty.setInterpolations(interpolations);
            defaultNearFarScalarProperty.setInterval(interval);
            defaultNearFarScalarProperty.setIntervals(intervals);
            defaultNearFarScalarProperty.setReference(reference);
            return defaultNearFarScalarProperty;
        }
    }
}
