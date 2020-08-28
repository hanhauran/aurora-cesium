package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
abstract class SinglePropertyAdapter<T, P extends Property> extends PropertyAdapter<P> {

    protected T instance;

    public SinglePropertyAdapter() {
        super();
    }

    public SinglePropertyAdapter(T instance) {
        this.instance = instance;
    }

    public SinglePropertyAdapter(T instance, TimeInterval interval) {
        this(instance, null, interval);
    }

    public SinglePropertyAdapter(T instance, Interpolations interpolations) {
        this(instance, interpolations, null);
    }

    public SinglePropertyAdapter(T instance, Interpolations interpolations, TimeInterval interval) {
        this.instance = instance;
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
        Optional.ofNullable(instance).ifPresent(action);
    }

    public T getInstance() {
        return instance;
    }

    public void setInstance(T instance) {
        this.instance = instance;
    }
}
