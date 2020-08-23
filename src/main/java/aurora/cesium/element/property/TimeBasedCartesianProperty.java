package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public class TimeBasedCartesianProperty extends SingleTimeBasedPropertyAdapter<Cartesian, CartesianProperty> implements CartesianProperty {

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
    public void dispatchCartesian(BoxDimensionsCesiumWriter writer) {
        dispatchConsumer(writer::writeCartesian, writer::writeCartesian);
    }

    @Override
    public void dispatchCartesian(EllipsoidRadiiCesiumWriter writer) {
        dispatchConsumer(writer::writeCartesian, writer::writeCartesian);
    }

    @Override
    public void dispatchCartesian(EyeOffsetCesiumWriter writer) {
        dispatchConsumer(writer::writeCartesian, writer::writeCartesian);
    }

    @Override
    public void dispatchCartesian(PositionCesiumWriter writer) {
        dispatchConsumer(writer::writeCartesian, writer::writeCartesian);
    }

    @Override
    public void dispatchCartesian(ViewFromCesiumWriter writer) {
        dispatchConsumer(writer::writeCartesian, writer::writeCartesian);
    }

    public List<Cartesian> getCartesians() {
        return instance;
    }

    public void setCartesians(List<Cartesian> cartesians) {
        this.instance = cartesians;
    }
}
