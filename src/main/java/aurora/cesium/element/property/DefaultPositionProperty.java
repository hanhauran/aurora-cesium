package aurora.cesium.element.property;

import aurora.cesium.language.writer.PositionCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultPositionProperty extends PropertyAdapter implements PositionProperty {

    private CartesianProperty cartesian;

    private CartographicDegreesProperty cartographicDegrees;

    private CartographicRadiansProperty cartographicRadians;

    public DefaultPositionProperty() {
        super();
    }

    public DefaultPositionProperty(CartesianProperty cartesian) {
        this.cartesian = cartesian;
    }

    public DefaultPositionProperty(CartographicDegreesProperty cartographicDegrees) {
        this.cartographicDegrees = cartographicDegrees;
    }

    public DefaultPositionProperty(CartographicRadiansProperty cartographicRadians) {
        this.cartographicRadians = cartographicRadians;
    }

    public DefaultPositionProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatchPosition(PositionCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getCartesian()).ifPresent(cartesianProperty -> cartesianProperty.dispatchPosition(writer));
            Optional.ofNullable(getCartographicDegrees()).ifPresent(cartographicDegreesProperty -> cartographicDegreesProperty.dispatchPosition(writer));
            Optional.ofNullable(getCartographicRadians()).ifPresent(cartographicRadiansProperty -> cartographicRadiansProperty.dispatchPosition(writer));
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
    public CartographicDegreesProperty getCartographicDegrees() {
        return cartographicDegrees;
    }

    public void setCartographicDegrees(CartographicDegreesProperty cartographicDegrees) {
        this.cartographicDegrees = cartographicDegrees;
    }

    @Override
    public CartographicRadiansProperty getCartographicRadians() {
        return cartographicRadians;
    }

    public void setCartographicRadians(CartographicRadiansProperty cartographicRadians) {
        this.cartographicRadians = cartographicRadians;
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
