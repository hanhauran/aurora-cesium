package aurora.cesium.element.property;

import aurora.cesium.language.writer.OrientationCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.UnitQuaternion;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface OrientationProperty extends InterpolatableProperty, IntervalProperty<OrientationProperty>, ReferenceProperty {

    static OrientationProperty from(UnitQuaternion value) {
        return newBuilder().withValue(value).build();
    }

    static DefaultOrientationProperty.Builder newBuilder() {
        return DefaultOrientationProperty.Builder.newBuilder();
    }

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<OrientationProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(OrientationCesiumWriter writer);
}
