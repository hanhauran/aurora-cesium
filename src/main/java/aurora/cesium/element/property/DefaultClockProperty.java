package aurora.cesium.element.property;

import aurora.cesium.language.writer.ClockRange;
import aurora.cesium.language.writer.ClockStep;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultClockProperty extends BaseIntervalProperty implements ClockProperty {

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
}
