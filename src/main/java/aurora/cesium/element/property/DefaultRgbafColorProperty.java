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
public class DefaultRgbafColorProperty extends SingleTimeBasedPropertyAdapter<Color, ColorProperty> implements ColorProperty {

    public DefaultRgbafColorProperty(Color instance) {
        super(instance);
    }

    public DefaultRgbafColorProperty(Color instance, TimeInterval interval) {
        super(instance, interval);
    }

    public DefaultRgbafColorProperty(Color instance, Interpolations interpolations) {
        super(instance, interpolations);
    }

    public DefaultRgbafColorProperty(Color instance, Interpolations interpolations, TimeInterval interval) {
        super(instance, interpolations, interval);
    }

    public DefaultRgbafColorProperty(List<JulianDate> dates, List<Color> instances) {
        super(dates, instances);
    }

    public DefaultRgbafColorProperty(List<JulianDate> dates, List<Color> instances, Interpolations interpolations) {
        super(dates, instances, interpolations);
    }

    public DefaultRgbafColorProperty(List<JulianDate> dates, List<Color> instances, TimeInterval interval) {
        super(dates, instances, interval);
    }

    public DefaultRgbafColorProperty(List<JulianDate> dates, List<Color> instances, Interpolations interpolations, TimeInterval interval) {
        super(dates, instances, interpolations, interval);
    }

    public DefaultRgbafColorProperty(List<JulianDate> dates, List<Color> instances, Integer startIndex, Integer length) {
        super(dates, instances, startIndex, length);
    }

    public DefaultRgbafColorProperty(List<JulianDate> dates, List<Color> instances, Integer startIndex, Integer length, Interpolations interpolations) {
        super(dates, instances, startIndex, length, interpolations);
    }

    public DefaultRgbafColorProperty(List<JulianDate> dates, List<Color> instances, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instances, startIndex, length, interval);
    }

    public DefaultRgbafColorProperty(List<JulianDate> dates, List<Color> instances, Integer startIndex, Integer length, Interpolations interpolations, TimeInterval interval) {
        super(dates, instances, startIndex, length, interpolations, interval);
    }

    public DefaultRgbafColorProperty(List<ColorProperty> intervals) {
        super(intervals);
    }

    public DefaultRgbafColorProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(ColorCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeRgbaf);
            dispatchInterpolations(writer);
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
            dispatchReference(writer);
        }
    }

    public Color getColor() {
        return instance;
    }

    public void setColor(Color color) {
        this.instance = color;
    }

    public java.util.List<Color> getColors() {
        return instances;
    }

    public void setColors(List<Color> colors) {
        this.instances = colors;
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
    public List<ColorProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<ColorProperty> intervals) {
        this.intervals = intervals;
    }

    @Override
    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }
}
