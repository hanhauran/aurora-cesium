package aurora.cesium.element.property;

import aurora.cesium.language.writer.BoxDimensionsCesiumWriter;
import aurora.cesium.language.writer.Cartesian;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface BoxDimensionsProperty extends Property<BoxDimensionsCesiumWriter>, Intervalable<BoxDimensionsProperty>, Referenceable {

    static BoxDimensionsProperty from(Cartesian cartesian) {
        return from(CartesianProperty.from(cartesian));
    }

    static BoxDimensionsProperty from(CartesianProperty cartesianProperty) {
        return newBuilder().withCartesian(cartesianProperty).build();
    }

    static BoxDimensionsProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static BoxDimensionsPropertyImpl.Builder newBuilder() {
        return BoxDimensionsPropertyImpl.Builder.newBuilder();
    }

    CartesianProperty getCartesian();

    @Override
    TimeInterval getInterval();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<BoxDimensionsCesiumWriter> supplier);
}
