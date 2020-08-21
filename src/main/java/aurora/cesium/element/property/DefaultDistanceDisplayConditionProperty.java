package aurora.cesium.element.property;

import aurora.cesium.language.writer.Bounds;
import aurora.cesium.language.writer.DistanceDisplayConditionCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultDistanceDisplayConditionProperty extends SinglePropertyAdapter<Bounds> implements DistanceDisplayConditionProperty {

    public DefaultDistanceDisplayConditionProperty() {
        super();
    }

    public DefaultDistanceDisplayConditionProperty(Bounds instance) {
        super(instance);
    }

    public DefaultDistanceDisplayConditionProperty(Bounds instance, TimeInterval interval) {
        super(instance, interval);
    }

    @Override
    public void dispatchDistanceDisplayCondition(DistanceDisplayConditionCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeDistanceDisplayCondition);
            dispatchInterpolations(writer);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public Bounds getBounds() {
        return instance;
    }

    public void setBounds(Bounds bounds) {
        this.instance = bounds;
    }

    @Override
    public Interpolations getInterpolations() {
        return interpolations;
    }

    public void setInterpolations(Interpolations interpolations) {
        this.interpolations = interpolations;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }
}
