package aurora.cesium.element.property;

import cesiumlanguagewriter.*;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PositionProperty extends Property<PositionCesiumWriter>, Deletable, Interpolatable, Intervalable<PositionProperty>, Referenceable {

    static PositionProperty fromCartesian(Cartesian cartesian) {
        return newBuilder().withCartesian(CartesianProperty.from(cartesian)).build();
    }

    static PositionProperty from(CartesianProperty cartesianProperty) {
        return newBuilder().withCartesian(cartesianProperty).build();
    }

    static PositionProperty fromCartographicDegrees(Cartographic cartographic) {
        return newBuilder().withCartographicDegrees(CartographicDegreesProperty.from(cartographic)).build();
    }

    static PositionProperty from(CartographicDegreesProperty cartographicDegreesProperty) {
        return newBuilder().withCartographicDegrees(cartographicDegreesProperty).build();
    }

    static PositionProperty fromCartographicRadians(Cartographic cartographic) {
        return newBuilder().withCartographicRadians(CartographicRadiansProperty.from(cartographic)).build();
    }

    static PositionProperty from(CartographicRadiansProperty cartographicRadiansProperty) {
        return newBuilder().withCartographicRadians(cartographicRadiansProperty).build();
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
    Boolean getDelete();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<PositionProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<PositionCesiumWriter> supplier);
}
