package aurora.cesium.element.property;

import cesiumlanguagewriter.JulianDate;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
abstract class SingleTimeBasedPropertyAdapter<T, P extends Property<?>> extends SinglePropertyAdapter<T, P> {

    protected List<JulianDate> dates;

    protected List<T> values;

    protected Integer startIndex;

    protected Integer length;

    public SingleTimeBasedPropertyAdapter() {
        super();
    }

    public SingleTimeBasedPropertyAdapter(T instance) {
        super(instance);
    }

    public SingleTimeBasedPropertyAdapter(T instance, TimeInterval interval) {
        super(instance, interval);
    }

    public SingleTimeBasedPropertyAdapter(T instance, Interpolations interpolations) {
        super(instance, interpolations);
    }

    public SingleTimeBasedPropertyAdapter(T instance, Interpolations interpolations, TimeInterval interval) {
        super(instance, interpolations, interval);
    }

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> values) {
        this(dates, values, null, null, null, null);
    }

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> values, Interpolations interpolations) {
        this(dates, values, null, null, interpolations, null);
    }

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> values, TimeInterval interval) {
        this(dates, values, null, null, null, interval);
    }

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> values, Interpolations interpolations, TimeInterval interval) {
        this(dates, values, null, null, interpolations, interval);
    }

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> values, Integer startIndex, Integer length) {
        this(dates, values, startIndex, length, null, null);
    }

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> values, Integer startIndex, Integer length, Interpolations interpolations) {
        this(dates, values, startIndex, length, interpolations, null);
    }

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> values, Integer startIndex, Integer length, TimeInterval interval) {
        this(dates, values, startIndex, length, null, interval);
    }

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> values, Integer startIndex, Integer length, Interpolations interpolations, TimeInterval interval) {
        this.dates = dates;
        this.values = values;
        this.startIndex = startIndex;
        this.length = length;
        this.interpolations = interpolations;
        this.interval = interval;
    }

    public SingleTimeBasedPropertyAdapter(List<P> intervals) {
        super(intervals);
    }

    public SingleTimeBasedPropertyAdapter(Reference reference) {
        super(reference);
    }

    void dispatchConsumer(Consumer<? super T> consumer, BiConsumer<List<JulianDate>, List<T>> biConsumer, QuadrupleConsumer<List<JulianDate>, List<T>, Integer, Integer> quadrupleConsumer) {
        Optional.ofNullable(value).ifPresent(consumer);
        if (getStartIndex() == null || getLength() == null) {
            Optional.ofNullable(getDates()).ifPresent(ds -> Optional.ofNullable(getValues()).ifPresent(vs -> biConsumer.accept(ds, vs)));
        } else {
            Optional.ofNullable(getDates()).ifPresent(ds -> Optional.ofNullable(getValues()).ifPresent(vs -> quadrupleConsumer.accept(ds, vs, getStartIndex(), getLength())));
        }
//        JDK9
//        Optional.ofNullable(getStartIndex()).ifPresentOrElse(
//                idx -> Optional.ofNullable(getLength()).ifPresentOrElse(
//                        len -> Optional.ofNullable(getDates()).ifPresent(julianDates -> Optional.ofNullable(values).ifPresent(it -> quadrupleConsumer.accept(julianDates, it, idx, len))),
//                        () -> Optional.ofNullable(getDates()).ifPresent(julianDates -> Optional.ofNullable(values).ifPresent(it -> biConsumer.accept(julianDates, it)))
//                ),
//                () -> Optional.ofNullable(getDates()).ifPresent(julianDates -> Optional.ofNullable(values).ifPresent(it -> biConsumer.accept(julianDates, it)))
//        );
    }

    @Override
    void dispatchConsumer(Consumer<? super T> action) {
        throw new UnsupportedOperationException("bad methods...");
    }

    public List<JulianDate> getDates() {
        return dates;
    }

    public void setDates(List<JulianDate> dates) {
        this.dates = dates;
    }

    public List<T> getValues() {
        return values;
    }

    public void setValues(List<T> values) {
        this.values = values;
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
