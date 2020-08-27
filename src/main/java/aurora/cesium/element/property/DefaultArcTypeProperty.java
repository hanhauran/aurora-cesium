package aurora.cesium.element.property;

import aurora.cesium.language.writer.ArcTypeCesiumWriter;
import aurora.cesium.language.writer.CesiumArcType;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public class DefaultArcTypeProperty extends SinglePropertyAdapter<CesiumArcType, ArcTypeProperty> implements ArcTypeProperty {

    public DefaultArcTypeProperty(CesiumArcType instance) {
        super(instance);
    }

    public DefaultArcTypeProperty(CesiumArcType instance, TimeInterval interval) {
        super(instance, interval);
    }

    public DefaultArcTypeProperty(List<ArcTypeProperty> intervals) {
        super(intervals);
    }

    public DefaultArcTypeProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(ArcTypeCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getArcType()).ifPresent(writer::writeArcType);
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
            dispatchReference(writer);
        }
    }

    @Override
    public CesiumArcType getArcType() {
        return instance;
    }

    public void setArcType(CesiumArcType arcType) {
        this.instance = arcType;
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
}
