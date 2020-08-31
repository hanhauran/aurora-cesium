package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumColorBlendMode;
import aurora.cesium.language.writer.ColorBlendModeCesiumWriter;
import aurora.cesium.language.writer.Reference;

import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public class ColorBlendModePropertyImpl extends SinglePropertyAdapter<CesiumColorBlendMode, ColorBlendModeProperty> implements ColorBlendModeProperty {

    @Override
    public void dispatch(Supplier<ColorBlendModeCesiumWriter> supplier) {
        try (ColorBlendModeCesiumWriter writer = supplier.get()) {
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

        public ColorBlendModePropertyImpl build() {
            ColorBlendModePropertyImpl colorBlendModePropertyImpl = new ColorBlendModePropertyImpl();
            colorBlendModePropertyImpl.setValue(value);
            colorBlendModePropertyImpl.setReference(reference);
            return colorBlendModePropertyImpl;
        }
    }
}
