package aurora.cesium.element.property;

import aurora.cesium.language.writer.JulianDate;

import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
final class Helper {
    private Helper() {}

    static <T> void dispatchTimeBasedProperty(TimeBasedProperty<T> property, List<T> instance, BiConsumer<List<JulianDate>, List<T>> biConsumer, QuadrupleConsumer<List<JulianDate>, List<T>, Integer, Integer> quadrupleConsumer) {
        Optional.ofNullable(property.getStartIndex()).ifPresentOrElse(
                idx -> Optional.ofNullable(property.getLength()).ifPresentOrElse(
                        len -> Optional.ofNullable(property.getDates()).ifPresent(julianDates -> Optional.ofNullable(instance).ifPresent(it -> quadrupleConsumer.accept(julianDates, it, idx, len))),
                        () -> Optional.ofNullable(property.getDates()).ifPresent(julianDates -> Optional.ofNullable(instance).ifPresent(it -> biConsumer.accept(julianDates, it)))
                ),
                () -> Optional.ofNullable(property.getDates()).ifPresent(julianDates -> Optional.ofNullable(instance).ifPresent(it -> biConsumer.accept(julianDates, it)))
        );
    }
}
