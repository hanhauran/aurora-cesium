package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface NearFarScalarProperty extends InterpolatableProperty, IntervalProperty, ReferenceProperty {

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    Reference getReference();

    void dispatch(NearFarScalarCesiumWriter writer);
}
