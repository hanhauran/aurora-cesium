package aurora.cesium.element.property;

import aurora.cesium.language.writer.IntegerCesiumWriter;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedIntegerProperty extends SingleTimeBasedPropertyAdapter<Integer> implements IntegerProperty {

    public TimeBasedIntegerProperty() {
        super();
    }

    public TimeBasedIntegerProperty(List<JulianDate> dates, List<Integer> instance) {
        super(dates, instance);
    }

    public TimeBasedIntegerProperty(List<JulianDate> dates, List<Integer> instance, Interpolations interpolations) {
        super(dates, instance, interpolations);
    }

    public TimeBasedIntegerProperty(List<JulianDate> dates, List<Integer> instance, TimeInterval interval) {
        super(dates, instance, interval);
    }

    public TimeBasedIntegerProperty(List<JulianDate> dates, List<Integer> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public TimeBasedIntegerProperty(List<JulianDate> dates, List<Integer> instance, Integer startIndex, Integer length, Interpolations interpolations) {
        super(dates, instance, startIndex, length, interpolations);
    }

    public TimeBasedIntegerProperty(List<JulianDate> dates, List<Integer> instance, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instance, startIndex, length, interval);
    }

    public TimeBasedIntegerProperty(List<JulianDate> dates, List<Integer> instance, Integer startIndex, Integer length, Interpolations interpolations, TimeInterval interval) {
        super(dates, instance, startIndex, length, interpolations, interval);
    }

    @Override
    public void dispatchInteger(IntegerCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeNumber, writer::writeNumber);
            dispatchInterpolations(writer);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public List<Integer> getIntegers() {
        return instance;
    }

    public void setIntegers(List<Integer> integers) {
        this.instance = integers;
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
