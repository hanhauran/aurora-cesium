package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
abstract class SingleTimeBasedPropertyAdapter<T, P extends Property> extends SinglePropertyAdapter<T, P> {

    protected List<JulianDate> dates;

    protected List<T> instances;

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

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> instances) {
        this(dates, instances, null, null, null, null);
    }

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> instances, Interpolations interpolations) {
        this(dates, instances, null, null, interpolations, null);
    }

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> instances, TimeInterval interval) {
        this(dates, instances, null, null, null, interval);
    }

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> instances, Interpolations interpolations, TimeInterval interval) {
        this(dates, instances, null, null, interpolations, interval);
    }

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> instances, Integer startIndex, Integer length) {
        this(dates, instances, startIndex, length, null, null);
    }

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> instances, Integer startIndex, Integer length, Interpolations interpolations) {
        this(dates, instances, startIndex, length, interpolations, null);
    }

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> instances, Integer startIndex, Integer length, TimeInterval interval) {
        this(dates, instances, startIndex, length, null, interval);
    }

    public SingleTimeBasedPropertyAdapter(List<JulianDate> dates, List<T> instances, Integer startIndex, Integer length, Interpolations interpolations, TimeInterval interval) {
        this.dates = dates;
        this.instances = instances;
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
        Optional.ofNullable(instance).ifPresent(consumer);
        Optional.ofNullable(getStartIndex()).ifPresentOrElse(
                idx -> Optional.ofNullable(getLength()).ifPresentOrElse(
                        len -> Optional.ofNullable(getDates()).ifPresent(julianDates -> Optional.ofNullable(instances).ifPresent(it -> quadrupleConsumer.accept(julianDates, it, idx, len))),
                        () -> Optional.ofNullable(getDates()).ifPresent(julianDates -> Optional.ofNullable(instances).ifPresent(it -> biConsumer.accept(julianDates, it)))
                ),
                () -> Optional.ofNullable(getDates()).ifPresent(julianDates -> Optional.ofNullable(instances).ifPresent(it -> biConsumer.accept(julianDates, it)))
        );
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

    public List<T> getInstances() {
        return instances;
    }

    public void setInstances(List<T> instances) {
        this.instances = instances;
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
