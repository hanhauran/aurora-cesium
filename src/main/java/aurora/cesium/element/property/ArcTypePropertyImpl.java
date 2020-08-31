package aurora.cesium.element.property;

import aurora.cesium.language.writer.ArcTypeCesiumWriter;
import aurora.cesium.language.writer.CesiumArcType;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public class ArcTypePropertyImpl extends SinglePropertyAdapter<CesiumArcType, ArcTypeProperty> implements ArcTypeProperty {

    @Override
    public void dispatch(Supplier<ArcTypeCesiumWriter> supplier) {
        try (ArcTypeCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeArcType);
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
    public List<ArcTypeProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<ArcTypeProperty> intervals) {
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
        protected CesiumArcType value;
        protected TimeInterval interval;
        protected List<ArcTypeProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CesiumArcType instance) {
            this.value = instance;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<ArcTypeProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public ArcTypePropertyImpl build() {
            ArcTypePropertyImpl arcTypePropertyImpl = new ArcTypePropertyImpl();
            arcTypePropertyImpl.setValue(value);
            arcTypePropertyImpl.setInterval(interval);
            arcTypePropertyImpl.setIntervals(intervals);
            arcTypePropertyImpl.setReference(reference);
            return arcTypePropertyImpl;
        }
    }
}
