package aurora.cesium.element.property;

import aurora.cesium.language.writer.DoubleCesiumWriter;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedDoubleProperty extends SingleTimeBasedPropertyAdapter<Double, DoubleProperty> implements DoubleProperty {

    public TimeBasedDoubleProperty() {
        super();
    }

    public TimeBasedDoubleProperty(List<JulianDate> dates, List<Double> instance) {
        super(dates, instance);
    }

    public TimeBasedDoubleProperty(List<JulianDate> dates, List<Double> instance, Interpolations interpolations) {
        super(dates, instance, interpolations);
    }

    public TimeBasedDoubleProperty(List<JulianDate> dates, List<Double> instance, TimeInterval interval) {
        super(dates, instance, interval);
    }

    public TimeBasedDoubleProperty(List<JulianDate> dates, List<Double> instance, Interpolations interpolations, TimeInterval interval) {
        super(dates, instance, interpolations, interval);
    }

    public TimeBasedDoubleProperty(List<JulianDate> dates, List<Double> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public TimeBasedDoubleProperty(List<JulianDate> dates, List<Double> instance, Integer startIndex, Integer length, Interpolations interpolations) {
        super(dates, instance, startIndex, length, interpolations);
    }

    public TimeBasedDoubleProperty(List<JulianDate> dates, List<Double> instance, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instance, startIndex, length, interval);
    }

    public TimeBasedDoubleProperty(List<JulianDate> dates, List<Double> instance, Integer startIndex, Integer length, Interpolations interpolations, TimeInterval interval) {
        super(dates, instance, startIndex, length, interpolations, interval);
    }

    public TimeBasedDoubleProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(DoubleCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeNumber, writer::writeNumber);
            dispatchInterpolations(writer);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public List<Double> getDoubles() {
        return instance;
    }

    public void setDoubles(List<Double> doubles) {
        this.instance = doubles;
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
