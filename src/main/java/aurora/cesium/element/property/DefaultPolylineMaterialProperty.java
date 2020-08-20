package aurora.cesium.element.property;

import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultPolylineMaterialProperty extends BaseIntervalProperty implements PolylineMaterialProperty {

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

    @Override
    public SolidColorMaterialProperty getSolidColor() {
        return solidColor;
    }

    public void setSolidColor(SolidColorMaterialProperty solidColor) {
        this.solidColor = solidColor;
    }
}
