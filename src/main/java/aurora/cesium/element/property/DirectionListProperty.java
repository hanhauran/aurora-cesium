package aurora.cesium.element.property;

import cesiumlanguagewriter.*;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public interface DirectionListProperty extends Property<DirectionListCesiumWriter>, Deletable, Intervalable<DirectionListProperty> {

    static DirectionListProperty fromCartesians(Iterable<Cartesian> cartesians) {
        return newBuilder().withCartesians(cartesians).build();
    }

    static DirectionListProperty fromSphericals(Iterable<Spherical> sphericals) {
        return newBuilder().withSphericals(sphericals).build();
    }

    static DirectionListProperty fromUnitCartesians(Iterable<UnitCartesian> unitCartesians) {
        return newBuilder().withUnitCartesians(unitCartesians).build();
    }

    static DirectionListProperty fromUnitSphericals(Iterable<UnitSpherical> unitSphericals) {
        return newBuilder().withUnitSphericals(unitSphericals).build();
    }

    static DirectionListPropertyImpl.Builder newBuilder() {
        return DirectionListPropertyImpl.Builder.newBuilder();
    }

    Iterable<Cartesian> getCartesians();

    Iterable<Spherical> getSphericals();

    Iterable<UnitCartesian> getUnitCartesians();

    Iterable<UnitSpherical> getUnitSphericals();

    @Override
    Boolean getDelete();

    @Override
    TimeInterval getInterval();

    @Override
    List<DirectionListProperty> getIntervals();

    @Override
    void dispatch(Supplier<DirectionListCesiumWriter> supplier);
}
