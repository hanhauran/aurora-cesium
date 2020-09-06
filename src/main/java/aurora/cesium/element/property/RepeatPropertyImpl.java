package aurora.cesium.element.property;

import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.RepeatCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
class RepeatPropertyImpl extends PropertyAdapter<RepeatProperty> implements RepeatProperty {

    private RectangularProperty rectangular;

    @Override
    public void dispatch(Supplier<RepeatCesiumWriter> supplier) {
        try (RepeatCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getRectangular()).ifPresent(rectangularProperty -> rectangularProperty.dispatchWithoutClose(writer));

            dispatchDelete(writer);
            dispatchInterpolations(writer);
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
            dispatchReference(writer);
        }
    }

    @Override
    public RectangularProperty getRectangular() {
        return rectangular;
    }

    public void setRectangular(RectangularProperty rectangular) {
        this.rectangular = rectangular;
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
    public List<RepeatProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<RepeatProperty> intervals) {
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
        private RectangularProperty rectangular;

        private Boolean delete;
        private Interpolations interpolations;
        private TimeInterval interval;
        private List<RepeatProperty> intervals;
        private Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withRectangular(RectangularProperty rectangular) {
            this.rectangular = rectangular;
            return this;
        }

        public Builder withInterpolations(Interpolations interpolations) {
            this.interpolations = interpolations;
            return this;
        }

        public Builder withDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<RepeatProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public RepeatPropertyImpl build() {
            RepeatPropertyImpl repeatPropertyImpl = new RepeatPropertyImpl();
            repeatPropertyImpl.setRectangular(rectangular);
            repeatPropertyImpl.setDelete(delete);
            repeatPropertyImpl.setInterpolations(interpolations);
            repeatPropertyImpl.setInterval(interval);
            repeatPropertyImpl.setIntervals(intervals);
            repeatPropertyImpl.setReference(reference);
            return repeatPropertyImpl;
        }
    }
}
