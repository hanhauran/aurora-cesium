package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PositionProperty extends Property<PositionCesiumWriter>, Interpolatable, Intervalable<PositionProperty>, Referenceable {

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

    void dispatch(Supplier<PositionCesiumWriter> supplier);
}
