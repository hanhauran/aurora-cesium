package aurora.cesium.element.property;

import aurora.cesium.language.writer.IntegerCesiumWriter;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedIntegerProperty extends BaseSingleInterpolatableTimeBasedIntervalProperty<Integer> implements IntegerProperty, InterpolatableProperty, IntervalProperty, Property {

    public TimeBasedIntegerProperty() {
        super();
    }

    public TimeBasedIntegerProperty(List<JulianDate> dates, List<Integer> instance) {
        super(dates, instance);
    }

    public TimeBasedIntegerProperty(List<JulianDate> dates, List<Integer> instance, TimeInterval interval) {
        super(dates, instance, interval);
    }

    public TimeBasedIntegerProperty(List<JulianDate> dates, List<Integer> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public TimeBasedIntegerProperty(List<JulianDate> dates, List<Integer> instance, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instance, startIndex, length, interval);
    }

    @Override
    public void dispatchInteger(IntegerCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeNumber, writer::writeNumber);
            dispatchInterpolations(writer);
        }
    }

    public List<Integer> getIntegers() {
        return instance;
    }

    public void setIntegers(List<Integer> integers) {
        this.instance = integers;
    }
}
