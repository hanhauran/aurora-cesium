package aurora.cesium.element.property;

import aurora.cesium.language.writer.BooleanCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class BooleanPropertyImpl extends SinglePropertyAdapter<Boolean, BooleanProperty> implements BooleanProperty {

    @Override
    public void dispatch(BooleanCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeBoolean);
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
    public List<BooleanProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<BooleanProperty> intervals) {
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
        protected Boolean value;
        protected TimeInterval interval;
        protected List<BooleanProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(Boolean instance) {
            this.value = instance;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<BooleanProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public BooleanPropertyImpl build() {
            BooleanPropertyImpl booleanPropertyImpl = new BooleanPropertyImpl();
            booleanPropertyImpl.setValue(value);
            booleanPropertyImpl.setInterval(interval);
            booleanPropertyImpl.setIntervals(intervals);
            booleanPropertyImpl.setReference(reference);
            return booleanPropertyImpl;
        }
    }
}
