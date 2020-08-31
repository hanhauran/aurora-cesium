package aurora.cesium.element.property;

import aurora.cesium.language.writer.Cartesian;
import aurora.cesium.language.writer.EllipsoidRadiiCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface EllipsoidRadiiProperty extends Property<EllipsoidRadiiCesiumWriter>, Interpolatable, Intervalable<EllipsoidRadiiProperty>, Referenceable {

    static EllipsoidRadiiProperty from(Cartesian cartesian) {
        return newBuilder().withCartesian(CartesianProperty.from(cartesian)).build();
    }

    static EllipsoidRadiiProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static EllipsoidRadiiPropertyImpl.Builder newBuilder() {
        return EllipsoidRadiiPropertyImpl.Builder.newBuilder();
    }

    CartesianProperty getCartesian();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<EllipsoidRadiiProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<EllipsoidRadiiCesiumWriter> supplier);
}
