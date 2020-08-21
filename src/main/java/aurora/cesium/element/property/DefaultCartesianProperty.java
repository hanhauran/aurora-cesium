package aurora.cesium.element.property;

import aurora.cesium.language.writer.Cartesian;
import aurora.cesium.language.writer.EyeOffsetCesiumWriter;
import aurora.cesium.language.writer.PositionCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public class DefaultCartesianProperty extends SinglePropertyAdapter<Cartesian> implements CartesianProperty {

    public DefaultCartesianProperty() {
        super();
    }

    public DefaultCartesianProperty(Cartesian instance) {
        super(instance);
    }

    @Override
    public void dispatchEyeOffset(EyeOffsetCesiumWriter writer) {
        dispatchConsumer(writer::writeCartesian);
    }

    @Override
    public void dispatchPosition(PositionCesiumWriter writer) {
        dispatchConsumer(writer::writeCartesian);
    }

    public Cartesian getCartesian() {
        return instance;
    }

    public void setCartesian(Cartesian cartesian) {
        this.instance = cartesian;
    }
}
