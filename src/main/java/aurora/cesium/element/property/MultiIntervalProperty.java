package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumIntervalListWriter;
import aurora.cesium.language.writer.advanced.CesiumPropertyWriter;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface MultiIntervalProperty<T extends IntervalProperty> {

    List<T> getIntervals();

    default <U extends CesiumPropertyWriter<U>, W extends CesiumIntervalListWriter<U>> void dispatchIntervals(Supplier<W> intervalListWriterSupplier, BiConsumer<? super U, ? super T> biConsumer) {
        if (getIntervals() != null && !getIntervals().isEmpty()) {
            W intervalListWriter = intervalListWriterSupplier.get();
            getIntervals().forEach(property -> biConsumer.accept(intervalListWriter.openInterval(), property));
        }
    }
}
