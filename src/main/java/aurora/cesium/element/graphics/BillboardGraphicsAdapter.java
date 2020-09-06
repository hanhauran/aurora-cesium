package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.BillboardCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
class BillboardGraphicsAdapter extends GraphicsAdapter<BillboardGraphics, BillboardCesiumWriter> implements BillboardGraphics {

    private AlignedAxisProperty alignedAxis;

    private ColorProperty color;

    private DoubleProperty disabledDepthTestDistance;

    private DistanceDisplayConditionProperty distanceDisplayCondition;

    private EyeOffsetProperty eyeOffset;

    private DoubleProperty height;

    private HeightReferenceProperty heightReference;

    private HorizontalOriginProperty horizontalOrigin;

    private UriProperty image;

    private BoundingRectangleProperty imageSubRegion;

    private PixelOffsetProperty pixelOffset;

    private NearFarScalarProperty pixelOffsetScaleByDistance;

    private DoubleProperty rotation;

    private DoubleProperty scale;

    private NearFarScalarProperty scaleByDistance;

    private BooleanProperty sizeInMeters;

    private NearFarScalarProperty translucencyByDistance;

    private VerticalOriginProperty verticalOrigin;

    private DoubleProperty width;

    @Override
    public void dispatch(Supplier<BillboardCesiumWriter> supplier) {
        try (BillboardCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getAlignedAxis()).ifPresent(alignedAxisProperty -> alignedAxisProperty.dispatch(writer::openAlignedAxisProperty));
            Optional.ofNullable(getColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openColorProperty));
            Optional.ofNullable(getDisabledDepthTestDistance()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openDisableDepthTestDistanceProperty));
            Optional.ofNullable(getDistanceDisplayCondition()).ifPresent(distanceDisplayConditionProperty -> distanceDisplayConditionProperty.dispatch(writer::openDistanceDisplayConditionProperty));
            Optional.ofNullable(getEyeOffset()).ifPresent(eyeOffsetProperty -> eyeOffsetProperty.dispatch(writer::openEyeOffsetProperty));
            Optional.ofNullable(getHeight()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openHeightProperty));
            Optional.ofNullable(getHeightReference()).ifPresent(heightReferenceProperty -> heightReferenceProperty.dispatch(writer::openHeightReferenceProperty));
            Optional.ofNullable(getHorizontalOrigin()).ifPresent(horizontalOriginProperty -> horizontalOriginProperty.dispatch(writer::openHorizontalOriginProperty));
            Optional.ofNullable(getImage()).ifPresent(resourceProperty -> resourceProperty.dispatch(writer::openImageProperty));
            Optional.ofNullable(getImageSubRegion()).ifPresent(boundingRectangleProperty -> boundingRectangleProperty.dispatch(writer::openImageSubRegionProperty));
            Optional.ofNullable(getPixelOffset()).ifPresent(pixelOffsetProperty -> pixelOffsetProperty.dispatch(writer::openPixelOffsetProperty));
            Optional.ofNullable(getPixelOffsetScaleByDistance()).ifPresent(nearFarScalarProperty -> nearFarScalarProperty.dispatch(writer::openPixelOffsetScaleByDistanceProperty));
            Optional.ofNullable(getRotation()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openRotationProperty));
            Optional.ofNullable(getScale()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openScaleProperty));
            Optional.ofNullable(getScaleByDistance()).ifPresent(nearFarScalarProperty -> nearFarScalarProperty.dispatch(writer::openScaleByDistanceProperty));
            Optional.ofNullable(getShow()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openShowProperty));
            Optional.ofNullable(getSizeInMeters()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openSizeInMetersProperty));
            Optional.ofNullable(getTranslucencyByDistance()).ifPresent(nearFarScalarProperty -> nearFarScalarProperty.dispatch(writer::openTranslucencyByDistanceProperty));
            Optional.ofNullable(getVerticalOrigin()).ifPresent(verticalOriginProperty -> verticalOriginProperty.dispatch(writer::openVerticalOriginProperty));
            Optional.ofNullable(getWidth()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openWidthProperty));
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
        }
    }

    @Override
    public AlignedAxisProperty getAlignedAxis() {
        return alignedAxis;
    }

    public void setAlignedAxis(AlignedAxisProperty alignedAxis) {
        this.alignedAxis = alignedAxis;
    }

    @Override
    public ColorProperty getColor() {
        return color;
    }

    public void setColor(ColorProperty color) {
        this.color = color;
    }

    @Override
    public DoubleProperty getDisabledDepthTestDistance() {
        return disabledDepthTestDistance;
    }

    public void setDisabledDepthTestDistance(DoubleProperty disabledDepthTestDistance) {
        this.disabledDepthTestDistance = disabledDepthTestDistance;
    }

    @Override
    public DistanceDisplayConditionProperty getDistanceDisplayCondition() {
        return distanceDisplayCondition;
    }

    public void setDistanceDisplayCondition(DistanceDisplayConditionProperty distanceDisplayCondition) {
        this.distanceDisplayCondition = distanceDisplayCondition;
    }

    @Override
    public EyeOffsetProperty getEyeOffset() {
        return eyeOffset;
    }

    public void setEyeOffset(EyeOffsetProperty eyeOffset) {
        this.eyeOffset = eyeOffset;
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
    public HorizontalOriginProperty getHorizontalOrigin() {
        return horizontalOrigin;
    }

    public void setHorizontalOrigin(HorizontalOriginProperty horizontalOrigin) {
        this.horizontalOrigin = horizontalOrigin;
    }

    @Override
    public UriProperty getImage() {
        return image;
    }

    public void setImage(UriProperty image) {
        this.image = image;
    }

    @Override
    public BoundingRectangleProperty getImageSubRegion() {
        return imageSubRegion;
    }

    public void setImageSubRegion(BoundingRectangleProperty imageSubRegion) {
        this.imageSubRegion = imageSubRegion;
    }

    @Override
    public PixelOffsetProperty getPixelOffset() {
        return pixelOffset;
    }

    public void setPixelOffset(PixelOffsetProperty pixelOffset) {
        this.pixelOffset = pixelOffset;
    }

    @Override
    public NearFarScalarProperty getPixelOffsetScaleByDistance() {
        return pixelOffsetScaleByDistance;
    }

    public void setPixelOffsetScaleByDistance(NearFarScalarProperty pixelOffsetScaleByDistance) {
        this.pixelOffsetScaleByDistance = pixelOffsetScaleByDistance;
    }

    @Override
    public DoubleProperty getRotation() {
        return rotation;
    }

    public void setRotation(DoubleProperty rotation) {
        this.rotation = rotation;
    }

    @Override
    public DoubleProperty getScale() {
        return scale;
    }

    public void setScale(DoubleProperty scale) {
        this.scale = scale;
    }

    @Override
    public NearFarScalarProperty getScaleByDistance() {
        return scaleByDistance;
    }

    public void setScaleByDistance(NearFarScalarProperty scaleByDistance) {
        this.scaleByDistance = scaleByDistance;
    }

    @Override
    public BooleanProperty getSizeInMeters() {
        return sizeInMeters;
    }

    public void setSizeInMeters(BooleanProperty sizeInMeters) {
        this.sizeInMeters = sizeInMeters;
    }

    @Override
    public NearFarScalarProperty getTranslucencyByDistance() {
        return translucencyByDistance;
    }

    public void setTranslucencyByDistance(NearFarScalarProperty translucencyByDistance) {
        this.translucencyByDistance = translucencyByDistance;
    }

    @Override
    public VerticalOriginProperty getVerticalOrigin() {
        return verticalOrigin;
    }

    public void setVerticalOrigin(VerticalOriginProperty verticalOrigin) {
        this.verticalOrigin = verticalOrigin;
    }

    @Override
    public DoubleProperty getWidth() {
        return width;
    }

    public void setWidth(DoubleProperty width) {
        this.width = width;
    }

    public static final class Builder {
        private AlignedAxisProperty alignedAxis;
        private ColorProperty color;
        private DoubleProperty disabledDepthTestDistance;
        private DistanceDisplayConditionProperty distanceDisplayCondition;
        private EyeOffsetProperty eyeOffset;
        private DoubleProperty height;
        private HeightReferenceProperty heightReference;
        private HorizontalOriginProperty horizontalOrigin;
        private UriProperty image;
        private BoundingRectangleProperty imageSubRegion;
        private PixelOffsetProperty pixelOffset;
        private NearFarScalarProperty pixelOffsetScaleByDistance;
        private DoubleProperty rotation;
        private DoubleProperty scale;
        private NearFarScalarProperty scaleByDistance;
        private BooleanProperty show;
        private BooleanProperty sizeInMeters;
        private NearFarScalarProperty translucencyByDistance;
        private VerticalOriginProperty verticalOrigin;
        private DoubleProperty width;

        private TimeInterval interval;
        private List<BillboardGraphics> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withAlignedAxis(AlignedAxisProperty alignedAxis) {
            this.alignedAxis = alignedAxis;
            return this;
        }

        public Builder withColor(ColorProperty color) {
            this.color = color;
            return this;
        }

        public Builder withDisabledDepthTestDistance(DoubleProperty disabledDepthTestDistance) {
            this.disabledDepthTestDistance = disabledDepthTestDistance;
            return this;
        }

        public Builder withDistanceDisplayCondition(DistanceDisplayConditionProperty distanceDisplayCondition) {
            this.distanceDisplayCondition = distanceDisplayCondition;
            return this;
        }

        public Builder withEyeOffset(EyeOffsetProperty eyeOffset) {
            this.eyeOffset = eyeOffset;
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

        public Builder withHorizontalOrigin(HorizontalOriginProperty horizontalOrigin) {
            this.horizontalOrigin = horizontalOrigin;
            return this;
        }

        public Builder withImage(UriProperty image) {
            this.image = image;
            return this;
        }

        public Builder withImageSubRegion(BoundingRectangleProperty imageSubRegion) {
            this.imageSubRegion = imageSubRegion;
            return this;
        }

        public Builder withPixelOffset(PixelOffsetProperty pixelOffset) {
            this.pixelOffset = pixelOffset;
            return this;
        }

        public Builder withPixelOffsetScaleByDistance(NearFarScalarProperty pixelOffsetScaleByDistance) {
            this.pixelOffsetScaleByDistance = pixelOffsetScaleByDistance;
            return this;
        }

        public Builder withRotation(DoubleProperty rotation) {
            this.rotation = rotation;
            return this;
        }

        public Builder withScale(DoubleProperty scale) {
            this.scale = scale;
            return this;
        }

        public Builder withScaleByDistance(NearFarScalarProperty scaleByDistance) {
            this.scaleByDistance = scaleByDistance;
            return this;
        }

        public Builder withSizeInMeters(BooleanProperty sizeInMeters) {
            this.sizeInMeters = sizeInMeters;
            return this;
        }

        public Builder withTranslucencyByDistance(NearFarScalarProperty translucencyByDistance) {
            this.translucencyByDistance = translucencyByDistance;
            return this;
        }

        public Builder withVerticalOrigin(VerticalOriginProperty verticalOrigin) {
            this.verticalOrigin = verticalOrigin;
            return this;
        }

        public Builder withWidth(DoubleProperty width) {
            this.width = width;
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

        public Builder withIntervals(List<BillboardGraphics> intervals) {
            this.intervals = intervals;
            return this;
        }

        public BillboardGraphicsAdapter build() {
            BillboardGraphicsAdapter billboardGraphicsAdapter = new BillboardGraphicsAdapter();
            billboardGraphicsAdapter.setAlignedAxis(alignedAxis);
            billboardGraphicsAdapter.setColor(color);
            billboardGraphicsAdapter.setDisabledDepthTestDistance(disabledDepthTestDistance);
            billboardGraphicsAdapter.setDistanceDisplayCondition(distanceDisplayCondition);
            billboardGraphicsAdapter.setEyeOffset(eyeOffset);
            billboardGraphicsAdapter.setHeight(height);
            billboardGraphicsAdapter.setHeightReference(heightReference);
            billboardGraphicsAdapter.setHorizontalOrigin(horizontalOrigin);
            billboardGraphicsAdapter.setImage(image);
            billboardGraphicsAdapter.setImageSubRegion(imageSubRegion);
            billboardGraphicsAdapter.setPixelOffset(pixelOffset);
            billboardGraphicsAdapter.setPixelOffsetScaleByDistance(pixelOffsetScaleByDistance);
            billboardGraphicsAdapter.setRotation(rotation);
            billboardGraphicsAdapter.setScale(scale);
            billboardGraphicsAdapter.setScaleByDistance(scaleByDistance);
            billboardGraphicsAdapter.setSizeInMeters(sizeInMeters);
            billboardGraphicsAdapter.setTranslucencyByDistance(translucencyByDistance);
            billboardGraphicsAdapter.setVerticalOrigin(verticalOrigin);
            billboardGraphicsAdapter.setWidth(width);
            billboardGraphicsAdapter.setShow(show);
            billboardGraphicsAdapter.setInterval(interval);
            billboardGraphicsAdapter.setIntervals(intervals);
            return billboardGraphicsAdapter;
        }
    }
}
