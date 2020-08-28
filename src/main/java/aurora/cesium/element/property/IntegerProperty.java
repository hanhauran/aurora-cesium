package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface IntegerProperty extends InterpolatableProperty, IntervalProperty<IntegerProperty>, ReferenceProperty {

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<IntegerProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(IntegerCesiumWriter writer);
}
