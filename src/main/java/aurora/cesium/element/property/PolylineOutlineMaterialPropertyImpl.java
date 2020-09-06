package aurora.cesium.element.property;

import cesiumlanguagewriter.PolylineOutlineMaterialCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
class PolylineOutlineMaterialPropertyImpl extends PropertyAdapter<PolylineOutlineMaterialProperty> implements PolylineOutlineMaterialProperty {

    private ColorProperty color;

    private ColorProperty outlineColor;

    private DoubleProperty outlineWidth;

    @Override
    public void dispatch(Supplier<PolylineOutlineMaterialCesiumWriter> supplier) {
        try (PolylineOutlineMaterialCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openColorProperty));
            Optional.ofNullable(getOutlineColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openOutlineColorProperty));
            Optional.ofNullable(getOutlineWidth()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openOutlineWidthProperty));

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
    public ColorProperty getOutlineColor() {
        return outlineColor;
    }

    public void setOutlineColor(ColorProperty outlineColor) {
        this.outlineColor = outlineColor;
    }

    @Override
    public DoubleProperty getOutlineWidth() {
        return outlineWidth;
    }

    public void setOutlineWidth(DoubleProperty outlineWidth) {
        this.outlineWidth = outlineWidth;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<PolylineOutlineMaterialProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<PolylineOutlineMaterialProperty> intervals) {
        this.intervals = intervals;
    }

    public static final class Builder {
        private ColorProperty color;
        private ColorProperty outlineColor;
        private DoubleProperty outlineWidth;

        protected TimeInterval interval;
        protected List<PolylineOutlineMaterialProperty> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withColor(ColorProperty color) {
            this.color = color;
            return this;
        }

        public Builder withOutlineColor(ColorProperty outlineColor) {
            this.outlineColor = outlineColor;
            return this;
        }

        public Builder withOutlineWidth(DoubleProperty outlineWidth) {
            this.outlineWidth = outlineWidth;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<PolylineOutlineMaterialProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public PolylineOutlineMaterialPropertyImpl build() {
            PolylineOutlineMaterialPropertyImpl polylineOutlineMaterialPropertyImpl = new PolylineOutlineMaterialPropertyImpl();
            polylineOutlineMaterialPropertyImpl.setColor(color);
            polylineOutlineMaterialPropertyImpl.setOutlineColor(outlineColor);
            polylineOutlineMaterialPropertyImpl.setOutlineWidth(outlineWidth);
            polylineOutlineMaterialPropertyImpl.setInterval(interval);
            polylineOutlineMaterialPropertyImpl.setIntervals(intervals);
            return polylineOutlineMaterialPropertyImpl;
        }
    }
}
