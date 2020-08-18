package aurora.cesium.element.property;

import aurora.cesium.writer.TimeInterval;

public interface HasInterval {

    default TimeInterval getInterval() {
        return null;
    }
}
