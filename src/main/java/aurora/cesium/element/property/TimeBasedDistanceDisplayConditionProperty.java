package aurora.cesium.element.property;

import aurora.cesium.language.writer.Bounds;
import aurora.cesium.language.writer.DistanceDisplayConditionCesiumWriter;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedDistanceDisplayConditionProperty extends BaseSingleInterpolatableTimeBasedIntervalProperty<Bounds> implements DistanceDisplayConditionProperty {

    public TimeBasedDistanceDisplayConditionProperty() {
        super();
    }

    public TimeBasedDistanceDisplayConditionProperty(List<JulianDate> dates, List<Bounds> instance) {
        super(dates, instance);
    }

    public TimeBasedDistanceDisplayConditionProperty(List<JulianDate> dates, List<Bounds> instance, TimeInterval interval) {
        super(dates, instance, interval);
    }

    public TimeBasedDistanceDisplayConditionProperty(List<JulianDate> dates, List<Bounds> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public TimeBasedDistanceDisplayConditionProperty(List<JulianDate> dates, List<Bounds> instance, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instance, startIndex, length, interval);
    }

    @Override
    public void dispatchDistanceDisplayCondition(DistanceDisplayConditionCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeDistanceDisplayCondition, writer::writeDistanceDisplayCondition);
            dispatchInterpolations(writer);
        }
    }
}
