package aurora.cesium.element.property;

import aurora.cesium.language.writer.PositionCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PositionProperty extends InterpolatableProperty, IntervalProperty, ReferenceProperty {

    CartesianProperty getCartesian();

    CartographicDegreesProperty getCartographicDegrees();

    CartographicRadiansProperty getCartographicRadians();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    Reference getReference();

    void dispatchPosition(PositionCesiumWriter writer);
}
