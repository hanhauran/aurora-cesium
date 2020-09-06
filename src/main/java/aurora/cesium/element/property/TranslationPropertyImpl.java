package aurora.cesium.element.property;

import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;
import cesiumlanguagewriter.TranslationCesiumWriter;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
class TranslationPropertyImpl extends PropertyAdapter<TranslationProperty> implements TranslationProperty {

    private CartesianProperty cartesian;

    @Override
    public void dispatch(Supplier<TranslationCesiumWriter> supplier) {
        try (TranslationCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getCartesian()).ifPresent(cartesianProperty -> cartesianProperty.dispatchWithoutClose(writer));

            dispatchDelete(writer);
            dispatchInterpolations(writer);
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
    public List<TranslationProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<TranslationProperty> intervals) {
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
        private Interpolations interpolations;
        private TimeInterval interval;
        private List<TranslationProperty> intervals;
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

        public Builder withInterpolations(Interpolations interpolations) {
            this.interpolations = interpolations;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<TranslationProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public TranslationPropertyImpl build() {
            TranslationPropertyImpl translationPropertyImpl = new TranslationPropertyImpl();
            translationPropertyImpl.setCartesian(cartesian);
            translationPropertyImpl.setDelete(delete);
            translationPropertyImpl.setInterpolations(interpolations);
            translationPropertyImpl.setInterval(interval);
            translationPropertyImpl.setIntervals(intervals);
            translationPropertyImpl.setReference(reference);
            return translationPropertyImpl;
        }
    }
}
