package aurora.cesium.element.property;

import cesiumlanguagewriter.DirectionCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
class DirectionPropertyImpl extends PropertyAdapter<DirectionProperty> implements DirectionProperty {

    private CartesianProperty cartesian;

    private SphericalProperty spherical;

    private UnitCartesianProperty unitCartesian;

    private UnitSphericalProperty unitSpherical;

    @Override
    public void dispatch(Supplier<DirectionCesiumWriter> supplier) {
        try (DirectionCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getCartesian()).ifPresent(cartesianProperty -> cartesianProperty.dispatchWithoutClose(writer));
            Optional.ofNullable(getSpherical()).ifPresent(sphericalProperty -> sphericalProperty.dispatchWithoutClose(writer));
            Optional.ofNullable(getUnitCartesian()).ifPresent(unitCartesianProperty -> unitCartesianProperty.dispatchWithoutClose(writer));
            Optional.ofNullable(getUnitSpherical()).ifPresent(unitSphericalProperty -> unitSphericalProperty.dispatchWithoutClose(writer));

            dispatchDelete(writer);
            dispatchInterpolations(writer);
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
    public CartesianProperty getCartesian() {
        return cartesian;
    }

    public void setCartesian(CartesianProperty cartesian) {
        this.cartesian = cartesian;
    }

    @Override
    public SphericalProperty getSpherical() {
        return spherical;
    }

    public void setSpherical(SphericalProperty spherical) {
        this.spherical = spherical;
    }

    @Override
    public UnitCartesianProperty getUnitCartesian() {
        return unitCartesian;
    }

    public void setUnitCartesian(UnitCartesianProperty unitCartesian) {
        this.unitCartesian = unitCartesian;
    }

    @Override
    public UnitSphericalProperty getUnitSpherical() {
        return unitSpherical;
    }

    public void setUnitSpherical(UnitSphericalProperty unitSpherical) {
        this.unitSpherical = unitSpherical;
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
    public List<DirectionProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<DirectionProperty> intervals) {
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
        private SphericalProperty spherical;
        private UnitCartesianProperty unitCartesian;
        private UnitSphericalProperty unitSpherical;

        private Boolean delete;
        private Interpolations interpolations;
        private TimeInterval interval;
        private List<DirectionProperty> intervals;
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

        public Builder withSpherical(SphericalProperty spherical) {
            this.spherical = spherical;
            return this;
        }

        public Builder withUnitCartesian(UnitCartesianProperty unitCartesian) {
            this.unitCartesian = unitCartesian;
            return this;
        }

        public Builder withUnitSpherical(UnitSphericalProperty unitSpherical) {
            this.unitSpherical = unitSpherical;
            return this;
        }

        public Builder withInterpolations(Interpolations interpolations) {
            this.interpolations = interpolations;
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

        public Builder withIntervals(List<DirectionProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public DirectionPropertyImpl build() {
            DirectionPropertyImpl directionPropertyImpl = new DirectionPropertyImpl();
            directionPropertyImpl.setCartesian(cartesian);
            directionPropertyImpl.setSpherical(spherical);
            directionPropertyImpl.setUnitCartesian(unitCartesian);
            directionPropertyImpl.setUnitSpherical(unitSpherical);
            directionPropertyImpl.setDelete(delete);
            directionPropertyImpl.setInterpolations(interpolations);
            directionPropertyImpl.setInterval(interval);
            directionPropertyImpl.setIntervals(intervals);
            directionPropertyImpl.setReference(reference);
            return directionPropertyImpl;
        }
    }
}
