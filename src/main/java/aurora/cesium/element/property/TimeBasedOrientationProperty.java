package aurora.cesium.element.property;

import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.OrientationCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.UnitQuaternion;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedOrientationProperty extends BaseSingleInterpolatableTimeBasedIntervalProperty<UnitQuaternion> implements OrientationProperty, InterpolatableProperty, IntervalProperty, Property {

    public TimeBasedOrientationProperty() {
        super();
    }

    public TimeBasedOrientationProperty(List<JulianDate> dates, List<UnitQuaternion> instance) {
        super(dates, instance);
    }

    public TimeBasedOrientationProperty(List<JulianDate> dates, List<UnitQuaternion> instance, TimeInterval interval) {
        super(dates, instance, interval);
    }

    public TimeBasedOrientationProperty(List<JulianDate> dates, List<UnitQuaternion> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public TimeBasedOrientationProperty(List<JulianDate> dates, List<UnitQuaternion> instance, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instance, startIndex, length, interval);
    }

    @Override
    public void dispatchOrientation(OrientationCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeUnitQuaternion, writer::writeUnitQuaternion);
            dispatchInterpolations(writer);
        }
    }

    public List<UnitQuaternion> getUnitQuaternions() {
        return instance;
    }

    public void setUnitQuaternions(List<UnitQuaternion> unitQuaternions) {
        this.instance = unitQuaternions;
    }
}
