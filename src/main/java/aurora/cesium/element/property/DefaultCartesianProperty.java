package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;
import aurora.cesium.language.writer.advanced.ICesiumCartesian3ValuePropertyWriter;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public class DefaultCartesianProperty extends SinglePropertyAdapter<Cartesian, CartesianProperty> implements CartesianProperty {

    public DefaultCartesianProperty() {
        super();
    }

    public DefaultCartesianProperty(Cartesian instance) {
        super(instance);
    }

    @Override
    public void dispatchCartesian(ICesiumCartesian3ValuePropertyWriter writer) {
        dispatchConsumer(writer::writeCartesian);
    }

    public Cartesian getCartesian() {
        return instance;
    }

    public void setCartesian(Cartesian cartesian) {
        this.instance = cartesian;
    }
}
