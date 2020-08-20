package aurora.cesium.element.property;

import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultSolidColorMaterialProperty extends BaseIntervalProperty implements SolidColorMaterialProperty {

    private ColorProperty color;

    public DefaultSolidColorMaterialProperty() {
        super();
    }

    public DefaultSolidColorMaterialProperty(ColorProperty color) {
        this(color, null);
    }

    public DefaultSolidColorMaterialProperty(ColorProperty color, TimeInterval interval) {
        this.color = color;
        this.interval = interval;
    }

    @Override
    public ColorProperty getColor() {
        return color;
    }

    public void setColor(ColorProperty color) {
        this.color = color;
    }
}
