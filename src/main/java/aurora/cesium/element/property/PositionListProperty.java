package aurora.cesium.element.property;

import cesiumlanguagewriter.*;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public interface PositionListProperty extends Property<PositionListCesiumWriter>, Deletable, Intervalable<PositionListProperty>, ListReferenceable {

    static PositionListProperty fromCartesians(Iterable<Cartesian> cartesians) {
        return newBuilder().withCartesians(cartesians).build();
    }

    static PositionListProperty fromCartographicDegrees(Iterable<Cartographic> cartographicDegrees) {
        return newBuilder().withCartographicDegrees(cartographicDegrees).build();
    }

    static PositionListProperty fromCartographicRadians(Iterable<Cartographic> cartographicRadians) {
        return newBuilder().withCartographicRadians(cartographicRadians).build();
    }

    static PositionListProperty from(Iterable<Reference> references) {
        return newBuilder().withReferences(references).build();
    }

    static PositionListPropertyImpl.Builder newBuilder() {
        return PositionListPropertyImpl.Builder.newBuilder();
    }

    Iterable<Cartesian> getCartesians();

    Iterable<Cartographic> getCartographicDegrees();

    Iterable<Cartographic> getCartographicRadians();

    @Override
    Boolean getDelete();

    @Override
    TimeInterval getInterval();

    @Override
    List<PositionListProperty> getIntervals();

    @Override
    Iterable<Reference> getReferences();

    @Override
    void dispatch(Supplier<PositionListCesiumWriter> supplier);
}
