package aurora.cesium.element.property;

import cesiumlanguagewriter.*;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
class NearFarScalarPropertyImpl extends SingleTimeBasedPropertyAdapter<NearFarScalar, NearFarScalarProperty> implements NearFarScalarProperty {

    @Override
    public void dispatch(Supplier<NearFarScalarCesiumWriter> supplier) {
        try (NearFarScalarCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeNearFarScalar, writer::writeNearFarScalar, writer::writeNearFarScalar);

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
        private List<JulianDate> dates;
        private List<NearFarScalar> values;
        private Integer startIndex;
        private Integer length;

        private NearFarScalar value;

        private Boolean delete;
        private Interpolations interpolations;
        private TimeInterval interval;
        private List<NearFarScalarProperty> intervals;
        private Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(NearFarScalar value) {
            this.value = value;
            return this;
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

        public Builder withIntervals(List<NearFarScalarProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public NearFarScalarPropertyImpl build() {
            NearFarScalarPropertyImpl nearFarScalarPropertyImpl = new NearFarScalarPropertyImpl();
            nearFarScalarPropertyImpl.setDates(dates);
            nearFarScalarPropertyImpl.setValues(values);
            nearFarScalarPropertyImpl.setStartIndex(startIndex);
            nearFarScalarPropertyImpl.setLength(length);
            nearFarScalarPropertyImpl.setValue(value);
            nearFarScalarPropertyImpl.setDelete(delete);
            nearFarScalarPropertyImpl.setInterpolations(interpolations);
            nearFarScalarPropertyImpl.setInterval(interval);
            nearFarScalarPropertyImpl.setIntervals(intervals);
            nearFarScalarPropertyImpl.setReference(reference);
            return nearFarScalarPropertyImpl;
        }
    }
}
