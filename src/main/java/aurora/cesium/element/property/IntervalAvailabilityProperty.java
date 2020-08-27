package aurora.cesium.element.property;

import aurora.cesium.language.writer.PacketCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public class IntervalAvailabilityProperty implements AvailabilityProperty {

    private TimeInterval interval;

    @Override
    public void dispatchAvailability(PacketCesiumWriter writer) {
        Optional.ofNullable(getInterval()).ifPresent(writer::writeAvailability);
    }

    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }
}
