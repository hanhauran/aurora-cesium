package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public interface PositionListProperty extends IntervalProperty, MultiIntervalProperty<PositionListProperty>, ReferencesProperty {

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
