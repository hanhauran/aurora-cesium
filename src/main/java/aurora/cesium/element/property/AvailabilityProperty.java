package aurora.cesium.element.property;

import aurora.cesium.language.writer.PacketCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface AvailabilityProperty extends Property<PacketCesiumWriter> {

    static AvailabilityProperty from(TimeInterval interval) {
        return newBuilder().withInterval(interval).build();
    }

    static AvailabilityProperty from(List<TimeInterval> intervals) {
        return newBuilder().withIntervals(intervals).build();
    }

    static AvailabilityPropertyImpl.Builder newBuilder() {
        return AvailabilityPropertyImpl.Builder.newBuilder();
    }

    @Override
    void dispatchWithoutClose(PacketCesiumWriter writer);
}
