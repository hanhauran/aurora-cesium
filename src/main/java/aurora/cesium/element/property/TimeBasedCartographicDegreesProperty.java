package aurora.cesium.element.property;

import aurora.cesium.language.writer.Cartographic;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.PositionCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedCartographicDegreesProperty extends SingleTimeBasedPropertyAdapter<Cartographic> implements CartographicDegreesProperty {

    public TimeBasedCartographicDegreesProperty() {
        super();
    }

    public TimeBasedCartographicDegreesProperty(List<JulianDate> dates, List<Cartographic> instance) {
        super(dates, instance);
    }

    public TimeBasedCartographicDegreesProperty(List<JulianDate> dates, List<Cartographic> instance, TimeInterval interval) {
        super(dates, instance, interval);
    }

    public TimeBasedCartographicDegreesProperty(List<JulianDate> dates, List<Cartographic> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public TimeBasedCartographicDegreesProperty(List<JulianDate> dates, List<Cartographic> instance, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instance, startIndex, length, interval);
    }

    @Override
    public void dispatchPosition(PositionCesiumWriter writer) {
        dispatchConsumer(writer::writeCartographicDegrees, writer::writeCartographicDegrees);
    }

    public List<Cartographic> getCartographics() {
        return instance;
    }

    public void setCartographics(List<Cartographic> cartographics) {
        this.instance = cartographics;
    }
}
