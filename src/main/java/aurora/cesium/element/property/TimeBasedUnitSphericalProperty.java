package aurora.cesium.element.property;

import aurora.cesium.language.writer.AlignedAxisCesiumWriter;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.UnitSpherical;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedUnitSphericalProperty extends BaseSingleTimeBasedIntervalProperty<UnitSpherical> implements UnitSphericalProperty, IntervalProperty, Property {

    public TimeBasedUnitSphericalProperty() {
        super();
    }

    public TimeBasedUnitSphericalProperty(List<JulianDate> dates, List<UnitSpherical> instance) {
        super(dates, instance);
    }

    public TimeBasedUnitSphericalProperty(List<JulianDate> dates, List<UnitSpherical> instance, TimeInterval interval) {
        super(dates, instance, interval);
    }

    public TimeBasedUnitSphericalProperty(List<JulianDate> dates, List<UnitSpherical> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public TimeBasedUnitSphericalProperty(List<JulianDate> dates, List<UnitSpherical> instance, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instance, startIndex, length, interval);
    }

    @Override
    public void dispatchAlignedAxis(AlignedAxisCesiumWriter writer, boolean close) {
        try {
            dispatchConsumer(writer::writeUnitSpherical, writer::writeUnitSpherical);
        } finally {
            if (close) {
                writer.close();
            }
        }
    }
    public List<UnitSpherical> getUnitSphericals() {
        return instance;
    }

    public void setUnitSphericals(List<UnitSpherical> unitSphericals) {
        this.instance = unitSphericals;
    }
}
