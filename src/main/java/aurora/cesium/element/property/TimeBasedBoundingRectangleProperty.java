package aurora.cesium.element.property;

import aurora.cesium.language.writer.BoundingRectangle;
import aurora.cesium.language.writer.BoundingRectangleCesiumWriter;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedBoundingRectangleProperty extends BaseSingleInterpolatableTimeBasedIntervalProperty<BoundingRectangle> implements BoundingRectangleProperty {

    public TimeBasedBoundingRectangleProperty() {
        super();
    }

    public TimeBasedBoundingRectangleProperty(List<JulianDate> dates, List<BoundingRectangle> instance) {
        super(dates, instance);
    }

    public TimeBasedBoundingRectangleProperty(List<JulianDate> dates, List<BoundingRectangle> instance, TimeInterval interval) {
        super(dates, instance, interval);
    }

    public TimeBasedBoundingRectangleProperty(List<JulianDate> dates, List<BoundingRectangle> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public TimeBasedBoundingRectangleProperty(List<JulianDate> dates, List<BoundingRectangle> instance, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instance, startIndex, length, interval);
    }

    @Override
    public void dispatchBoundingRectangle(BoundingRectangleCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeBoundingRectangle, writer::writeBoundingRectangle);
            dispatchInterpolatableProperty(writer);
        }
    }

    public List<BoundingRectangle> getBoundingRectangles() {
        return instance;
    }

    public void setBoundingRectangles(List<BoundingRectangle> boundingRectangles) {
        this.instance = boundingRectangles;
    }
}
