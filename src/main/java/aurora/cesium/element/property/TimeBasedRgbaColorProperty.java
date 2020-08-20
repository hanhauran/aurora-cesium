package aurora.cesium.element.property;

import aurora.cesium.language.writer.ColorCesiumWriter;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.TimeInterval;

import java.awt.*;
import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedRgbaColorProperty extends BaseSingleInterpolatableTimeBasedIntervalProperty<Color> implements ColorProperty {
    public TimeBasedRgbaColorProperty() {
        super();
    }

    public TimeBasedRgbaColorProperty(List<JulianDate> dates, List<Color> instance) {
        super(dates, instance);
    }

    public TimeBasedRgbaColorProperty(List<JulianDate> dates, List<Color> instance, TimeInterval interval) {
        super(dates, instance, interval);
    }

    public TimeBasedRgbaColorProperty(List<JulianDate> dates, List<Color> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public TimeBasedRgbaColorProperty(List<JulianDate> dates, List<Color> instance, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instance, startIndex, length, interval);
    }

    @Override
    public void dispatchColor(ColorCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeRgba, writer::writeRgba);
            dispatchInterpolatableProperty(writer);
        }
    }

    public List<Color> getColors() {
        return instance;
    }

    public void setColors(List<Color> colors) {
        this.instance = colors;
    }
}
