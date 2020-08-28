package aurora.cesium.element.property;

import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.ShadowModeCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/22
 */
public interface ShadowModeProperty extends Property, ReferenceProperty {

    static DefaultShadowModeProperty.Builder newBuilder() {
        return DefaultShadowModeProperty.Builder.newBuilder();
    }

    @Override
    Reference getReference();

    void dispatch(ShadowModeCesiumWriter writer);
}
