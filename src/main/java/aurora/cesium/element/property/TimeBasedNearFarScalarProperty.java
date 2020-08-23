package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedNearFarScalarProperty extends SingleTimeBasedPropertyAdapter<NearFarScalar, NearFarScalarProperty> implements NearFarScalarProperty {

    public TimeBasedNearFarScalarProperty() {
        super();
    }

    public TimeBasedNearFarScalarProperty(List<JulianDate> dates, List<NearFarScalar> instance) {
        super(dates, instance);
    }

    public TimeBasedNearFarScalarProperty(List<JulianDate> dates, List<NearFarScalar> instance, Interpolations interpolations) {
        super(dates, instance, interpolations);
    }

    public TimeBasedNearFarScalarProperty(List<JulianDate> dates, List<NearFarScalar> instance, TimeInterval interval) {
        super(dates, instance, interval);
    }

    public TimeBasedNearFarScalarProperty(List<JulianDate> dates, List<NearFarScalar> instance, Interpolations interpolations, TimeInterval interval) {
        super(dates, instance, interpolations, interval);
    }

    public TimeBasedNearFarScalarProperty(List<JulianDate> dates, List<NearFarScalar> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public TimeBasedNearFarScalarProperty(List<JulianDate> dates, List<NearFarScalar> instance, Integer startIndex, Integer length, Interpolations interpolations) {
        super(dates, instance, startIndex, length, interpolations);
    }

    public TimeBasedNearFarScalarProperty(List<JulianDate> dates, List<NearFarScalar> instance, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instance, startIndex, length, interval);
    }

    public TimeBasedNearFarScalarProperty(List<JulianDate> dates, List<NearFarScalar> instance, Integer startIndex, Integer length, Interpolations interpolations, TimeInterval interval) {
        super(dates, instance, startIndex, length, interpolations, interval);
    }

    public TimeBasedNearFarScalarProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(NearFarScalarCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeNearFarScalar, writer::writeNearFarScalar);
            dispatchInterpolations(writer);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public List<NearFarScalar> getNearFarScalars() {
        return instance;
    }

    public void setNearFarScalars(List<NearFarScalar> nearFarScalars) {
        this.instance = nearFarScalars;
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
