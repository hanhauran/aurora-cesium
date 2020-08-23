package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumResource;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.UriCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class CesiumResourceProperty extends SinglePropertyAdapter<CesiumResource, UriProperty> implements UriProperty {

    public CesiumResourceProperty() {
        super();
    }

    public CesiumResourceProperty(CesiumResource instance) {
        super(instance);
    }

    public CesiumResourceProperty(CesiumResource instance, TimeInterval interval) {
        super(instance, interval);
    }

    public CesiumResourceProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatchUri(UriCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeUri);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public CesiumResource getResource() {
        return instance;
    }

    public void setResource(CesiumResource resource) {
        this.instance = resource;
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
