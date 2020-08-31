package aurora.cesium.element.property;

import aurora.cesium.language.writer.EllipsoidRadiiCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public class EllipsoidRadiiPropertyImpl extends PropertyAdapter<EllipsoidRadiiProperty> implements EllipsoidRadiiProperty {

    private CartesianProperty cartesian;

    @Override
    public void dispatch(Supplier<EllipsoidRadiiCesiumWriter> supplier) {
        try (EllipsoidRadiiCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getCartesian()).ifPresent(cartesianProperty -> cartesianProperty.dispatchWithoutClose(writer));
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
    public List<EllipsoidRadiiProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<EllipsoidRadiiProperty> intervals) {
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

        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<EllipsoidRadiiProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withCartesian(CartesianProperty cartesian) {
            this.cartesian = cartesian;
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

        public Builder withIntervals(List<EllipsoidRadiiProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public EllipsoidRadiiPropertyImpl build() {
            EllipsoidRadiiPropertyImpl ellipsoidRadiiPropertyImpl = new EllipsoidRadiiPropertyImpl();
            ellipsoidRadiiPropertyImpl.setCartesian(cartesian);
            ellipsoidRadiiPropertyImpl.setInterpolations(interpolations);
            ellipsoidRadiiPropertyImpl.setInterval(interval);
            ellipsoidRadiiPropertyImpl.setIntervals(intervals);
            ellipsoidRadiiPropertyImpl.setReference(reference);
            return ellipsoidRadiiPropertyImpl;
        }
    }
}
