package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface AlignedAxisProperty extends InterpolatableProperty, IntervalProperty<AlignedAxisProperty>, ReferenceProperty {

    static AlignedAxisProperty from(UnitCartesian unitCartesian) {
        return newBuilder().withUnitCartesian(UnitCartesianProperty.from(unitCartesian)).build();
    }

    static AlignedAxisProperty from(UnitSpherical unitSpherical) {
        return newBuilder().withUnitSpherical(UnitSphericalProperty.from(unitSpherical)).build();
    }

    static DefaultAlignedAxisProperty.Builder newBuilder() {
        return DefaultAlignedAxisProperty.Builder.newBuilder();
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
