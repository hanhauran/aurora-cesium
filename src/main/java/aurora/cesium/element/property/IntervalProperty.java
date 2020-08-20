package aurora.cesium.element.property;

import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.advanced.CesiumPropertyWriter;

import java.util.Optional;

interface IntervalProperty extends Property {

    default TimeInterval getInterval() {
        return null;
    }

    default void setInterval(TimeInterval interval) {
    }

    default <T extends CesiumPropertyWriter<T>> void dispatchInterval(T writer) {
        Optional.ofNullable(getInterval()).ifPresent(writer::writeInterval);
    }
}
