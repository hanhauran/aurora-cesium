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
public interface MultiIntervalProperty<P extends MultiIntervalProperty<P>> extends Property {

    TimeInterval getInterval();

    List<P> getIntervals();

    default <W extends CesiumPropertyWriter<W>> void dispatchInterval(W writer, BiConsumer<? super W, ? super P> biConsumer) {
        Optional.ofNullable(getInterval()).ifPresent(writer::writeInterval);
        Optional.ofNullable(getIntervals()).ifPresent(properties -> {
            if (properties.isEmpty()) {
                return;
            }

            try (CesiumIntervalListWriter<W> intervalListWriter = writer.openMultipleIntervals()) {
                properties.forEach(property -> {
                    try (W intervalWriter = intervalListWriter.openInterval()) {
                        biConsumer.accept(intervalWriter, property);
                    }
                });
            }
        });
    }
}
