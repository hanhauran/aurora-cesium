package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultPixelOffsetProperty extends SingleTimeBasedPropertyAdapter<Rectangular, PixelOffsetProperty> implements PixelOffsetProperty {

    @Override
    public void dispatch(PixelOffsetCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeCartesian2, writer::writeCartesian2, writer::writeCartesian2);
            dispatchInterpolations(writer);
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
            dispatchReference(writer);
        }
    }

    @Override
    public Interpolations getInterpolations() {
        return interpolations;
    }

    public void setInterpolations(Interpolations interpolations) {
        this.interpolations = interpolations;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<PixelOffsetProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<PixelOffsetProperty> intervals) {
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
        protected List<JulianDate> dates;
        protected List<Rectangular> instances;
        protected Integer startIndex;
        protected Integer length;
        protected Rectangular instance;
        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<PixelOffsetProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder aDefaultPixelOffsetProperty() {
            return new Builder();
        }

        public Builder with(List<JulianDate> dates, List<Rectangular> instances) {
            this.dates = dates;
            this.instances = instances;
            return this;
        }

        public Builder with(List<JulianDate> dates, List<Rectangular> instances, Integer startIndex, Integer length) {
            this.dates = dates;
            this.instances = instances;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public Builder with(Rectangular instance) {
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

        public Builder withIntervals(List<PixelOffsetProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public DefaultPixelOffsetProperty build() {
            DefaultPixelOffsetProperty defaultPixelOffsetProperty = new DefaultPixelOffsetProperty();
            defaultPixelOffsetProperty.setDates(dates);
            defaultPixelOffsetProperty.setInstances(instances);
            defaultPixelOffsetProperty.setStartIndex(startIndex);
            defaultPixelOffsetProperty.setLength(length);
            defaultPixelOffsetProperty.setInstance(instance);
            defaultPixelOffsetProperty.setInterpolations(interpolations);
            defaultPixelOffsetProperty.setInterval(interval);
            defaultPixelOffsetProperty.setIntervals(intervals);
            defaultPixelOffsetProperty.setReference(reference);
            return defaultPixelOffsetProperty;
        }
    }
}
