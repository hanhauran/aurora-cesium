package aurora.cesium.element.property;

import cesiumlanguagewriter.SolidColorMaterialCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
class SolidColorMaterialPropertyImpl extends PropertyAdapter<SolidColorMaterialProperty> implements SolidColorMaterialProperty {

    private ColorProperty color;

    @Override
    public void dispatch(Supplier<SolidColorMaterialCesiumWriter> supplier) {
        try (SolidColorMaterialCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openColorProperty));

            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
        }
    }

    @Override
    public ColorProperty getColor() {
        return color;
    }

    public void setColor(ColorProperty color) {
        this.color = color;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<SolidColorMaterialProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<SolidColorMaterialProperty> intervals) {
        this.intervals = intervals;
    }

    public static final class Builder {
        private ColorProperty color;

        protected TimeInterval interval;
        protected List<SolidColorMaterialProperty> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withColor(ColorProperty color) {
            this.color = color;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<SolidColorMaterialProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public SolidColorMaterialPropertyImpl build() {
            SolidColorMaterialPropertyImpl solidColorMaterialPropertyImpl = new SolidColorMaterialPropertyImpl();
            solidColorMaterialPropertyImpl.setColor(color);
            solidColorMaterialPropertyImpl.setInterval(interval);
            solidColorMaterialPropertyImpl.setIntervals(intervals);
            return solidColorMaterialPropertyImpl;
        }
    }
}
