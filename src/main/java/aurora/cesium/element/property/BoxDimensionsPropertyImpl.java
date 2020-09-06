package aurora.cesium.element.property;

import cesiumlanguagewriter.BoxDimensionsCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
class BoxDimensionsPropertyImpl extends PropertyAdapter<BoxDimensionsProperty> implements BoxDimensionsProperty {

    private CartesianProperty cartesian;

    @Override
    public void dispatch(Supplier<BoxDimensionsCesiumWriter> supplier) {
        try (BoxDimensionsCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getCartesian()).ifPresent(cartesianProperty -> cartesianProperty.dispatchWithoutClose(writer));

            dispatchDelete(writer);
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
            dispatchReference(writer);
        }
    }

    @Override
    public CartesianProperty getCartesian() {
        return cartesian;
    }

    public void setCartesian(CartesianProperty cartesian) {
        this.cartesian = cartesian;
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
    public List<BoxDimensionsProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<BoxDimensionsProperty> intervals) {
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
        private CartesianProperty cartesian;

        private Boolean delete;
        private TimeInterval interval;
        private List<BoxDimensionsProperty> intervals;
        private Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withCartesian(CartesianProperty cartesian) {
            this.cartesian = cartesian;
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

        public Builder withIntervals(List<BoxDimensionsProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public BoxDimensionsPropertyImpl build() {
            BoxDimensionsPropertyImpl boxDimensionsPropertyImpl = new BoxDimensionsPropertyImpl();
            boxDimensionsPropertyImpl.setCartesian(cartesian);
            boxDimensionsPropertyImpl.setDelete(delete);
            boxDimensionsPropertyImpl.setInterval(interval);
            boxDimensionsPropertyImpl.setIntervals(intervals);
            boxDimensionsPropertyImpl.setReference(reference);
            return boxDimensionsPropertyImpl;
        }
    }
}
