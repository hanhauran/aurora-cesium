package aurora.cesium.element.property;

import aurora.cesium.language.writer.AlignedAxisCesiumWriter;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.UnitSpherical;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedUnitSphericalProperty extends SingleTimeBasedPropertyAdapter<UnitSpherical> implements UnitSphericalProperty {

    public TimeBasedUnitSphericalProperty() {
        super();
    }

    public TimeBasedUnitSphericalProperty(List<JulianDate> dates, List<UnitSpherical> instance) {
        super(dates, instance);
    }

    public TimeBasedUnitSphericalProperty(List<JulianDate> dates, List<UnitSpherical> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    @Override
    public void dispatchUnitSpherical(AlignedAxisCesiumWriter writer) {
        dispatchConsumer(writer::writeUnitSpherical, writer::writeUnitSpherical);
    }
    public List<UnitSpherical> getUnitSphericals() {
        return instance;
    }

    public void setUnitSphericals(List<UnitSpherical> unitSphericals) {
        this.instance = unitSphericals;
    }
}
