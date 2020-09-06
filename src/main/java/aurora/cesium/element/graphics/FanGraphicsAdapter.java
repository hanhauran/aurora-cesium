package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.FanCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
class FanGraphicsAdapter extends GraphicsAdapter<FanGraphics, FanCesiumWriter> implements FanGraphics {

    private DirectionListProperty directions;

    private BooleanProperty fill;

    private IntegerProperty numberOfRings;

    private MaterialProperty material;

    private BooleanProperty outline;

    private ColorProperty outlineColor;

    private DoubleProperty outlineWidth;

    private BooleanProperty perDirectionRadius;

    private DoubleProperty radius;

    @Override
    public void dispatch(Supplier<FanCesiumWriter> supplier) {
        try (FanCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getDirections()).ifPresent(directionListProperty -> directionListProperty.dispatch(writer::openDirectionsProperty));
            Optional.ofNullable(getFill()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openFillProperty));
            Optional.ofNullable(getNumberOfRings()).ifPresent(integerProperty -> integerProperty.dispatch(writer::openNumberOfRingsProperty));
            Optional.ofNullable(getMaterial()).ifPresent(materialProperty -> materialProperty.dispatch(writer::openMaterialProperty));
            Optional.ofNullable(getOutline()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openOutlineProperty));
            Optional.ofNullable(getOutlineColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openOutlineColorProperty));
            Optional.ofNullable(getOutlineWidth()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openOutlineWidthProperty));
            Optional.ofNullable(getPerDirectionRadius()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openPerDirectionRadiusProperty));
            Optional.ofNullable(getRadius()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openRadiusProperty));
            Optional.ofNullable(getShow()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openShowProperty));
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
        }
    }

    @Override
    public DirectionListProperty getDirections() {
        return directions;
    }

    public void setDirections(DirectionListProperty directions) {
        this.directions = directions;
    }

    @Override
    public BooleanProperty getFill() {
        return fill;
    }

    public void setFill(BooleanProperty fill) {
        this.fill = fill;
    }

    @Override
    public IntegerProperty getNumberOfRings() {
        return numberOfRings;
    }

    public void setNumberOfRings(IntegerProperty numberOfRings) {
        this.numberOfRings = numberOfRings;
    }

    @Override
    public MaterialProperty getMaterial() {
        return material;
    }

    public void setMaterial(MaterialProperty material) {
        this.material = material;
    }

    @Override
    public BooleanProperty getOutline() {
        return outline;
    }

    public void setOutline(BooleanProperty outline) {
        this.outline = outline;
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
    public BooleanProperty getPerDirectionRadius() {
        return perDirectionRadius;
    }

    public void setPerDirectionRadius(BooleanProperty perDirectionRadius) {
        this.perDirectionRadius = perDirectionRadius;
    }

    @Override
    public DoubleProperty getRadius() {
        return radius;
    }

    public void setRadius(DoubleProperty radius) {
        this.radius = radius;
    }

    public static final class Builder {
        protected BooleanProperty show;
        private DirectionListProperty directions;
        private BooleanProperty fill;
        private IntegerProperty numberOfRings;
        private MaterialProperty material;
        private BooleanProperty outline;
        private ColorProperty outlineColor;
        private DoubleProperty outlineWidth;
        private BooleanProperty perDirectionRadius;
        private DoubleProperty radius;

        protected TimeInterval interval;
        protected List<FanGraphics> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withDirections(DirectionListProperty directions) {
            this.directions = directions;
            return this;
        }

        public Builder withFill(BooleanProperty fill) {
            this.fill = fill;
            return this;
        }

        public Builder withNumberOfRings(IntegerProperty numberOfRings) {
            this.numberOfRings = numberOfRings;
            return this;
        }

        public Builder withMaterial(MaterialProperty material) {
            this.material = material;
            return this;
        }

        public Builder withOutline(BooleanProperty outline) {
            this.outline = outline;
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

        public Builder withPerDirectionRadius(BooleanProperty perDirectionRadius) {
            this.perDirectionRadius = perDirectionRadius;
            return this;
        }

        public Builder withRadius(DoubleProperty radius) {
            this.radius = radius;
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

        public Builder withIntervals(List<FanGraphics> intervals) {
            this.intervals = intervals;
            return this;
        }

        public FanGraphicsAdapter build() {
            FanGraphicsAdapter fanGraphicsAdapter = new FanGraphicsAdapter();
            fanGraphicsAdapter.setDirections(directions);
            fanGraphicsAdapter.setFill(fill);
            fanGraphicsAdapter.setNumberOfRings(numberOfRings);
            fanGraphicsAdapter.setMaterial(material);
            fanGraphicsAdapter.setOutline(outline);
            fanGraphicsAdapter.setOutlineColor(outlineColor);
            fanGraphicsAdapter.setOutlineWidth(outlineWidth);
            fanGraphicsAdapter.setPerDirectionRadius(perDirectionRadius);
            fanGraphicsAdapter.setRadius(radius);
            fanGraphicsAdapter.setShow(show);
            fanGraphicsAdapter.setInterval(interval);
            fanGraphicsAdapter.setIntervals(intervals);
            return fanGraphicsAdapter;
        }
    }
}
