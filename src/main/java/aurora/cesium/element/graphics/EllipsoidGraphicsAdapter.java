package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.EllipsoidCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
class EllipsoidGraphicsAdapter extends GraphicsAdapter<EllipsoidGraphics, EllipsoidCesiumWriter> implements EllipsoidGraphics {

    private DistanceDisplayConditionProperty distanceDisplayCondition;

    private BooleanProperty fill;

    private HeightReferenceProperty heightReference;

    private EllipsoidRadiiProperty innerRadii;

    private MaterialProperty material;

    private DoubleProperty maximumClock;

    private DoubleProperty maximumCone;

    private DoubleProperty minimumClock;

    private DoubleProperty minimumCone;

    private BooleanProperty outline;

    private ColorProperty outlineColor;

    private DoubleProperty outlineWidth;

    private EllipsoidRadiiProperty radii;

    private ShadowModeProperty shadows;

    private IntegerProperty slicePartitions;

    private IntegerProperty stackPartitions;

    private IntegerProperty subDivisions;

    @Override
    public void dispatch(Supplier<EllipsoidCesiumWriter> supplier) {
        try (EllipsoidCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getDistanceDisplayCondition()).ifPresent(distanceDisplayConditionProperty -> distanceDisplayConditionProperty.dispatch(writer::openDistanceDisplayConditionProperty));
            Optional.ofNullable(getFill()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openFillProperty));
            Optional.ofNullable(getHeightReference()).ifPresent(heightReferenceProperty -> heightReferenceProperty.dispatch(writer::openHeightReferenceProperty));
            Optional.ofNullable(getInnerRadii()).ifPresent(ellipsoidRadiiProperty -> ellipsoidRadiiProperty.dispatch(writer::openInnerRadiiProperty));
            Optional.ofNullable(getMaterial()).ifPresent(materialProperty -> materialProperty.dispatch(writer::openMaterialProperty));
            Optional.ofNullable(getMaximumClock()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openMaximumClockProperty));
            Optional.ofNullable(getMaximumCone()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openMaximumConeProperty));
            Optional.ofNullable(getMinimumClock()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openMinimumClockProperty));
            Optional.ofNullable(getMinimumCone()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openMinimumConeProperty));
            Optional.ofNullable(getOutline()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openOutlineProperty));
            Optional.ofNullable(getOutlineColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openOutlineColorProperty));
            Optional.ofNullable(getOutlineWidth()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openOutlineWidthProperty));
            Optional.ofNullable(getRadii()).ifPresent(ellipsoidRadiiProperty -> ellipsoidRadiiProperty.dispatch(writer::openRadiiProperty));
            Optional.ofNullable(getShadows()).ifPresent(shadowModeProperty -> shadowModeProperty.dispatch(writer::openShadowsProperty));
            Optional.ofNullable(getShow()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openShowProperty));
            Optional.ofNullable(getSlicePartitions()).ifPresent(integerProperty -> integerProperty.dispatch(writer::openSlicePartitionsProperty));
            Optional.ofNullable(getStackPartitions()).ifPresent(integerProperty -> integerProperty.dispatch(writer::openStackPartitionsProperty));
            Optional.ofNullable(getSubDivisions()).ifPresent(integerProperty -> integerProperty.dispatch(writer::openSubdivisionsProperty));
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
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
    public EllipsoidRadiiProperty getInnerRadii() {
        return innerRadii;
    }

    public void setInnerRadii(EllipsoidRadiiProperty innerRadii) {
        this.innerRadii = innerRadii;
    }

    @Override
    public DoubleProperty getMaximumClock() {
        return maximumClock;
    }

    public void setMaximumClock(DoubleProperty maximumClock) {
        this.maximumClock = maximumClock;
    }

    @Override
    public DoubleProperty getMaximumCone() {
        return maximumCone;
    }

    public void setMaximumCone(DoubleProperty maximumCone) {
        this.maximumCone = maximumCone;
    }

    @Override
    public DoubleProperty getMinimumClock() {
        return minimumClock;
    }

    public void setMinimumClock(DoubleProperty minimumClock) {
        this.minimumClock = minimumClock;
    }

    @Override
    public DoubleProperty getMinimumCone() {
        return minimumCone;
    }

    public void setMinimumCone(DoubleProperty minimumCone) {
        this.minimumCone = minimumCone;
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
    public EllipsoidRadiiProperty getRadii() {
        return radii;
    }

    public void setRadii(EllipsoidRadiiProperty radii) {
        this.radii = radii;
    }

    @Override
    public ShadowModeProperty getShadows() {
        return shadows;
    }

    public void setShadows(ShadowModeProperty shadows) {
        this.shadows = shadows;
    }

    @Override
    public IntegerProperty getSlicePartitions() {
        return slicePartitions;
    }

    public void setSlicePartitions(IntegerProperty slicePartitions) {
        this.slicePartitions = slicePartitions;
    }

    @Override
    public IntegerProperty getStackPartitions() {
        return stackPartitions;
    }

    public void setStackPartitions(IntegerProperty stackPartitions) {
        this.stackPartitions = stackPartitions;
    }

    @Override
    public IntegerProperty getSubDivisions() {
        return subDivisions;
    }

    public void setSubDivisions(IntegerProperty subDivisions) {
        this.subDivisions = subDivisions;
    }


    public static final class Builder {
        private DistanceDisplayConditionProperty distanceDisplayCondition;
        private BooleanProperty fill;
        private HeightReferenceProperty heightReference;
        private MaterialProperty material;
        private EllipsoidRadiiProperty innerRadii;
        private DoubleProperty maximumClock;
        private DoubleProperty maximumCone;
        private DoubleProperty minimumClock;
        private DoubleProperty minimumCone;
        private BooleanProperty outline;
        private ColorProperty outlineColor;
        private DoubleProperty outlineWidth;
        private EllipsoidRadiiProperty radii;
        private ShadowModeProperty shadows;
        private BooleanProperty show;
        private IntegerProperty slicePartitions;
        private IntegerProperty stackPartitions;
        private IntegerProperty subDivisions;

        private TimeInterval interval;
        private List<EllipsoidGraphics> intervals;

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

        public Builder withHeightReference(HeightReferenceProperty heightReference) {
            this.heightReference = heightReference;
            return this;
        }

        public Builder withMaterial(MaterialProperty material) {
            this.material = material;
            return this;
        }

        public Builder withInnerRadii(EllipsoidRadiiProperty innerRadii) {
            this.innerRadii = innerRadii;
            return this;
        }

        public Builder withMaximumClock(DoubleProperty maximumClock) {
            this.maximumClock = maximumClock;
            return this;
        }

        public Builder withMaximumCone(DoubleProperty maximumCone) {
            this.maximumCone = maximumCone;
            return this;
        }

        public Builder withMinimumClock(DoubleProperty minimumClock) {
            this.minimumClock = minimumClock;
            return this;
        }

        public Builder withMinimumCone(DoubleProperty minimumCone) {
            this.minimumCone = minimumCone;
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

        public Builder withRadii(EllipsoidRadiiProperty radii) {
            this.radii = radii;
            return this;
        }

        public Builder withShadows(ShadowModeProperty shadows) {
            this.shadows = shadows;
            return this;
        }

        public Builder withSlicePartitions(IntegerProperty slicePartitions) {
            this.slicePartitions = slicePartitions;
            return this;
        }

        public Builder withStackPartitions(IntegerProperty stackPartitions) {
            this.stackPartitions = stackPartitions;
            return this;
        }

        public Builder withSubDivisions(IntegerProperty subDivisions) {
            this.subDivisions = subDivisions;
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

        public Builder withIntervals(List<EllipsoidGraphics> intervals) {
            this.intervals = intervals;
            return this;
        }

        public EllipsoidGraphicsAdapter build() {
            EllipsoidGraphicsAdapter ellipsoidGraphicsAdapter = new EllipsoidGraphicsAdapter();
            ellipsoidGraphicsAdapter.setDistanceDisplayCondition(distanceDisplayCondition);
            ellipsoidGraphicsAdapter.setFill(fill);
            ellipsoidGraphicsAdapter.setHeightReference(heightReference);
            ellipsoidGraphicsAdapter.setMaterial(material);
            ellipsoidGraphicsAdapter.setInnerRadii(innerRadii);
            ellipsoidGraphicsAdapter.setMaximumClock(maximumClock);
            ellipsoidGraphicsAdapter.setMaximumCone(maximumCone);
            ellipsoidGraphicsAdapter.setMinimumClock(minimumClock);
            ellipsoidGraphicsAdapter.setMinimumCone(minimumCone);
            ellipsoidGraphicsAdapter.setOutline(outline);
            ellipsoidGraphicsAdapter.setOutlineColor(outlineColor);
            ellipsoidGraphicsAdapter.setOutlineWidth(outlineWidth);
            ellipsoidGraphicsAdapter.setRadii(radii);
            ellipsoidGraphicsAdapter.setShadows(shadows);
            ellipsoidGraphicsAdapter.setSlicePartitions(slicePartitions);
            ellipsoidGraphicsAdapter.setStackPartitions(stackPartitions);
            ellipsoidGraphicsAdapter.setSubDivisions(subDivisions);
            ellipsoidGraphicsAdapter.setShow(show);
            ellipsoidGraphicsAdapter.setInterval(interval);
            ellipsoidGraphicsAdapter.setIntervals(intervals);
            return ellipsoidGraphicsAdapter;
        }
    }
}
