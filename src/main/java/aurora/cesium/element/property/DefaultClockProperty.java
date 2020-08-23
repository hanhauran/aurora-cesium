package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultClockProperty extends PropertyAdapter<ClockProperty> implements ClockProperty {

    private JulianDate currentTime;

    private Double multiplier;

    private ClockRange range;

    private ClockStep step;

    public DefaultClockProperty() {
        super();
    }

    public DefaultClockProperty(JulianDate currentTime, Double multiplier, ClockRange range, ClockStep step) {
        this(currentTime, multiplier, range, step, null);
    }

    public DefaultClockProperty(JulianDate currentTime, Double multiplier, ClockRange range, ClockStep step, TimeInterval interval) {
        this.currentTime = currentTime;
        this.multiplier = multiplier;
        this.range = range;
        this.step = step;
        this.interval = interval;
    }

    @Override
    public void dispatch(ClockCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getCurrentTime()).ifPresent(writer::writeCurrentTime);
            Optional.ofNullable(getMultiplier()).ifPresent(writer::writeMultiplier);
            Optional.ofNullable(getRange()).ifPresent(writer::writeRange);
            Optional.ofNullable(getStep()).ifPresent(writer::writeStep);
            Optional.ofNullable(getInterval()).ifPresent(writer::writeInterval);
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
}
