package aurora.cesium.element.property;

import cesiumlanguagewriter.OrientationCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;
import cesiumlanguagewriter.UnitQuaternion;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface OrientationProperty extends Property<OrientationCesiumWriter>, Deletable, Interpolatable, Intervalable<OrientationProperty>, Referenceable {

    static OrientationProperty from(UnitQuaternion unitQuaternion) {
        return from(UnitQuaternionProperty.from(unitQuaternion));
    }

    static OrientationProperty from(UnitQuaternionProperty unitQuaternionProperty) {
        return newBuilder().withUnitQuaternion(unitQuaternionProperty).build();
    }

    static OrientationProperty fromVelocity(Reference reference) {
        return newBuilder().withVelocityReference(reference).build();
    }

    static OrientationProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static OrientationPropertyImpl.Builder newBuilder() {
        return OrientationPropertyImpl.Builder.newBuilder();
    }

    UnitQuaternionProperty getUnitQuaternion();

    Reference getVelocityReference();

    @Override
    Boolean getDelete();

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
