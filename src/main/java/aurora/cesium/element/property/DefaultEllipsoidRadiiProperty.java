package aurora.cesium.element.property;

import aurora.cesium.language.writer.EllipsoidRadiiCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public class DefaultEllipsoidRadiiProperty extends PropertyAdapter<EllipsoidRadiiProperty> implements EllipsoidRadiiProperty {

    private CartesianProperty cartesian;

    @Override
    public void dispatch(EllipsoidRadiiCesiumWriter writer) {
        try (writer) {
            doDispatch(writer, this);
            dispatchIntervals(writer::openMultipleIntervals, (itemWriter, property) -> {
                try (itemWriter) {
                    doDispatch(itemWriter, property);
                }
            });
        }
    }

    private void doDispatch(EllipsoidRadiiCesiumWriter writer, EllipsoidRadiiProperty property) {
        Optional.ofNullable(property.getCartesian()).ifPresent(cartesianProperty -> cartesianProperty.dispatchCartesian(writer));
        dispatchInterpolations(writer, property);
        dispatchInterval(writer, property);
        dispatchReference(writer, property);
    }

    @Override
    public CartesianProperty getCartesian() {
        return cartesian;
    }

    public void setCartesian(CartesianProperty cartesian) {
        this.cartesian = cartesian;
    }

    @Override
    public Interpolations getInterpolations() {
        return interpolations;
    }

    public void setInterpolations(Interpolations interpolations) {
        this.interpolations = interpolations;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<EllipsoidRadiiProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<EllipsoidRadiiProperty> intervals) {
        this.intervals = intervals;
    }

    @Override
    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }
}
