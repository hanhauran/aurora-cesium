package aurora.cesium.element.property;

import aurora.cesium.language.writer.ClockRange;
import aurora.cesium.language.writer.ClockStep;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface ClockProperty extends IntervalProperty {

    JulianDate getCurrentTime();

    Double getMultiplier();

    ClockRange getRange();

    ClockStep getStep();

    @Override
    TimeInterval getInterval();
}
