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
public class DefaultCartographicDegreesProperty extends SingleTimeBasedPropertyAdapter<Cartographic, CartographicDegreesProperty> implements CartographicDegreesProperty {

    public DefaultCartographicDegreesProperty(Cartographic instance) {
        super(instance);
    }

    public DefaultCartographicDegreesProperty(List<JulianDate> dates, List<Cartographic> instances) {
        super(dates, instances);
    }

    public DefaultCartographicDegreesProperty(List<JulianDate> dates, List<Cartographic> instances, Integer startIndex, Integer length) {
        super(dates, instances, startIndex, length);
    }

    @Override
    public void dispatchCartographicDegrees(PositionCesiumWriter writer) {
        dispatchConsumer(writer::writeCartographicDegrees, writer::writeCartographicDegrees, writer::writeCartographicDegrees);
    }

    public Cartographic getCartographic() {
        return instance;
    }

    public void setCartographic(Cartographic cartographic) {
        this.instance = cartographic;
    }

    public List<Cartographic> getCartographics() {
        return instances;
    }

    public void setCartographics(List<Cartographic> cartographics) {
        this.instances = cartographics;
    }
}
