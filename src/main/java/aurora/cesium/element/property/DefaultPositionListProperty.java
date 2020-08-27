package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public class DefaultPositionListProperty extends PropertyAdapter<PositionListProperty> implements PositionListProperty {

    private Iterable<Cartesian> cartesians;

    private Iterable<Cartographic> cartographicDegrees;

    private Iterable<Cartographic> cartographicRadians;

    private Iterable<Reference> references;

    @Override
    public void dispatch(PositionListCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getCartesians()).ifPresent(writer::writeCartesian);
            Optional.ofNullable(getCartographicDegrees()).ifPresent(writer::writeCartographicDegrees);
            Optional.ofNullable(getCartographicRadians()).ifPresent(writer::writeCartographicRadians);
            dispatchInterval(writer);
            Optional.ofNullable(getReferences()).ifPresent(writer::writeReferences);
        }
    }

    @Override
    public Iterable<Cartesian> getCartesians() {
        return cartesians;
    }

    public void setCartesians(Iterable<Cartesian> cartesians) {
        this.cartesians = cartesians;
    }

    @Override
    public Iterable<Cartographic> getCartographicDegrees() {
        return cartographicDegrees;
    }

    public void setCartographicDegrees(Iterable<Cartographic> cartographicDegrees) {
        this.cartographicDegrees = cartographicDegrees;
    }

    @Override
    public Iterable<Cartographic> getCartographicRadians() {
        return cartographicRadians;
    }

    public void setCartographicRadians(Iterable<Cartographic> cartographicRadians) {
        this.cartographicRadians = cartographicRadians;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<PositionListProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<PositionListProperty> intervals) {
        this.intervals = intervals;
    }

    @Override
    public Iterable<Reference> getReferences() {
        return references;
    }

    public void setReferences(Iterable<Reference> references) {
        this.references = references;
    }
}
