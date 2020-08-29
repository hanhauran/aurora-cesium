package aurora.cesium.element.property;

import aurora.cesium.language.writer.Bounds;
import aurora.cesium.language.writer.DistanceDisplayConditionCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface DistanceDisplayConditionProperty extends InterpolatableProperty, IntervalProperty<DistanceDisplayConditionProperty>, ReferenceProperty {

    static DistanceDisplayConditionProperty from(Bounds value) {
        return newBuilder().withValue(value).build();
    }

    static DistanceDisplayConditionProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static DistanceDisplayConditionPropertyImpl.Builder newBuilder() {
        return DistanceDisplayConditionPropertyImpl.Builder.newBuilder();
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
