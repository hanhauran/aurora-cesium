package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumClassificationType;
import aurora.cesium.language.writer.ClassificationTypeCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public class DefaultClassificationTypeProperty extends SinglePropertyAdapter<CesiumClassificationType, ClassificationTypeProperty> implements ClassificationTypeProperty {

    @Override
    public void dispatch(ClassificationTypeCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeClassificationType);
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
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
        protected CesiumClassificationType value;
        protected TimeInterval interval;

        protected List<ClassificationTypeProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CesiumClassificationType value) {
            this.value = value;
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

        public DefaultClassificationTypeProperty build() {
            DefaultClassificationTypeProperty defaultClassificationTypeProperty = new DefaultClassificationTypeProperty();
            defaultClassificationTypeProperty.setValue(value);
            defaultClassificationTypeProperty.setInterval(interval);
            defaultClassificationTypeProperty.setIntervals(intervals);
            defaultClassificationTypeProperty.setReference(reference);
            return defaultClassificationTypeProperty;
        }
    }
}
