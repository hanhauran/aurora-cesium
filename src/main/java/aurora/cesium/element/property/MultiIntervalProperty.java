package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumIntervalListWriter;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.advanced.CesiumPropertyWriter;

import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface MultiIntervalProperty<W extends CesiumPropertyWriter<W>, P extends MultiIntervalProperty<W, P>> {

    TimeInterval getInterval();

    List<P> getIntervals();

    void dispatch(W writer);

    default void dispatchInterval(W writer) {
        Optional.ofNullable(getInterval()).ifPresent(writer::writeInterval);
        Optional.ofNullable(getIntervals()).ifPresent(properties -> {
            if (properties.isEmpty()) {
                return;
            }

            try (CesiumIntervalListWriter<W> intervalListWriter = writer.openMultipleIntervals()) {
                properties.forEach(property -> {
                    try (W intervalWriter = intervalListWriter.openInterval()) {
                        property.dispatch(intervalWriter);
                    }
                });
            }
        });
    }
}
