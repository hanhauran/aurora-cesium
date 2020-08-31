package aurora.cesium.element.property;

import aurora.cesium.language.writer.FontCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public class FontPropertyImpl extends SinglePropertyAdapter<String, FontProperty> implements FontProperty {

    @Override
    public void dispatch(Supplier<FontCesiumWriter> supplier) {
        try (FontCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeFont);
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
            dispatchReference(writer);
        }
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<FontProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<FontProperty> intervals) {
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
        protected String value;

        protected TimeInterval interval;
        protected List<FontProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(String value) {
            this.value = value;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<FontProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public FontPropertyImpl build() {
            FontPropertyImpl fontPropertyImpl = new FontPropertyImpl();
            fontPropertyImpl.setValue(value);
            fontPropertyImpl.setInterval(interval);
            fontPropertyImpl.setIntervals(intervals);
            fontPropertyImpl.setReference(reference);
            return fontPropertyImpl;
        }
    }
}
