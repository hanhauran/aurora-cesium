package aurora.cesium.element.property;

import aurora.cesium.language.writer.PositionCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultPositionProperty extends PropertyAdapter<PositionProperty> implements PositionProperty {

    private CartesianProperty cartesian;

    private CartographicDegreesProperty cartographicDegrees;

    private CartographicRadiansProperty cartographicRadians;

    @Override
    public void dispatch(PositionCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getCartesian()).ifPresent(cartesianProperty -> cartesianProperty.dispatchCartesian(writer));
            Optional.ofNullable(getCartographicDegrees()).ifPresent(cartographicDegreesProperty -> cartographicDegreesProperty.dispatchCartographicDegrees(writer));
            Optional.ofNullable(getCartographicRadians()).ifPresent(cartographicRadiansProperty -> cartographicRadiansProperty.dispatchCartographicRadians(writer));
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
    public CartographicDegreesProperty getCartographicDegrees() {
        return cartographicDegrees;
    }

    public void setCartographicDegrees(CartographicDegreesProperty cartographicDegrees) {
        this.cartographicDegrees = cartographicDegrees;
    }

    @Override
    public CartographicRadiansProperty getCartographicRadians() {
        return cartographicRadians;
    }

    public void setCartographicRadians(CartographicRadiansProperty cartographicRadians) {
        this.cartographicRadians = cartographicRadians;
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
    public List<PositionProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<PositionProperty> intervals) {
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
        protected List<PositionProperty> intervals;
        protected Reference reference;
        private CartesianProperty cartesian;
        private CartographicDegreesProperty cartographicDegrees;
        private CartographicRadiansProperty cartographicRadians;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withCartesian(CartesianProperty cartesian) {
            this.cartesian = cartesian;
            return this;
        }

        public Builder withCartographicDegrees(CartographicDegreesProperty cartographicDegrees) {
            this.cartographicDegrees = cartographicDegrees;
            return this;
        }

        public Builder withCartographicRadians(CartographicRadiansProperty cartographicRadians) {
            this.cartographicRadians = cartographicRadians;
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

        public Builder withIntervals(List<PositionProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public DefaultPositionProperty build() {
            DefaultPositionProperty defaultPositionProperty = new DefaultPositionProperty();
            defaultPositionProperty.setCartesian(cartesian);
            defaultPositionProperty.setCartographicDegrees(cartographicDegrees);
            defaultPositionProperty.setCartographicRadians(cartographicRadians);
            defaultPositionProperty.setInterpolations(interpolations);
            defaultPositionProperty.setInterval(interval);
            defaultPositionProperty.setIntervals(intervals);
            defaultPositionProperty.setReference(reference);
            return defaultPositionProperty;
        }
    }
}
