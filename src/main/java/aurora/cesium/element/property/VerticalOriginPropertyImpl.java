package aurora.cesium.element.property;

import cesiumlanguagewriter.CesiumVerticalOrigin;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;
import cesiumlanguagewriter.VerticalOriginCesiumWriter;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
class VerticalOriginPropertyImpl extends SinglePropertyAdapter<CesiumVerticalOrigin, VerticalOriginProperty> implements VerticalOriginProperty {

    @Override
    public void dispatch(Supplier<VerticalOriginCesiumWriter> supplier) {
        try (VerticalOriginCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeVerticalOrigin);

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
    public List<VerticalOriginProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<VerticalOriginProperty> intervals) {
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
        private CesiumVerticalOrigin value;

        private Boolean delete;
        private TimeInterval interval;
        private List<VerticalOriginProperty> intervals;
        private Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CesiumVerticalOrigin instance) {
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

        public Builder withIntervals(List<VerticalOriginProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public VerticalOriginPropertyImpl build() {
            VerticalOriginPropertyImpl verticalOriginPropertyImpl = new VerticalOriginPropertyImpl();
            verticalOriginPropertyImpl.setValue(value);
            verticalOriginPropertyImpl.setDelete(delete);
            verticalOriginPropertyImpl.setInterval(interval);
            verticalOriginPropertyImpl.setIntervals(intervals);
            verticalOriginPropertyImpl.setReference(reference);
            return verticalOriginPropertyImpl;
        }
    }
}
