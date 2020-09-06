package aurora.cesium.element.property;

import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
abstract class SinglePropertyAdapter<T, P extends Property<?>> extends PropertyAdapter<P> {

    protected T value;

    public SinglePropertyAdapter() {
        super();
    }

    public SinglePropertyAdapter(T value) {
        this.value = value;
    }

    public SinglePropertyAdapter(T value, TimeInterval interval) {
        this(value, null, interval);
    }

    public SinglePropertyAdapter(T value, Interpolations interpolations) {
        this(value, interpolations, null);
    }

    public SinglePropertyAdapter(T value, Interpolations interpolations, TimeInterval interval) {
        this.value = value;
        this.interpolations = interpolations;
        this.interval = interval;
    }

    public SinglePropertyAdapter(List<P> intervals) {
        this.intervals = intervals;
    }

    public SinglePropertyAdapter(Reference reference) {
        super(reference);
    }

    void dispatchConsumer(Consumer<? super T> action) {
        Optional.ofNullable(value).ifPresent(action);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
