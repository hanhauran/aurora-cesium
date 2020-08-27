package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;
import aurora.cesium.language.writer.advanced.ICesiumCartesian3ValuePropertyWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public class DefaultCartesianProperty extends SingleTimeBasedPropertyAdapter<Cartesian, CartesianProperty> implements CartesianProperty {

    public DefaultCartesianProperty(Cartesian instance) {
        super(instance);
    }

    public DefaultCartesianProperty(List<JulianDate> dates, List<Cartesian> instances) {
        super(dates, instances);
    }

    public DefaultCartesianProperty(List<JulianDate> dates, List<Cartesian> instances, Integer startIndex, Integer length) {
        super(dates, instances, startIndex, length);
    }

    @Override
    public void dispatchCartesian(ICesiumCartesian3ValuePropertyWriter writer) {
        dispatchConsumer(writer::writeCartesian, writer::writeCartesian, writer::writeCartesian);
    }

    public Cartesian getCartesian() {
        return instance;
    }

    public void setCartesian(Cartesian cartesian) {
        this.instance = cartesian;
    }

    public List<Cartesian> getCartesians() {
        return instances;
    }

    public void setCartesians(List<Cartesian> cartesians) {
        this.instances = cartesians;
    }
}
