package aurora.cesium.element.property;

import cesiumlanguagewriter.CesiumIntervalListWriter;
import cesiumlanguagewriter.TimeInterval;
import cesiumlanguagewriter.advanced.CesiumPropertyWriter;

import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface Intervalable<P extends Intervalable<P>> {

    TimeInterval getInterval();

    List<P> getIntervals();

    default <W extends CesiumPropertyWriter<W>> void dispatchInterval(W writer, BiConsumer<Supplier<W>, ? super P> biConsumer) {
        Optional.ofNullable(getInterval()).ifPresent(writer::writeInterval);
        Optional.ofNullable(getIntervals()).ifPresent(properties -> {
            if (properties.isEmpty()) {
                return;
            }

            try (CesiumIntervalListWriter<W> intervalListWriter = writer.openMultipleIntervals()) {
                properties.forEach(property -> biConsumer.accept(intervalListWriter::openInterval, property));
            }
        });
    }
}
