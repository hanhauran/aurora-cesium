package aurora.cesium.element.property;

import cesiumlanguagewriter.StripeMaterialCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
class StripeMaterialPropertyImpl extends PropertyAdapter<StripeMaterialProperty> implements StripeMaterialProperty {

    private StripeOrientationProperty orientation;

    private ColorProperty evenColor;

    private ColorProperty oddColor;

    private DoubleProperty offset;

    private DoubleProperty repeat;

    @Override
    public void dispatch(Supplier<StripeMaterialCesiumWriter> supplier) {
        try (StripeMaterialCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getOrientation()).ifPresent(stripeOrientationProperty -> stripeOrientationProperty.dispatch(writer::openOrientationProperty));
            Optional.ofNullable(getEvenColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openEvenColorProperty));
            Optional.ofNullable(getOddColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openOddColorProperty));
            Optional.ofNullable(getOffset()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openOffsetProperty));
            Optional.ofNullable(getRepeat()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openRepeatProperty));

            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
        }
    }

    @Override
    public StripeOrientationProperty getOrientation() {
        return orientation;
    }

    public void setOrientation(StripeOrientationProperty orientation) {
        this.orientation = orientation;
    }

    @Override
    public ColorProperty getEvenColor() {
        return evenColor;
    }

    public void setEvenColor(ColorProperty evenColor) {
        this.evenColor = evenColor;
    }

    @Override
    public ColorProperty getOddColor() {
        return oddColor;
    }

    public void setOddColor(ColorProperty oddColor) {
        this.oddColor = oddColor;
    }

    @Override
    public DoubleProperty getOffset() {
        return offset;
    }

    public void setOffset(DoubleProperty offset) {
        this.offset = offset;
    }

    @Override
    public DoubleProperty getRepeat() {
        return repeat;
    }

    public void setRepeat(DoubleProperty repeat) {
        this.repeat = repeat;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<StripeMaterialProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<StripeMaterialProperty> intervals) {
        this.intervals = intervals;
    }

    public static final class Builder {
        private StripeOrientationProperty orientation;
        private ColorProperty evenColor;
        private ColorProperty oddColor;
        private DoubleProperty offset;
        private DoubleProperty repeat;

        protected TimeInterval interval;
        protected List<StripeMaterialProperty> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withOrientation(StripeOrientationProperty orientation) {
            this.orientation = orientation;
            return this;
        }

        public Builder withEvenColor(ColorProperty evenColor) {
            this.evenColor = evenColor;
            return this;
        }

        public Builder withOddColor(ColorProperty oddColor) {
            this.oddColor = oddColor;
            return this;
        }

        public Builder withOffset(DoubleProperty offset) {
            this.offset = offset;
            return this;
        }

        public Builder withRepeat(DoubleProperty repeat) {
            this.repeat = repeat;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<StripeMaterialProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public StripeMaterialPropertyImpl build() {
            StripeMaterialPropertyImpl stripeMaterialPropertyImpl = new StripeMaterialPropertyImpl();
            stripeMaterialPropertyImpl.setOrientation(orientation);
            stripeMaterialPropertyImpl.setEvenColor(evenColor);
            stripeMaterialPropertyImpl.setOddColor(oddColor);
            stripeMaterialPropertyImpl.setOffset(offset);
            stripeMaterialPropertyImpl.setRepeat(repeat);
            stripeMaterialPropertyImpl.setInterval(interval);
            stripeMaterialPropertyImpl.setIntervals(intervals);
            return stripeMaterialPropertyImpl;
        }
    }
}
