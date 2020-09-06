package aurora.cesium.element.property;

import cesiumlanguagewriter.*;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
class BoundingRectanglePropertyImpl extends SingleTimeBasedPropertyAdapter<BoundingRectangle, BoundingRectangleProperty> implements BoundingRectangleProperty {

    @Override
    public void dispatch(Supplier<BoundingRectangleCesiumWriter> supplier) {
        try (BoundingRectangleCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeBoundingRectangle, writer::writeBoundingRectangle, writer::writeBoundingRectangle);

            dispatchDelete(writer);
            dispatchInterpolations(writer);
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
            dispatchReference(writer);
        }
    }

    @Override
    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
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
    public List<BoundingRectangleProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<BoundingRectangleProperty> intervals) {
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
        private List<JulianDate> dates;
        private List<BoundingRectangle> values;
        private Integer startIndex;
        private Integer length;

        private BoundingRectangle value;

        private Boolean delete;
        private Interpolations interpolations;
        private TimeInterval interval;
        private List<BoundingRectangleProperty> intervals;
        private Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(BoundingRectangle value) {
            this.value = value;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<BoundingRectangle> values) {
            this.dates = dates;
            this.values = values;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<BoundingRectangle> values, Integer startIndex, Integer length) {
            this.dates = dates;
            this.values = values;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public Builder withDelete(Boolean delete) {
            this.delete = delete;
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

        public Builder withIntervals(List<BoundingRectangleProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public BoundingRectanglePropertyImpl build() {
            BoundingRectanglePropertyImpl boundingRectanglePropertyImpl = new BoundingRectanglePropertyImpl();
            boundingRectanglePropertyImpl.setDates(dates);
            boundingRectanglePropertyImpl.setValues(values);
            boundingRectanglePropertyImpl.setStartIndex(startIndex);
            boundingRectanglePropertyImpl.setLength(length);
            boundingRectanglePropertyImpl.setValue(value);
            boundingRectanglePropertyImpl.setDelete(delete);
            boundingRectanglePropertyImpl.setInterpolations(interpolations);
            boundingRectanglePropertyImpl.setInterval(interval);
            boundingRectanglePropertyImpl.setIntervals(intervals);
            boundingRectanglePropertyImpl.setReference(reference);
            return boundingRectanglePropertyImpl;
        }
    }
}
