package aurora.cesium.element.property;

import aurora.cesium.language.writer.AlignedAxisCesiumWriter;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.UnitCartesian;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedUnitCartesian extends BaseSingleTimeBasedIntervalProperty<UnitCartesian> implements UnitCartesianProperty {

    public TimeBasedUnitCartesian() {
        super();
    }

    public TimeBasedUnitCartesian(List<JulianDate> dates, List<UnitCartesian> instance) {
        super(dates, instance);
    }

    public TimeBasedUnitCartesian(List<JulianDate> dates, List<UnitCartesian> instance, TimeInterval interval) {
        super(dates, instance, interval);
    }

    public TimeBasedUnitCartesian(List<JulianDate> dates, List<UnitCartesian> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public TimeBasedUnitCartesian(List<JulianDate> dates, List<UnitCartesian> instance, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instance, startIndex, length, interval);
    }

    @Override
    public void dispatchAlignedAxis(AlignedAxisCesiumWriter writer, boolean close) {
        try {
            dispatchConsumer(writer::writeUnitCartesian, writer::writeUnitCartesian);
        } finally {
            if (close) {
                writer.close();
            }
        }
    }

    public List<UnitCartesian> getUnitCartesians() {
        return instance;
    }

    public void setUnitCartesians(List<UnitCartesian> unitCartesians) {
        this.instance = unitCartesians;
    }
}
