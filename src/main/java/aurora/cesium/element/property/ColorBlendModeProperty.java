package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumColorBlendMode;
import aurora.cesium.language.writer.ColorBlendModeCesiumWriter;
import aurora.cesium.language.writer.Reference;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface ColorBlendModeProperty extends Property, ReferenceProperty {

    static ColorBlendModeProperty from(CesiumColorBlendMode colorBlendMode) {
        return newBuilder().withValue(colorBlendMode).build();
    }

    static ColorBlendModeProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static ColorBlendModePropertyImpl.Builder newBuilder() {
        return ColorBlendModePropertyImpl.Builder.newBuilder();
    }

    void dispatch(ColorBlendModeCesiumWriter writer);
}
