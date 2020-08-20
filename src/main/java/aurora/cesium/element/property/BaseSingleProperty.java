package aurora.cesium.element.property;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
abstract class BaseSingleProperty<T> extends BaseProperty implements Property {

    protected T instance;

    public BaseSingleProperty() {
        super();
    }

    public BaseSingleProperty(T instance) {
        this.instance = instance;
    }

    protected void dispatchConsumer(Consumer<? super T> action) {
        Optional.ofNullable(instance).ifPresent(action);
    }
}
