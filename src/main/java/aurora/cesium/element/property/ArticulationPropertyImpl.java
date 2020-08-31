package aurora.cesium.element.property;

import aurora.cesium.language.writer.ArticulationCesiumWriter;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public class ArticulationPropertyImpl extends SingleTimeBasedPropertyAdapter<Double, ArticulationProperty> implements ArticulationProperty {

    private String name;

    @Override
    public void dispatch(Supplier<ArticulationCesiumWriter> supplier) {
        try (ArticulationCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeNumber, writer::writeNumber, writer::writeNumber);
            dispatchInterpolations(writer);
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
            dispatchReference(writer);
        }
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public List<ArticulationProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<ArticulationProperty> intervals) {
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
        private String name;

        protected List<JulianDate> dates;
        protected List<Double> values;
        protected Integer startIndex;
        protected Integer length;

        protected Double value;

        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<ArticulationProperty> intervals;
        protected Reference reference;

        private Builder(String name) {
            this.name = name;
        }

        public static Builder newBuilder(String name) {
            return new Builder(name);
        }

        public Builder withValues(List<JulianDate> dates, List<Double> instances) {
            this.dates = dates;
            this.values = instances;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<Double> instances, Integer startIndex, Integer length) {
            this.dates = dates;
            this.values = instances;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public Builder withValue(Double instance) {
            this.value = instance;
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

        public Builder withIntervals(List<ArticulationProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public ArticulationPropertyImpl build() {
            ArticulationPropertyImpl articulationPropertyImpl = new ArticulationPropertyImpl();
            articulationPropertyImpl.setName(name);
            articulationPropertyImpl.setDates(dates);
            articulationPropertyImpl.setValues(values);
            articulationPropertyImpl.setStartIndex(startIndex);
            articulationPropertyImpl.setLength(length);
            articulationPropertyImpl.setValue(value);
            articulationPropertyImpl.setInterpolations(interpolations);
            articulationPropertyImpl.setInterval(interval);
            articulationPropertyImpl.setIntervals(intervals);
            articulationPropertyImpl.setReference(reference);
            return articulationPropertyImpl;
        }
    }
}
