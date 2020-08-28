package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumHeightReference;
import aurora.cesium.language.writer.HeightReferenceCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultHeightReferenceProperty extends SinglePropertyAdapter<CesiumHeightReference, HeightReferenceProperty> implements HeightReferenceProperty {

    public DefaultHeightReferenceProperty() {
        super();
    }

    @Override
    public void dispatch(HeightReferenceCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeHeightReference);
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
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
    public List<HeightReferenceProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<HeightReferenceProperty> intervals) {
        this.intervals = intervals;
    }

    @Override
    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }

    public static final class Builder {
        protected CesiumHeightReference instance;
        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<HeightReferenceProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder aDefaultHeightReferenceProperty() {
            return new Builder();
        }

        public Builder with(CesiumHeightReference instance) {
            this.instance = instance;
            return this;
        }

        public Builder withInterpolations(Interpolations interpolations) {
            this.interpolations = interpolations;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<HeightReferenceProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public DefaultHeightReferenceProperty build() {
            DefaultHeightReferenceProperty defaultHeightReferenceProperty = new DefaultHeightReferenceProperty();
            defaultHeightReferenceProperty.setInterval(interval);
            defaultHeightReferenceProperty.setIntervals(intervals);
            defaultHeightReferenceProperty.setReference(reference);
            defaultHeightReferenceProperty.interpolations = this.interpolations;
            defaultHeightReferenceProperty.instance = this.instance;
            return defaultHeightReferenceProperty;
        }
    }
}
