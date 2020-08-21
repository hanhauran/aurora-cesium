package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface EyeOffsetProperty extends InterpolatableProperty, IntervalProperty, ReferenceProperty {

    CartesianProperty getCartesian();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    Reference getReference();

    void dispatch(EyeOffsetCesiumWriter writer);
}
