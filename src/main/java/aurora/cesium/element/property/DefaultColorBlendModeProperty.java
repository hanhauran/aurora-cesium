package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumColorBlendMode;
import aurora.cesium.language.writer.ColorBlendModeCesiumWriter;
import aurora.cesium.language.writer.Reference;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public class DefaultColorBlendModeProperty extends SinglePropertyAdapter<CesiumColorBlendMode, ColorBlendModeProperty> implements ColorBlendModeProperty {

    @Override
    public void dispatch(ColorBlendModeCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeColorBlendMode);
            dispatchReference(writer);
        }
    }

    @Override
    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }

    public static final class Builder {
        protected CesiumColorBlendMode value;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CesiumColorBlendMode value) {
            this.value = value;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public DefaultColorBlendModeProperty build() {
            DefaultColorBlendModeProperty defaultColorBlendModeProperty = new DefaultColorBlendModeProperty();
            defaultColorBlendModeProperty.setValue(value);
            defaultColorBlendModeProperty.setReference(reference);
            return defaultColorBlendModeProperty;
        }
    }
}
