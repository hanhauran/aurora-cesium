package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumVerticalOrigin;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.VerticalOriginCesiumWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultVerticalOriginProperty extends SinglePropertyAdapter<CesiumVerticalOrigin, VerticalOriginProperty> implements VerticalOriginProperty {

    @Override
    public void dispatch(VerticalOriginCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeVerticalOrigin);
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
    public List<VerticalOriginProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<VerticalOriginProperty> intervals) {
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
        protected CesiumVerticalOrigin value;

        protected TimeInterval interval;
        protected List<VerticalOriginProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CesiumVerticalOrigin instance) {
            this.value = instance;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<VerticalOriginProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public DefaultVerticalOriginProperty build() {
            DefaultVerticalOriginProperty defaultVerticalOriginProperty = new DefaultVerticalOriginProperty();
            defaultVerticalOriginProperty.setValue(value);
            defaultVerticalOriginProperty.setInterval(interval);
            defaultVerticalOriginProperty.setIntervals(intervals);
            defaultVerticalOriginProperty.setReference(reference);
            return defaultVerticalOriginProperty;
        }
    }
}
