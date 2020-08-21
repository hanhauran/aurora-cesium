package aurora.cesium.element.property;

import aurora.cesium.language.writer.DoubleCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultDoubleProperty extends SinglePropertyAdapter<Double> implements DoubleProperty {

    public DefaultDoubleProperty() {
        super();
    }

    public DefaultDoubleProperty(Double instance) {
        super(instance);
    }

    public DefaultDoubleProperty(Double instance, TimeInterval interval) {
        super(instance, interval);
    }

    public DefaultDoubleProperty(Double instance, Interpolations interpolations) {
        super(instance, interpolations);
    }

    public DefaultDoubleProperty(Double instance, Interpolations interpolations, TimeInterval interval) {
        super(instance, interpolations, interval);
    }

    public DefaultDoubleProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatchDouble(DoubleCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeNumber);
            dispatchInterpolations(writer);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public Double getDouble() {
        return instance;
    }

    public void setDouble(Double instance) {
        this.instance = instance;
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
