package aurora.cesium.element.property;

import cesiumlanguagewriter.*;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public interface DirectionProperty extends Property<DirectionCesiumWriter>, Deletable, Interpolatable, Intervalable<DirectionProperty>, Referenceable {

    static DirectionProperty from(Cartesian cartesian) {
        return from(CartesianProperty.from(cartesian));
    }

    static DirectionProperty from(CartesianProperty cartesianProperty) {
        return newBuilder().withCartesian(cartesianProperty).build();
    }

    static DirectionProperty from(Spherical spherical) {
        return from(SphericalProperty.from(spherical));
    }

    static DirectionProperty from(SphericalProperty sphericalProperty) {
        return newBuilder().withSpherical(sphericalProperty).build();
    }

    static DirectionProperty from(UnitCartesian unitCartesian) {
        return from(UnitCartesianProperty.from(unitCartesian));
    }

    static DirectionProperty from(UnitCartesianProperty unitCartesianProperty) {
        return newBuilder().withUnitCartesian(unitCartesianProperty).build();
    }

    static DirectionProperty from(UnitSpherical unitSpherical) {
        return from(UnitSphericalProperty.from(unitSpherical));
    }

    static DirectionProperty from(UnitSphericalProperty unitSphericalProperty) {
        return newBuilder().withUnitSpherical(unitSphericalProperty).build();
    }

    static DirectionPropertyImpl.Builder newBuilder() {
        return DirectionPropertyImpl.Builder.newBuilder();
    }

    CartesianProperty getCartesian();

    SphericalProperty getSpherical();

    UnitCartesianProperty getUnitCartesian();

    UnitSphericalProperty getUnitSpherical();

    @Override
    Boolean getDelete();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<DirectionProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<DirectionCesiumWriter> supplier);
}
