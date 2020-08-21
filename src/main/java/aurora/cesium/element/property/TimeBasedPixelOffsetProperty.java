package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedPixelOffsetProperty extends SingleTimeBasedPropertyAdapter<Rectangular> implements PixelOffsetProperty {

    public TimeBasedPixelOffsetProperty() {
        super();
    }

    public TimeBasedPixelOffsetProperty(List<JulianDate> dates, List<Rectangular> instance) {
        super(dates, instance);
    }

    public TimeBasedPixelOffsetProperty(List<JulianDate> dates, List<Rectangular> instance, Interpolations interpolations) {
        super(dates, instance, interpolations);
    }

    public TimeBasedPixelOffsetProperty(List<JulianDate> dates, List<Rectangular> instance, TimeInterval interval) {
        super(dates, instance, interval);
    }

    public TimeBasedPixelOffsetProperty(List<JulianDate> dates, List<Rectangular> instance, Interpolations interpolations, TimeInterval interval) {
        super(dates, instance, interpolations, interval);
    }

    public TimeBasedPixelOffsetProperty(List<JulianDate> dates, List<Rectangular> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public TimeBasedPixelOffsetProperty(List<JulianDate> dates, List<Rectangular> instance, Integer startIndex, Integer length, Interpolations interpolations) {
        super(dates, instance, startIndex, length, interpolations);
    }

    public TimeBasedPixelOffsetProperty(List<JulianDate> dates, List<Rectangular> instance, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instance, startIndex, length, interval);
    }

    public TimeBasedPixelOffsetProperty(List<JulianDate> dates, List<Rectangular> instance, Integer startIndex, Integer length, Interpolations interpolations, TimeInterval interval) {
        super(dates, instance, startIndex, length, interpolations, interval);
    }

    public TimeBasedPixelOffsetProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(PixelOffsetCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeCartesian2, writer::writeCartesian2);
            dispatchInterpolations(writer);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public List<Rectangular> getRectangulars() {
        return instance;
    }

    public void setRectangulars(List<Rectangular> rectangulars) {
        this.instance = rectangulars;
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
