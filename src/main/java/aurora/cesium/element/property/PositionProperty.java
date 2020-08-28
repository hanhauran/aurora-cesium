package aurora.cesium.element.property;

import aurora.cesium.language.writer.PositionCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PositionProperty extends InterpolatableProperty, MultiIntervalProperty<PositionProperty>, ReferenceProperty {

    static DefaultPositionProperty.Builder newBuilder() {
        return DefaultPositionProperty.Builder.newBuilder();
    }

    CartesianProperty getCartesian();

    CartographicDegreesProperty getCartographicDegrees();

    CartographicRadiansProperty getCartographicRadians();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<PositionProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(PositionCesiumWriter writer);
}
