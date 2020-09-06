package aurora.cesium.element.property;

import cesiumlanguagewriter.OrientationCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
class OrientationPropertyImpl extends PropertyAdapter<OrientationProperty> implements OrientationProperty {

    private UnitQuaternionProperty unitQuaternion;

    private Reference velocityReference;

    @Override
    public void dispatch(Supplier<OrientationCesiumWriter> supplier) {
        try (OrientationCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getUnitQuaternion()).ifPresent(unitQuaternionProperty -> unitQuaternionProperty.dispatchWithoutClose(writer));
            Optional.ofNullable(getVelocityReference()).ifPresent(writer::writeVelocityReference);

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
    public Reference getVelocityReference() {
        return velocityReference;
    }

    public void setVelocityReference(Reference velocityReference) {
        this.velocityReference = velocityReference;
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
    public List<OrientationProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<OrientationProperty> intervals) {
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
        private Reference velocityReference;

        private Boolean delete;
        private Interpolations interpolations;
        private TimeInterval interval;
        private List<OrientationProperty> intervals;
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

        public Builder withVelocityReference(Reference velocityReference) {
            this.velocityReference = velocityReference;
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

        public Builder withIntervals(List<OrientationProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public OrientationPropertyImpl build() {
            OrientationPropertyImpl orientationPropertyImpl = new OrientationPropertyImpl();
            orientationPropertyImpl.setUnitQuaternion(unitQuaternion);
            orientationPropertyImpl.setVelocityReference(velocityReference);
            orientationPropertyImpl.setDelete(delete);
            orientationPropertyImpl.setInterpolations(interpolations);
            orientationPropertyImpl.setInterval(interval);
            orientationPropertyImpl.setIntervals(intervals);
            orientationPropertyImpl.setReference(reference);
            return orientationPropertyImpl;
        }
    }
}
