package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public interface PositionListProperty extends IntervalProperty<PositionListProperty>, ReferencesProperty {

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
    TimeInterval getInterval();

    @Override
    List<PositionListProperty> getIntervals();

    @Override
    Iterable<Reference> getReferences();

    void dispatch(PositionListCesiumWriter writer);
}
