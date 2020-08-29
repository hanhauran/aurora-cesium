package aurora.cesium.element.property;

import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.RotationCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public class RotationPropertyImpl extends PropertyAdapter<RotationProperty> implements RotationProperty {

    private UnitQuaternionProperty unitQuaternion;

    @Override
    public void dispatch(RotationCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getUnitQuaternion()).ifPresent(unitCartesianProperty -> unitCartesianProperty.dispatchWithoutClose(writer));

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

        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<RotationProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withUnitQuaternion(UnitQuaternionProperty unitQuaternion) {
            this.unitQuaternion = unitQuaternion;
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
            rotationPropertyImpl.setInterpolations(interpolations);
            rotationPropertyImpl.setInterval(interval);
            rotationPropertyImpl.setIntervals(intervals);
            rotationPropertyImpl.setReference(reference);
            return rotationPropertyImpl;
        }
    }
}
