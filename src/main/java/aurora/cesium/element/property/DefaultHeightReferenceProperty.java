package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumHeightReference;
import aurora.cesium.language.writer.HeightReferenceCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultHeightReferenceProperty extends SinglePropertyAdapter<CesiumHeightReference, HeightReferenceProperty> implements HeightReferenceProperty {

    public DefaultHeightReferenceProperty() {
        super();
    }

    public DefaultHeightReferenceProperty(CesiumHeightReference instance) {
        super(instance);
    }

    public DefaultHeightReferenceProperty(CesiumHeightReference instance, TimeInterval interval) {
        super(instance, interval);
    }

    public DefaultHeightReferenceProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(HeightReferenceCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeHeightReference);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public CesiumHeightReference getHeightReference() {
        return instance;
    }

    public void setHeightReference(CesiumHeightReference heightReference) {
        this.instance = heightReference;
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
