package aurora.cesium.element.property;

import cesiumlanguagewriter.CesiumHeightReference;
import cesiumlanguagewriter.HeightReferenceCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
class HeightReferencePropertyImpl extends SinglePropertyAdapter<CesiumHeightReference, HeightReferenceProperty> implements HeightReferenceProperty {

    @Override
    public void dispatch(Supplier<HeightReferenceCesiumWriter> supplier) {
        try (HeightReferenceCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeHeightReference);

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
    public List<HeightReferenceProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<HeightReferenceProperty> intervals) {
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
        private CesiumHeightReference value;

        private Boolean delete;
        private TimeInterval interval;
        private List<HeightReferenceProperty> intervals;
        private Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CesiumHeightReference value) {
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

        public Builder withIntervals(List<HeightReferenceProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public HeightReferencePropertyImpl build() {
            HeightReferencePropertyImpl heightReferencePropertyImpl = new HeightReferencePropertyImpl();
            heightReferencePropertyImpl.setValue(value);
            heightReferencePropertyImpl.setDelete(delete);
            heightReferencePropertyImpl.setInterval(interval);
            heightReferencePropertyImpl.setIntervals(intervals);
            heightReferencePropertyImpl.setReference(reference);
            return heightReferencePropertyImpl;
        }
    }
}
