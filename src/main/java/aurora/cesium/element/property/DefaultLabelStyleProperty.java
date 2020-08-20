package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumLabelStyle;
import aurora.cesium.language.writer.LabelStyleCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultLabelStyleProperty extends BaseSingleIntervalProperty<CesiumLabelStyle> implements LabelStyleProperty, IntervalProperty, Property {

    public DefaultLabelStyleProperty() {
        super();
    }

    public DefaultLabelStyleProperty(CesiumLabelStyle instance) {
        super(instance);
    }

    public DefaultLabelStyleProperty(CesiumLabelStyle instance, TimeInterval interval) {
        super(instance, interval);
    }

    @Override
    public void dispatchLabelStyle(LabelStyleCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeLabelStyle);
        }
    }

    public CesiumLabelStyle getLabelStyle() {
        return instance;
    }

    public void setLabelStyle(CesiumLabelStyle labelStyle) {
        this.instance = labelStyle;
    }
}
