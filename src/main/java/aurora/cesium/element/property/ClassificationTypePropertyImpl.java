package aurora.cesium.element.property;

import cesiumlanguagewriter.CesiumClassificationType;
import cesiumlanguagewriter.ClassificationTypeCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
class ClassificationTypePropertyImpl extends SinglePropertyAdapter<CesiumClassificationType, ClassificationTypeProperty> implements ClassificationTypeProperty {

    @Override
    public void dispatch(Supplier<ClassificationTypeCesiumWriter> supplier) {
        try (ClassificationTypeCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeClassificationType);

            dispatchDelete(writer);
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
            dispatchReference(writer);
        }
    }

    @Override
    public CesiumClassificationType getClassificationType() {
        return value;
    }

    public void setClassificationType(CesiumClassificationType type) {
        this.value = type;
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
    public List<ClassificationTypeProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<ClassificationTypeProperty> intervals) {
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
        private CesiumClassificationType value;

        private Boolean delete;
        private TimeInterval interval;
        private List<ClassificationTypeProperty> intervals;
        private Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CesiumClassificationType value) {
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

        public Builder withIntervals(List<ClassificationTypeProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public ClassificationTypePropertyImpl build() {
            ClassificationTypePropertyImpl classificationTypePropertyImpl = new ClassificationTypePropertyImpl();
            classificationTypePropertyImpl.setValue(value);
            classificationTypePropertyImpl.setDelete(delete);
            classificationTypePropertyImpl.setInterval(interval);
            classificationTypePropertyImpl.setIntervals(intervals);
            classificationTypePropertyImpl.setReference(reference);
            return classificationTypePropertyImpl;
        }
    }
}
