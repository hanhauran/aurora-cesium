package aurora.cesium.element.property;

import cesiumlanguagewriter.CesiumSensorVolumePortionToDisplay;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.SensorVolumePortionToDisplayCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
class SensorVolumePortionToDisplayPropertyImpl extends SinglePropertyAdapter<CesiumSensorVolumePortionToDisplay, SensorVolumePortionToDisplayProperty> implements SensorVolumePortionToDisplayProperty {

    @Override
    public void dispatch(Supplier<SensorVolumePortionToDisplayCesiumWriter> supplier) {
        try (SensorVolumePortionToDisplayCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writePortionToDisplay);

            dispatchDelete(writer);
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
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<SensorVolumePortionToDisplayProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<SensorVolumePortionToDisplayProperty> intervals) {
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
        private CesiumSensorVolumePortionToDisplay value;

        private Boolean delete;
        private TimeInterval interval;
        private List<SensorVolumePortionToDisplayProperty> intervals;
        private Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CesiumSensorVolumePortionToDisplay value) {
            this.value = value;
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

        public Builder withIntervals(List<SensorVolumePortionToDisplayProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public SensorVolumePortionToDisplayPropertyImpl build() {
            SensorVolumePortionToDisplayPropertyImpl sensorVolumePortionToDisplayPropertyImpl = new SensorVolumePortionToDisplayPropertyImpl();
            sensorVolumePortionToDisplayPropertyImpl.setValue(value);
            sensorVolumePortionToDisplayPropertyImpl.setDelete(delete);
            sensorVolumePortionToDisplayPropertyImpl.setInterval(interval);
            sensorVolumePortionToDisplayPropertyImpl.setIntervals(intervals);
            sensorVolumePortionToDisplayPropertyImpl.setReference(reference);
            return sensorVolumePortionToDisplayPropertyImpl;
        }
    }
}
