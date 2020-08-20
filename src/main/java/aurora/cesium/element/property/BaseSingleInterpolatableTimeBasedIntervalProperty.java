package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
abstract class BaseSingleInterpolatableTimeBasedIntervalProperty<T> extends BaseSingleInterpolatableTimeBasedProperty<T> implements IntervalProperty, InterpolatableProperty {

    protected TimeInterval interval;

    public BaseSingleInterpolatableTimeBasedIntervalProperty() {
        super();
    }

    public BaseSingleInterpolatableTimeBasedIntervalProperty(List<JulianDate> dates, List<T> instance) {
        super(dates, instance);
    }

    public BaseSingleInterpolatableTimeBasedIntervalProperty(List<JulianDate> dates, List<T> instance, TimeInterval interval) {
        super(dates, instance);
        this.interval = interval;
    }

    public BaseSingleInterpolatableTimeBasedIntervalProperty(List<JulianDate> dates, List<T> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public BaseSingleInterpolatableTimeBasedIntervalProperty(List<JulianDate> dates, List<T> instance, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instance, startIndex, length);
        this.interval = interval;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    @Override
    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }
}
