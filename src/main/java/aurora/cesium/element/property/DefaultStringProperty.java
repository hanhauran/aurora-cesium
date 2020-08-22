package aurora.cesium.element.property;

import aurora.cesium.language.writer.FontCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.StringCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultStringProperty extends SinglePropertyAdapter<String> implements StringProperty {

    public DefaultStringProperty() {
        super();
    }

    public DefaultStringProperty(String instance) {
        super(instance);
    }

    public DefaultStringProperty(String instance, TimeInterval interval) {
        super(instance, interval);
    }

    public DefaultStringProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(StringCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeString);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    @Override
    public void dispatch(FontCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeFont);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public String getString() {
        return instance;
    }

    public void setString(String string) {
        this.instance = string;
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
