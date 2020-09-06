package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.BoxCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
class BoxGraphicsAdapter extends GraphicsAdapter<BoxGraphics, BoxCesiumWriter> implements BoxGraphics {

    private BoxDimensionsProperty dimensions;

    private DistanceDisplayConditionProperty distanceDisplayCondition;

    private BooleanProperty fill;

    private HeightReferenceProperty heightReference;

    private MaterialProperty material;

    private BooleanProperty outline;

    private ColorProperty outlineColor;

    private DoubleProperty outlineWidth;

    private ShadowModeProperty shadows;

    @Override
    public void dispatch(Supplier<BoxCesiumWriter> supplier) {
        try (BoxCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getDimensions()).ifPresent(boxDimensionsProperty -> boxDimensionsProperty.dispatch(writer::openDimensionsProperty));
            Optional.ofNullable(getDistanceDisplayCondition()).ifPresent(distanceDisplayConditionProperty -> distanceDisplayConditionProperty.dispatch(writer::openDistanceDisplayConditionProperty));
            Optional.ofNullable(getFill()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openFillProperty));
            Optional.ofNullable(getHeightReference()).ifPresent(heightReferenceProperty -> heightReferenceProperty.dispatch(writer::openHeightReferenceProperty));
            Optional.ofNullable(getMaterial()).ifPresent(materialProperty -> materialProperty.dispatch(writer::openMaterialProperty));
            Optional.ofNullable(getOutline()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openOutlineProperty));
            Optional.ofNullable(getOutlineColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openOutlineColorProperty));
            Optional.ofNullable(getOutlineWidth()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openOutlineWidthProperty));
            Optional.ofNullable(getShadows()).ifPresent(shadowModeProperty -> shadowModeProperty.dispatch(writer::openShadowsProperty));
            Optional.ofNullable(getShow()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openShowProperty));
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
        }
    }

    @Override
    public BoxDimensionsProperty getDimensions() {
        return dimensions;
    }

    public void setDimensions(BoxDimensionsProperty dimensions) {
        this.dimensions = dimensions;
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
    public ShadowModeProperty getShadows() {
        return shadows;
    }

    public void setShadows(ShadowModeProperty shadows) {
        this.shadows = shadows;
    }


    public static final class Builder {
        private BoxDimensionsProperty dimensions;
        private DistanceDisplayConditionProperty distanceDisplayCondition;
        private BooleanProperty fill;
        private HeightReferenceProperty heightReference;
        private MaterialProperty material;
        private BooleanProperty show;
        private BooleanProperty outline;
        private ColorProperty outlineColor;
        private DoubleProperty outlineWidth;
        private ShadowModeProperty shadows;

        private TimeInterval interval;
        private List<BoxGraphics> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withDimensions(BoxDimensionsProperty dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder withDistanceDisplayCondition(DistanceDisplayConditionProperty distanceDisplayCondition) {
            this.distanceDisplayCondition = distanceDisplayCondition;
            return this;
        }

        public Builder withFill(BooleanProperty fill) {
            this.fill = fill;
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

        public Builder withIntervals(List<BoxGraphics> intervals) {
            this.intervals = intervals;
            return this;
        }

        public BoxGraphicsAdapter build() {
            BoxGraphicsAdapter boxGraphicsAdapter = new BoxGraphicsAdapter();
            boxGraphicsAdapter.setDimensions(dimensions);
            boxGraphicsAdapter.setDistanceDisplayCondition(distanceDisplayCondition);
            boxGraphicsAdapter.setFill(fill);
            boxGraphicsAdapter.setHeightReference(heightReference);
            boxGraphicsAdapter.setMaterial(material);
            boxGraphicsAdapter.setOutline(outline);
            boxGraphicsAdapter.setOutlineColor(outlineColor);
            boxGraphicsAdapter.setOutlineWidth(outlineWidth);
            boxGraphicsAdapter.setShadows(shadows);
            boxGraphicsAdapter.setShow(show);
            boxGraphicsAdapter.setInterval(interval);
            boxGraphicsAdapter.setIntervals(intervals);
            return boxGraphicsAdapter;
        }
    }
}
