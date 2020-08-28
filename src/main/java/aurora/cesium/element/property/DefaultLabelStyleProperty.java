package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumLabelStyle;
import aurora.cesium.language.writer.LabelStyleCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultLabelStyleProperty extends SinglePropertyAdapter<CesiumLabelStyle, LabelStyleProperty> implements LabelStyleProperty {

    @Override
    public void dispatch(LabelStyleCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeLabelStyle);
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
    public List<LabelStyleProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<LabelStyleProperty> intervals) {
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
        protected CesiumLabelStyle value;

        protected TimeInterval interval;
        protected List<LabelStyleProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CesiumLabelStyle value) {
            this.value = value;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<LabelStyleProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public DefaultLabelStyleProperty build() {
            DefaultLabelStyleProperty defaultLabelStyleProperty = new DefaultLabelStyleProperty();
            defaultLabelStyleProperty.setValue(value);
            defaultLabelStyleProperty.setInterval(interval);
            defaultLabelStyleProperty.setIntervals(intervals);
            defaultLabelStyleProperty.setReference(reference);
            return defaultLabelStyleProperty;
        }
    }
}
