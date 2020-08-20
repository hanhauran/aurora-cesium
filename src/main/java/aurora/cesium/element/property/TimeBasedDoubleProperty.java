package aurora.cesium.element.property;

import aurora.cesium.language.writer.DoubleCesiumWriter;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedDoubleProperty extends BaseSingleInterpolatableTimeBasedIntervalProperty<Double> implements DoubleProperty, InterpolatableProperty, IntervalProperty {
    public TimeBasedDoubleProperty() {
        super();
    }

    public TimeBasedDoubleProperty(List<JulianDate> dates, List<Double> instance) {
        super(dates, instance);
    }

    public TimeBasedDoubleProperty(List<JulianDate> dates, List<Double> instance, TimeInterval interval) {
        super(dates, instance, interval);
    }

    public TimeBasedDoubleProperty(List<JulianDate> dates, List<Double> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public TimeBasedDoubleProperty(List<JulianDate> dates, List<Double> instance, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instance, startIndex, length, interval);
    }

    @Override
    public void dispatchDouble(DoubleCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeNumber, writer::writeNumber);
            dispatchInterpolatableProperty(writer);
        }
    }

    public List<Double> getDoubles() {
        return instance;
    }

    public void setDoubles(List<Double> doubles) {
        this.instance = doubles;
    }
}
