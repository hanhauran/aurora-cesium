package aurora.cesium.element.property;

import cesiumlanguagewriter.DoubleListCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
class DoubleListPropertyImpl extends SinglePropertyAdapter<Iterable<Double>, DoubleListProperty> implements DoubleListProperty {

    @Override
    public void dispatch(Supplier<DoubleListCesiumWriter> supplier) {
        try (DoubleListCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeArray);

            dispatchDelete(writer);
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
            dispatchReferences(writer);
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
    public List<DoubleListProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<DoubleListProperty> intervals) {
        this.intervals = intervals;
    }

    public Iterable<Reference> getReferences() {
        return referenceList;
    }

    public void setReferences(Iterable<Reference> referenceList) {
        this.referenceList = referenceList;
    }

    public static final class Builder {
        private Iterable<Double> value;

        private Boolean delete;
        private TimeInterval interval;
        private List<DoubleListProperty> intervals;
        private Iterable<Reference> referenceList;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(Iterable<Double> value) {
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

        public Builder withIntervals(List<DoubleListProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReferenceList(Iterable<Reference> referenceList) {
            this.referenceList = referenceList;
            return this;
        }

        public DoubleListPropertyImpl build() {
            DoubleListPropertyImpl doubleListPropertyImpl = new DoubleListPropertyImpl();
            doubleListPropertyImpl.setValue(value);
            doubleListPropertyImpl.setDelete(delete);
            doubleListPropertyImpl.setInterval(interval);
            doubleListPropertyImpl.setIntervals(intervals);
            doubleListPropertyImpl.referenceList = this.referenceList;
            return doubleListPropertyImpl;
        }
    }
}
