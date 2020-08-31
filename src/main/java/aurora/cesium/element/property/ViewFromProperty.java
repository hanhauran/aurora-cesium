package aurora.cesium.element.property;

import aurora.cesium.language.writer.Cartesian;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.ViewFromCesiumWriter;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface ViewFromProperty extends Property<ViewFromCesiumWriter>, Interpolatable, Intervalable<ViewFromProperty>, Referenceable {

    static ViewFromProperty from(Cartesian cartesian) {
        return from(CartesianProperty.from(cartesian));
    }

    static ViewFromProperty from(CartesianProperty cartesianProperty) {
        return newBuilder().withCartesian(cartesianProperty).build();
    }

    static ViewFromProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static ViewFromPropertyImpl.Builder newBuilder() {
        return ViewFromPropertyImpl.Builder.newBuilder();
    }

    CartesianProperty getCartesian();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<ViewFromProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<ViewFromCesiumWriter> supplier);
}
