package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumHorizontalOrigin;
import aurora.cesium.language.writer.HorizontalOriginCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class HorizontalOriginPropertyImpl extends SinglePropertyAdapter<CesiumHorizontalOrigin, HorizontalOriginProperty> implements HorizontalOriginProperty {

    @Override
    public void dispatch(HorizontalOriginCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeHorizontalOrigin);
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
    public List<HorizontalOriginProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<HorizontalOriginProperty> intervals) {
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
        protected CesiumHorizontalOrigin value;

        protected TimeInterval interval;
        protected List<HorizontalOriginProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CesiumHorizontalOrigin value) {
            this.value = value;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<HorizontalOriginProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public HorizontalOriginPropertyImpl build() {
            HorizontalOriginPropertyImpl horizontalOriginPropertyImpl = new HorizontalOriginPropertyImpl();
            horizontalOriginPropertyImpl.setValue(value);
            horizontalOriginPropertyImpl.setInterval(interval);
            horizontalOriginPropertyImpl.setIntervals(intervals);
            horizontalOriginPropertyImpl.setReference(reference);
            return horizontalOriginPropertyImpl;
        }
    }
}
