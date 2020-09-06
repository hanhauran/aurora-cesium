package aurora.cesium.element.property;

import cesiumlanguagewriter.CesiumLabelStyle;
import cesiumlanguagewriter.LabelStyleCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
class LabelStylePropertyImpl extends SinglePropertyAdapter<CesiumLabelStyle, LabelStyleProperty> implements LabelStyleProperty {

    @Override
    public void dispatch(Supplier<LabelStyleCesiumWriter> supplier) {
        try (LabelStyleCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeLabelStyle);

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
    public List<LabelStyleProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<LabelStyleProperty> intervals) {
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
        private CesiumLabelStyle value;

        private Boolean delete;
        private TimeInterval interval;
        private List<LabelStyleProperty> intervals;
        private Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CesiumLabelStyle value) {
            this.value = value;
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

        public Builder withIntervals(List<LabelStyleProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public LabelStylePropertyImpl build() {
            LabelStylePropertyImpl labelStylePropertyImpl = new LabelStylePropertyImpl();
            labelStylePropertyImpl.setValue(value);
            labelStylePropertyImpl.setDelete(delete);
            labelStylePropertyImpl.setInterval(interval);
            labelStylePropertyImpl.setIntervals(intervals);
            labelStylePropertyImpl.setReference(reference);
            return labelStylePropertyImpl;
        }
    }
}
