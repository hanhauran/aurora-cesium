package aurora.cesium.element.property;

import cesiumlanguagewriter.PolylineArrowMaterialCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
class PolylineArrowMaterialPropertyImpl extends PropertyAdapter<PolylineArrowMaterialProperty> implements PolylineArrowMaterialProperty {

    private ColorProperty color;

    @Override
    public void dispatch(Supplier<PolylineArrowMaterialCesiumWriter> supplier) {
        try (PolylineArrowMaterialCesiumWriter writer = supplier.get()) {
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
    public List<PolylineArrowMaterialProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<PolylineArrowMaterialProperty> intervals) {
        this.intervals = intervals;
    }

    public static final class Builder {
        private ColorProperty color;

        protected TimeInterval interval;
        protected List<PolylineArrowMaterialProperty> intervals;

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

        public Builder withIntervals(List<PolylineArrowMaterialProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public PolylineArrowMaterialPropertyImpl build() {
            PolylineArrowMaterialPropertyImpl polylineArrowMaterialPropertyImpl = new PolylineArrowMaterialPropertyImpl();
            polylineArrowMaterialPropertyImpl.setColor(color);
            polylineArrowMaterialPropertyImpl.setInterval(interval);
            polylineArrowMaterialPropertyImpl.setIntervals(intervals);
            return polylineArrowMaterialPropertyImpl;
        }
    }
}
