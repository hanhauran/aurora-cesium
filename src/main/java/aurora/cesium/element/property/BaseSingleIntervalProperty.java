package aurora.cesium.element.property;

import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
abstract class BaseSingleIntervalProperty<T> extends BaseSingleProperty<T> implements IntervalProperty, Property {

    protected TimeInterval interval;

    public BaseSingleIntervalProperty() {
        super();
    }

    public BaseSingleIntervalProperty(T instance) {
        super(instance);
    }

    public BaseSingleIntervalProperty(T instance, TimeInterval interval) {
        super(instance);
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
