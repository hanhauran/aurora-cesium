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

    @Override
    public void dispatch(ColorCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeRgba, writer::writeRgba, writer::writeRgba);
            dispatchInterpolations(writer);
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
            dispatchReference(writer);
        }
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

    public static final class Builder {
        protected List<JulianDate> dates;
        protected List<Color> values;
        protected Integer startIndex;
        protected Integer length;
        protected Color value;

        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<ColorProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValues(List<JulianDate> dates, List<Color> values) {
            this.dates = dates;
            this.values = values;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<Color> values, Integer startIndex, Integer length) {
            this.dates = dates;
            this.values = values;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public Builder withValue(Color value) {
            this.value = value;
            return this;
        }

        public Builder withInterpolations(Interpolations interpolations) {
            this.interpolations = interpolations;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<ColorProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public DefaultRgbaColorProperty build() {
            DefaultRgbaColorProperty defaultRgbaColorProperty = new DefaultRgbaColorProperty();
            defaultRgbaColorProperty.setDates(dates);
            defaultRgbaColorProperty.setValues(values);
            defaultRgbaColorProperty.setStartIndex(startIndex);
            defaultRgbaColorProperty.setLength(length);
            defaultRgbaColorProperty.setValue(value);
            defaultRgbaColorProperty.setInterpolations(interpolations);
            defaultRgbaColorProperty.setInterval(interval);
            defaultRgbaColorProperty.setIntervals(intervals);
            defaultRgbaColorProperty.setReference(reference);
            return defaultRgbaColorProperty;
        }
    }
}
