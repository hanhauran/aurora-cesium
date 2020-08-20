package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import aurora.cesium.language.writer.BillboardCesiumWriter;
import aurora.cesium.language.writer.Reference;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class BillboardGraphicsAdapter extends GraphicsAdapter implements BillboardGraphics {

    private AlignedAxisProperty alignedAxis;

    private Reference alignedAxisRef;

    private ColorProperty color;

    private Reference colorRef;

    private DoubleProperty disabledDepthTestDistance;

    private Reference disabledDepthTestDistanceRef;

    private DistanceDisplayConditionProperty distanceDisplayCondition;

    private Reference distanceDisplayConditionRef;

    private EyeOffsetProperty eyeOffset;

    private Reference eyeOffsetRef;

    private DoubleProperty height;

    private Reference heightRef;

    private HeightReferenceProperty heightReference;

    private Reference heightReferenceRef;

    private HorizontalOriginProperty horizontalOrigin;

    private Reference horizontalOriginRef;

    private ResourceProperty image;

    private Reference imageRef;

    private BoundingRectangleProperty imageSubRegion;

    private Reference imageSubRegionRef;

    private PixelOffsetProperty pixelOffset;

    private Reference pixelOffsetRef;

    private NearFarScalarProperty pixelOffsetScaleByDistance;

    private Reference pixelOffsetScaleByDistanceRef;

    private DoubleProperty rotation;

    private Reference rotationRef;

    private DoubleProperty scale;

    private Reference scaleRef;

    private NearFarScalarProperty scaleByDistance;

    private Reference scaleByDistanceRef;

    private BooleanProperty sizeInMeters;

    private Reference sizeInMetersRef;

    private NearFarScalarProperty translucencyByDistance;

    private Reference translucencyByDistanceRef;

    private VerticalOriginProperty verticalOrigin;

    private Reference verticalOriginRef;

    private DoubleProperty width;

    private Reference widthRef;

    @Override
    public void dispatchBillboard(BillboardCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getAlignedAxis()).ifPresent(alignedAxisProperty -> alignedAxisProperty.dispatchAlignedAxis(writer.openAlignedAxisProperty()));
            Optional.ofNullable(getAlignedAxisRef()).ifPresent(writer::writeAlignedAxisPropertyReference);
            Optional.ofNullable(getColor()).ifPresent(colorProperty -> colorProperty.dispatchColor(writer.openColorProperty()));
            Optional.ofNullable(getColorRef()).ifPresent(writer::writeColorPropertyReference);
            Optional.ofNullable(getDisabledDepthTestDistance()).ifPresent(doubleProperty -> doubleProperty.dispatchDouble(writer.openDisableDepthTestDistanceProperty()));
            Optional.ofNullable(getDisabledDepthTestDistanceRef()).ifPresent(writer::writeDisableDepthTestDistancePropertyReference);
            Optional.ofNullable(getDistanceDisplayCondition()).ifPresent(distanceDisplayConditionProperty -> distanceDisplayConditionProperty.dispatchDistanceDisplayCondition(writer.openDistanceDisplayConditionProperty()));
            Optional.ofNullable(getDistanceDisplayConditionRef()).ifPresent(writer::writeDistanceDisplayConditionPropertyReference);
            Optional.ofNullable(getEyeOffset()).ifPresent(eyeOffsetProperty -> eyeOffsetProperty.dispatchEyeOffset(writer.openEyeOffsetProperty()));
            Optional.ofNullable(getEyeOffsetRef()).ifPresent(writer::writeEyeOffsetPropertyReference);
            Optional.ofNullable(getHeight()).ifPresent(doubleProperty -> doubleProperty.dispatchDouble(writer.openHeightProperty()));
            Optional.ofNullable(getHeightRef()).ifPresent(writer::writeHeightPropertyReference);
            Optional.ofNullable(getHeightReference()).ifPresent(heightReferenceProperty -> heightReferenceProperty.dispatchHeightReference(writer.openHeightReferenceProperty()));
            Optional.ofNullable(getHeightReferenceRef()).ifPresent(writer::writeHeightReferencePropertyReference);
            Optional.ofNullable(getHorizontalOrigin()).ifPresent(horizontalOriginProperty -> horizontalOriginProperty.dispatchHorizontalOrigin(writer.openHorizontalOriginProperty()));
            Optional.ofNullable(getHorizontalOriginRef()).ifPresent(writer::writeHorizontalOriginPropertyReference);
            Optional.ofNullable(getImage()).ifPresent(resourceProperty -> resourceProperty.dispatchUri(writer.openImageProperty()));
            Optional.ofNullable(getImageRef()).ifPresent(writer::writeImagePropertyReference);
            Optional.ofNullable(getImageSubRegion()).ifPresent(boundingRectangleProperty -> boundingRectangleProperty.dispatchBoundingRectangle(writer.openImageSubRegionProperty()));
            Optional.ofNullable(getImageSubRegionRef()).ifPresent(writer::writeImageSubRegionPropertyReference);
            Optional.ofNullable(getPixelOffset()).ifPresent(pixelOffsetProperty -> pixelOffsetProperty.dispatchPixelOffset(writer.openPixelOffsetProperty()));
            Optional.ofNullable(getPixelOffsetRef()).ifPresent(writer::writePixelOffsetPropertyReference);
            Optional.ofNullable(getPixelOffsetScaleByDistance()).ifPresent(nearFarScalarProperty -> nearFarScalarProperty.dispatchNearFarScalar(writer.openPixelOffsetScaleByDistanceProperty()));
            Optional.ofNullable(getPixelOffsetScaleByDistanceRef()).ifPresent(writer::writePixelOffsetScaleByDistancePropertyReference);
            Optional.ofNullable(getRotation()).ifPresent(doubleProperty -> doubleProperty.dispatchDouble(writer.openRotationProperty()));
            Optional.ofNullable(getRotationRef()).ifPresent(writer::writeRotationPropertyReference);
            Optional.ofNullable(getScale()).ifPresent(doubleProperty -> doubleProperty.dispatchDouble(writer.openScaleProperty()));
            Optional.ofNullable(getScaleRef()).ifPresent(writer::writeScalePropertyReference);
            Optional.ofNullable(getScaleByDistance()).ifPresent(nearFarScalarProperty -> nearFarScalarProperty.dispatchNearFarScalar(writer.openScaleByDistanceProperty()));
            Optional.ofNullable(getScaleByDistanceRef()).ifPresent(writer::writeScaleByDistancePropertyReference);
            Optional.ofNullable(getShow()).ifPresent(booleanProperty -> booleanProperty.dispatchBoolean(writer.openShowProperty()));
            Optional.ofNullable(getShowRef()).ifPresent(writer::writeShowPropertyReference);
            Optional.ofNullable(getSizeInMeters()).ifPresent(booleanProperty -> booleanProperty.dispatchBoolean(writer.openSizeInMetersProperty()));
            Optional.ofNullable(getSizeInMetersRef()).ifPresent(writer::writeSizeInMetersPropertyReference);
            Optional.ofNullable(getTranslucencyByDistance()).ifPresent(nearFarScalarProperty -> nearFarScalarProperty.dispatchNearFarScalar(writer.openTranslucencyByDistanceProperty()));
            Optional.ofNullable(getTranslucencyByDistanceRef()).ifPresent(writer::writeTranslucencyByDistancePropertyReference);
            Optional.ofNullable(getVerticalOrigin()).ifPresent(verticalOriginProperty -> verticalOriginProperty.dispatchVerticalOrigin(writer.openVerticalOriginProperty()));
            Optional.ofNullable(getVerticalOriginRef()).ifPresent(writer::writeVerticalOriginPropertyReference);
            Optional.ofNullable(getWidth()).ifPresent(doubleProperty -> doubleProperty.dispatchDouble(writer.openWidthProperty()));
            Optional.ofNullable(getWidthRef()).ifPresent(writer::writeWidthPropertyReference);
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
    public Reference getAlignedAxisRef() {
        return alignedAxisRef;
    }

    public void setAlignedAxisRef(Reference alignedAxisRef) {
        this.alignedAxisRef = alignedAxisRef;
    }

    @Override
    public ColorProperty getColor() {
        return color;
    }

    public void setColor(ColorProperty color) {
        this.color = color;
    }

    @Override
    public Reference getColorRef() {
        return colorRef;
    }

    public void setColorRef(Reference colorRef) {
        this.colorRef = colorRef;
    }

    @Override
    public DoubleProperty getDisabledDepthTestDistance() {
        return disabledDepthTestDistance;
    }

    public void setDisabledDepthTestDistance(DoubleProperty disabledDepthTestDistance) {
        this.disabledDepthTestDistance = disabledDepthTestDistance;
    }

    @Override
    public Reference getDisabledDepthTestDistanceRef() {
        return disabledDepthTestDistanceRef;
    }

    public void setDisabledDepthTestDistanceRef(Reference disabledDepthTestDistanceRef) {
        this.disabledDepthTestDistanceRef = disabledDepthTestDistanceRef;
    }

    @Override
    public DistanceDisplayConditionProperty getDistanceDisplayCondition() {
        return distanceDisplayCondition;
    }

    public void setDistanceDisplayCondition(DistanceDisplayConditionProperty distanceDisplayCondition) {
        this.distanceDisplayCondition = distanceDisplayCondition;
    }

    @Override
    public Reference getDistanceDisplayConditionRef() {
        return distanceDisplayConditionRef;
    }

    public void setDistanceDisplayConditionRef(Reference distanceDisplayConditionRef) {
        this.distanceDisplayConditionRef = distanceDisplayConditionRef;
    }

    @Override
    public EyeOffsetProperty getEyeOffset() {
        return eyeOffset;
    }

    public void setEyeOffset(EyeOffsetProperty eyeOffset) {
        this.eyeOffset = eyeOffset;
    }

    @Override
    public Reference getEyeOffsetRef() {
        return eyeOffsetRef;
    }

    public void setEyeOffsetRef(Reference eyeOffsetRef) {
        this.eyeOffsetRef = eyeOffsetRef;
    }

    @Override
    public DoubleProperty getHeight() {
        return height;
    }

    public void setHeight(DoubleProperty height) {
        this.height = height;
    }

    @Override
    public Reference getHeightRef() {
        return heightRef;
    }

    public void setHeightRef(Reference heightRef) {
        this.heightRef = heightRef;
    }

    @Override
    public HeightReferenceProperty getHeightReference() {
        return heightReference;
    }

    public void setHeightReference(HeightReferenceProperty heightReference) {
        this.heightReference = heightReference;
    }

    @Override
    public Reference getHeightReferenceRef() {
        return heightReferenceRef;
    }

    public void setHeightReferenceRef(Reference heightReferenceRef) {
        this.heightReferenceRef = heightReferenceRef;
    }

    @Override
    public HorizontalOriginProperty getHorizontalOrigin() {
        return horizontalOrigin;
    }

    public void setHorizontalOrigin(HorizontalOriginProperty horizontalOrigin) {
        this.horizontalOrigin = horizontalOrigin;
    }

    @Override
    public Reference getHorizontalOriginRef() {
        return horizontalOriginRef;
    }

    public void setHorizontalOriginRef(Reference horizontalOriginRef) {
        this.horizontalOriginRef = horizontalOriginRef;
    }

    @Override
    public ResourceProperty getImage() {
        return image;
    }

    public void setImage(ResourceProperty image) {
        this.image = image;
    }

    @Override
    public Reference getImageRef() {
        return imageRef;
    }

    public void setImageRef(Reference imageRef) {
        this.imageRef = imageRef;
    }

    @Override
    public BoundingRectangleProperty getImageSubRegion() {
        return imageSubRegion;
    }

    public void setImageSubRegion(BoundingRectangleProperty imageSubRegion) {
        this.imageSubRegion = imageSubRegion;
    }

    @Override
    public Reference getImageSubRegionRef() {
        return imageSubRegionRef;
    }

    public void setImageSubRegionRef(Reference imageSubRegionRef) {
        this.imageSubRegionRef = imageSubRegionRef;
    }

    @Override
    public PixelOffsetProperty getPixelOffset() {
        return pixelOffset;
    }

    public void setPixelOffset(PixelOffsetProperty pixelOffset) {
        this.pixelOffset = pixelOffset;
    }

    @Override
    public Reference getPixelOffsetRef() {
        return pixelOffsetRef;
    }

    public void setPixelOffsetRef(Reference pixelOffsetRef) {
        this.pixelOffsetRef = pixelOffsetRef;
    }

    @Override
    public NearFarScalarProperty getPixelOffsetScaleByDistance() {
        return pixelOffsetScaleByDistance;
    }

    public void setPixelOffsetScaleByDistance(NearFarScalarProperty pixelOffsetScaleByDistance) {
        this.pixelOffsetScaleByDistance = pixelOffsetScaleByDistance;
    }

    @Override
    public Reference getPixelOffsetScaleByDistanceRef() {
        return pixelOffsetScaleByDistanceRef;
    }

    public void setPixelOffsetScaleByDistanceRef(Reference pixelOffsetScaleByDistanceRef) {
        this.pixelOffsetScaleByDistanceRef = pixelOffsetScaleByDistanceRef;
    }

    @Override
    public DoubleProperty getRotation() {
        return rotation;
    }

    public void setRotation(DoubleProperty rotation) {
        this.rotation = rotation;
    }

    @Override
    public Reference getRotationRef() {
        return rotationRef;
    }

    public void setRotationRef(Reference rotationRef) {
        this.rotationRef = rotationRef;
    }

    @Override
    public DoubleProperty getScale() {
        return scale;
    }

    public void setScale(DoubleProperty scale) {
        this.scale = scale;
    }

    @Override
    public Reference getScaleRef() {
        return scaleRef;
    }

    public void setScaleRef(Reference scaleRef) {
        this.scaleRef = scaleRef;
    }

    @Override
    public NearFarScalarProperty getScaleByDistance() {
        return scaleByDistance;
    }

    public void setScaleByDistance(NearFarScalarProperty scaleByDistance) {
        this.scaleByDistance = scaleByDistance;
    }

    @Override
    public Reference getScaleByDistanceRef() {
        return scaleByDistanceRef;
    }

    public void setScaleByDistanceRef(Reference scaleByDistanceRef) {
        this.scaleByDistanceRef = scaleByDistanceRef;
    }

    @Override
    public BooleanProperty getSizeInMeters() {
        return sizeInMeters;
    }

    public void setSizeInMeters(BooleanProperty sizeInMeters) {
        this.sizeInMeters = sizeInMeters;
    }

    @Override
    public Reference getSizeInMetersRef() {
        return sizeInMetersRef;
    }

    public void setSizeInMetersRef(Reference sizeInMetersRef) {
        this.sizeInMetersRef = sizeInMetersRef;
    }

    @Override
    public NearFarScalarProperty getTranslucencyByDistance() {
        return translucencyByDistance;
    }

    public void setTranslucencyByDistance(NearFarScalarProperty translucencyByDistance) {
        this.translucencyByDistance = translucencyByDistance;
    }

    @Override
    public Reference getTranslucencyByDistanceRef() {
        return translucencyByDistanceRef;
    }

    public void setTranslucencyByDistanceRef(Reference translucencyByDistanceRef) {
        this.translucencyByDistanceRef = translucencyByDistanceRef;
    }

    @Override
    public VerticalOriginProperty getVerticalOrigin() {
        return verticalOrigin;
    }

    public void setVerticalOrigin(VerticalOriginProperty verticalOrigin) {
        this.verticalOrigin = verticalOrigin;
    }

    @Override
    public Reference getVerticalOriginRef() {
        return verticalOriginRef;
    }

    public void setVerticalOriginRef(Reference verticalOriginRef) {
        this.verticalOriginRef = verticalOriginRef;
    }

    @Override
    public DoubleProperty getWidth() {
        return width;
    }

    public void setWidth(DoubleProperty width) {
        this.width = width;
    }

    @Override
    public Reference getWidthRef() {
        return widthRef;
    }

    public void setWidthRef(Reference widthRef) {
        this.widthRef = widthRef;
    }

    public static final class Builder {
        protected BooleanProperty show;
        protected Reference showRef;
        private AlignedAxisProperty alignedAxis;
        private Reference alignedAxisRef;
        private ColorProperty color;
        private Reference colorRef;
        private DoubleProperty disabledDepthTestDistance;
        private Reference disabledDepthTestDistanceRef;
        private DistanceDisplayConditionProperty distanceDisplayCondition;
        private Reference distanceDisplayConditionRef;
        private EyeOffsetProperty eyeOffset;
        private Reference eyeOffsetRef;
        private DoubleProperty height;
        private Reference heightRef;
        private HeightReferenceProperty heightReference;
        private Reference heightReferenceRef;
        private HorizontalOriginProperty horizontalOrigin;
        private Reference horizontalOriginRef;
        private ResourceProperty image;
        private Reference imageRef;
        private BoundingRectangleProperty imageSubRegion;
        private Reference imageSubRegionRef;
        private PixelOffsetProperty pixelOffset;
        private Reference pixelOffsetRef;
        private NearFarScalarProperty pixelOffsetScaleByDistance;
        private Reference pixelOffsetScaleByDistanceRef;
        private DoubleProperty rotation;
        private Reference rotationRef;
        private DoubleProperty scale;
        private Reference scaleRef;
        private NearFarScalarProperty scaleByDistance;
        private Reference scaleByDistanceRef;
        private BooleanProperty sizeInMeters;
        private Reference sizeInMetersRef;
        private NearFarScalarProperty translucencyByDistance;
        private Reference translucencyByDistanceRef;
        private VerticalOriginProperty verticalOrigin;
        private Reference verticalOriginRef;
        private DoubleProperty width;
        private Reference widthRef;

        private Builder() {
        }

        public static Builder aBillboardGraphicsAdapter() {
            return new Builder();
        }

        public Builder withAlignedAxis(AlignedAxisProperty alignedAxis) {
            this.alignedAxis = alignedAxis;
            return this;
        }

        public Builder withAlignedAxisRef(Reference alignedAxisRef) {
            this.alignedAxisRef = alignedAxisRef;
            return this;
        }

        public Builder withColor(ColorProperty color) {
            this.color = color;
            return this;
        }

        public Builder withColorRef(Reference colorRef) {
            this.colorRef = colorRef;
            return this;
        }

        public Builder withDisabledDepthTestDistance(DoubleProperty disabledDepthTestDistance) {
            this.disabledDepthTestDistance = disabledDepthTestDistance;
            return this;
        }

        public Builder withDisabledDepthTestDistanceRef(Reference disabledDepthTestDistanceRef) {
            this.disabledDepthTestDistanceRef = disabledDepthTestDistanceRef;
            return this;
        }

        public Builder withDistanceDisplayCondition(DistanceDisplayConditionProperty distanceDisplayCondition) {
            this.distanceDisplayCondition = distanceDisplayCondition;
            return this;
        }

        public Builder withDistanceDisplayConditionRef(Reference distanceDisplayConditionRef) {
            this.distanceDisplayConditionRef = distanceDisplayConditionRef;
            return this;
        }

        public Builder withEyeOffset(EyeOffsetProperty eyeOffset) {
            this.eyeOffset = eyeOffset;
            return this;
        }

        public Builder withEyeOffsetRef(Reference eyeOffsetRef) {
            this.eyeOffsetRef = eyeOffsetRef;
            return this;
        }

        public Builder withHeight(DoubleProperty height) {
            this.height = height;
            return this;
        }

        public Builder withHeightRef(Reference heightRef) {
            this.heightRef = heightRef;
            return this;
        }

        public Builder withHeightReference(HeightReferenceProperty heightReference) {
            this.heightReference = heightReference;
            return this;
        }

        public Builder withHeightReferenceRef(Reference heightReferenceRef) {
            this.heightReferenceRef = heightReferenceRef;
            return this;
        }

        public Builder withHorizontalOrigin(HorizontalOriginProperty horizontalOrigin) {
            this.horizontalOrigin = horizontalOrigin;
            return this;
        }

        public Builder withHorizontalOriginRef(Reference horizontalOriginRef) {
            this.horizontalOriginRef = horizontalOriginRef;
            return this;
        }

        public Builder withImage(ResourceProperty image) {
            this.image = image;
            return this;
        }

        public Builder withImageRef(Reference imageRef) {
            this.imageRef = imageRef;
            return this;
        }

        public Builder withImageSubRegion(BoundingRectangleProperty imageSubRegion) {
            this.imageSubRegion = imageSubRegion;
            return this;
        }

        public Builder withImageSubRegionRef(Reference imageSubRegionRef) {
            this.imageSubRegionRef = imageSubRegionRef;
            return this;
        }

        public Builder withPixelOffset(PixelOffsetProperty pixelOffset) {
            this.pixelOffset = pixelOffset;
            return this;
        }

        public Builder withPixelOffsetRef(Reference pixelOffsetRef) {
            this.pixelOffsetRef = pixelOffsetRef;
            return this;
        }

        public Builder withPixelOffsetScaleByDistance(NearFarScalarProperty pixelOffsetScaleByDistance) {
            this.pixelOffsetScaleByDistance = pixelOffsetScaleByDistance;
            return this;
        }

        public Builder withPixelOffsetScaleByDistanceRef(Reference pixelOffsetScaleByDistanceRef) {
            this.pixelOffsetScaleByDistanceRef = pixelOffsetScaleByDistanceRef;
            return this;
        }

        public Builder withRotation(DoubleProperty rotation) {
            this.rotation = rotation;
            return this;
        }

        public Builder withRotationRef(Reference rotationRef) {
            this.rotationRef = rotationRef;
            return this;
        }

        public Builder withScale(DoubleProperty scale) {
            this.scale = scale;
            return this;
        }

        public Builder withScaleRef(Reference scaleRef) {
            this.scaleRef = scaleRef;
            return this;
        }

        public Builder withScaleByDistance(NearFarScalarProperty scaleByDistance) {
            this.scaleByDistance = scaleByDistance;
            return this;
        }

        public Builder withScaleByDistanceRef(Reference scaleByDistanceRef) {
            this.scaleByDistanceRef = scaleByDistanceRef;
            return this;
        }

        public Builder withSizeInMeters(BooleanProperty sizeInMeters) {
            this.sizeInMeters = sizeInMeters;
            return this;
        }

        public Builder withSizeInMetersRef(Reference sizeInMetersRef) {
            this.sizeInMetersRef = sizeInMetersRef;
            return this;
        }

        public Builder withTranslucencyByDistance(NearFarScalarProperty translucencyByDistance) {
            this.translucencyByDistance = translucencyByDistance;
            return this;
        }

        public Builder withTranslucencyByDistanceRef(Reference translucencyByDistanceRef) {
            this.translucencyByDistanceRef = translucencyByDistanceRef;
            return this;
        }

        public Builder withVerticalOrigin(VerticalOriginProperty verticalOrigin) {
            this.verticalOrigin = verticalOrigin;
            return this;
        }

        public Builder withVerticalOriginRef(Reference verticalOriginRef) {
            this.verticalOriginRef = verticalOriginRef;
            return this;
        }

        public Builder withWidth(DoubleProperty width) {
            this.width = width;
            return this;
        }

        public Builder withWidthRef(Reference widthRef) {
            this.widthRef = widthRef;
            return this;
        }

        public Builder withShow(BooleanProperty show) {
            this.show = show;
            return this;
        }

        public Builder withShowRef(Reference showRef) {
            this.showRef = showRef;
            return this;
        }

        public BillboardGraphicsAdapter build() {
            BillboardGraphicsAdapter billboardGraphicsAdapter = new BillboardGraphicsAdapter();
            billboardGraphicsAdapter.setAlignedAxis(alignedAxis);
            billboardGraphicsAdapter.setAlignedAxisRef(alignedAxisRef);
            billboardGraphicsAdapter.setColor(color);
            billboardGraphicsAdapter.setColorRef(colorRef);
            billboardGraphicsAdapter.setDisabledDepthTestDistance(disabledDepthTestDistance);
            billboardGraphicsAdapter.setDisabledDepthTestDistanceRef(disabledDepthTestDistanceRef);
            billboardGraphicsAdapter.setDistanceDisplayCondition(distanceDisplayCondition);
            billboardGraphicsAdapter.setDistanceDisplayConditionRef(distanceDisplayConditionRef);
            billboardGraphicsAdapter.setEyeOffset(eyeOffset);
            billboardGraphicsAdapter.setEyeOffsetRef(eyeOffsetRef);
            billboardGraphicsAdapter.setHeight(height);
            billboardGraphicsAdapter.setHeightRef(heightRef);
            billboardGraphicsAdapter.setHeightReference(heightReference);
            billboardGraphicsAdapter.setHeightReferenceRef(heightReferenceRef);
            billboardGraphicsAdapter.setHorizontalOrigin(horizontalOrigin);
            billboardGraphicsAdapter.setHorizontalOriginRef(horizontalOriginRef);
            billboardGraphicsAdapter.setImage(image);
            billboardGraphicsAdapter.setImageRef(imageRef);
            billboardGraphicsAdapter.setImageSubRegion(imageSubRegion);
            billboardGraphicsAdapter.setImageSubRegionRef(imageSubRegionRef);
            billboardGraphicsAdapter.setPixelOffset(pixelOffset);
            billboardGraphicsAdapter.setPixelOffsetRef(pixelOffsetRef);
            billboardGraphicsAdapter.setPixelOffsetScaleByDistance(pixelOffsetScaleByDistance);
            billboardGraphicsAdapter.setPixelOffsetScaleByDistanceRef(pixelOffsetScaleByDistanceRef);
            billboardGraphicsAdapter.setRotation(rotation);
            billboardGraphicsAdapter.setRotationRef(rotationRef);
            billboardGraphicsAdapter.setScale(scale);
            billboardGraphicsAdapter.setScaleRef(scaleRef);
            billboardGraphicsAdapter.setScaleByDistance(scaleByDistance);
            billboardGraphicsAdapter.setScaleByDistanceRef(scaleByDistanceRef);
            billboardGraphicsAdapter.setSizeInMeters(sizeInMeters);
            billboardGraphicsAdapter.setSizeInMetersRef(sizeInMetersRef);
            billboardGraphicsAdapter.setTranslucencyByDistance(translucencyByDistance);
            billboardGraphicsAdapter.setTranslucencyByDistanceRef(translucencyByDistanceRef);
            billboardGraphicsAdapter.setVerticalOrigin(verticalOrigin);
            billboardGraphicsAdapter.setVerticalOriginRef(verticalOriginRef);
            billboardGraphicsAdapter.setWidth(width);
            billboardGraphicsAdapter.setWidthRef(widthRef);
            billboardGraphicsAdapter.setShow(show);
            billboardGraphicsAdapter.setShowRef(showRef);
            return billboardGraphicsAdapter;
        }
    }
}
