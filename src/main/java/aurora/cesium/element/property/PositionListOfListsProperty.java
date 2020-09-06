package aurora.cesium.element.property;

import cesiumlanguagewriter.*;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public interface PositionListOfListsProperty extends Property<PositionListOfListsCesiumWriter>, Deletable, Intervalable<PositionListOfListsProperty>, ListOfListsReferenceable {

    static PositionListOfListsProperty fromCartesians(Iterable<? extends Iterable<Cartesian>> cartesians) {
        return newBuilder().withCartesians(cartesians).build();
    }

    static PositionListOfListsProperty fromCartographicDegrees(Iterable<? extends Iterable<Cartographic>> cartographicDegrees) {
        return newBuilder().withCartographicDegrees(cartographicDegrees).build();
    }

    static PositionListOfListsProperty fromCartographicRadians(Iterable<? extends Iterable<Cartographic>> cartographicRadians) {
        return newBuilder().withCartographicRadians(cartographicRadians).build();
    }

    static PositionListOfListsProperty from(Iterable<? extends Iterable<? extends Reference>> references) {
        return newBuilder().withReferenceListOfLists(references).build();
    }

    static PositionListOfListsPropertyImpl.Builder newBuilder() {
        return PositionListOfListsPropertyImpl.Builder.newBuilder();
    }

    Iterable<? extends Iterable<Cartesian>> getCartesians();

    Iterable<? extends Iterable<Cartographic>> getCartographicDegrees();

    Iterable<? extends Iterable<Cartographic>> getCartographicRadians();

    @Override
    Boolean getDelete();

    @Override
    TimeInterval getInterval();

    @Override
    List<PositionListOfListsProperty> getIntervals();

    @Override
    Iterable<? extends Iterable<? extends Reference>> getReferences();

    @Override
    void dispatch(Supplier<PositionListOfListsCesiumWriter> supplier);
}
