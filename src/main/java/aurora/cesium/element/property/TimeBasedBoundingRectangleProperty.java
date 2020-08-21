package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedBoundingRectangleProperty extends SingleTimeBasedPropertyAdapter<BoundingRectangle> implements BoundingRectangleProperty {

    public TimeBasedBoundingRectangleProperty() {
        super();
    }

    public TimeBasedBoundingRectangleProperty(List<JulianDate> dates, List<BoundingRectangle> instance) {
        super(dates, instance);
    }

    public TimeBasedBoundingRectangleProperty(List<JulianDate> dates, List<BoundingRectangle> instance, Interpolations interpolations) {
        super(dates, instance, interpolations);
    }

    public TimeBasedBoundingRectangleProperty(List<JulianDate> dates, List<BoundingRectangle> instance, TimeInterval interval) {
        super(dates, instance, interval);
    }

    public TimeBasedBoundingRectangleProperty(List<JulianDate> dates, List<BoundingRectangle> instance, Interpolations interpolations, TimeInterval interval) {
        super(dates, instance, interpolations, interval);
    }

    public TimeBasedBoundingRectangleProperty(List<JulianDate> dates, List<BoundingRectangle> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public TimeBasedBoundingRectangleProperty(List<JulianDate> dates, List<BoundingRectangle> instance, Integer startIndex, Integer length, Interpolations interpolations) {
        super(dates, instance, startIndex, length, interpolations);
    }

    public TimeBasedBoundingRectangleProperty(List<JulianDate> dates, List<BoundingRectangle> instance, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instance, startIndex, length, interval);
    }

    public TimeBasedBoundingRectangleProperty(List<JulianDate> dates, List<BoundingRectangle> instance, Integer startIndex, Integer length, Interpolations interpolations, TimeInterval interval) {
        super(dates, instance, startIndex, length, interpolations, interval);
    }

    public TimeBasedBoundingRectangleProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(BoundingRectangleCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeBoundingRectangle, writer::writeBoundingRectangle);
            dispatchInterval(writer);
            dispatchInterpolations(writer);
            dispatchReference(writer);
        }
    }

    public List<BoundingRectangle> getBoundingRectangles() {
        return instance;
    }

    public void setBoundingRectangles(List<BoundingRectangle> boundingRectangles) {
        this.instance = boundingRectangles;
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
