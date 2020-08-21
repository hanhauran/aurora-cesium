package aurora.cesium.element.property;

import aurora.cesium.language.writer.Cartesian;
import aurora.cesium.language.writer.EyeOffsetCesiumWriter;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.PositionCesiumWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public class TimeBasedCartesianProperty extends SingleTimeBasedPropertyAdapter<Cartesian> implements CartesianProperty {

    public TimeBasedCartesianProperty() {
        super();
    }

    public TimeBasedCartesianProperty(List<JulianDate> dates, List<Cartesian> instance) {
        super(dates, instance);
    }

    public TimeBasedCartesianProperty(List<JulianDate> dates, List<Cartesian> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    @Override
    public void dispatchEyeOffset(EyeOffsetCesiumWriter writer) {
        dispatchConsumer(writer::writeCartesian, writer::writeCartesian);
    }

    @Override
    public void dispatchPosition(PositionCesiumWriter writer) {
        dispatchConsumer(writer::writeCartesian, writer::writeCartesian);
    }

    public List<Cartesian> getCartesians() {
        return instance;
    }

    public void setCartesians(List<Cartesian> cartesians) {
        this.instance = cartesians;
    }
}
