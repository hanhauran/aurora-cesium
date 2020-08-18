package aurora.cesium.element.property;

import aurora.cesium.writer.TimeInterval;

public abstract class BaseIntervalProperty implements HasInterval {

    protected TimeInterval interval;

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }
}
