package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumVerticalOrigin;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.VerticalOriginCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultVerticalOriginProperty extends SinglePropertyAdapter<CesiumVerticalOrigin> implements VerticalOriginProperty, IntervalProperty, Property {

    public DefaultVerticalOriginProperty() {
        super();
    }

    public DefaultVerticalOriginProperty(CesiumVerticalOrigin instance) {
        super(instance);
    }

    public DefaultVerticalOriginProperty(CesiumVerticalOrigin instance, TimeInterval interval) {
        super(instance, interval);
    }

    public DefaultVerticalOriginProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatchVerticalOrigin(VerticalOriginCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeVerticalOrigin);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public CesiumVerticalOrigin getVerticalOrigin() {
        return instance;
    }

    public void setVerticalOrigin(CesiumVerticalOrigin verticalOrigin) {
        this.instance = verticalOrigin;
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
