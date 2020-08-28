package aurora.cesium.element.property;

import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.RotationCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.UnitQuaternion;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface RotationProperty extends InterpolatableProperty, IntervalProperty<RotationProperty>, ReferenceProperty {

    static RotationProperty from(UnitQuaternion unitQuaternion) {
        return newBuilder().withUnitQuaternion(UnitQuaternionProperty.from(unitQuaternion)).build();
    }

    static DefaultRotationProperty.Builder newBuilder() {
        return DefaultRotationProperty.Builder.newBuilder();
    }

    UnitQuaternionProperty getUnitQuaternion();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<RotationProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(RotationCesiumWriter writer);
}
