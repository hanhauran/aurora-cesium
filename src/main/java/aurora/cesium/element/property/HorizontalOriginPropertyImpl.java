package aurora.cesium.element.property;

import cesiumlanguagewriter.CesiumHorizontalOrigin;
import cesiumlanguagewriter.HorizontalOriginCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
class HorizontalOriginPropertyImpl extends SinglePropertyAdapter<CesiumHorizontalOrigin, HorizontalOriginProperty> implements HorizontalOriginProperty {

    @Override
    public void dispatch(Supplier<HorizontalOriginCesiumWriter> supplier) {
        try (HorizontalOriginCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeHorizontalOrigin);

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
    public List<HorizontalOriginProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<HorizontalOriginProperty> intervals) {
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
        private CesiumHorizontalOrigin value;

        private Boolean delete;
        private TimeInterval interval;
        private List<HorizontalOriginProperty> intervals;
        private Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CesiumHorizontalOrigin value) {
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

        public Builder withIntervals(List<HorizontalOriginProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public HorizontalOriginPropertyImpl build() {
            HorizontalOriginPropertyImpl horizontalOriginPropertyImpl = new HorizontalOriginPropertyImpl();
            horizontalOriginPropertyImpl.setValue(value);
            horizontalOriginPropertyImpl.setDelete(delete);
            horizontalOriginPropertyImpl.setInterval(interval);
            horizontalOriginPropertyImpl.setIntervals(intervals);
            horizontalOriginPropertyImpl.setReference(reference);
            return horizontalOriginPropertyImpl;
        }
    }
}
