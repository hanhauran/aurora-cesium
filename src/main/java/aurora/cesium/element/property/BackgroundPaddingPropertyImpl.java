package aurora.cesium.element.property;

import cesiumlanguagewriter.BackgroundPaddingCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
class BackgroundPaddingPropertyImpl extends PropertyAdapter<BackgroundPaddingProperty> implements BackgroundPaddingProperty {

    private RectangularProperty rectangular;

    @Override
    public void dispatch(Supplier<BackgroundPaddingCesiumWriter> supplier) {
        try (BackgroundPaddingCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getRectangular()).ifPresent(rectangularProperty -> rectangularProperty.dispatchWithoutClose(writer));

            dispatchDelete(writer);
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
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<BackgroundPaddingProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<BackgroundPaddingProperty> intervals) {
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
        private TimeInterval interval;
        private List<BackgroundPaddingProperty> intervals;
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

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<BackgroundPaddingProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public BackgroundPaddingPropertyImpl build() {
            BackgroundPaddingPropertyImpl backgroundPaddingPropertyImpl = new BackgroundPaddingPropertyImpl();
            backgroundPaddingPropertyImpl.setRectangular(rectangular);
            backgroundPaddingPropertyImpl.setDelete(delete);
            backgroundPaddingPropertyImpl.setInterval(interval);
            backgroundPaddingPropertyImpl.setIntervals(intervals);
            backgroundPaddingPropertyImpl.setReference(reference);
            return backgroundPaddingPropertyImpl;
        }
    }
}
