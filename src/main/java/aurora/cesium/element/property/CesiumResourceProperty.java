package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumResource;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.UriCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class CesiumResourceProperty extends BaseSingleIntervalProperty<CesiumResource> implements ResourceProperty {

    public CesiumResourceProperty() {
        super();
    }

    public CesiumResourceProperty(CesiumResource instance) {
        super(instance);
    }

    public CesiumResourceProperty(CesiumResource instance, TimeInterval interval) {
        super(instance, interval);
    }

    @Override
    public void dispatchUri(UriCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeUri);
        }
    }

    public CesiumResource getResource() {
        return instance;
    }

    public void setResource(CesiumResource resource) {
        this.instance = resource;
    }
}
