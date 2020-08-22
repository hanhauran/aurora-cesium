package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumShadowMode;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.ShadowModeCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/22
 */
public class DefaultShadowModeProperty extends SinglePropertyAdapter<CesiumShadowMode> implements ShadowModeProperty {

    public DefaultShadowModeProperty() {
        super();
    }

    public DefaultShadowModeProperty(CesiumShadowMode instance) {
        super(instance);
    }

    public DefaultShadowModeProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(ShadowModeCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeShadowMode);
            dispatchReference(writer);
        }
    }

    public CesiumShadowMode getShadowMode() {
        return instance;
    }

    public void setShadowMode(CesiumShadowMode shadowMode) {
        this.instance = shadowMode;
    }

    @Override
    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }
}
