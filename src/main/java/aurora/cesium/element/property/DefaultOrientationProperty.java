package aurora.cesium.element.property;

import aurora.cesium.language.writer.OrientationCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.UnitQuaternion;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultOrientationProperty extends BaseSingleInterpolatableIntervalProperty<UnitQuaternion> implements OrientationProperty, InterpolatableProperty, IntervalProperty, Property {

    public DefaultOrientationProperty() {
        super();
    }

    public DefaultOrientationProperty(UnitQuaternion instance) {
        super(instance);
    }

    public DefaultOrientationProperty(UnitQuaternion instance, TimeInterval interval) {
        super(instance, interval);
    }

    @Override
    public void dispatchOrientation(OrientationCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeUnitQuaternion);
            dispatchInterpolations(writer);
        }
    }

    public UnitQuaternion getUnitQuaternion() {
        return instance;
    }

    public void setUnitQuaternion(UnitQuaternion unitQuaternion) {
        this.instance = unitQuaternion;
    }
}
