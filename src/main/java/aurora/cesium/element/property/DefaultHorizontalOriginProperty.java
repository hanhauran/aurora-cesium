package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumHorizontalOrigin;
import aurora.cesium.language.writer.HorizontalOriginCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultHorizontalOriginProperty extends SinglePropertyAdapter<CesiumHorizontalOrigin, HorizontalOriginProperty> implements HorizontalOriginProperty {

    public DefaultHorizontalOriginProperty() {
        super();
    }

    public DefaultHorizontalOriginProperty(CesiumHorizontalOrigin instance) {
        super(instance);
    }

    public DefaultHorizontalOriginProperty(CesiumHorizontalOrigin instance, TimeInterval interval) {
        super(instance, interval);
    }

    public DefaultHorizontalOriginProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(HorizontalOriginCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeHorizontalOrigin);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public CesiumHorizontalOrigin getHorizontalOrigin() {
        return instance;
    }

    public void setHorizontalOrigin(CesiumHorizontalOrigin horizontalOrigin) {
        this.instance = horizontalOrigin;
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
