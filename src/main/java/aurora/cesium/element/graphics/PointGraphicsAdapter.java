package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.PointCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
class PointGraphicsAdapter extends GraphicsAdapter<PointGraphics, PointCesiumWriter> implements PointGraphics {

    private ColorProperty color;

    private DoubleProperty disableDepthTestDistance;

    private DistanceDisplayConditionProperty distanceDisplayCondition;

    private HeightReferenceProperty heightReference;

    private ColorProperty outlineColor;

    private DoubleProperty outlineWidth;

    private DoubleProperty pixelSize;

    private NearFarScalarProperty scaleByDistance;

    private NearFarScalarProperty translucencyByDistance;

    @Override
    public void dispatch(Supplier<PointCesiumWriter> supplier) {
        try (PointCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openColorProperty));
            Optional.ofNullable(getDisableDepthTestDistance()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openDisableDepthTestDistanceProperty));
            Optional.ofNullable(getDistanceDisplayCondition()).ifPresent(distanceDisplayConditionProperty -> distanceDisplayConditionProperty.dispatch(writer::openDistanceDisplayConditionProperty));
            Optional.ofNullable(getHeightReference()).ifPresent(heightReferenceProperty -> heightReferenceProperty.dispatch(writer::openHeightReferenceProperty));
            Optional.ofNullable(getOutlineColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openOutlineColorProperty));
            Optional.ofNullable(getOutlineWidth()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openOutlineWidthProperty));
            Optional.ofNullable(getPixelSize()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openPixelSizeProperty));
            Optional.ofNullable(getScaleByDistance()).ifPresent(nearFarScalarProperty -> nearFarScalarProperty.dispatch(writer::openScaleByDistanceProperty));
            Optional.ofNullable(getShow()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openShowProperty));
            Optional.ofNullable(getTranslucencyByDistance()).ifPresent(nearFarScalarProperty -> nearFarScalarProperty.dispatch(writer::openTranslucencyByDistanceProperty));
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
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
    public DoubleProperty getDisableDepthTestDistance() {
        return disableDepthTestDistance;
    }

    public void setDisableDepthTestDistance(DoubleProperty disableDepthTestDistance) {
        this.disableDepthTestDistance = disableDepthTestDistance;
    }

    @Override
    public DistanceDisplayConditionProperty getDistanceDisplayCondition() {
        return distanceDisplayCondition;
    }

    public void setDistanceDisplayCondition(DistanceDisplayConditionProperty distanceDisplayCondition) {
        this.distanceDisplayCondition = distanceDisplayCondition;
    }

    @Override
    public HeightReferenceProperty getHeightReference() {
        return heightReference;
    }

    public void setHeightReference(HeightReferenceProperty heightReference) {
        this.heightReference = heightReference;
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
    public DoubleProperty getPixelSize() {
        return pixelSize;
    }

    public void setPixelSize(DoubleProperty pixelSize) {
        this.pixelSize = pixelSize;
    }

    @Override
    public NearFarScalarProperty getScaleByDistance() {
        return scaleByDistance;
    }

    public void setScaleByDistance(NearFarScalarProperty scaleByDistance) {
        this.scaleByDistance = scaleByDistance;
    }

    @Override
    public NearFarScalarProperty getTranslucencyByDistance() {
        return translucencyByDistance;
    }

    public void setTranslucencyByDistance(NearFarScalarProperty translucencyByDistance) {
        this.translucencyByDistance = translucencyByDistance;
    }


    public static final class Builder {
        private ColorProperty color;
        private DoubleProperty disableDepthTestDistance;
        private DistanceDisplayConditionProperty distanceDisplayCondition;
        private HeightReferenceProperty heightReference;
        private ColorProperty outlineColor;
        private DoubleProperty outlineWidth;
        private DoubleProperty pixelSize;
        private NearFarScalarProperty scaleByDistance;
        private BooleanProperty show;
        private NearFarScalarProperty translucencyByDistance;

        private TimeInterval interval;
        private List<PointGraphics> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withColor(ColorProperty color) {
            this.color = color;
            return this;
        }

        public Builder withDisableDepthTestDistance(DoubleProperty disableDepthTestDistance) {
            this.disableDepthTestDistance = disableDepthTestDistance;
            return this;
        }

        public Builder withDistanceDisplayCondition(DistanceDisplayConditionProperty distanceDisplayCondition) {
            this.distanceDisplayCondition = distanceDisplayCondition;
            return this;
        }

        public Builder withHeightReference(HeightReferenceProperty heightReference) {
            this.heightReference = heightReference;
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

        public Builder withPixelSize(DoubleProperty pixelSize) {
            this.pixelSize = pixelSize;
            return this;
        }

        public Builder withScaleByDistance(NearFarScalarProperty scaleByDistance) {
            this.scaleByDistance = scaleByDistance;
            return this;
        }

        public Builder withTranslucencyByDistance(NearFarScalarProperty translucencyByDistance) {
            this.translucencyByDistance = translucencyByDistance;
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

        public Builder withIntervals(List<PointGraphics> intervals) {
            this.intervals = intervals;
            return this;
        }

        public PointGraphicsAdapter build() {
            PointGraphicsAdapter pointGraphicsAdapter = new PointGraphicsAdapter();
            pointGraphicsAdapter.setColor(color);
            pointGraphicsAdapter.setDisableDepthTestDistance(disableDepthTestDistance);
            pointGraphicsAdapter.setDistanceDisplayCondition(distanceDisplayCondition);
            pointGraphicsAdapter.setHeightReference(heightReference);
            pointGraphicsAdapter.setOutlineColor(outlineColor);
            pointGraphicsAdapter.setOutlineWidth(outlineWidth);
            pointGraphicsAdapter.setPixelSize(pixelSize);
            pointGraphicsAdapter.setScaleByDistance(scaleByDistance);
            pointGraphicsAdapter.setTranslucencyByDistance(translucencyByDistance);
            pointGraphicsAdapter.setShow(show);
            pointGraphicsAdapter.setInterval(interval);
            pointGraphicsAdapter.setIntervals(intervals);
            return pointGraphicsAdapter;
        }
    }
}
