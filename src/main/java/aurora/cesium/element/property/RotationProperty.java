package aurora.cesium.element.property;

import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.RotationCesiumWriter;
import cesiumlanguagewriter.TimeInterval;
import cesiumlanguagewriter.UnitQuaternion;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface RotationProperty extends Property<RotationCesiumWriter>, Deletable, Interpolatable, Intervalable<RotationProperty>, Referenceable {

    static RotationProperty from(UnitQuaternion unitQuaternion) {
        return from(UnitQuaternionProperty.from(unitQuaternion));
    }

    static RotationProperty from(UnitQuaternionProperty unitQuaternionProperty) {
        return newBuilder().withUnitQuaternion(unitQuaternionProperty).build();
    }

    static RotationProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static RotationPropertyImpl.Builder newBuilder() {
        return RotationPropertyImpl.Builder.newBuilder();
    }

    UnitQuaternionProperty getUnitQuaternion();

    @Override
    Boolean getDelete();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<RotationProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<RotationCesiumWriter> supplier);
}
