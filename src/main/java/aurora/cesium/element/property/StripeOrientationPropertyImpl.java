package aurora.cesium.element.property;

import cesiumlanguagewriter.CesiumStripeOrientation;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.StripeOrientationCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
class StripeOrientationPropertyImpl extends SinglePropertyAdapter<CesiumStripeOrientation, StripeOrientationProperty> implements StripeOrientationProperty {

    @Override
    public void dispatch(Supplier<StripeOrientationCesiumWriter> supplier) {
        try (StripeOrientationCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeStripeOrientation);

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
    public List<StripeOrientationProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<StripeOrientationProperty> intervals) {
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
        private CesiumStripeOrientation value;

        private Boolean delete;
        private TimeInterval interval;
        private List<StripeOrientationProperty> intervals;
        private Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CesiumStripeOrientation value) {
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

        public Builder withIntervals(List<StripeOrientationProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public StripeOrientationPropertyImpl build() {
            StripeOrientationPropertyImpl stripeOrientationPropertyImpl = new StripeOrientationPropertyImpl();
            stripeOrientationPropertyImpl.setValue(value);
            stripeOrientationPropertyImpl.setDelete(delete);
            stripeOrientationPropertyImpl.setInterval(interval);
            stripeOrientationPropertyImpl.setIntervals(intervals);
            stripeOrientationPropertyImpl.setReference(reference);
            return stripeOrientationPropertyImpl;
        }
    }
}
