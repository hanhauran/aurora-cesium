package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumLabelStyle;
import aurora.cesium.language.writer.LabelStyleCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultLabelStyleProperty extends SinglePropertyAdapter<CesiumLabelStyle> implements LabelStyleProperty {

    public DefaultLabelStyleProperty() {
        super();
    }

    public DefaultLabelStyleProperty(CesiumLabelStyle instance) {
        super(instance);
    }

    public DefaultLabelStyleProperty(CesiumLabelStyle instance, TimeInterval interval) {
        super(instance, interval);
    }

    public DefaultLabelStyleProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(LabelStyleCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeLabelStyle);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public CesiumLabelStyle getLabelStyle() {
        return instance;
    }

    public void setLabelStyle(CesiumLabelStyle labelStyle) {
        this.instance = labelStyle;
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
