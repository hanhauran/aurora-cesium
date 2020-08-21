package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedDistanceDisplayConditionProperty extends SingleTimeBasedPropertyAdapter<Bounds> implements DistanceDisplayConditionProperty {

    public TimeBasedDistanceDisplayConditionProperty() {
        super();
    }

    public TimeBasedDistanceDisplayConditionProperty(List<JulianDate> dates, List<Bounds> instance) {
        super(dates, instance);
    }

    public TimeBasedDistanceDisplayConditionProperty(List<JulianDate> dates, List<Bounds> instance, Interpolations interpolations) {
        super(dates, instance, interpolations);
    }

    public TimeBasedDistanceDisplayConditionProperty(List<JulianDate> dates, List<Bounds> instance, TimeInterval interval) {
        super(dates, instance, interval);
    }

    public TimeBasedDistanceDisplayConditionProperty(List<JulianDate> dates, List<Bounds> instance, Interpolations interpolations, TimeInterval interval) {
        super(dates, instance, interpolations, interval);
    }

    public TimeBasedDistanceDisplayConditionProperty(List<JulianDate> dates, List<Bounds> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public TimeBasedDistanceDisplayConditionProperty(List<JulianDate> dates, List<Bounds> instance, Integer startIndex, Integer length, Interpolations interpolations) {
        super(dates, instance, startIndex, length, interpolations);
    }

    public TimeBasedDistanceDisplayConditionProperty(List<JulianDate> dates, List<Bounds> instance, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instance, startIndex, length, interval);
    }

    public TimeBasedDistanceDisplayConditionProperty(List<JulianDate> dates, List<Bounds> instance, Integer startIndex, Integer length, Interpolations interpolations, TimeInterval interval) {
        super(dates, instance, startIndex, length, interpolations, interval);
    }

    public TimeBasedDistanceDisplayConditionProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(DistanceDisplayConditionCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeDistanceDisplayCondition, writer::writeDistanceDisplayCondition);
            dispatchInterpolations(writer);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public List<Bounds> getBounds() {
        return instance;
    }

    public void setBounds(List<Bounds> bounds) {
        this.instance = bounds;
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
