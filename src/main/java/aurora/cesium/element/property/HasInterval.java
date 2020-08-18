package aurora.cesium.element.property;

import aurora.cesium.language.writer.TimeInterval;

public interface HasInterval {

    default TimeInterval getInterval() {
        return null;
    }
}
