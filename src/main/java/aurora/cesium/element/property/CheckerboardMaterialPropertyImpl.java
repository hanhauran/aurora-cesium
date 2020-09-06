package aurora.cesium.element.property;

import cesiumlanguagewriter.CheckerboardMaterialCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
class CheckerboardMaterialPropertyImpl extends PropertyAdapter<CheckerboardMaterialProperty> implements CheckerboardMaterialProperty {

    private ColorProperty evenColor;

    private ColorProperty oddColor;

    private RepeatProperty repeat;

    @Override
    public void dispatch(Supplier<CheckerboardMaterialCesiumWriter> supplier) {
        try (CheckerboardMaterialCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getEvenColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openEvenColorProperty));
            Optional.ofNullable(getOddColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openOddColorProperty));
            Optional.ofNullable(getRepeat()).ifPresent(repeatProperty -> repeatProperty.dispatch(writer::openRepeatProperty));

            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
        }
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
    public RepeatProperty getRepeat() {
        return repeat;
    }

    public void setRepeat(RepeatProperty repeat) {
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
    public List<CheckerboardMaterialProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<CheckerboardMaterialProperty> intervals) {
        this.intervals = intervals;
    }


    public static final class Builder {
        private ColorProperty evenColor;
        private ColorProperty oddColor;
        private RepeatProperty repeat;

        private TimeInterval interval;
        private List<CheckerboardMaterialProperty> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withEvenColor(ColorProperty evenColor) {
            this.evenColor = evenColor;
            return this;
        }

        public Builder withOddColor(ColorProperty oddColor) {
            this.oddColor = oddColor;
            return this;
        }

        public Builder withRepeat(RepeatProperty repeat) {
            this.repeat = repeat;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<CheckerboardMaterialProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public CheckerboardMaterialPropertyImpl build() {
            CheckerboardMaterialPropertyImpl checkerboardMaterialPropertyImpl = new CheckerboardMaterialPropertyImpl();
            checkerboardMaterialPropertyImpl.setEvenColor(evenColor);
            checkerboardMaterialPropertyImpl.setOddColor(oddColor);
            checkerboardMaterialPropertyImpl.setRepeat(repeat);
            checkerboardMaterialPropertyImpl.setInterval(interval);
            checkerboardMaterialPropertyImpl.setIntervals(intervals);
            return checkerboardMaterialPropertyImpl;
        }
    }
}
