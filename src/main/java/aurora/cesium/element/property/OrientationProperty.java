package aurora.cesium.element.property;

import aurora.cesium.language.writer.OrientationCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.UnitQuaternion;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface OrientationProperty extends Property<OrientationCesiumWriter>, Interpolatable, Intervalable<OrientationProperty>, Referenceable {

    static OrientationProperty from(UnitQuaternion unitQuaternion) {
        return newBuilder().withValue(unitQuaternion).build();
    }

    static OrientationProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static OrientationPropertyImpl.Builder newBuilder() {
        return OrientationPropertyImpl.Builder.newBuilder();
    }

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<OrientationProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<OrientationCesiumWriter> supplier);
}
