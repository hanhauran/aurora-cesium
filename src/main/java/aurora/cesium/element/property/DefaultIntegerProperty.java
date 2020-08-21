package aurora.cesium.element.property;

import aurora.cesium.language.writer.IntegerCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultIntegerProperty extends SinglePropertyAdapter<Integer> implements IntegerProperty {

    public DefaultIntegerProperty() {
        super();
    }

    public DefaultIntegerProperty(Integer instance) {
        super(instance);
    }

    public DefaultIntegerProperty(Integer instance, TimeInterval interval) {
        super(instance, interval);
    }

    public DefaultIntegerProperty(Integer instance, Interpolations interpolations) {
        super(instance, interpolations);
    }

    public DefaultIntegerProperty(Integer instance, Interpolations interpolations, TimeInterval interval) {
        super(instance, interpolations, interval);
    }

    public DefaultIntegerProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatchInteger(IntegerCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeNumber);
            dispatchInterpolations(writer);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public Integer getInteger() {
        return instance;
    }

    public void setInteger(Integer integer) {
        this.instance = integer;
    }

    @Override
    public Interpolations getInterpolations() {
        return interpolations;
    }

    public void setInterpolations(Interpolations interpolations) {
        this.interpolations = interpolations;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }
}
