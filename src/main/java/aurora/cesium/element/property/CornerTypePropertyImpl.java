package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumCornerType;
import aurora.cesium.language.writer.CornerTypeCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public class CornerTypePropertyImpl extends SinglePropertyAdapter<CesiumCornerType, CornerTypeProperty> implements CornerTypeProperty {

    @Override
    public void dispatch(Supplier<CornerTypeCesiumWriter> supplier) {
        try (CornerTypeCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeCornerType);
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
    public List<CornerTypeProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<CornerTypeProperty> intervals) {
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
        protected CesiumCornerType value;

        protected TimeInterval interval;
        protected List<CornerTypeProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CesiumCornerType value) {
            this.value = value;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<CornerTypeProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public CornerTypePropertyImpl build() {
            CornerTypePropertyImpl cornerTypePropertyImpl = new CornerTypePropertyImpl();
            cornerTypePropertyImpl.setValue(value);
            cornerTypePropertyImpl.setInterval(interval);
            cornerTypePropertyImpl.setIntervals(intervals);
            cornerTypePropertyImpl.setReference(reference);
            return cornerTypePropertyImpl;
        }
    }
}
