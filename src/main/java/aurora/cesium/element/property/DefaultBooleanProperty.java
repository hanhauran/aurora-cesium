package aurora.cesium.element.property;

import aurora.cesium.language.writer.BooleanCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultBooleanProperty extends BaseSingleIntervalProperty<Boolean> implements BooleanProperty {

    public DefaultBooleanProperty() {
        super();
    }

    public DefaultBooleanProperty(Boolean instance) {
        super(instance);
    }

    public DefaultBooleanProperty(Boolean instance, TimeInterval interval) {
        super(instance, interval);
    }

    @Override
    public void dispatchBoolean(BooleanCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeBoolean);
        }
    }

    public Boolean getBoolean() {
        return instance;
    }

    public void setBoolean(Boolean bool) {
        this.instance = bool;
    }
}
