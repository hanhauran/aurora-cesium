package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.TimeInterval;
import cesiumlanguagewriter.WallCesiumWriter;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
class WallGraphicsAdapter extends GraphicsAdapter<WallGraphics, WallCesiumWriter> implements WallGraphics {

    private DistanceDisplayConditionProperty distanceDisplayCondition;

    private BooleanProperty fill;

    private DoubleProperty granularity;

    private MaterialProperty material;

    private DoubleListProperty maximumHeights;

    private DoubleListProperty minimumHeights;

    private BooleanProperty outline;

    private ColorProperty outlineColor;

    private DoubleProperty outlineWidth;

    private PositionListProperty positions;

    private ShadowModeProperty shadows;

    @Override
    public void dispatch(Supplier<WallCesiumWriter> supplier) {
        try (WallCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getDistanceDisplayCondition()).ifPresent(distanceDisplayConditionProperty -> distanceDisplayConditionProperty.dispatch(writer::openDistanceDisplayConditionProperty));
            Optional.ofNullable(getFill()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openFillProperty));
            Optional.ofNullable(getGranularity()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openGranularityProperty));
            Optional.ofNullable(getMaterial()).ifPresent(materialProperty -> materialProperty.dispatch(writer::openMaterialProperty));
            Optional.ofNullable(getMaximumHeights()).ifPresent(doubleListProperty -> doubleListProperty.dispatch(writer::openMaximumHeightsProperty));
            Optional.ofNullable(getMinimumHeights()).ifPresent(doubleListProperty -> doubleListProperty.dispatch(writer::openMinimumHeightsProperty));
            Optional.ofNullable(getOutline()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openOutlineProperty));
            Optional.ofNullable(getOutlineColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openOutlineColorProperty));
            Optional.ofNullable(getOutlineWidth()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openOutlineWidthProperty));
            Optional.ofNullable(getPositions()).ifPresent(positionListProperty -> positionListProperty.dispatch(writer::openPositionsProperty));
            Optional.ofNullable(getShadows()).ifPresent(shadowModeProperty -> shadowModeProperty.dispatch(writer::openShadowsProperty));
            Optional.ofNullable(getShow()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openShowProperty));
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
        }
    }

    @Override
    public DistanceDisplayConditionProperty getDistanceDisplayCondition() {
        return distanceDisplayCondition;
    }

    public void setDistanceDisplayCondition(DistanceDisplayConditionProperty distanceDisplayCondition) {
        this.distanceDisplayCondition = distanceDisplayCondition;
    }

    @Override
    public BooleanProperty getFill() {
        return fill;
    }

    public void setFill(BooleanProperty fill) {
        this.fill = fill;
    }

    @Override
    public DoubleProperty getGranularity() {
        return granularity;
    }

    public void setGranularity(DoubleProperty granularity) {
        this.granularity = granularity;
    }

    @Override
    public MaterialProperty getMaterial() {
        return material;
    }

    public void setMaterial(MaterialProperty material) {
        this.material = material;
    }

    @Override
    public DoubleListProperty getMaximumHeights() {
        return maximumHeights;
    }

    public void setMaximumHeights(DoubleListProperty maximumHeights) {
        this.maximumHeights = maximumHeights;
    }

    @Override
    public DoubleListProperty getMinimumHeights() {
        return minimumHeights;
    }

    public void setMinimumHeights(DoubleListProperty minimumHeights) {
        this.minimumHeights = minimumHeights;
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
    public PositionListProperty getPositions() {
        return positions;
    }

    public void setPositions(PositionListProperty positions) {
        this.positions = positions;
    }

    @Override
    public ShadowModeProperty getShadows() {
        return shadows;
    }

    public void setShadows(ShadowModeProperty shadows) {
        this.shadows = shadows;
    }


    public static final class Builder {
        protected BooleanProperty show;
        private DistanceDisplayConditionProperty distanceDisplayCondition;
        private BooleanProperty fill;
        private DoubleProperty granularity;
        private MaterialProperty material;
        private DoubleListProperty maximumHeights;
        private DoubleListProperty minimumHeights;
        private BooleanProperty outline;
        private ColorProperty outlineColor;
        private DoubleProperty outlineWidth;
        private PositionListProperty positions;
        private ShadowModeProperty shadows;

        protected TimeInterval interval;
        protected List<WallGraphics> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withDistanceDisplayCondition(DistanceDisplayConditionProperty distanceDisplayCondition) {
            this.distanceDisplayCondition = distanceDisplayCondition;
            return this;
        }

        public Builder withFill(BooleanProperty fill) {
            this.fill = fill;
            return this;
        }

        public Builder withGranularity(DoubleProperty granularity) {
            this.granularity = granularity;
            return this;
        }

        public Builder withMaterial(MaterialProperty material) {
            this.material = material;
            return this;
        }

        public Builder withMaximumHeights(DoubleListProperty maximumHeights) {
            this.maximumHeights = maximumHeights;
            return this;
        }

        public Builder withMinimumHeights(DoubleListProperty minimumHeights) {
            this.minimumHeights = minimumHeights;
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

        public Builder withPositions(PositionListProperty positions) {
            this.positions = positions;
            return this;
        }

        public Builder withShadows(ShadowModeProperty shadows) {
            this.shadows = shadows;
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

        public Builder withIntervals(List<WallGraphics> intervals) {
            this.intervals = intervals;
            return this;
        }

        public WallGraphicsAdapter build() {
            WallGraphicsAdapter wallGraphicsAdapter = new WallGraphicsAdapter();
            wallGraphicsAdapter.setDistanceDisplayCondition(distanceDisplayCondition);
            wallGraphicsAdapter.setFill(fill);
            wallGraphicsAdapter.setGranularity(granularity);
            wallGraphicsAdapter.setMaterial(material);
            wallGraphicsAdapter.setMaximumHeights(maximumHeights);
            wallGraphicsAdapter.setMinimumHeights(minimumHeights);
            wallGraphicsAdapter.setOutline(outline);
            wallGraphicsAdapter.setOutlineColor(outlineColor);
            wallGraphicsAdapter.setOutlineWidth(outlineWidth);
            wallGraphicsAdapter.setPositions(positions);
            wallGraphicsAdapter.setShadows(shadows);
            wallGraphicsAdapter.setShow(show);
            wallGraphicsAdapter.setInterval(interval);
            wallGraphicsAdapter.setIntervals(intervals);
            return wallGraphicsAdapter;
        }
    }
}
