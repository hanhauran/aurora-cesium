package aurora.cesium.element.property;

import cesiumlanguagewriter.LineCountCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
class LineCountPropertyImpl extends PropertyAdapter<LineCountProperty> implements LineCountProperty {

    private RectangularProperty rectangular;

    @Override
    public void dispatch(Supplier<LineCountCesiumWriter> supplier) {
        try (LineCountCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getRectangular()).ifPresent(rectangularProperty -> rectangularProperty.dispatchWithoutClose(writer));

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
    public RectangularProperty getRectangular() {
        return rectangular;
    }

    public void setRectangular(RectangularProperty rectangular) {
        this.rectangular = rectangular;
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
    public List<LineCountProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<LineCountProperty> intervals) {
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
        private List<LineCountProperty> intervals;
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

        public Builder withIntervals(List<LineCountProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public LineCountPropertyImpl build() {
            LineCountPropertyImpl lineCountPropertyImpl = new LineCountPropertyImpl();
            lineCountPropertyImpl.setRectangular(rectangular);
            lineCountPropertyImpl.setDelete(delete);
            lineCountPropertyImpl.setInterpolations(interpolations);
            lineCountPropertyImpl.setInterval(interval);
            lineCountPropertyImpl.setIntervals(intervals);
            lineCountPropertyImpl.setReference(reference);
            return lineCountPropertyImpl;
        }
    }
}
