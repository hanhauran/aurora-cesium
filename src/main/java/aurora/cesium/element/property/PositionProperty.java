package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PositionProperty extends InterpolatableProperty, IntervalProperty<PositionProperty>, ReferenceProperty {

    static PositionProperty from(Cartesian cartesian) {
        return newBuilder().withCartesian(CartesianProperty.from(cartesian)).build();
    }

    static PositionProperty fromDegrees(Cartographic cartographic) {
        return newBuilder().withCartographicDegrees(CartographicDegreesProperty.from(cartographic)).build();
    }

    static PositionProperty fromRadians(Cartographic cartographic) {
        return newBuilder().withCartographicRadians(CartographicRadiansProperty.from(cartographic)).build();
    }

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
