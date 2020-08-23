package aurora.cesium.element.property;

import aurora.cesium.language.writer.NearFarScalar;
import aurora.cesium.language.writer.NearFarScalarCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultNearFarScalarProperty extends SinglePropertyAdapter<NearFarScalar, NearFarScalarProperty> implements NearFarScalarProperty {

    public DefaultNearFarScalarProperty() {
        super();
    }

    public DefaultNearFarScalarProperty(NearFarScalar instance) {
        super(instance);
    }

    public DefaultNearFarScalarProperty(NearFarScalar instance, TimeInterval interval) {
        super(instance, interval);
    }

    public DefaultNearFarScalarProperty(NearFarScalar instance, Interpolations interpolations) {
        super(instance, interpolations);
    }

    public DefaultNearFarScalarProperty(NearFarScalar instance, Interpolations interpolations, TimeInterval interval) {
        super(instance, interpolations, interval);
    }

    public DefaultNearFarScalarProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(NearFarScalarCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeNearFarScalar);
            dispatchInterpolations(writer);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public NearFarScalar getNearFarScalar() {
        return instance;
    }

    public void setNearFarScalar(NearFarScalar nearFarScalar) {
        this.instance = nearFarScalar;
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
