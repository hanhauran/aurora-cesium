package aurora.cesium.element.property;

import cesiumlanguagewriter.*;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface AlignedAxisProperty extends Property<AlignedAxisCesiumWriter>, Deletable, Interpolatable, Intervalable<AlignedAxisProperty>, Referenceable {

    static AlignedAxisProperty from(UnitCartesian unitCartesian) {
        return from(UnitCartesianProperty.from(unitCartesian));
    }

    static AlignedAxisProperty from(UnitCartesianProperty unitCartesianProperty) {
        return newBuilder().withUnitCartesian(unitCartesianProperty).build();
    }

    static AlignedAxisProperty from(UnitSpherical unitSpherical) {
        return from(UnitSphericalProperty.from(unitSpherical));
    }

    static AlignedAxisProperty from(UnitSphericalProperty unitSphericalProperty) {
        return newBuilder().withUnitSpherical(unitSphericalProperty).build();
    }

    static AlignedAxisProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static AlignedAxisPropertyImpl.Builder newBuilder() {
        return AlignedAxisPropertyImpl.Builder.newBuilder();
    }

    UnitCartesianProperty getUnitCartesian();

    UnitSphericalProperty getUnitSpherical();

    @Override
    Boolean getDelete();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<AlignedAxisProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<AlignedAxisCesiumWriter> supplier);
}
