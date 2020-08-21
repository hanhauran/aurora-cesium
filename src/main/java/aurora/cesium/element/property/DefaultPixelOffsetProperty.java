package aurora.cesium.element.property;

import aurora.cesium.language.writer.PixelOffsetCesiumWriter;
import aurora.cesium.language.writer.Rectangular;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultPixelOffsetProperty extends SinglePropertyAdapter<Rectangular> implements PixelOffsetProperty {

    public DefaultPixelOffsetProperty() {
        super();
    }

    public DefaultPixelOffsetProperty(Rectangular instance) {
        super(instance);
    }

    public DefaultPixelOffsetProperty(Rectangular instance, TimeInterval interval) {
        super(instance, interval);
    }

    public DefaultPixelOffsetProperty(Rectangular instance, Interpolations interpolations) {
        super(instance, interpolations);
    }

    public DefaultPixelOffsetProperty(Rectangular instance, Interpolations interpolations, TimeInterval interval) {
        super(instance, interpolations, interval);
    }

    public DefaultPixelOffsetProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatchPixelOffset(PixelOffsetCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeCartesian2);
            dispatchInterpolations(writer);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public Rectangular getRectangular() {
        return instance;
    }

    public void setRectangular(Rectangular rectangular) {
        this.instance = rectangular;
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
