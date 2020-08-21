package aurora.cesium.element.property;

import aurora.cesium.language.writer.Cartographic;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultCartographicRadiansProperty extends SinglePropertyAdapter<Cartographic> implements CartographicRadiansProperty {

    public DefaultCartographicRadiansProperty() {
        super();
    }

    public DefaultCartographicRadiansProperty(Cartographic instance) {
        super(instance);
    }

    public DefaultCartographicRadiansProperty(Cartographic instance, TimeInterval interval) {
        super(instance, interval);
    }

    public Cartographic getCartographic() {
        return instance;
    }

    public void setCartographic(Cartographic cartographic) {
        this.instance = cartographic;
    }
}
