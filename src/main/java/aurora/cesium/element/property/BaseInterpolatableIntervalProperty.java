package aurora.cesium.element.property;

import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class BaseInterpolatableIntervalProperty extends BaseInterpolatableProperty implements IntervalProperty, InterpolatableProperty {

    protected TimeInterval interval;

    public BaseInterpolatableIntervalProperty() {
        super();
    }

    public BaseInterpolatableIntervalProperty(TimeInterval interval) {
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
