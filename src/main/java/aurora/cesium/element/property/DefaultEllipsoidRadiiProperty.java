package aurora.cesium.element.property;

import aurora.cesium.language.writer.EllipsoidRadiiCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public class DefaultEllipsoidRadiiProperty extends PropertyAdapter<EllipsoidRadiiProperty> implements EllipsoidRadiiProperty {

    private CartesianProperty cartesian;

    @Override
    public void dispatch(EllipsoidRadiiCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getCartesian()).ifPresent(cartesianProperty -> cartesianProperty.dispatchCartesian(writer));
            dispatchInterpolations(writer);
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
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
        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<EllipsoidRadiiProperty> intervals;
        protected Reference reference;
        private CartesianProperty cartesian;

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

        public DefaultEllipsoidRadiiProperty build() {
            DefaultEllipsoidRadiiProperty defaultEllipsoidRadiiProperty = new DefaultEllipsoidRadiiProperty();
            defaultEllipsoidRadiiProperty.setCartesian(cartesian);
            defaultEllipsoidRadiiProperty.setInterpolations(interpolations);
            defaultEllipsoidRadiiProperty.setInterval(interval);
            defaultEllipsoidRadiiProperty.setIntervals(intervals);
            defaultEllipsoidRadiiProperty.setReference(reference);
            return defaultEllipsoidRadiiProperty;
        }
    }
}
