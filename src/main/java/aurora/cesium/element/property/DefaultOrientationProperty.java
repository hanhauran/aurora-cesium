package aurora.cesium.element.property;

import aurora.cesium.language.writer.OrientationCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.UnitQuaternion;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultOrientationProperty extends SinglePropertyAdapter<UnitQuaternion> implements OrientationProperty {
    public DefaultOrientationProperty() {
        super();
    }

    public DefaultOrientationProperty(UnitQuaternion instance) {
        super(instance);
    }

    public DefaultOrientationProperty(UnitQuaternion instance, TimeInterval interval) {
        super(instance, interval);
    }

    public DefaultOrientationProperty(UnitQuaternion instance, Interpolations interpolations) {
        super(instance, interpolations);
    }

    public DefaultOrientationProperty(UnitQuaternion instance, Interpolations interpolations, TimeInterval interval) {
        super(instance, interpolations, interval);
    }

    public DefaultOrientationProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatchOrientation(OrientationCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeUnitQuaternion);
            dispatchInterpolations(writer);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public UnitQuaternion getUnitQuaternion() {
        return instance;
    }

    public void setUnitQuaternion(UnitQuaternion unitQuaternion) {
        this.instance = unitQuaternion;
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
