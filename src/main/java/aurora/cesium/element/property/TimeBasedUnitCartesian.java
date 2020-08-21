package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedUnitCartesian extends SingleTimeBasedPropertyAdapter<UnitCartesian> implements UnitCartesianProperty {

    public TimeBasedUnitCartesian() {
        super();
    }

    public TimeBasedUnitCartesian(List<JulianDate> dates, List<UnitCartesian> instance) {
        super(dates, instance);
    }

    public TimeBasedUnitCartesian(List<JulianDate> dates, List<UnitCartesian> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    @Override
    public void dispatchUnitCartesian(AlignedAxisCesiumWriter writer) {
        dispatchConsumer(writer::writeUnitCartesian, writer::writeUnitCartesian);
    }

    public List<UnitCartesian> getUnitCartesians() {
        return instance;
    }

    public void setUnitCartesians(List<UnitCartesian> unitCartesians) {
        this.instance = unitCartesians;
    }
}
