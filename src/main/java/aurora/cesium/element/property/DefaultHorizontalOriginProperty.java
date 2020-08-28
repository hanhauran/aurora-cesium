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
public class DefaultHorizontalOriginProperty extends SinglePropertyAdapter<CesiumHorizontalOrigin, HorizontalOriginProperty> implements HorizontalOriginProperty {

    public DefaultHorizontalOriginProperty() {
        super();
    }

    @Override
    public void dispatch(HorizontalOriginCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeHorizontalOrigin);
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
            dispatchReference(writer);
        }
    }

    public CesiumHorizontalOrigin getHorizontalOrigin() {
        return instance;
    }

    public void setHorizontalOrigin(CesiumHorizontalOrigin horizontalOrigin) {
        this.instance = horizontalOrigin;
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
        protected CesiumHorizontalOrigin instance;
        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<HorizontalOriginProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder aDefaultHorizontalOriginProperty() {
            return new Builder();
        }

        public Builder with(CesiumHorizontalOrigin instance) {
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

        public Builder withIntervals(List<HorizontalOriginProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public DefaultHorizontalOriginProperty build() {
            DefaultHorizontalOriginProperty defaultHorizontalOriginProperty = new DefaultHorizontalOriginProperty();
            defaultHorizontalOriginProperty.setInterval(interval);
            defaultHorizontalOriginProperty.setIntervals(intervals);
            defaultHorizontalOriginProperty.setReference(reference);
            defaultHorizontalOriginProperty.interpolations = this.interpolations;
            defaultHorizontalOriginProperty.instance = this.instance;
            return defaultHorizontalOriginProperty;
        }
    }
}
