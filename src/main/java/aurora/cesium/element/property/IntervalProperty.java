package aurora.cesium.element.property;

import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.advanced.CesiumPropertyWriter;

import java.util.Optional;

interface IntervalProperty extends Property {

    TimeInterval getInterval();

    default <T extends CesiumPropertyWriter<T>> void dispatchInterval(T writer) {
        dispatchInterval(writer, this);
    }

    default <T extends CesiumPropertyWriter<T>> void dispatchInterval(T writer, IntervalProperty property) {
        Optional.ofNullable(property.getInterval()).ifPresent(writer::writeInterval);
    }
}
