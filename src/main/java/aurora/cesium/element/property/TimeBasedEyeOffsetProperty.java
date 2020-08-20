package aurora.cesium.element.property;

import aurora.cesium.language.writer.Cartesian;
import aurora.cesium.language.writer.EyeOffsetCesiumWriter;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedEyeOffsetProperty extends BaseSingleInterpolatableTimeBasedIntervalProperty<Cartesian> implements EyeOffsetProperty, InterpolatableProperty, IntervalProperty, Property {

    public TimeBasedEyeOffsetProperty() {
        super();
    }

    public TimeBasedEyeOffsetProperty(List<JulianDate> dates, List<Cartesian> instance) {
        super(dates, instance);
    }

    public TimeBasedEyeOffsetProperty(List<JulianDate> dates, List<Cartesian> instance, TimeInterval interval) {
        super(dates, instance, interval);
    }

    public TimeBasedEyeOffsetProperty(List<JulianDate> dates, List<Cartesian> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public TimeBasedEyeOffsetProperty(List<JulianDate> dates, List<Cartesian> instance, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instance, startIndex, length, interval);
    }

    @Override
    public void dispatchEyeOffset(EyeOffsetCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeCartesian, writer::writeCartesian);
            dispatchInterpolatableProperty(writer);
        }
    }

    public List<Cartesian> getCartesians() {
        return instance;
    }

    public void setCartesians(List<Cartesian> cartesians) {
        this.instance = cartesians;
    }
}
