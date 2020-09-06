package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.PolylineCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
class PolylineGraphicsAdapter extends GraphicsAdapter<PolylineGraphics, PolylineCesiumWriter> implements PolylineGraphics {

    private ArcTypeProperty arcType;

    private BooleanProperty clampToGround;

    private ClassificationTypeProperty classificationType;

    private PolylineMaterialProperty depthFailMaterial;

    private DistanceDisplayConditionProperty distanceDisplayCondition;

    private BooleanProperty followSurface;

    private DoubleProperty granularity;

    private PolylineMaterialProperty material;

    private PositionListProperty positions;

    private ShadowModeProperty shadows;

    private DoubleProperty width;

    private IntegerProperty zIndex;

    @Override
    public void dispatch(Supplier<PolylineCesiumWriter> supplier) {
        try (PolylineCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getArcType()).ifPresent(arcTypeProperty -> arcTypeProperty.dispatch(writer::openArcTypeProperty));
            Optional.ofNullable(getClampToGround()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openClampToGroundProperty));
            Optional.ofNullable(getClassificationType()).ifPresent(classificationTypeProperty -> classificationTypeProperty.dispatch(writer::openClassificationTypeProperty));
            Optional.ofNullable(getDepthFailMaterial()).ifPresent(polylineMaterialProperty -> polylineMaterialProperty.dispatch(writer::openDepthFailMaterialProperty));
            Optional.ofNullable(getDistanceDisplayCondition()).ifPresent(distanceDisplayConditionProperty -> distanceDisplayConditionProperty.dispatch(writer::openDistanceDisplayConditionProperty));
            Optional.ofNullable(getFollowSurface()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openFollowSurfaceProperty));
            Optional.ofNullable(getGranularity()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openGranularityProperty));
            Optional.ofNullable(getMaterial()).ifPresent(polylineMaterialProperty -> polylineMaterialProperty.dispatch(writer::openMaterialProperty));
            Optional.ofNullable(getPositions()).ifPresent(positionListProperty -> positionListProperty.dispatch(writer::openPositionsProperty));
            Optional.ofNullable(getShadows()).ifPresent(shadowModeProperty -> shadowModeProperty.dispatch(writer::openShadowsProperty));
            Optional.ofNullable(getShow()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openShowProperty));
            Optional.ofNullable(getWidth()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openWidthProperty));
            Optional.ofNullable(getZIndex()).ifPresent(integerProperty -> integerProperty.dispatch(writer::openZIndexProperty));
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
        }
    }

    @Override
    public ArcTypeProperty getArcType() {
        return arcType;
    }

    public void setArcType(ArcTypeProperty arcType) {
        this.arcType = arcType;
    }

    @Override
    public BooleanProperty getClampToGround() {
        return clampToGround;
    }

    public void setClampToGround(BooleanProperty clampToGround) {
        this.clampToGround = clampToGround;
    }

    @Override
    public ClassificationTypeProperty getClassificationType() {
        return classificationType;
    }

    public void setClassificationType(ClassificationTypeProperty classificationType) {
        this.classificationType = classificationType;
    }

    @Override
    public PolylineMaterialProperty getDepthFailMaterial() {
        return depthFailMaterial;
    }

    public void setDepthFailMaterial(PolylineMaterialProperty depthFailMaterial) {
        this.depthFailMaterial = depthFailMaterial;
    }

    @Override
    public DistanceDisplayConditionProperty getDistanceDisplayCondition() {
        return distanceDisplayCondition;
    }

    public void setDistanceDisplayCondition(DistanceDisplayConditionProperty distanceDisplayCondition) {
        this.distanceDisplayCondition = distanceDisplayCondition;
    }

    @Override
    public BooleanProperty getFollowSurface() {
        return followSurface;
    }

    public void setFollowSurface(BooleanProperty followSurface) {
        this.followSurface = followSurface;
    }

    @Override
    public DoubleProperty getGranularity() {
        return granularity;
    }

    public void setGranularity(DoubleProperty granularity) {
        this.granularity = granularity;
    }

    @Override
    public PolylineMaterialProperty getMaterial() {
        return material;
    }

    public void setMaterial(PolylineMaterialProperty material) {
        this.material = material;
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

    public IntegerProperty getZIndex() {
        return zIndex;
    }

    public void setZIndex(IntegerProperty zIndex) {
        this.zIndex = zIndex;
    }

    public static final class Builder {
        protected BooleanProperty show;
        private ArcTypeProperty arcType;
        private BooleanProperty clampToGround;
        private ClassificationTypeProperty classificationType;
        private PolylineMaterialProperty depthFailMaterial;
        private DistanceDisplayConditionProperty distanceDisplayCondition;
        private BooleanProperty followSurface;
        private DoubleProperty granularity;
        private PolylineMaterialProperty material;
        private PositionListProperty positions;
        private ShadowModeProperty shadows;
        private DoubleProperty width;
        private IntegerProperty zIndex;

        private TimeInterval interval;
        private List<PolylineGraphics> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withArcType(ArcTypeProperty arcType) {
            this.arcType = arcType;
            return this;
        }

        public Builder withClampToGround(BooleanProperty clampToGround) {
            this.clampToGround = clampToGround;
            return this;
        }

        public Builder withClassificationType(ClassificationTypeProperty classificationType) {
            this.classificationType = classificationType;
            return this;
        }

        public Builder withDepthFailMaterial(PolylineMaterialProperty depthFailMaterial) {
            this.depthFailMaterial = depthFailMaterial;
            return this;
        }

        public Builder withDistanceDisplayCondition(DistanceDisplayConditionProperty distanceDisplayCondition) {
            this.distanceDisplayCondition = distanceDisplayCondition;
            return this;
        }

        public Builder withFollowSurface(BooleanProperty followSurface) {
            this.followSurface = followSurface;
            return this;
        }

        public Builder withGranularity(DoubleProperty granularity) {
            this.granularity = granularity;
            return this;
        }

        public Builder withMaterial(PolylineMaterialProperty material) {
            this.material = material;
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

        public Builder withIntervals(List<PolylineGraphics> intervals) {
            this.intervals = intervals;
            return this;
        }

        public PolylineGraphicsAdapter build() {
            PolylineGraphicsAdapter polylineGraphicsAdapter = new PolylineGraphicsAdapter();
            polylineGraphicsAdapter.setArcType(arcType);
            polylineGraphicsAdapter.setClampToGround(clampToGround);
            polylineGraphicsAdapter.setClassificationType(classificationType);
            polylineGraphicsAdapter.setDepthFailMaterial(depthFailMaterial);
            polylineGraphicsAdapter.setDistanceDisplayCondition(distanceDisplayCondition);
            polylineGraphicsAdapter.setFollowSurface(followSurface);
            polylineGraphicsAdapter.setGranularity(granularity);
            polylineGraphicsAdapter.setMaterial(material);
            polylineGraphicsAdapter.setPositions(positions);
            polylineGraphicsAdapter.setShadows(shadows);
            polylineGraphicsAdapter.setWidth(width);
            polylineGraphicsAdapter.setZIndex(zIndex);
            polylineGraphicsAdapter.setShow(show);
            polylineGraphicsAdapter.setInterval(interval);
            polylineGraphicsAdapter.setIntervals(intervals);
            return polylineGraphicsAdapter;
        }
    }
}
