package aurora.cesium.element.property;

import cesiumlanguagewriter.BooleanCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
class BooleanPropertyImpl extends SinglePropertyAdapter<Boolean, BooleanProperty> implements BooleanProperty {

    @Override
    public void dispatch(Supplier<BooleanCesiumWriter> supplier) {
        try (BooleanCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeBoolean);

            dispatchDelete(writer);
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
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<BooleanProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<BooleanProperty> intervals) {
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
        private Boolean value;

        private Boolean delete;
        private TimeInterval interval;
        private List<BooleanProperty> intervals;
        private Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(Boolean instance) {
            this.value = instance;
            return this;
        }

        public Builder withDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<BooleanProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public BooleanPropertyImpl build() {
            BooleanPropertyImpl booleanPropertyImpl = new BooleanPropertyImpl();
            booleanPropertyImpl.setValue(value);
            booleanPropertyImpl.setDelete(delete);
            booleanPropertyImpl.setInterval(interval);
            booleanPropertyImpl.setIntervals(intervals);
            booleanPropertyImpl.setReference(reference);
            return booleanPropertyImpl;
        }
    }
}
