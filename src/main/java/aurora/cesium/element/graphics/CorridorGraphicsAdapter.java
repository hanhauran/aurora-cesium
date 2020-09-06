package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.CorridorCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
class CorridorGraphicsAdapter extends GraphicsAdapter<CorridorGraphics, CorridorCesiumWriter> implements CorridorGraphics {

    private ClassificationTypeProperty classificationType;

    private CornerTypeProperty cornerType;

    private DistanceDisplayConditionProperty distanceDisplayCondition;

    private DoubleProperty extrudedHeight;

    private HeightReferenceProperty extrudedHeightReference;

    private BooleanProperty fill;

    private DoubleProperty granularity;

    private DoubleProperty height;

    private HeightReferenceProperty heightReference;

    private MaterialProperty material;

    private BooleanProperty outline;

    private ColorProperty outlineColor;

    private DoubleProperty outlineWidth;

    private PositionListProperty positions;

    private ShadowModeProperty shadows;

    private DoubleProperty width;

    private IntegerProperty zIndex;

    @Override
    public void dispatch(Supplier<CorridorCesiumWriter> supplier) {
        try (CorridorCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getClassificationType()).ifPresent(classificationTypeProperty -> classificationTypeProperty.dispatch(writer::openClassificationTypeProperty));
            Optional.ofNullable(getCornerType()).ifPresent(cornerTypeProperty -> cornerTypeProperty.dispatch(writer::openCornerTypeProperty));
            Optional.ofNullable(getDistanceDisplayCondition()).ifPresent(distanceDisplayConditionProperty -> distanceDisplayConditionProperty.dispatch(writer::openDistanceDisplayConditionProperty));
            Optional.ofNullable(getExtrudedHeight()).ifPresent(extrudedHeightProperty -> extrudedHeightProperty.dispatch(writer::openExtrudedHeightProperty));
            Optional.ofNullable(getExtrudedHeightReference()).ifPresent(extrudedHeightReferenceProperty -> extrudedHeightReferenceProperty.dispatch(writer::openExtrudedHeightReferenceProperty));
            Optional.ofNullable(getFill()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openFillProperty));
            Optional.ofNullable(getGranularity()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openGranularityProperty));
            Optional.ofNullable(getHeight()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openHeightProperty));
            Optional.ofNullable(getHeightReference()).ifPresent(heightReferenceProperty -> heightReferenceProperty.dispatch(writer::openHeightReferenceProperty));
            Optional.ofNullable(getMaterial()).ifPresent(materialProperty -> materialProperty.dispatch(writer::openMaterialProperty));
            Optional.ofNullable(getOutline()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openOutlineProperty));
            Optional.ofNullable(getOutlineColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openOutlineColorProperty));
            Optional.ofNullable(getOutlineWidth()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openOutlineWidthProperty));
            Optional.ofNullable(getPositions()).ifPresent(positionListProperty -> positionListProperty.dispatch(writer::openPositionsProperty));
            Optional.ofNullable(getShadows()).ifPresent(shadowModeProperty -> shadowModeProperty.dispatch(writer::openShadowsProperty));
            Optional.ofNullable(getShow()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openShowProperty));
            Optional.ofNullable(getWidth()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openWidthProperty));
            Optional.ofNullable(getZIndex()).ifPresent(integerProperty -> integerProperty.dispatch(writer::openZIndexProperty));
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
        }
    }

    @Override
    public ClassificationTypeProperty getClassificationType() {
        return classificationType;
    }

    public void setClassificationType(ClassificationTypeProperty classificationType) {
        this.classificationType = classificationType;
    }

    @Override
    public CornerTypeProperty getCornerType() {
        return cornerType;
    }

    public void setCornerType(CornerTypeProperty cornerType) {
        this.cornerType = cornerType;
    }

    @Override
    public DistanceDisplayConditionProperty getDistanceDisplayCondition() {
        return distanceDisplayCondition;
    }

    public void setDistanceDisplayCondition(DistanceDisplayConditionProperty distanceDisplayCondition) {
        this.distanceDisplayCondition = distanceDisplayCondition;
    }

    @Override
    public DoubleProperty getExtrudedHeight() {
        return extrudedHeight;
    }

    public void setExtrudedHeight(DoubleProperty extrudedHeight) {
        this.extrudedHeight = extrudedHeight;
    }

    @Override
    public HeightReferenceProperty getExtrudedHeightReference() {
        return extrudedHeightReference;
    }

    public void setExtrudedHeightReference(HeightReferenceProperty extrudedHeightReference) {
        this.extrudedHeightReference = extrudedHeightReference;
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
    public DoubleProperty getHeight() {
        return height;
    }

    public void setHeight(DoubleProperty height) {
        this.height = height;
    }

    @Override
    public HeightReferenceProperty getHeightReference() {
        return heightReference;
    }

    public void setHeightReference(HeightReferenceProperty heightReference) {
        this.heightReference = heightReference;
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

    @Override
    public DoubleProperty getWidth() {
        return width;
    }

    public void setWidth(DoubleProperty width) {
        this.width = width;
    }

    @Override
    public IntegerProperty getZIndex() {
        return zIndex;
    }

    public void setZIndex(IntegerProperty zIndex) {
        this.zIndex = zIndex;
    }

    public static final class Builder {
        protected BooleanProperty show;
        private ClassificationTypeProperty classificationType;
        private CornerTypeProperty cornerType;
        private DistanceDisplayConditionProperty distanceDisplayCondition;
        private DoubleProperty extrudedHeight;
        private HeightReferenceProperty extrudedHeightReference;
        private BooleanProperty fill;
        private DoubleProperty granularity;
        private DoubleProperty height;
        private HeightReferenceProperty heightReference;
        private MaterialProperty material;
        private BooleanProperty outline;
        private ColorProperty outlineColor;
        private DoubleProperty outlineWidth;
        private PositionListProperty positions;
        private ShadowModeProperty shadows;
        private DoubleProperty width;
        private IntegerProperty zIndex;

        protected TimeInterval interval;
        protected List<CorridorGraphics> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withClassificationType(ClassificationTypeProperty classificationType) {
            this.classificationType = classificationType;
            return this;
        }

        public Builder withCornerType(CornerTypeProperty cornerType) {
            this.cornerType = cornerType;
            return this;
        }

        public Builder withDistanceDisplayCondition(DistanceDisplayConditionProperty distanceDisplayCondition) {
            this.distanceDisplayCondition = distanceDisplayCondition;
            return this;
        }

        public Builder withExtrudedHeight(DoubleProperty extrudedHeight) {
            this.extrudedHeight = extrudedHeight;
            return this;
        }

        public Builder withExtrudedHeightReference(HeightReferenceProperty extrudedHeightReference) {
            this.extrudedHeightReference = extrudedHeightReference;
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

        public Builder withHeight(DoubleProperty height) {
            this.height = height;
            return this;
        }

        public Builder withHeightReference(HeightReferenceProperty heightReference) {
            this.heightReference = heightReference;
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

        public Builder withPositions(PositionListProperty positions) {
            this.positions = positions;
            return this;
        }

        public Builder withShadows(ShadowModeProperty shadows) {
            this.shadows = shadows;
            return this;
        }

        public Builder withWidth(DoubleProperty width) {
            this.width = width;
            return this;
        }

        public Builder withZIndex(IntegerProperty zIndex) {
            this.zIndex = zIndex;
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

        public Builder withIntervals(List<CorridorGraphics> intervals) {
            this.intervals = intervals;
            return this;
        }

        public CorridorGraphicsAdapter build() {
            CorridorGraphicsAdapter corridorGraphicsAdapter = new CorridorGraphicsAdapter();
            corridorGraphicsAdapter.setClassificationType(classificationType);
            corridorGraphicsAdapter.setCornerType(cornerType);
            corridorGraphicsAdapter.setDistanceDisplayCondition(distanceDisplayCondition);
            corridorGraphicsAdapter.setExtrudedHeight(extrudedHeight);
            corridorGraphicsAdapter.setExtrudedHeightReference(extrudedHeightReference);
            corridorGraphicsAdapter.setFill(fill);
            corridorGraphicsAdapter.setGranularity(granularity);
            corridorGraphicsAdapter.setHeightReference(heightReference);
            corridorGraphicsAdapter.setMaterial(material);
            corridorGraphicsAdapter.setOutline(outline);
            corridorGraphicsAdapter.setOutlineColor(outlineColor);
            corridorGraphicsAdapter.setOutlineWidth(outlineWidth);
            corridorGraphicsAdapter.setPositions(positions);
            corridorGraphicsAdapter.setShadows(shadows);
            corridorGraphicsAdapter.setWidth(width);
            corridorGraphicsAdapter.setZIndex(zIndex);
            corridorGraphicsAdapter.setShow(show);
            corridorGraphicsAdapter.setInterval(interval);
            corridorGraphicsAdapter.setIntervals(intervals);
            return corridorGraphicsAdapter;
        }
    }
}
