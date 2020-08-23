package aurora.cesium.element.property;

import aurora.cesium.language.writer.PositionCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultPositionProperty extends PropertyAdapter<PositionProperty> implements PositionProperty {

    private CartesianProperty cartesian;

    private CartographicDegreesProperty cartographicDegrees;

    private CartographicRadiansProperty cartographicRadians;

    public DefaultPositionProperty() {
        super();
    }

    public DefaultPositionProperty(CartesianProperty cartesian) {
        this(cartesian, null, null);
    }

    public DefaultPositionProperty(CartesianProperty cartesian, TimeInterval interval) {
        this(cartesian, null, interval);
    }

    public DefaultPositionProperty(CartesianProperty cartesian, Interpolations interpolations) {
        this(cartesian, interpolations, null);
    }

    public DefaultPositionProperty(CartesianProperty cartesian, Interpolations interpolations, TimeInterval interval) {
        this.cartesian = cartesian;
        this.interpolations = interpolations;
        this.interval = interval;
    }

    public DefaultPositionProperty(CartographicDegreesProperty cartographicDegrees) {
        this(cartographicDegrees, null, null);
    }

    public DefaultPositionProperty(CartographicDegreesProperty cartographicDegrees, Interpolations interpolations) {
        this(cartographicDegrees, interpolations, null);
    }

    public DefaultPositionProperty(CartographicDegreesProperty cartographicDegrees, TimeInterval interval) {
        this(cartographicDegrees, null, interval);
    }

    public DefaultPositionProperty(CartographicDegreesProperty cartographicDegrees, Interpolations interpolations, TimeInterval interval) {
        this.cartographicDegrees = cartographicDegrees;
        this.interpolations = interpolations;
        this.interval = interval;
    }

    public DefaultPositionProperty(CartographicRadiansProperty cartographicRadians) {
        this(cartographicRadians, null, null);
    }

    public DefaultPositionProperty(CartographicRadiansProperty cartographicRadians, Interpolations interpolations) {
        this(cartographicRadians, interpolations, null);
    }

    public DefaultPositionProperty(CartographicRadiansProperty cartographicRadians, TimeInterval interval) {
        this(cartographicRadians, null, interval);
    }

    public DefaultPositionProperty(CartographicRadiansProperty cartographicRadians, Interpolations interpolations, TimeInterval interval) {
        this.cartographicRadians = cartographicRadians;
        this.interpolations = interpolations;
        this.interval = interval;
    }

    public DefaultPositionProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(PositionCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getCartesian()).ifPresent(cartesianProperty -> cartesianProperty.dispatchCartesian(writer));
            Optional.ofNullable(getCartographicDegrees()).ifPresent(cartographicDegreesProperty -> cartographicDegreesProperty.dispatchCartographicDegrees(writer));
            Optional.ofNullable(getCartographicRadians()).ifPresent(cartographicRadiansProperty -> cartographicRadiansProperty.dispatchCartographicRadians(writer));
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
