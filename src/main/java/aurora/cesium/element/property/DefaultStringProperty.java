package aurora.cesium.element.property;

import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultStringProperty extends BaseSingleIntervalProperty<String> implements StringProperty {

    public DefaultStringProperty() {
        super();
    }

    public DefaultStringProperty(String instance) {
        super(instance);
    }

    public DefaultStringProperty(String instance, TimeInterval interval) {
        super(instance, interval);
    }

    public String getString() {
        return instance;
    }

    public void setString(String string) {
        this.instance = string;
    }
}
