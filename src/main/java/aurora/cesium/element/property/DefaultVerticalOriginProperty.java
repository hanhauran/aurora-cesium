package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumVerticalOrigin;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.VerticalOriginCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultVerticalOriginProperty extends BaseSingleIntervalProperty<CesiumVerticalOrigin> implements VerticalOriginProperty, IntervalProperty, Property {

    public DefaultVerticalOriginProperty() {
        super();
    }

    public DefaultVerticalOriginProperty(CesiumVerticalOrigin instance) {
        super(instance);
    }

    public DefaultVerticalOriginProperty(CesiumVerticalOrigin instance, TimeInterval interval) {
        super(instance, interval);
    }

    @Override
    public void dispatchVerticalOrigin(VerticalOriginCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeVerticalOrigin);
        }
    }

    public CesiumVerticalOrigin getVerticalOrigin() {
        return instance;
    }

    public void setVerticalOrigin(CesiumVerticalOrigin verticalOrigin) {
        this.instance = verticalOrigin;
    }
}
