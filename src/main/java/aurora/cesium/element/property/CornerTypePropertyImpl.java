package aurora.cesium.element.property;

import cesiumlanguagewriter.CesiumCornerType;
import cesiumlanguagewriter.CornerTypeCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
class CornerTypePropertyImpl extends SinglePropertyAdapter<CesiumCornerType, CornerTypeProperty> implements CornerTypeProperty {

    @Override
    public void dispatch(Supplier<CornerTypeCesiumWriter> supplier) {
        try (CornerTypeCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeCornerType);

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
    public List<CornerTypeProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<CornerTypeProperty> intervals) {
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
        private CesiumCornerType value;

        private Boolean delete;
        private TimeInterval interval;
        private List<CornerTypeProperty> intervals;
        private Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CesiumCornerType value) {
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

        public Builder withIntervals(List<CornerTypeProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public CornerTypePropertyImpl build() {
            CornerTypePropertyImpl cornerTypePropertyImpl = new CornerTypePropertyImpl();
            cornerTypePropertyImpl.setValue(value);
            cornerTypePropertyImpl.setDelete(delete);
            cornerTypePropertyImpl.setInterval(interval);
            cornerTypePropertyImpl.setIntervals(intervals);
            cornerTypePropertyImpl.setReference(reference);
            return cornerTypePropertyImpl;
        }
    }
}
