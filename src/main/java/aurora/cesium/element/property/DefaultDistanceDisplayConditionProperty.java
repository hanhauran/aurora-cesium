package aurora.cesium.element.property;

import aurora.cesium.language.writer.Bounds;
import aurora.cesium.language.writer.DistanceDisplayConditionCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultDistanceDisplayConditionProperty extends BaseSingleInterpolatableIntervalProperty<Bounds> implements DistanceDisplayConditionProperty {

    public DefaultDistanceDisplayConditionProperty() {
        super();
    }

    public DefaultDistanceDisplayConditionProperty(Bounds instance) {
        super(instance);
    }

    public DefaultDistanceDisplayConditionProperty(Bounds instance, TimeInterval interval) {
        super(instance, interval);
    }

    @Override
    public void dispatchDistanceDisplayCondition(DistanceDisplayConditionCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeDistanceDisplayCondition);
            dispatchInterpolatableProperty(writer);
        }
    }

    public Bounds getBounds() {
        return instance;
    }

    public void setBounds(Bounds bounds) {
        this.instance = bounds;
    }
}
