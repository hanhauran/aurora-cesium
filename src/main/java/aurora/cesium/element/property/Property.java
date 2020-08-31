package aurora.cesium.element.property;

import java.util.function.Supplier;

interface Property<WRITER> {

    default void dispatch(Supplier<WRITER> supplier) {
        throw new UnsupportedOperationException();
    }

    default void dispatchWithoutClose(WRITER writer) {
        throw new UnsupportedOperationException();
    }
}
