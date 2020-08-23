package aurora.cesium.element.property;

import aurora.cesium.language.writer.BoxDimensionsCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public class DefaultBoxDimensionsProperty extends PropertyAdapter<BoxDimensionsProperty> implements BoxDimensionsProperty {

    private CartesianProperty cartesian;

    public DefaultBoxDimensionsProperty() {
        super();
    }

    public DefaultBoxDimensionsProperty(CartesianProperty cartesian) {
        this(cartesian, null);
    }

    public DefaultBoxDimensionsProperty(CartesianProperty cartesian, TimeInterval interval) {
        this.cartesian = cartesian;
        this.interval = interval;
    }

    public DefaultBoxDimensionsProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(BoxDimensionsCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getCartesian()).ifPresent(cartesianProperty -> cartesianProperty.dispatchCartesian(writer));
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
