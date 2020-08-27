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
public class DefaultRgbaColorProperty extends SingleTimeBasedPropertyAdapter<Color, ColorProperty> implements ColorProperty {

    public DefaultRgbaColorProperty(Color instance) {
        super(instance);
    }

    public DefaultRgbaColorProperty(Color instance, TimeInterval interval) {
        super(instance, interval);
    }

    public DefaultRgbaColorProperty(Color instance, Interpolations interpolations) {
        super(instance, interpolations);
    }

    public DefaultRgbaColorProperty(Color instance, Interpolations interpolations, TimeInterval interval) {
        super(instance, interpolations, interval);
    }

    public DefaultRgbaColorProperty(List<JulianDate> dates, List<Color> instances) {
        super(dates, instances);
    }

    public DefaultRgbaColorProperty(List<JulianDate> dates, List<Color> instances, Interpolations interpolations) {
        super(dates, instances, interpolations);
    }

    public DefaultRgbaColorProperty(List<JulianDate> dates, List<Color> instances, TimeInterval interval) {
        super(dates, instances, interval);
    }

    public DefaultRgbaColorProperty(List<JulianDate> dates, List<Color> instances, Interpolations interpolations, TimeInterval interval) {
        super(dates, instances, interpolations, interval);
    }

    public DefaultRgbaColorProperty(List<JulianDate> dates, List<Color> instances, Integer startIndex, Integer length) {
        super(dates, instances, startIndex, length);
    }

    public DefaultRgbaColorProperty(List<JulianDate> dates, List<Color> instances, Integer startIndex, Integer length, Interpolations interpolations) {
        super(dates, instances, startIndex, length, interpolations);
    }

    public DefaultRgbaColorProperty(List<JulianDate> dates, List<Color> instances, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instances, startIndex, length, interval);
    }

    public DefaultRgbaColorProperty(List<JulianDate> dates, List<Color> instances, Integer startIndex, Integer length, Interpolations interpolations, TimeInterval interval) {
        super(dates, instances, startIndex, length, interpolations, interval);
    }

    public DefaultRgbaColorProperty(List<ColorProperty> intervals) {
        super(intervals);
    }

    public DefaultRgbaColorProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(ColorCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeRgba);
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

    public List<Color> getColors() {
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
