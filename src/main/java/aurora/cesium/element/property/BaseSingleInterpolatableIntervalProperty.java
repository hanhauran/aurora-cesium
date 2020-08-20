package aurora.cesium.element.property;

import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
abstract class BaseSingleInterpolatableIntervalProperty<T> extends BaseSingleInterpolatableProperty<T> implements IntervalProperty, InterpolatableProperty {

    protected TimeInterval interval;

    public BaseSingleInterpolatableIntervalProperty() {
        super();
    }

    public BaseSingleInterpolatableIntervalProperty(T instance) {
        super(instance);
    }

    public BaseSingleInterpolatableIntervalProperty(T instance, TimeInterval interval) {
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
