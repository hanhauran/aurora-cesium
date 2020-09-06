package aurora.cesium.element.property;

import cesiumlanguagewriter.AlignedAxisCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
class AlignedAxisPropertyImpl extends PropertyAdapter<AlignedAxisProperty> implements AlignedAxisProperty {

    private UnitCartesianProperty unitCartesian;

    private UnitSphericalProperty unitSpherical;

    @Override
    public void dispatch(Supplier<AlignedAxisCesiumWriter> supplier) {
        try (AlignedAxisCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getUnitCartesian()).ifPresent(unitCartesianProperty -> unitCartesianProperty.dispatchWithoutClose(writer));
            Optional.ofNullable(getUnitSpherical()).ifPresent(unitSphericalProperty -> unitSphericalProperty.dispatchWithoutClose(writer));

            dispatchDelete(writer);
            dispatchInterpolations(writer);
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
            dispatchReference(writer);
        }
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
    public List<AlignedAxisProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<AlignedAxisProperty> intervals) {
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
        private UnitCartesianProperty unitCartesian;
        private UnitSphericalProperty unitSpherical;

        protected Boolean delete;
        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<AlignedAxisProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withUnitCartesian(UnitCartesianProperty unitCartesian) {
            this.unitCartesian = unitCartesian;
            return this;
        }

        public Builder withUnitSpherical(UnitSphericalProperty unitSpherical) {
            this.unitSpherical = unitSpherical;
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

        public Builder withIntervals(List<AlignedAxisProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public AlignedAxisPropertyImpl build() {
            AlignedAxisPropertyImpl alignedAxisPropertyImpl = new AlignedAxisPropertyImpl();
            alignedAxisPropertyImpl.setUnitCartesian(unitCartesian);
            alignedAxisPropertyImpl.setUnitSpherical(unitSpherical);
            alignedAxisPropertyImpl.setDelete(delete);
            alignedAxisPropertyImpl.setInterpolations(interpolations);
            alignedAxisPropertyImpl.setInterval(interval);
            alignedAxisPropertyImpl.setIntervals(intervals);
            alignedAxisPropertyImpl.setReference(reference);
            return alignedAxisPropertyImpl;
        }
    }
}
