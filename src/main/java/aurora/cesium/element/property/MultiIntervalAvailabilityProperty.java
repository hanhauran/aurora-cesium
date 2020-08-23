package aurora.cesium.element.property;

import aurora.cesium.language.writer.PacketCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public class MultiIntervalAvailabilityProperty extends PropertyAdapter<AvailabilityProperty> implements AvailabilityProperty {

    private List<TimeInterval> intervals;

    public MultiIntervalAvailabilityProperty() {
        super();
    }

    public MultiIntervalAvailabilityProperty(List<TimeInterval> intervals) {
        this.intervals = intervals;
    }

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
