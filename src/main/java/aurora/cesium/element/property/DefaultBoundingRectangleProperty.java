package aurora.cesium.element.property;

import aurora.cesium.language.writer.BoundingRectangle;
import aurora.cesium.language.writer.BoundingRectangleCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultBoundingRectangleProperty extends SinglePropertyAdapter<BoundingRectangle, BoundingRectangleProperty> implements BoundingRectangleProperty {

    public DefaultBoundingRectangleProperty(BoundingRectangle instance) {
        super(instance);
    }

    public DefaultBoundingRectangleProperty(BoundingRectangle instance, TimeInterval interval) {
        super(instance, interval);
    }

    public DefaultBoundingRectangleProperty(BoundingRectangle instance, Interpolations interpolations) {
        super(instance, interpolations);
    }

    public DefaultBoundingRectangleProperty(BoundingRectangle instance, Interpolations interpolations, TimeInterval interval) {
        super(instance, interpolations, interval);
    }

    public DefaultBoundingRectangleProperty(List<BoundingRectangleProperty> intervals) {
        super(intervals);
    }

    public DefaultBoundingRectangleProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(BoundingRectangleCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeBoundingRectangle);
            dispatchInterpolations(writer);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public BoundingRectangle getBoundingRectangle() {
        return instance;
    }

    public void setBoundingRectangle(BoundingRectangle boundingRectangle) {
        this.instance = boundingRectangle;
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
    public List<BoundingRectangleProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<BoundingRectangleProperty> intervals) {
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
