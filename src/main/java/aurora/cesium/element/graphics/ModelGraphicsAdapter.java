package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import aurora.cesium.language.writer.ModelCesiumWriter;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/22
 */
public class ModelGraphicsAdapter extends GraphicsAdapter<ModelCesiumWriter> implements ModelGraphics {

    private ColorProperty color;

    private ColorBlendModeProperty colorBlendMode;

    private DoubleProperty colorBlendAmount;

    private DistanceDisplayConditionProperty distanceDisplayCondition;

    private UriProperty gltf;

    private HeightReferenceProperty heightReference;

    private BooleanProperty incrementallyLoadTextures;

    private DoubleProperty maximumScale;

    private DoubleProperty minimumPixelSize;

    private BooleanProperty runAnimations;

    private DoubleProperty scale;

    private ColorProperty silhouetteColor;

    private DoubleProperty silhouetteSize;

    private ShadowModeProperty shadows;

    @Override
    public void dispatch(ModelCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer.openColorProperty()));
            Optional.ofNullable(getColorBlendMode()).ifPresent(colorBlendModeProperty -> colorBlendModeProperty.dispatch(writer.openColorBlendModeProperty()));
            Optional.ofNullable(getColorBlendAmount()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer.openColorBlendAmountProperty()));
            Optional.ofNullable(getDistanceDisplayCondition()).ifPresent(distanceDisplayConditionProperty -> distanceDisplayConditionProperty.dispatch(writer.openDistanceDisplayConditionProperty()));
            Optional.ofNullable(getGltf()).ifPresent(uriProperty -> uriProperty.dispatchUri(writer.openGltfProperty()));
            Optional.ofNullable(getHeightReference()).ifPresent(heightReferenceProperty -> heightReferenceProperty.dispatch(writer.openHeightReferenceProperty()));
            Optional.ofNullable(getIncrementallyLoadTextures()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer.openIncrementallyLoadTexturesProperty()));
            Optional.ofNullable(getMaximumScale()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer.openMaximumScaleProperty()));
            Optional.ofNullable(getMinimumPixelSize()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer.openMinimumPixelSizeProperty()));
            Optional.ofNullable(getRunAnimations()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer.openRunAnimationsProperty()));
            Optional.ofNullable(getScale()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer.openScaleProperty()));
            Optional.ofNullable(getSilhouetteColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer.openSilhouetteColorProperty()));
            Optional.ofNullable(getSilhouetteSize()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer.openSilhouetteSizeProperty()));
            Optional.ofNullable(getShadows()).ifPresent(shadowModeProperty -> shadowModeProperty.dispatch(writer.openShadowsProperty()));
            Optional.ofNullable(getShow()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer.openShowProperty()));
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
    public ColorBlendModeProperty getColorBlendMode() {
        return colorBlendMode;
    }

    public void setColorBlendMode(ColorBlendModeProperty colorBlendMode) {
        this.colorBlendMode = colorBlendMode;
    }

    @Override
    public DoubleProperty getColorBlendAmount() {
        return colorBlendAmount;
    }

    public void setColorBlendAmount(DoubleProperty colorBlendAmount) {
        this.colorBlendAmount = colorBlendAmount;
    }

    @Override
    public DistanceDisplayConditionProperty getDistanceDisplayCondition() {
        return distanceDisplayCondition;
    }

    public void setDistanceDisplayCondition(DistanceDisplayConditionProperty distanceDisplayCondition) {
        this.distanceDisplayCondition = distanceDisplayCondition;
    }

    @Override
    public UriProperty getGltf() {
        return gltf;
    }

    public void setGltf(UriProperty gltf) {
        this.gltf = gltf;
    }

    @Override
    public HeightReferenceProperty getHeightReference() {
        return heightReference;
    }

    public void setHeightReference(HeightReferenceProperty heightReference) {
        this.heightReference = heightReference;
    }

    @Override
    public BooleanProperty getIncrementallyLoadTextures() {
        return incrementallyLoadTextures;
    }

    public void setIncrementallyLoadTextures(BooleanProperty incrementallyLoadTextures) {
        this.incrementallyLoadTextures = incrementallyLoadTextures;
    }

    @Override
    public DoubleProperty getMaximumScale() {
        return maximumScale;
    }

    public void setMaximumScale(DoubleProperty maximumScale) {
        this.maximumScale = maximumScale;
    }

    @Override
    public DoubleProperty getMinimumPixelSize() {
        return minimumPixelSize;
    }

    public void setMinimumPixelSize(DoubleProperty minimumPixelSize) {
        this.minimumPixelSize = minimumPixelSize;
    }

    @Override
    public BooleanProperty getRunAnimations() {
        return runAnimations;
    }

    public void setRunAnimations(BooleanProperty runAnimations) {
        this.runAnimations = runAnimations;
    }

    @Override
    public DoubleProperty getScale() {
        return scale;
    }

    public void setScale(DoubleProperty scale) {
        this.scale = scale;
    }

    @Override
    public ColorProperty getSilhouetteColor() {
        return silhouetteColor;
    }

    public void setSilhouetteColor(ColorProperty silhouetteColor) {
        this.silhouetteColor = silhouetteColor;
    }

    @Override
    public DoubleProperty getSilhouetteSize() {
        return silhouetteSize;
    }

    public void setSilhouetteSize(DoubleProperty silhouetteSize) {
        this.silhouetteSize = silhouetteSize;
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
        private ColorProperty color;
        private ColorBlendModeProperty colorBlendMode;
        private DoubleProperty colorBlendAmount;
        private DistanceDisplayConditionProperty distanceDisplayCondition;
        private UriProperty gltf;
        private HeightReferenceProperty heightReference;
        private BooleanProperty incrementallyLoadTextures;
        private DoubleProperty maximumScale;
        private DoubleProperty minimumPixelSize;
        private BooleanProperty runAnimations;
        private DoubleProperty scale;
        private ColorProperty silhouetteColor;
        private DoubleProperty silhouetteSize;
        private ShadowModeProperty shadows;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withColor(ColorProperty color) {
            this.color = color;
            return this;
        }

        public Builder withColorBlendMode(ColorBlendModeProperty colorBlendMode) {
            this.colorBlendMode = colorBlendMode;
            return this;
        }

        public Builder withColorBlendAmount(DoubleProperty colorBlendAmount) {
            this.colorBlendAmount = colorBlendAmount;
            return this;
        }

        public Builder withDistanceDisplayCondition(DistanceDisplayConditionProperty distanceDisplayCondition) {
            this.distanceDisplayCondition = distanceDisplayCondition;
            return this;
        }

        public Builder withGltf(UriProperty gltf) {
            this.gltf = gltf;
            return this;
        }

        public Builder withHeightReference(HeightReferenceProperty heightReference) {
            this.heightReference = heightReference;
            return this;
        }

        public Builder withIncrementallyLoadTextures(BooleanProperty incrementallyLoadTextures) {
            this.incrementallyLoadTextures = incrementallyLoadTextures;
            return this;
        }

        public Builder withMaximumScale(DoubleProperty maximumScale) {
            this.maximumScale = maximumScale;
            return this;
        }

        public Builder withMinimumPixelSize(DoubleProperty minimumPixelSize) {
            this.minimumPixelSize = minimumPixelSize;
            return this;
        }

        public Builder withRunAnimations(BooleanProperty runAnimations) {
            this.runAnimations = runAnimations;
            return this;
        }

        public Builder withScale(DoubleProperty scale) {
            this.scale = scale;
            return this;
        }

        public Builder withSilhouetteColor(ColorProperty silhouetteColor) {
            this.silhouetteColor = silhouetteColor;
            return this;
        }

        public Builder withSilhouetteSize(DoubleProperty silhouetteSize) {
            this.silhouetteSize = silhouetteSize;
            return this;
        }

        public Builder withShadows(ShadowModeProperty shadowMode) {
            this.shadows = shadowMode;
            return this;
        }

        public Builder withShow(BooleanProperty show) {
            this.show = show;
            return this;
        }

        public ModelGraphicsAdapter build() {
            ModelGraphicsAdapter modelGraphicsAdapter = new ModelGraphicsAdapter();
            modelGraphicsAdapter.setColor(color);
            modelGraphicsAdapter.setColorBlendMode(colorBlendMode);
            modelGraphicsAdapter.setColorBlendAmount(colorBlendAmount);
            modelGraphicsAdapter.setDistanceDisplayCondition(distanceDisplayCondition);
            modelGraphicsAdapter.setGltf(gltf);
            modelGraphicsAdapter.setHeightReference(heightReference);
            modelGraphicsAdapter.setIncrementallyLoadTextures(incrementallyLoadTextures);
            modelGraphicsAdapter.setMaximumScale(maximumScale);
            modelGraphicsAdapter.setMinimumPixelSize(minimumPixelSize);
            modelGraphicsAdapter.setRunAnimations(runAnimations);
            modelGraphicsAdapter.setScale(scale);
            modelGraphicsAdapter.setSilhouetteColor(silhouetteColor);
            modelGraphicsAdapter.setSilhouetteSize(silhouetteSize);
            modelGraphicsAdapter.setShadows(shadows);
            modelGraphicsAdapter.setShow(show);
            return modelGraphicsAdapter;
        }
    }
}
