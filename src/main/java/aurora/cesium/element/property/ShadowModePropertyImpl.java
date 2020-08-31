package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumShadowMode;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.ShadowModeCesiumWriter;

import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/22
 */
public class ShadowModePropertyImpl extends SinglePropertyAdapter<CesiumShadowMode, ShadowModeProperty> implements ShadowModeProperty {

    @Override
    public void dispatch(Supplier<ShadowModeCesiumWriter> supplier) {
        try (ShadowModeCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeShadowMode);
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
        protected CesiumShadowMode value;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CesiumShadowMode value) {
            this.value = value;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public ShadowModePropertyImpl build() {
            ShadowModePropertyImpl shadowModePropertyImpl = new ShadowModePropertyImpl();
            shadowModePropertyImpl.setValue(value);
            shadowModePropertyImpl.setReference(reference);
            return shadowModePropertyImpl;
        }
    }
}
