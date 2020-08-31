package aurora.cesium.element.graphics;

import aurora.cesium.element.property.ColorProperty;
import aurora.cesium.element.property.DirectionProperty;
import aurora.cesium.element.property.DoubleProperty;
import aurora.cesium.language.writer.VectorCesiumWriter;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public class VectorGraphicsAdapter extends GraphicsAdapter<VectorGraphics, VectorCesiumWriter> implements VectorGraphics {

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
}
