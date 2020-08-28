package aurora.cesium.element.property;

import aurora.cesium.language.writer.DoubleCesiumWriter;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultDoubleProperty extends SingleTimeBasedPropertyAdapter<Double, DoubleProperty> implements DoubleProperty {

    public DefaultDoubleProperty() {
        super();
    }

    @Override
    public void dispatch(DoubleCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeNumber, writer::writeNumber, writer::writeNumber);
            dispatchInterpolations(writer);
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
            dispatchReference(writer);
        }
    }

    public Double getDouble() {
        return instance;
    }

    public void setDouble(Double instance) {
        this.instance = instance;
    }

    public List<Double> getDoubles() {
        return instances;
    }

    public void setDoubles(List<Double> instances) {
        this.instances = instances;
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
    public List<DoubleProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<DoubleProperty> intervals) {
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
        protected List<Double> instances;
        protected Integer startIndex;
        protected Integer length;

        protected Double instance;

        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<DoubleProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder with(List<JulianDate> dates, List<Double> instances) {
            this.dates = dates;
            this.instances = instances;
            return this;
        }

        public Builder with(List<JulianDate> dates, List<Double> instances, Integer startIndex, Integer length) {
            this.dates = dates;
            this.instances = instances;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public Builder with(Double instance) {
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

        public Builder withIntervals(List<DoubleProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public DefaultDoubleProperty build() {
            DefaultDoubleProperty defaultDoubleProperty = new DefaultDoubleProperty();
            defaultDoubleProperty.setDates(dates);
            defaultDoubleProperty.setStartIndex(startIndex);
            defaultDoubleProperty.setLength(length);
            defaultDoubleProperty.setInterpolations(interpolations);
            defaultDoubleProperty.setInterval(interval);
            defaultDoubleProperty.setIntervals(intervals);
            defaultDoubleProperty.setReference(reference);
            defaultDoubleProperty.instances = this.instances;
            defaultDoubleProperty.instance = this.instance;
            return defaultDoubleProperty;
        }
    }
}
