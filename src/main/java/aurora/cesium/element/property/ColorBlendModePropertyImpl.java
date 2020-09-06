package aurora.cesium.element.property;

import cesiumlanguagewriter.CesiumColorBlendMode;
import cesiumlanguagewriter.ColorBlendModeCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
class ColorBlendModePropertyImpl extends SinglePropertyAdapter<CesiumColorBlendMode, ColorBlendModeProperty> implements ColorBlendModeProperty {

    @Override
    public void dispatch(Supplier<ColorBlendModeCesiumWriter> supplier) {
        try (ColorBlendModeCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeColorBlendMode);

            dispatchDelete(writer);
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
            dispatchReference(writer);
        }
    }

    @Override
    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<ColorBlendModeProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<ColorBlendModeProperty> intervals) {
        this.intervals = intervals;
    }

    @Override
    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }

    public static final class Builder {
        private CesiumColorBlendMode value;

        private Boolean delete;
        private TimeInterval interval;
        private List<ColorBlendModeProperty> intervals;
        private Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CesiumColorBlendMode value) {
            this.value = value;
            return this;
        }

        public Builder withDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<ColorBlendModeProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public ColorBlendModePropertyImpl build() {
            ColorBlendModePropertyImpl colorBlendModePropertyImpl = new ColorBlendModePropertyImpl();
            colorBlendModePropertyImpl.setValue(value);
            colorBlendModePropertyImpl.setDelete(delete);
            colorBlendModePropertyImpl.setInterval(interval);
            colorBlendModePropertyImpl.setIntervals(intervals);
            colorBlendModePropertyImpl.setReference(reference);
            return colorBlendModePropertyImpl;
        }
    }
}
