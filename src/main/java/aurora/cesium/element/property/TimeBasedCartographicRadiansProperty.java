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
public class TimeBasedCartographicRadiansProperty extends SingleTimeBasedPropertyAdapter<Cartographic> implements CartographicRadiansProperty {

    public TimeBasedCartographicRadiansProperty() {
        super();
    }

    public TimeBasedCartographicRadiansProperty(List<JulianDate> dates, List<Cartographic> instance) {
        super(dates, instance);
    }

    public TimeBasedCartographicRadiansProperty(List<JulianDate> dates, List<Cartographic> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    @Override
    public void dispatchCartographicRadians(PositionCesiumWriter writer) {
        dispatchConsumer(writer::writeCartographicRadians, writer::writeCartographicRadians);
    }

    public List<Cartographic> getCartographics() {
        return instance;
    }

    public void setCartographics(List<Cartographic> cartographics) {
        this.instance = cartographics;
    }
}
