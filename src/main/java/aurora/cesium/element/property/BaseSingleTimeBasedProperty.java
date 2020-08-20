package aurora.cesium.element.property;

import aurora.cesium.language.writer.JulianDate;

import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
abstract class BaseSingleTimeBasedProperty<T> extends BaseSingleProperty<List<T>> implements Property {

    protected List<JulianDate> dates;

    protected Integer startIndex;

    protected Integer length;

    public BaseSingleTimeBasedProperty() {
        super();
    }

    public BaseSingleTimeBasedProperty(List<JulianDate> dates, List<T> instance) {
        this.dates = dates;
        this.instance = instance;
    }

    public BaseSingleTimeBasedProperty(List<JulianDate> dates, List<T> instance, Integer startIndex, Integer length) {
        this.dates = dates;
        this.instance = instance;
        this.startIndex = startIndex;
        this.length = length;
    }

    protected void dispatchConsumer(BiConsumer<List<JulianDate>, List<T>> biConsumer, QuadrupleConsumer<List<JulianDate>, List<T>, Integer, Integer> quadrupleConsumer) {
        Optional.ofNullable(getStartIndex()).ifPresentOrElse(
                idx -> Optional.ofNullable(getLength()).ifPresentOrElse(
                        len -> Optional.ofNullable(getDates()).ifPresent(julianDates -> Optional.ofNullable(instance).ifPresent(it -> quadrupleConsumer.accept(julianDates, it, idx, len))),
                        () -> Optional.ofNullable(getDates()).ifPresent(julianDates -> Optional.ofNullable(instance).ifPresent(it -> biConsumer.accept(julianDates, it)))
                ),
                () -> Optional.ofNullable(getDates()).ifPresent(julianDates -> Optional.ofNullable(instance).ifPresent(it -> biConsumer.accept(julianDates, it)))
        );
    }

    public List<JulianDate> getDates() {
        return dates;
    }

    public void setDates(List<JulianDate> dates) {
        this.dates = dates;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}
