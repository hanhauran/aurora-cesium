package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface AlignedAxisProperty extends InterpolatableProperty, IntervalProperty<AlignedAxisProperty>, ReferenceProperty {

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
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<AlignedAxisProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(AlignedAxisCesiumWriter writer);
}
