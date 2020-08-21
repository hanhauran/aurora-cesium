package aurora.cesium.element.property;

import aurora.cesium.language.writer.ColorCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.awt.*;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultRgbafColorProperty extends SinglePropertyAdapter<Color> implements ColorProperty {

    public DefaultRgbafColorProperty() {
        super();
    }

    public DefaultRgbafColorProperty(Color instance) {
        super(instance);
    }

    public DefaultRgbafColorProperty(Color instance, TimeInterval interval) {
        super(instance, interval);
    }

    public DefaultRgbafColorProperty(Color instance, Interpolations interpolations) {
        super(instance, interpolations);
    }

    public DefaultRgbafColorProperty(Color instance, Interpolations interpolations, TimeInterval interval) {
        super(instance, interpolations, interval);
    }

    public DefaultRgbafColorProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(ColorCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeRgbaf);
            dispatchInterpolations(writer);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public Color getColor() {
        return instance;
    }

    public void setColor(Color color) {
        this.instance = color;
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
