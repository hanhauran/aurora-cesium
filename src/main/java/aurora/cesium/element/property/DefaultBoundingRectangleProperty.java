package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultBoundingRectangleProperty extends SingleTimeBasedPropertyAdapter<BoundingRectangle, BoundingRectangleProperty> implements BoundingRectangleProperty {

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

    public DefaultBoundingRectangleProperty(List<JulianDate> dates, List<BoundingRectangle> instances) {
        super(dates, instances);
    }

    public DefaultBoundingRectangleProperty(List<JulianDate> dates, List<BoundingRectangle> instances, Interpolations interpolations) {
        super(dates, instances, interpolations);
    }

    public DefaultBoundingRectangleProperty(List<JulianDate> dates, List<BoundingRectangle> instances, TimeInterval interval) {
        super(dates, instances, interval);
    }

    public DefaultBoundingRectangleProperty(List<JulianDate> dates, List<BoundingRectangle> instances, Interpolations interpolations, TimeInterval interval) {
        super(dates, instances, interpolations, interval);
    }

    public DefaultBoundingRectangleProperty(List<JulianDate> dates, List<BoundingRectangle> instances, Integer startIndex, Integer length) {
        super(dates, instances, startIndex, length);
    }

    public DefaultBoundingRectangleProperty(List<JulianDate> dates, List<BoundingRectangle> instances, Integer startIndex, Integer length, Interpolations interpolations) {
        super(dates, instances, startIndex, length, interpolations);
    }

    public DefaultBoundingRectangleProperty(List<JulianDate> dates, List<BoundingRectangle> instances, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instances, startIndex, length, interval);
    }

    public DefaultBoundingRectangleProperty(List<JulianDate> dates, List<BoundingRectangle> instances, Integer startIndex, Integer length, Interpolations interpolations, TimeInterval interval) {
        super(dates, instances, startIndex, length, interpolations, interval);
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
            dispatchConsumer(writer::writeBoundingRectangle, writer::writeBoundingRectangle, writer::writeBoundingRectangle);
            dispatchInterpolations(writer);
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
            dispatchReference(writer);
        }
    }

    public BoundingRectangle getBoundingRectangle() {
        return instance;
    }

    public void setBoundingRectangle(BoundingRectangle boundingRectangle) {
        this.instance = boundingRectangle;
    }

    public List<BoundingRectangle> getBoundingRectangles() {
        return instances;
    }

    public void setBoundingRectangles(List<BoundingRectangle> boundingRectangles) {
        this.instances = boundingRectangles;
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
