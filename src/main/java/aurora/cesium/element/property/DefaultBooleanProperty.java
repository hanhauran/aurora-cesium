package aurora.cesium.element.property;

import aurora.cesium.language.writer.BooleanCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultBooleanProperty extends SinglePropertyAdapter<Boolean, BooleanProperty> implements BooleanProperty {

    public DefaultBooleanProperty(Boolean instance) {
        super(instance);
    }

    public DefaultBooleanProperty(Boolean instance, TimeInterval interval) {
        super(instance, interval);
    }

    public DefaultBooleanProperty(List<BooleanProperty> intervals) {
        super(intervals);
    }

    public DefaultBooleanProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(BooleanCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeBoolean);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public Boolean getBoolean() {
        return instance;
    }

    public void setBoolean(Boolean value) {
        this.instance = value;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<BooleanProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<BooleanProperty> intervals) {
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
