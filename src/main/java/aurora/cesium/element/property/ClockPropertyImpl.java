package aurora.cesium.element.property;

import cesiumlanguagewriter.*;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
class ClockPropertyImpl extends PropertyAdapter<ClockProperty> implements ClockProperty {

    private JulianDate currentTime;

    private Double multiplier;

    private ClockRange range;

    private ClockStep step;

    @Override
    public void dispatch(Supplier<ClockCesiumWriter> supplier) {
        try (ClockCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getCurrentTime()).ifPresent(writer::writeCurrentTime);
            Optional.ofNullable(getMultiplier()).ifPresent(writer::writeMultiplier);
            Optional.ofNullable(getRange()).ifPresent(writer::writeRange);
            Optional.ofNullable(getStep()).ifPresent(writer::writeStep);
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
        }
    }

    @Override
    public JulianDate getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(JulianDate currentTime) {
        this.currentTime = currentTime;
    }

    @Override
    public Double getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(Double multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public ClockRange getRange() {
        return range;
    }

    public void setRange(ClockRange range) {
        this.range = range;
    }

    @Override
    public ClockStep getStep() {
        return step;
    }

    public void setStep(ClockStep step) {
        this.step = step;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<ClockProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<ClockProperty> intervals) {
        this.intervals = intervals;
    }

    public static final class Builder {
        protected TimeInterval interval;
        private JulianDate currentTime;
        private Double multiplier;
        private ClockRange range;
        private ClockStep step;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withCurrentTime(JulianDate currentTime) {
            this.currentTime = currentTime;
            return this;
        }

        public Builder withMultiplier(Double multiplier) {
            this.multiplier = multiplier;
            return this;
        }

        public Builder withRange(ClockRange range) {
            this.range = range;
            return this;
        }

        public Builder withStep(ClockStep step) {
            this.step = step;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public ClockPropertyImpl build() {
            ClockPropertyImpl clockPropertyImpl = new ClockPropertyImpl();
            clockPropertyImpl.setCurrentTime(currentTime);
            clockPropertyImpl.setMultiplier(multiplier);
            clockPropertyImpl.setRange(range);
            clockPropertyImpl.setStep(step);
            clockPropertyImpl.setInterval(interval);
            return clockPropertyImpl;
        }
    }
}
