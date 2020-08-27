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

    public DefaultAvailabilityProperty(TimeInterval interval) {
        this.interval = interval;
    }

    public DefaultAvailabilityProperty(List<TimeInterval> intervals) {
        this.intervals = intervals;
    }

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
}
