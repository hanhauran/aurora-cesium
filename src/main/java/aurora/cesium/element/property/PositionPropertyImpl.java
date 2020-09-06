package aurora.cesium.element.property;

import cesiumlanguagewriter.PositionCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
class PositionPropertyImpl extends PropertyAdapter<PositionProperty> implements PositionProperty {

    private CartesianProperty cartesian;

    private CartographicDegreesProperty cartographicDegrees;

    private CartographicRadiansProperty cartographicRadians;

    @Override
    public void dispatch(Supplier<PositionCesiumWriter> supplier) {
        try (PositionCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getCartesian()).ifPresent(cartesianProperty -> cartesianProperty.dispatchWithoutClose(writer));
            Optional.ofNullable(getCartographicDegrees()).ifPresent(cartographicDegreesProperty -> cartographicDegreesProperty.dispatchWithoutClose(writer));
            Optional.ofNullable(getCartographicRadians()).ifPresent(cartographicRadiansProperty -> cartographicRadiansProperty.dispatchWithoutClose(writer));

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
        private CartesianProperty cartesian;
        private CartographicDegreesProperty cartographicDegrees;
        private CartographicRadiansProperty cartographicRadians;

        private Boolean delete;
        private Interpolations interpolations;
        private TimeInterval interval;
        private List<PositionProperty> intervals;
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

        public Builder withCartographicDegrees(CartographicDegreesProperty cartographicDegrees) {
            this.cartographicDegrees = cartographicDegrees;
            return this;
        }

        public Builder withCartographicRadians(CartographicRadiansProperty cartographicRadians) {
            this.cartographicRadians = cartographicRadians;
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

        public Builder withIntervals(List<PositionProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public PositionPropertyImpl build() {
            PositionPropertyImpl positionPropertyImpl = new PositionPropertyImpl();
            positionPropertyImpl.setCartesian(cartesian);
            positionPropertyImpl.setCartographicDegrees(cartographicDegrees);
            positionPropertyImpl.setCartographicRadians(cartographicRadians);
            positionPropertyImpl.setDelete(delete);
            positionPropertyImpl.setInterpolations(interpolations);
            positionPropertyImpl.setInterval(interval);
            positionPropertyImpl.setIntervals(intervals);
            positionPropertyImpl.setReference(reference);
            return positionPropertyImpl;
        }
    }
}
