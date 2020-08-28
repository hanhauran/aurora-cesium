package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumStripeOrientation;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.StripeOrientationCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public class DefaultStripeOrientationProperty extends SinglePropertyAdapter<CesiumStripeOrientation, StripeOrientationProperty> implements StripeOrientationProperty {

    @Override
    public void dispatch(StripeOrientationCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeStripeOrientation);
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
    public List<StripeOrientationProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<StripeOrientationProperty> intervals) {
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
        protected CesiumStripeOrientation value;

        protected TimeInterval interval;
        protected List<StripeOrientationProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CesiumStripeOrientation value) {
            this.value = value;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<StripeOrientationProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public DefaultStripeOrientationProperty build() {
            DefaultStripeOrientationProperty defaultStripeOrientationProperty = new DefaultStripeOrientationProperty();
            defaultStripeOrientationProperty.setValue(value);
            defaultStripeOrientationProperty.setInterval(interval);
            defaultStripeOrientationProperty.setIntervals(intervals);
            defaultStripeOrientationProperty.setReference(reference);
            return defaultStripeOrientationProperty;
        }
    }
}
