package aurora.cesium.element.property;

import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.ViewFromCesiumWriter;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public class DefaultViewFromProperty extends PropertyAdapter<ViewFromProperty> implements ViewFromProperty {

    protected CartesianProperty cartesian;

    public DefaultViewFromProperty() {
        super();
    }

    public DefaultViewFromProperty(CartesianProperty cartesian) {
        this(cartesian, null, null);
    }

    public DefaultViewFromProperty(CartesianProperty cartesian, Interpolations interpolations) {
        this(cartesian, interpolations, null);
    }

    public DefaultViewFromProperty(CartesianProperty cartesian, TimeInterval interval) {
        this(cartesian, null, interval);
    }

    public DefaultViewFromProperty(CartesianProperty cartesian, Interpolations interpolations, TimeInterval interval) {
        this.cartesian = cartesian;
        this.interpolations = interpolations;
        this.interval = interval;
    }

    public DefaultViewFromProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(ViewFromCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getCartesian()).ifPresent(cartesianProperty -> cartesianProperty.dispatchCartesian(writer));
            dispatchInterpolations(writer);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
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
    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }
}
