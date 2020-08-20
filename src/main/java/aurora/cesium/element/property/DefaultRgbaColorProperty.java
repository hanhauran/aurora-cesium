package aurora.cesium.element.property;

import aurora.cesium.language.writer.ColorCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.awt.*;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultRgbaColorProperty extends BaseSingleInterpolatableIntervalProperty<Color> implements ColorProperty {
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
            dispatchInterval(writer);
            dispatchConsumer(writer::writeRgba);
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
