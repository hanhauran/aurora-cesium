package aurora.cesium.element.property;

import aurora.cesium.language.writer.EyeOffsetCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultEyeOffsetProperty extends PropertyAdapter implements EyeOffsetProperty {

    private CartesianProperty cartesian;

    public DefaultEyeOffsetProperty() {
        super();
    }

    public DefaultEyeOffsetProperty(CartesianProperty cartesian) {
        this.cartesian = cartesian;
    }

    public DefaultEyeOffsetProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatchEyeOffset(EyeOffsetCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getCartesian()).ifPresent(cartesianProperty -> cartesianProperty.dispatchEyeOffset(writer));
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
