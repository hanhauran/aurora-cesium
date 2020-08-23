package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

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
    public void dispatchCartesian(BoxDimensionsCesiumWriter writer) {
        dispatchConsumer(writer::writeCartesian);
    }

    @Override
    public void dispatchCartesian(EllipsoidRadiiCesiumWriter writer) {
        dispatchConsumer(writer::writeCartesian);
    }

    @Override
    public void dispatchCartesian(EyeOffsetCesiumWriter writer) {
        dispatchConsumer(writer::writeCartesian);
    }

    @Override
    public void dispatchCartesian(PositionCesiumWriter writer) {
        dispatchConsumer(writer::writeCartesian);
    }

    @Override
    public void dispatchCartesian(ViewFromCesiumWriter writer) {
        dispatchConsumer(writer::writeCartesian);
    }

    public Cartesian getCartesian() {
        return instance;
    }

    public void setCartesian(Cartesian cartesian) {
        this.instance = cartesian;
    }
}
