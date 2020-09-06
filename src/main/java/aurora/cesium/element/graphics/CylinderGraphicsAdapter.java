package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.CylinderCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
class CylinderGraphicsAdapter extends GraphicsAdapter<CylinderGraphics, CylinderCesiumWriter> implements CylinderGraphics {

    private DoubleProperty bottomRadius;

    private DistanceDisplayConditionProperty distanceDisplayCondition;

    private BooleanProperty fill;

    private HeightReferenceProperty heightReference;

    private DoubleProperty length;

    private MaterialProperty material;

    private IntegerProperty numberOfVerticalLines;

    private BooleanProperty outline;

    private ColorProperty outlineColor;

    private DoubleProperty outlineWidth;

    private ShadowModeProperty shadows;

    private IntegerProperty slices;

    private DoubleProperty topRadius;

    @Override
    public void dispatch(Supplier<CylinderCesiumWriter> supplier) {
        try (CylinderCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getBottomRadius()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openBottomRadiusProperty));
            Optional.ofNullable(getDistanceDisplayCondition()).ifPresent(distanceDisplayConditionProperty -> distanceDisplayConditionProperty.dispatch(writer::openDistanceDisplayConditionProperty));
            Optional.ofNullable(getFill()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openFillProperty));
            Optional.ofNullable(getHeightReference()).ifPresent(heightReferenceProperty -> heightReferenceProperty.dispatch(writer::openHeightReferenceProperty));
            Optional.ofNullable(getLength()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openLengthProperty));
            Optional.ofNullable(getMaterial()).ifPresent(materialProperty -> materialProperty.dispatch(writer::openMaterialProperty));
            Optional.ofNullable(getNumberOfVerticalLines()).ifPresent(integerProperty -> integerProperty.dispatch(writer::openNumberOfVerticalLinesProperty));
            Optional.ofNullable(getOutline()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openOutlineProperty));
            Optional.ofNullable(getOutlineColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openOutlineColorProperty));
            Optional.ofNullable(getOutlineWidth()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openOutlineWidthProperty));
            Optional.ofNullable(getShadows()).ifPresent(shadowModeProperty -> shadowModeProperty.dispatch(writer::openShadowsProperty));
            Optional.ofNullable(getShow()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openShowProperty));
            Optional.ofNullable(getSlices()).ifPresent(integerProperty -> integerProperty.dispatch(writer::openSlicesProperty));
            Optional.ofNullable(getTopRadius()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openTopRadiusProperty));
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
        }
    }

    @Override
    public DoubleProperty getBottomRadius() {
        return bottomRadius;
    }

    public void setBottomRadius(DoubleProperty bottomRadius) {
        this.bottomRadius = bottomRadius;
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
    public DoubleProperty getLength() {
        return length;
    }

    public void setLength(DoubleProperty length) {
        this.length = length;
    }

    @Override
    public MaterialProperty getMaterial() {
        return material;
    }

    public void setMaterial(MaterialProperty material) {
        this.material = material;
    }

    @Override
    public IntegerProperty getNumberOfVerticalLines() {
        return numberOfVerticalLines;
    }

    public void setNumberOfVerticalLines(IntegerProperty numberOfVerticalLines) {
        this.numberOfVerticalLines = numberOfVerticalLines;
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

    @Override
    public IntegerProperty getSlices() {
        return slices;
    }

    public void setSlices(IntegerProperty slices) {
        this.slices = slices;
    }

    @Override
    public DoubleProperty getTopRadius() {
        return topRadius;
    }

    public void setTopRadius(DoubleProperty topRadius) {
        this.topRadius = topRadius;
    }


    public static final class Builder {
        protected BooleanProperty show;
        private DoubleProperty bottomRadius;
        private DistanceDisplayConditionProperty distanceDisplayCondition;
        private BooleanProperty fill;
        private HeightReferenceProperty heightReference;
        private DoubleProperty length;
        private MaterialProperty material;
        private IntegerProperty numberOfVerticalLines;
        private BooleanProperty outline;
        private ColorProperty outlineColor;
        private DoubleProperty outlineWidth;
        private ShadowModeProperty shadows;
        private IntegerProperty slices;
        private DoubleProperty topRadius;

        private TimeInterval interval;
        private List<CylinderGraphics> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withBottomRadius(DoubleProperty bottomRadius) {
            this.bottomRadius = bottomRadius;
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

        public Builder withLength(DoubleProperty length) {
            this.length = length;
            return this;
        }

        public Builder withMaterial(MaterialProperty material) {
            this.material = material;
            return this;
        }

        public Builder withNumberOfVerticalLines(IntegerProperty numberOfVerticalLines) {
            this.numberOfVerticalLines = numberOfVerticalLines;
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

        public Builder withSlices(IntegerProperty slices) {
            this.slices = slices;
            return this;
        }

        public Builder withTopRadius(DoubleProperty topRadius) {
            this.topRadius = topRadius;
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

        public Builder withIntervals(List<CylinderGraphics> intervals) {
            this.intervals = intervals;
            return this;
        }

        public CylinderGraphicsAdapter build() {
            CylinderGraphicsAdapter cylinderGraphicsAdapter = new CylinderGraphicsAdapter();
            cylinderGraphicsAdapter.setBottomRadius(bottomRadius);
            cylinderGraphicsAdapter.setDistanceDisplayCondition(distanceDisplayCondition);
            cylinderGraphicsAdapter.setFill(fill);
            cylinderGraphicsAdapter.setHeightReference(heightReference);
            cylinderGraphicsAdapter.setLength(length);
            cylinderGraphicsAdapter.setMaterial(material);
            cylinderGraphicsAdapter.setNumberOfVerticalLines(numberOfVerticalLines);
            cylinderGraphicsAdapter.setOutline(outline);
            cylinderGraphicsAdapter.setOutlineColor(outlineColor);
            cylinderGraphicsAdapter.setOutlineWidth(outlineWidth);
            cylinderGraphicsAdapter.setShadows(shadows);
            cylinderGraphicsAdapter.setSlices(slices);
            cylinderGraphicsAdapter.setTopRadius(topRadius);
            cylinderGraphicsAdapter.setShow(show);
            cylinderGraphicsAdapter.setInterval(interval);
            cylinderGraphicsAdapter.setIntervals(intervals);
            return cylinderGraphicsAdapter;
        }
    }
}
