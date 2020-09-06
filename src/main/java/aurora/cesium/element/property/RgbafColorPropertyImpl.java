package aurora.cesium.element.property;

import cesiumlanguagewriter.ColorCesiumWriter;
import cesiumlanguagewriter.JulianDate;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.awt.*;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
class RgbafColorPropertyImpl extends SingleTimeBasedPropertyAdapter<Color, ColorProperty> implements ColorProperty {

    @Override
    public void dispatch(Supplier<ColorCesiumWriter> supplier) {
        try (ColorCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeRgbaf, writer::writeRgbaf, writer::writeRgbaf);

            dispatchDelete(writer);
            dispatchInterpolations(writer);
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
            dispatchReference(writer);
        }
    }

    @Override
    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
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
        private List<JulianDate> dates;
        private List<Color> values;
        private Integer startIndex;
        private Integer length;

        private Color value;

        private Boolean delete;
        private Interpolations interpolations;
        private TimeInterval interval;
        private List<ColorProperty> intervals;
        private Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(Color value) {
            this.value = value;
            return this;
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

        public Builder withDelete(Boolean delete) {
            this.delete = delete;
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

        public RgbafColorPropertyImpl build() {
            RgbafColorPropertyImpl rgbafColorPropertyImpl = new RgbafColorPropertyImpl();
            rgbafColorPropertyImpl.setDates(dates);
            rgbafColorPropertyImpl.setValues(values);
            rgbafColorPropertyImpl.setStartIndex(startIndex);
            rgbafColorPropertyImpl.setLength(length);
            rgbafColorPropertyImpl.setValue(value);
            rgbafColorPropertyImpl.setDelete(delete);
            rgbafColorPropertyImpl.setInterpolations(interpolations);
            rgbafColorPropertyImpl.setInterval(interval);
            rgbafColorPropertyImpl.setIntervals(intervals);
            rgbafColorPropertyImpl.setReference(reference);
            return rgbafColorPropertyImpl;
        }
    }
}
