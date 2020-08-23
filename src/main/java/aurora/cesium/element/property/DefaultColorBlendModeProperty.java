package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumColorBlendMode;
import aurora.cesium.language.writer.ColorBlendModeCesiumWriter;
import aurora.cesium.language.writer.Reference;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public class DefaultColorBlendModeProperty extends SinglePropertyAdapter<CesiumColorBlendMode, ColorBlendModeProperty> implements ColorBlendModeProperty {

    public DefaultColorBlendModeProperty() {
        super();
    }

    public DefaultColorBlendModeProperty(CesiumColorBlendMode instance) {
        super(instance);
    }

    public DefaultColorBlendModeProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(ColorBlendModeCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeColorBlendMode);
            dispatchReference(writer);
        }
    }

    public CesiumColorBlendMode getColorBlendMode() {
        return instance;
    }

    public void setColorBlendMode(CesiumColorBlendMode colorBlendMode) {
        this.instance = colorBlendMode;
    }

    @Override
    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }
}
