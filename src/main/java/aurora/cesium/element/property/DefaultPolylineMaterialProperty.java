package aurora.cesium.element.property;

import aurora.cesium.language.writer.PolylineMaterialCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultPolylineMaterialProperty extends PropertyAdapter implements PolylineMaterialProperty {

    private SolidColorMaterialProperty solidColor;

    public DefaultPolylineMaterialProperty() {
        super();
    }

    public DefaultPolylineMaterialProperty(SolidColorMaterialProperty solidColor) {
        this(solidColor, null);
    }

    public DefaultPolylineMaterialProperty(SolidColorMaterialProperty solidColor, TimeInterval interval) {
        this.solidColor = solidColor;
        this.interval = interval;
    }

    public DefaultPolylineMaterialProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatchPolylineMaterial(PolylineMaterialCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getSolidColor()).ifPresent(solidColorMaterialProperty -> solidColorMaterialProperty.dispatchSolidColorMaterial(writer.openSolidColorProperty()));
            dispatchInterval(writer);
        }
    }

    @Override
    public SolidColorMaterialProperty getSolidColor() {
        return solidColor;
    }

    public void setSolidColor(SolidColorMaterialProperty solidColor) {
        this.solidColor = solidColor;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }
}
