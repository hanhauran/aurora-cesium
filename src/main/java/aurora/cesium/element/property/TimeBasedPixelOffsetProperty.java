package aurora.cesium.element.property;

import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.PixelOffsetCesiumWriter;
import aurora.cesium.language.writer.Rectangular;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedPixelOffsetProperty extends BaseSingleInterpolatableTimeBasedIntervalProperty<Rectangular> implements PixelOffsetProperty, InterpolatableProperty, IntervalProperty, Property {

    public TimeBasedPixelOffsetProperty() {
        super();
    }

    public TimeBasedPixelOffsetProperty(List<JulianDate> dates, List<Rectangular> instance) {
        super(dates, instance);
    }

    public TimeBasedPixelOffsetProperty(List<JulianDate> dates, List<Rectangular> instance, TimeInterval interval) {
        super(dates, instance, interval);
    }

    public TimeBasedPixelOffsetProperty(List<JulianDate> dates, List<Rectangular> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public TimeBasedPixelOffsetProperty(List<JulianDate> dates, List<Rectangular> instance, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instance, startIndex, length, interval);
    }

    @Override
    public void dispatchPixelOffset(PixelOffsetCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeCartesian2, writer::writeCartesian2);
            dispatchInterpolatableProperty(writer);
        }
    }

    public List<Rectangular> getRectangulars() {
        return instance;
    }

    public void setRectangulars(List<Rectangular> rectangulars) {
        this.instance = rectangulars;
    }
}
