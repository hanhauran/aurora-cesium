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
public class HeightReferencePropertyImpl extends SinglePropertyAdapter<CesiumHeightReference, HeightReferenceProperty> implements HeightReferenceProperty {

    @Override
    public void dispatch(HeightReferenceCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeHeightReference);
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
            dispatchReference(writer);
        }
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
        protected CesiumHeightReference value;

        protected TimeInterval interval;
        protected List<HeightReferenceProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CesiumHeightReference value) {
            this.value = value;
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

        public HeightReferencePropertyImpl build() {
            HeightReferencePropertyImpl heightReferencePropertyImpl = new HeightReferencePropertyImpl();
            heightReferencePropertyImpl.setValue(value);
            heightReferencePropertyImpl.setInterval(interval);
            heightReferencePropertyImpl.setIntervals(intervals);
            heightReferencePropertyImpl.setReference(reference);
            return heightReferencePropertyImpl;
        }
    }
}
