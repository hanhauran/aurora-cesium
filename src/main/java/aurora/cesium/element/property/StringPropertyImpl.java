package aurora.cesium.element.property;

import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.StringCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class StringPropertyImpl extends SinglePropertyAdapter<String, StringProperty> implements StringProperty {

    @Override
    public void dispatch(Supplier<StringCesiumWriter> supplier) {
        try (StringCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeString);
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
    public List<StringProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<StringProperty> intervals) {
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
        protected List<StringProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(String instance) {
            this.value = instance;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<StringProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public StringPropertyImpl build() {
            StringPropertyImpl stringPropertyImpl = new StringPropertyImpl();
            stringPropertyImpl.setValue(value);
            stringPropertyImpl.setInterval(interval);
            stringPropertyImpl.setIntervals(intervals);
            stringPropertyImpl.setReference(reference);
            return stringPropertyImpl;
        }
    }
}
