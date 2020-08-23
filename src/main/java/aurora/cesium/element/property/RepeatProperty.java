package aurora.cesium.element.property;

import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.RepeatCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface RepeatProperty extends InterpolatableProperty, IntervalProperty, MultiIntervalProperty<RepeatProperty>, ReferenceProperty {

    RectangularProperty getRectangular();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<RepeatProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(RepeatCesiumWriter writer);
}
