package aurora.cesium.element.property;

import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
abstract class BaseSingleTimeBasedIntervalProperty<T> extends BaseSingleTimeBasedProperty<T> implements IntervalProperty {

    protected TimeInterval interval;

    public BaseSingleTimeBasedIntervalProperty() {
        super();
    }

    public BaseSingleTimeBasedIntervalProperty(List<JulianDate> dates, List<T> instance) {
        super(dates, instance);
    }

    public BaseSingleTimeBasedIntervalProperty(List<JulianDate> dates, List<T> instance, TimeInterval interval) {
        super(dates, instance);
        this.interval = interval;
    }

    public BaseSingleTimeBasedIntervalProperty(List<JulianDate> dates, List<T> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public BaseSingleTimeBasedIntervalProperty(List<JulianDate> dates, List<T> instance, Integer startIndex, Integer length, TimeInterval interval) {
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
