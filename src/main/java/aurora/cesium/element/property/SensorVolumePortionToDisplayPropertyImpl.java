package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumSensorVolumePortionToDisplay;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.SensorVolumePortionToDisplayCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public class SensorVolumePortionToDisplayPropertyImpl extends SinglePropertyAdapter<CesiumSensorVolumePortionToDisplay, SensorVolumePortionToDisplayProperty> implements SensorVolumePortionToDisplayProperty {

    @Override
    public void dispatch(Supplier<SensorVolumePortionToDisplayCesiumWriter> supplier) {
        try (SensorVolumePortionToDisplayCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writePortionToDisplay);
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
            dispatchReference(writer);
        }
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
        protected CesiumSensorVolumePortionToDisplay value;
        protected TimeInterval interval;
        protected List<SensorVolumePortionToDisplayProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CesiumSensorVolumePortionToDisplay value) {
            this.value = value;
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
            sensorVolumePortionToDisplayPropertyImpl.setInterval(interval);
            sensorVolumePortionToDisplayPropertyImpl.setIntervals(intervals);
            sensorVolumePortionToDisplayPropertyImpl.setReference(reference);
            return sensorVolumePortionToDisplayPropertyImpl;
        }
    }
}
