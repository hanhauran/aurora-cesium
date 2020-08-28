package aurora.cesium.element.property;

import aurora.cesium.language.writer.PacketCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface AvailabilityProperty extends Property {

    static AvailabilityProperty from(TimeInterval interval) {
        return newBuilder().withInterval(interval).build();
    }

    static AvailabilityProperty from(List<TimeInterval> intervals) {
        return newBuilder().withIntervals(intervals).build();
    }

    static DefaultAvailabilityProperty.Builder newBuilder() {
        return DefaultAvailabilityProperty.Builder.newBuilder();
    }

    void dispatchAvailability(PacketCesiumWriter writer);
}
