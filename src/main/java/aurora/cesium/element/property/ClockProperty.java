package aurora.cesium.element.property;

import cesiumlanguagewriter.*;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface ClockProperty extends Property<ClockCesiumWriter>, Intervalable<ClockProperty> {

    static ClockPropertyImpl.Builder newBuilder() {
        return ClockPropertyImpl.Builder.newBuilder();
    }

    JulianDate getCurrentTime();

    Double getMultiplier();

    ClockRange getRange();

    ClockStep getStep();

    @Override
    TimeInterval getInterval();

    @Override
    List<ClockProperty> getIntervals();

    @Override
    void dispatch(Supplier<ClockCesiumWriter> supplier);
}
