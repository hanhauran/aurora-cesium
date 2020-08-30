package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PositionProperty extends InterpolatableProperty, IntervalProperty<PositionProperty>, ReferenceProperty {

    static PositionProperty fromCartesian(Cartesian cartesian) {
        return newBuilder().withCartesian(CartesianProperty.from(cartesian)).build();
    }

    static PositionProperty fromCartographicDegrees(Cartographic cartographic) {
        return newBuilder().withCartographicDegrees(CartographicDegreesProperty.from(cartographic)).build();
    }

    static PositionProperty fromCartographicRadians(Cartographic cartographic) {
        return newBuilder().withCartographicRadians(CartographicRadiansProperty.from(cartographic)).build();
    }

    static PositionProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static PositionPropertyImpl.Builder newBuilder() {
        return PositionPropertyImpl.Builder.newBuilder();
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
