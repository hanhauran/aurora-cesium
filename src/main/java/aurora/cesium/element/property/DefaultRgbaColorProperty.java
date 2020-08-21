package aurora.cesium.element.property;

import aurora.cesium.language.writer.ColorCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.awt.*;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultRgbaColorProperty extends SinglePropertyAdapter<Color> implements ColorProperty {

    public DefaultRgbaColorProperty() {
        super();
    }

    public DefaultRgbaColorProperty(Color instance) {
        super(instance);
    }

    public DefaultRgbaColorProperty(Color instance, TimeInterval interval) {
        super(instance, interval);
    }

    @Override
    public void dispatchColor(ColorCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeRgba);
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
