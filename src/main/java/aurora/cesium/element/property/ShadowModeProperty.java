package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumShadowMode;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.ShadowModeCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/22
 */
public interface ShadowModeProperty extends Property, ReferenceProperty {

    static ShadowModeProperty from(CesiumShadowMode shadowMode) {
        return newBuilder().withValue(shadowMode).build();
    }

    static ShadowModeProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static ShadowModePropertyImpl.Builder newBuilder() {
        return ShadowModePropertyImpl.Builder.newBuilder();
    }

    @Override
    Reference getReference();

    void dispatch(ShadowModeCesiumWriter writer);
}
