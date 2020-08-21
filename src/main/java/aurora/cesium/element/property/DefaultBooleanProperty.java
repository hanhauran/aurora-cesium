package aurora.cesium.element.property;

import aurora.cesium.language.writer.BooleanCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultBooleanProperty extends SinglePropertyAdapter<Boolean> implements BooleanProperty {

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
            dispatchConsumer(writer::writeBoolean);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public Boolean getBoolean() {
        return instance;
    }

    public void setBoolean(Boolean bool) {
        this.instance = bool;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }
}
