package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedOrientationProperty extends SingleTimeBasedPropertyAdapter<UnitQuaternion> implements OrientationProperty, InterpolatableProperty, IntervalProperty, Property {

    public TimeBasedOrientationProperty() {
        super();
    }

    public TimeBasedOrientationProperty(List<JulianDate> dates, List<UnitQuaternion> instance) {
        super(dates, instance);
    }

    public TimeBasedOrientationProperty(List<JulianDate> dates, List<UnitQuaternion> instance, Interpolations interpolations) {
        super(dates, instance, interpolations);
    }

    public TimeBasedOrientationProperty(List<JulianDate> dates, List<UnitQuaternion> instance, TimeInterval interval) {
        super(dates, instance, interval);
    }

    public TimeBasedOrientationProperty(List<JulianDate> dates, List<UnitQuaternion> instance, Interpolations interpolations, TimeInterval interval) {
        super(dates, instance, interpolations, interval);
    }

    public TimeBasedOrientationProperty(List<JulianDate> dates, List<UnitQuaternion> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public TimeBasedOrientationProperty(List<JulianDate> dates, List<UnitQuaternion> instance, Integer startIndex, Integer length, Interpolations interpolations) {
        super(dates, instance, startIndex, length, interpolations);
    }

    public TimeBasedOrientationProperty(List<JulianDate> dates, List<UnitQuaternion> instance, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instance, startIndex, length, interval);
    }

    public TimeBasedOrientationProperty(List<JulianDate> dates, List<UnitQuaternion> instance, Integer startIndex, Integer length, Interpolations interpolations, TimeInterval interval) {
        super(dates, instance, startIndex, length, interpolations, interval);
    }

    public TimeBasedOrientationProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatchOrientation(OrientationCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeUnitQuaternion, writer::writeUnitQuaternion);
            dispatchInterpolations(writer);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public List<UnitQuaternion> getUnitQuaternions() {
        return instance;
    }

    public void setUnitQuaternions(List<UnitQuaternion> unitQuaternions) {
        this.instance = unitQuaternions;
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
