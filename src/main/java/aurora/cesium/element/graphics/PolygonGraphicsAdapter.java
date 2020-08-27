package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import aurora.cesium.language.writer.PolygonCesiumWriter;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public class PolygonGraphicsAdapter extends GraphicsAdapter<PolygonCesiumWriter> implements PolygonGraphics {

    private ArcTypeProperty arcType;

    private BooleanProperty closeTop;

    private BooleanProperty closeBottom;

    private ClassificationTypeProperty classificationType;

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

    private BooleanProperty perPositionHeight;

    private ShadowModeProperty shadows;

    private DoubleProperty stRotation;

    private IntegerProperty zIndex;

    @Override
    public void dispatch(PolygonCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getArcType()).ifPresent(arcTypeProperty -> arcTypeProperty.dispatch(writer.openArcTypeProperty()));
            Optional.ofNullable(getCloseTop()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer.openCloseTopProperty()));
            Optional.ofNullable(getCloseBottom()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer.openCloseBottomProperty()));
            Optional.ofNullable(getClassificationType()).ifPresent(classificationTypeProperty -> classificationTypeProperty.dispatch(writer.openClassificationTypeProperty()));
            Optional.ofNullable(getDistanceDisplayCondition()).ifPresent(distanceDisplayConditionProperty -> distanceDisplayConditionProperty.dispatch(writer.openDistanceDisplayConditionProperty()));
            Optional.ofNullable(getExtrudedHeight()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer.openExtrudedHeightProperty()));
            Optional.ofNullable(getExtrudedHeightReference()).ifPresent(heightReferenceProperty -> heightReferenceProperty.dispatch(writer.openExtrudedHeightReferenceProperty()));
            Optional.ofNullable(getFill()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer.openFillProperty()));
            Optional.ofNullable(getGranularity()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer.openGranularityProperty()));
            Optional.ofNullable(getHeight()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer.openHeightProperty()));
            Optional.ofNullable(getHeightReference()).ifPresent(heightReferenceProperty -> heightReferenceProperty.dispatch(writer.openHeightReferenceProperty()));
            Optional.ofNullable(getMaterial()).ifPresent(materialProperty -> materialProperty.dispatch(writer.openMaterialProperty()));
            Optional.ofNullable(getOutline()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer.openOutlineProperty()));
            Optional.ofNullable(getOutlineColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer.openOutlineColorProperty()));
            Optional.ofNullable(getOutlineWidth()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer.openOutlineWidthProperty()));
            Optional.ofNullable(getPerPositionHeight()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer.openPerPositionHeightProperty()));
            Optional.ofNullable(getShadows()).ifPresent(shadowModeProperty -> shadowModeProperty.dispatch(writer.openShadowsProperty()));
            Optional.ofNullable(getShow()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer.openShowProperty()));
            Optional.ofNullable(getStRotation()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer.openStRotationProperty()));
            Optional.ofNullable(getZIndex()).ifPresent(integerProperty -> integerProperty.dispatch(writer.openZIndexProperty()));
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
    public BooleanProperty getCloseTop() {
        return closeTop;
    }

    public void setCloseTop(BooleanProperty closeTop) {
        this.closeTop = closeTop;
    }

    @Override
    public BooleanProperty getCloseBottom() {
        return closeBottom;
    }

    public void setCloseBottom(BooleanProperty closeBottom) {
        this.closeBottom = closeBottom;
    }

    @Override
    public ClassificationTypeProperty getClassificationType() {
        return classificationType;
    }

    public void setClassificationType(ClassificationTypeProperty classificationType) {
        this.classificationType = classificationType;
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
    public BooleanProperty getPerPositionHeight() {
        return perPositionHeight;
    }

    public void setPerPositionHeight(BooleanProperty perPositionHeight) {
        this.perPositionHeight = perPositionHeight;
    }

    @Override
    public ShadowModeProperty getShadows() {
        return shadows;
    }

    public void setShadows(ShadowModeProperty shadows) {
        this.shadows = shadows;
    }

    @Override
    public DoubleProperty getStRotation() {
        return stRotation;
    }

    public void setStRotation(DoubleProperty stRotation) {
        this.stRotation = stRotation;
    }

    public IntegerProperty getZIndex() {
        return zIndex;
    }

    public void setZIndex(IntegerProperty zIndex) {
        this.zIndex = zIndex;
    }

    public static final class Builder {
        private ArcTypeProperty arcType;
        private BooleanProperty closeTop;
        private BooleanProperty closeBottom;
        private ClassificationTypeProperty classificationType;
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
        private BooleanProperty perPositionHeight;
        private ShadowModeProperty shadows;
        private BooleanProperty show;
        private DoubleProperty stRotation;
        private IntegerProperty zIndex;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withArcType(ArcTypeProperty arcType) {
            this.arcType = arcType;
            return this;
        }

        public Builder withCloseTop(BooleanProperty closeTop) {
            this.closeTop = closeTop;
            return this;
        }

        public Builder withCloseBottom(BooleanProperty closeBottom) {
            this.closeBottom = closeBottom;
            return this;
        }

        public Builder withClassificationType(ClassificationTypeProperty classificationType) {
            this.classificationType = classificationType;
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

        public Builder withPerPositionHeight(BooleanProperty perPositionHeight) {
            this.perPositionHeight = perPositionHeight;
            return this;
        }

        public Builder withShadows(ShadowModeProperty shadows) {
            this.shadows = shadows;
            return this;
        }

        public Builder withStRotation(DoubleProperty stRotation) {
            this.stRotation = stRotation;
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

        public PolygonGraphicsAdapter build() {
            PolygonGraphicsAdapter polygonGraphicsAdapter = new PolygonGraphicsAdapter();
            polygonGraphicsAdapter.setArcType(arcType);
            polygonGraphicsAdapter.setCloseTop(closeTop);
            polygonGraphicsAdapter.setCloseBottom(closeBottom);
            polygonGraphicsAdapter.setClassificationType(classificationType);
            polygonGraphicsAdapter.setDistanceDisplayCondition(distanceDisplayCondition);
            polygonGraphicsAdapter.setExtrudedHeight(extrudedHeight);
            polygonGraphicsAdapter.setExtrudedHeightReference(extrudedHeightReference);
            polygonGraphicsAdapter.setFill(fill);
            polygonGraphicsAdapter.setGranularity(granularity);
            polygonGraphicsAdapter.setHeight(height);
            polygonGraphicsAdapter.setHeightReference(heightReference);
            polygonGraphicsAdapter.setMaterial(material);
            polygonGraphicsAdapter.setOutline(outline);
            polygonGraphicsAdapter.setOutlineColor(outlineColor);
            polygonGraphicsAdapter.setOutlineWidth(outlineWidth);
            polygonGraphicsAdapter.setPerPositionHeight(perPositionHeight);
            polygonGraphicsAdapter.setShadows(shadows);
            polygonGraphicsAdapter.setStRotation(stRotation);
            polygonGraphicsAdapter.setZIndex(zIndex);
            polygonGraphicsAdapter.setShow(show);
            return polygonGraphicsAdapter;
        }
    }
}
