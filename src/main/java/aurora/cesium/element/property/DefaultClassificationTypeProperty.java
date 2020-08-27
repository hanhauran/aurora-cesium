package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumClassificationType;
import aurora.cesium.language.writer.ClassificationTypeCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public class DefaultClassificationTypeProperty extends SinglePropertyAdapter<CesiumClassificationType, ClassificationTypeProperty> implements ClassificationTypeProperty {

    public DefaultClassificationTypeProperty(CesiumClassificationType instance) {
        super(instance);
    }

    public DefaultClassificationTypeProperty(CesiumClassificationType instance, TimeInterval interval) {
        super(instance, interval);
    }

    public DefaultClassificationTypeProperty(Reference reference) {
        super(reference);
    }

    public DefaultClassificationTypeProperty(List<ClassificationTypeProperty> intervals) {
        super(intervals);
    }

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
        return instance;
    }

    public void setClassificationType(CesiumClassificationType type) {
        this.instance = type;
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
}
