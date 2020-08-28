package aurora.cesium.element.property;

import aurora.cesium.language.writer.PacketCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public class DefaultAvailabilityProperty implements AvailabilityProperty {

    private TimeInterval interval;

    private List<TimeInterval> intervals;

    @Override
    public void dispatchAvailability(PacketCesiumWriter writer) {
        Optional.ofNullable(getInterval()).ifPresent(writer::writeAvailability);
        Optional.ofNullable(getIntervals()).ifPresent(writer::writeAvailability);
    }

    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    public List<TimeInterval> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<TimeInterval> intervals) {
        this.intervals = intervals;
    }

    public static final class Builder {
        private TimeInterval interval;
        private List<TimeInterval> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<TimeInterval> intervals) {
            this.intervals = intervals;
            return this;
        }

        public DefaultAvailabilityProperty build() {
            DefaultAvailabilityProperty defaultAvailabilityProperty = new DefaultAvailabilityProperty();
            defaultAvailabilityProperty.setInterval(interval);
            defaultAvailabilityProperty.setIntervals(intervals);
            return defaultAvailabilityProperty;
        }
    }
}
