package aurora.cesium.element.property;

import cesiumlanguagewriter.CesiumShadowMode;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.ShadowModeCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/22
 */
class ShadowModePropertyImpl extends SinglePropertyAdapter<CesiumShadowMode, ShadowModeProperty> implements ShadowModeProperty {

    @Override
    public void dispatch(Supplier<ShadowModeCesiumWriter> supplier) {
        try (ShadowModeCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeShadowMode);

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
    public List<ShadowModeProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<ShadowModeProperty> intervals) {
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
        protected CesiumShadowMode value;

        protected Boolean delete;
        protected TimeInterval interval;
        protected List<ShadowModeProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CesiumShadowMode value) {
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

        public Builder withIntervals(List<ShadowModeProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public ShadowModePropertyImpl build() {
            ShadowModePropertyImpl shadowModePropertyImpl = new ShadowModePropertyImpl();
            shadowModePropertyImpl.setValue(value);
            shadowModePropertyImpl.setDelete(delete);
            shadowModePropertyImpl.setInterval(interval);
            shadowModePropertyImpl.setIntervals(intervals);
            shadowModePropertyImpl.setReference(reference);
            return shadowModePropertyImpl;
        }
    }
}
