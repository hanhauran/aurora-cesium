package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.element.property.ColorProperty;
import aurora.cesium.element.property.DirectionProperty;
import aurora.cesium.element.property.DoubleProperty;
import cesiumlanguagewriter.TimeInterval;
import cesiumlanguagewriter.VectorCesiumWriter;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
class VectorGraphicsAdapter extends GraphicsAdapter<VectorGraphics, VectorCesiumWriter> implements VectorGraphics {

    private ColorProperty color;

    private DirectionProperty direction;

    private DoubleProperty length;

    private DoubleProperty minimumLengthInPixels;

    @Override
    public void dispatch(Supplier<VectorCesiumWriter> supplier) {
        try (VectorCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openColorProperty));
            Optional.ofNullable(getDirection()).ifPresent(directionProperty -> directionProperty.dispatch(writer::openDirectionProperty));
            Optional.ofNullable(getLength()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openLengthProperty));
            Optional.ofNullable(getMinimumLengthInPixels()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openMinimumLengthInPixelsProperty));
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
    public DirectionProperty getDirection() {
        return direction;
    }

    public void setDirection(DirectionProperty direction) {
        this.direction = direction;
    }

    @Override
    public DoubleProperty getLength() {
        return length;
    }

    public void setLength(DoubleProperty length) {
        this.length = length;
    }

    @Override
    public DoubleProperty getMinimumLengthInPixels() {
        return minimumLengthInPixels;
    }

    public void setMinimumLengthInPixels(DoubleProperty minimumLengthInPixels) {
        this.minimumLengthInPixels = minimumLengthInPixels;
    }

    public static final class Builder {
        private BooleanProperty show;
        private ColorProperty color;
        private DirectionProperty direction;
        private DoubleProperty length;
        private DoubleProperty minimumLengthInPixels;

        private TimeInterval interval;
        private List<VectorGraphics> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withColor(ColorProperty color) {
            this.color = color;
            return this;
        }

        public Builder withDirection(DirectionProperty direction) {
            this.direction = direction;
            return this;
        }

        public Builder withLength(DoubleProperty length) {
            this.length = length;
            return this;
        }

        public Builder withMinimumLengthInPixels(DoubleProperty minimumLengthInPixels) {
            this.minimumLengthInPixels = minimumLengthInPixels;
            return this;
        }

        public Builder withShow(BooleanProperty show) {
            this.show = show;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<VectorGraphics> intervals) {
            this.intervals = intervals;
            return this;
        }

        public VectorGraphicsAdapter build() {
            VectorGraphicsAdapter vectorGraphicsAdapter = new VectorGraphicsAdapter();
            vectorGraphicsAdapter.setColor(color);
            vectorGraphicsAdapter.setDirection(direction);
            vectorGraphicsAdapter.setLength(length);
            vectorGraphicsAdapter.setMinimumLengthInPixels(minimumLengthInPixels);
            vectorGraphicsAdapter.setShow(show);
            vectorGraphicsAdapter.setInterval(interval);
            vectorGraphicsAdapter.setIntervals(intervals);
            return vectorGraphicsAdapter;
        }
    }
}
