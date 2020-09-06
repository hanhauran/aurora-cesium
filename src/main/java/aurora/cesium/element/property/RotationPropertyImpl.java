package aurora.cesium.element.property;

import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.RotationCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
class RotationPropertyImpl extends PropertyAdapter<RotationProperty> implements RotationProperty {

    private UnitQuaternionProperty unitQuaternion;

    @Override
    public void dispatch(Supplier<RotationCesiumWriter> supplier) {
        try (RotationCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getUnitQuaternion()).ifPresent(unitCartesianProperty -> unitCartesianProperty.dispatchWithoutClose(writer));

            dispatchDelete(writer);
            dispatchInterpolations(writer);
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
            dispatchReference(writer);
        }
    }

    @Override
    public UnitQuaternionProperty getUnitQuaternion() {
        return unitQuaternion;
    }

    public void setUnitQuaternion(UnitQuaternionProperty unitQuaternion) {
        this.unitQuaternion = unitQuaternion;
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
    public List<RotationProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<RotationProperty> intervals) {
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
        private UnitQuaternionProperty unitQuaternion;

        private Boolean delete;
        private Interpolations interpolations;
        private TimeInterval interval;
        private List<RotationProperty> intervals;
        private Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withUnitQuaternion(UnitQuaternionProperty unitQuaternion) {
            this.unitQuaternion = unitQuaternion;
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

        public Builder withIntervals(List<RotationProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public RotationPropertyImpl build() {
            RotationPropertyImpl rotationPropertyImpl = new RotationPropertyImpl();
            rotationPropertyImpl.setUnitQuaternion(unitQuaternion);
            rotationPropertyImpl.setDelete(delete);
            rotationPropertyImpl.setInterpolations(interpolations);
            rotationPropertyImpl.setInterval(interval);
            rotationPropertyImpl.setIntervals(intervals);
            rotationPropertyImpl.setReference(reference);
            return rotationPropertyImpl;
        }
    }
}
