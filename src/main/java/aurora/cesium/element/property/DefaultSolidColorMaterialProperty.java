package aurora.cesium.element.property;

import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.SolidColorMaterialCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultSolidColorMaterialProperty extends PropertyAdapter implements SolidColorMaterialProperty {

    private ColorProperty color;

    public DefaultSolidColorMaterialProperty() {
        super();
    }

    public DefaultSolidColorMaterialProperty(ColorProperty color) {
        this.color = color;
    }

    public DefaultSolidColorMaterialProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatchSolidColorMaterial(SolidColorMaterialCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getColor()).ifPresent(colorProperty -> colorProperty.dispatchColor(writer.openColorProperty()));
            dispatchInterval(writer);
        }
    }

    @Override
    public ColorProperty getColor() {
        return color;
    }

    public void setColor(ColorProperty color) {
        this.color = color;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }
}
