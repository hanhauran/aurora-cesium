package aurora.cesium.element.property;

import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.RepeatCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface RepeatProperty extends InterpolatableProperty, MultiIntervalProperty<RepeatProperty>, ReferenceProperty {

    static DefaultRepeatProperty.Builder newBuilder() {
        return DefaultRepeatProperty.Builder.newBuilder();
    }

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
