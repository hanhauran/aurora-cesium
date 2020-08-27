package aurora.cesium.element.property;

import aurora.cesium.language.writer.PacketCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public class IntervalsAvailabilityProperty implements AvailabilityProperty {

    private List<TimeInterval> intervals;

    @Override
    public void dispatchAvailability(PacketCesiumWriter writer) {
        Optional.ofNullable(getIntervals()).ifPresent(writer::writeAvailability);
    }

    public List<TimeInterval> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<TimeInterval> intervals) {
        this.intervals = intervals;
    }
}
