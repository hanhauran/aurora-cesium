package aurora.cesium.element.property;

import aurora.cesium.language.writer.NearFarScalar;
import aurora.cesium.language.writer.NearFarScalarCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultNearFarScalarProperty extends BaseSingleInterpolatableIntervalProperty<NearFarScalar> implements NearFarScalarProperty, InterpolatableProperty, IntervalProperty, Property {

    public DefaultNearFarScalarProperty() {
        super();
    }

    public DefaultNearFarScalarProperty(NearFarScalar instance) {
        super(instance);
    }

    public DefaultNearFarScalarProperty(NearFarScalar instance, TimeInterval interval) {
        super(instance, interval);
    }

    @Override
    public void dispatchNearFarScalar(NearFarScalarCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeNearFarScalar);
            dispatchInterpolatableProperty(writer);
        }
    }

    public NearFarScalar getNearFarScalar() {
        return instance;
    }

    public void setNearFarScalar(NearFarScalar nearFarScalar) {
        this.instance = nearFarScalar;
    }
}
