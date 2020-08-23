package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
abstract class SingleTimeBasedPropertyAdapter<T, P extends Property> extends SinglePropertyAdapter<List<T>, P> {

    protected List<JulianDate> dates;

    protected Integer startIndex;

    protected Integer length;

    public SingleTimeBasedPropertyAdapter() {}

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> instance) {
        this(dates, instance, null, null, null, null);
    }

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> instance, Interpolations interpolations) {
        this(dates, instance, null, null, interpolations, null);
    }

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> instance, TimeInterval interval) {
        this(dates, instance, null, null, null, interval);
    }

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> instance, Interpolations interpolations, TimeInterval interval) {
        this(dates, instance, null, null, interpolations, interval);
    }

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> instance, Integer startIndex, Integer length) {
        this(dates, instance, startIndex, length, null, null);
    }

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> instance, Integer startIndex, Integer length, Interpolations interpolations) {
        this(dates, instance, startIndex, length, interpolations, null);
    }

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> instance, Integer startIndex, Integer length, TimeInterval interval) {
        this(dates, instance, startIndex, length, null, interval);
    }

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> instance, Integer startIndex, Integer length, Interpolations interpolations, TimeInterval interval) {
        this.dates = dates;
        this.instance = instance;
        this.startIndex = startIndex;
        this.length = length;
        this.interpolations = interpolations;
        this.interval = interval;
    }

    public SingleTimeBasedPropertyAdapter(Reference reference) {
        super(reference);
    }

    public SingleTimeBasedPropertyAdapter(List<P> intervals) {
        super(intervals);
    }

    void dispatchConsumer(BiConsumer<List<JulianDate>, List<T>> biConsumer, QuadrupleConsumer<List<JulianDate>, List<T>, Integer, Integer> quadrupleConsumer) {
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
