package aurora.cesium.element.property;

import aurora.cesium.language.writer.IntegerCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultIntegerProperty extends BaseSingleInterpolatableIntervalProperty<Integer> implements IntegerProperty, InterpolatableProperty, IntervalProperty, Property {

    public DefaultIntegerProperty() {
        super();
    }

    public DefaultIntegerProperty(Integer instance) {
        super(instance);
    }

    public DefaultIntegerProperty(Integer instance, TimeInterval interval) {
        super(instance, interval);
    }

    @Override
    public void dispatchInteger(IntegerCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeNumber);
            dispatchInterpolations(writer);
        }
    }

    public Integer getInteger() {
        return instance;
    }

    public void setInteger(Integer integer) {
        this.instance = integer;
    }
}
