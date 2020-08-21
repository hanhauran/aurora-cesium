package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface AlignedAxisProperty extends InterpolatableProperty, IntervalProperty, ReferenceProperty {

    UnitCartesianProperty getUnitCartesian();

    UnitSphericalProperty getUnitSpherical();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    Reference getReference();

    void dispatch(AlignedAxisCesiumWriter writer);
}
