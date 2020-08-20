package aurora.cesium.element.property;

import aurora.cesium.language.writer.DoubleCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultDoubleProperty extends BaseSingleInterpolatableIntervalProperty<Double> implements DoubleProperty, InterpolatableProperty, IntervalProperty {
    public DefaultDoubleProperty() {
        super();
    }

    public DefaultDoubleProperty(Double instance) {
        super(instance);
    }

    public DefaultDoubleProperty(Double instance, TimeInterval interval) {
        super(instance, interval);
    }

    @Override
    public void dispatchDouble(DoubleCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeNumber);
            dispatchInterpolatableProperty(writer);
        }
    }

    public Double getDouble() {
        return instance;
    }

    public void setDouble(Double instance) {
        this.instance = instance;
    }
}
