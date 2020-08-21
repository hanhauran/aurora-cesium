package aurora.cesium.element.property;

import aurora.cesium.language.writer.ColorCesiumWriter;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.awt.*;
import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedRgbafColorProperty extends SingleTimeBasedPropertyAdapter<Color> implements ColorProperty {

    public TimeBasedRgbafColorProperty() {
        super();
    }

    public TimeBasedRgbafColorProperty(List<JulianDate> dates, List<Color> instance) {
        super(dates, instance);
    }

    public TimeBasedRgbafColorProperty(List<JulianDate> dates, List<Color> instance, Interpolations interpolations) {
        super(dates, instance, interpolations);
    }

    public TimeBasedRgbafColorProperty(List<JulianDate> dates, List<Color> instance, TimeInterval interval) {
        super(dates, instance, interval);
    }

    public TimeBasedRgbafColorProperty(List<JulianDate> dates, List<Color> instance, Interpolations interpolations, TimeInterval interval) {
        super(dates, instance, interpolations, interval);
    }

    public TimeBasedRgbafColorProperty(List<JulianDate> dates, List<Color> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public TimeBasedRgbafColorProperty(List<JulianDate> dates, List<Color> instance, Integer startIndex, Integer length, Interpolations interpolations) {
        super(dates, instance, startIndex, length, interpolations);
    }

    public TimeBasedRgbafColorProperty(List<JulianDate> dates, List<Color> instance, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instance, startIndex, length, interval);
    }

    public TimeBasedRgbafColorProperty(List<JulianDate> dates, List<Color> instance, Integer startIndex, Integer length, Interpolations interpolations, TimeInterval interval) {
        super(dates, instance, startIndex, length, interpolations, interval);
    }

    public TimeBasedRgbafColorProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(ColorCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeRgbaf, writer::writeRgbaf);
            dispatchInterpolations(writer);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public List<Color> getColors() {
        return instance;
    }

    public void setColors(List<Color> colors) {
        this.instance = colors;
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
