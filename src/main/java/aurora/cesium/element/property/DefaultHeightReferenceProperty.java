package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumHeightReference;
import aurora.cesium.language.writer.HeightReferenceCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultHeightReferenceProperty extends BaseSingleIntervalProperty<CesiumHeightReference> implements HeightReferenceProperty, IntervalProperty, Property {

    public DefaultHeightReferenceProperty() {
        super();
    }

    public DefaultHeightReferenceProperty(CesiumHeightReference instance) {
        super(instance);
    }

    public DefaultHeightReferenceProperty(CesiumHeightReference instance, TimeInterval interval) {
        super(instance, interval);
    }

    @Override
    public void dispatchHeightReference(HeightReferenceCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeHeightReference);
        }
    }

    public CesiumHeightReference getHeightReference() {
        return instance;
    }

    public void setHeightReference(CesiumHeightReference heightReference) {
        this.instance = heightReference;
    }
}
