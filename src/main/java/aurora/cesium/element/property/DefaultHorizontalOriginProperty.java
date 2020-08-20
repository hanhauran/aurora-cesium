package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumHorizontalOrigin;
import aurora.cesium.language.writer.HorizontalOriginCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultHorizontalOriginProperty extends BaseSingleIntervalProperty<CesiumHorizontalOrigin> implements HorizontalOriginProperty, IntervalProperty, Property {

    public DefaultHorizontalOriginProperty() {
        super();
    }

    public DefaultHorizontalOriginProperty(CesiumHorizontalOrigin instance) {
        super(instance);
    }

    public DefaultHorizontalOriginProperty(CesiumHorizontalOrigin instance, TimeInterval interval) {
        super(instance, interval);
    }

    @Override
    public void dispatchHorizontalOrigin(HorizontalOriginCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeHorizontalOrigin);
        }
    }

    public CesiumHorizontalOrigin getHorizontalOrigin() {
        return instance;
    }

    public void setHorizontalOrigin(CesiumHorizontalOrigin horizontalOrigin) {
        this.instance = horizontalOrigin;
    }
}
