package aurora.cesium.element.property;

import aurora.cesium.language.writer.DistanceDisplayConditionCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface DistanceDisplayConditionProperty extends InterpolatableProperty, MultiIntervalProperty<DistanceDisplayConditionProperty>
        , ReferenceProperty {

    static DefaultDistanceDisplayConditionProperty.Builder newBuilder() {
        return DefaultDistanceDisplayConditionProperty.Builder.newBuilder();
    }

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<DistanceDisplayConditionProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(DistanceDisplayConditionCesiumWriter writer);
}
