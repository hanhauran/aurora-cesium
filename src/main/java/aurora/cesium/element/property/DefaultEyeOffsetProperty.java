package aurora.cesium.element.property;

import aurora.cesium.language.writer.Cartesian;
import aurora.cesium.language.writer.EyeOffsetCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultEyeOffsetProperty extends BaseSingleInterpolatableIntervalProperty<Cartesian> implements EyeOffsetProperty, InterpolatableProperty, IntervalProperty, Property {

    public DefaultEyeOffsetProperty() {
        super();
    }

    public DefaultEyeOffsetProperty(Cartesian instance) {
        super(instance);
    }

    public DefaultEyeOffsetProperty(Cartesian instance, TimeInterval interval) {
        super(instance, interval);
    }

    @Override
    public void dispatchEyeOffset(EyeOffsetCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeCartesian);
            dispatchInterpolations(writer);
        }
    }

    public Cartesian getCartesian() {
        return instance;
    }

    public void setCartesian(Cartesian cartesian) {
        this.instance = cartesian;
    }
}
