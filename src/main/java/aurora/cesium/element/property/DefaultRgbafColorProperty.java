package aurora.cesium.element.property;

import aurora.cesium.language.writer.ColorCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.awt.*;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultRgbafColorProperty extends BaseSingleInterpolatableIntervalProperty<Color> implements ColorProperty {
    public DefaultRgbafColorProperty() {
        super();
    }

    public DefaultRgbafColorProperty(Color instance) {
        super(instance);
    }

    public DefaultRgbafColorProperty(Color instance, TimeInterval interval) {
        super(instance, interval);
    }

    @Override
    public void dispatchColor(ColorCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeRgbaf);
            dispatchInterpolatableProperty(writer);
        }
    }

    public Color getColor() {
        return instance;
    }

    public void setColor(Color color) {
        this.instance = color;
    }
}
