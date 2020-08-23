package aurora.cesium.element.property;

import aurora.cesium.language.writer.BackgroundPaddingCesiumWriter;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.Rectangular;
import aurora.cesium.language.writer.RepeatCesiumWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public class TimeBasedRectangularProperty extends SingleTimeBasedPropertyAdapter<Rectangular, RectangularProperty> implements RectangularProperty {

    public TimeBasedRectangularProperty() {
        super();
    }

    public TimeBasedRectangularProperty(List<JulianDate> dates, List<Rectangular> instance) {
        super(dates, instance);
    }

    public TimeBasedRectangularProperty(List<JulianDate> dates, List<Rectangular> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    @Override
    public void dispatchRectangular(BackgroundPaddingCesiumWriter writer) {
        dispatchConsumer(writer::writeCartesian2, writer::writeCartesian2);
    }

    @Override
    public void dispatchRectangular(RepeatCesiumWriter writer) {
        dispatchConsumer(writer::writeCartesian2, writer::writeCartesian2);
    }

    public List<Rectangular> getRectangulars() {
        return instance;
    }

    public void setRectangulars(List<Rectangular> rectangulars) {
        this.instance = rectangulars;
    }
}
