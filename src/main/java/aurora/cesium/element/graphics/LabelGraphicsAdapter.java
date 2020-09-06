package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.LabelCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
class LabelGraphicsAdapter extends GraphicsAdapter<LabelGraphics, LabelCesiumWriter> implements LabelGraphics {

    private ColorProperty backgroundColor;

    private BackgroundPaddingProperty backgroundPadding;

    private DoubleProperty disableDepthTestDistance;

    private DistanceDisplayConditionProperty distanceDisplayCondition;

    private EyeOffsetProperty eyeOffset;

    private ColorProperty fillColor;

    private FontProperty font;

    private HeightReferenceProperty heightReference;

    private HorizontalOriginProperty horizontalOrigin;

    private ColorProperty outlineColor;

    private DoubleProperty outlineWidth;

    private PixelOffsetProperty pixelOffset;

    private NearFarScalarProperty pixelOffsetScaleByDistance;

    private DoubleProperty scale;

    private NearFarScalarProperty scaleByDistance;

    private BooleanProperty showBackground;

    private LabelStyleProperty style;

    private StringProperty text;

    private NearFarScalarProperty translucencyByDistance;

    private VerticalOriginProperty verticalOrigin;

    @Override
    public void dispatch(Supplier<LabelCesiumWriter> supplier) {
        try (LabelCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getBackgroundColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openBackgroundColorProperty));
            Optional.ofNullable(getBackgroundPadding()).ifPresent(backgroundPaddingProperty -> backgroundPaddingProperty.dispatch(writer::openBackgroundPaddingProperty));
            Optional.ofNullable(getDisableDepthTestDistance()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openDisableDepthTestDistanceProperty));
            Optional.ofNullable(getDistanceDisplayCondition()).ifPresent(distanceDisplayConditionProperty -> distanceDisplayConditionProperty.dispatch(writer::openDistanceDisplayConditionProperty));
            Optional.ofNullable(getEyeOffset()).ifPresent(eyeOffsetProperty -> eyeOffsetProperty.dispatch(writer::openEyeOffsetProperty));
            Optional.ofNullable(getFillColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openFillColorProperty));
            Optional.ofNullable(getFont()).ifPresent(fontProperty -> fontProperty.dispatch(writer::openFontProperty));
            Optional.ofNullable(getHeightReference()).ifPresent(heightReferenceProperty -> heightReferenceProperty.dispatch(writer::openHeightReferenceProperty));
            Optional.ofNullable(getHorizontalOrigin()).ifPresent(horizontalOriginProperty -> horizontalOriginProperty.dispatch(writer::openHorizontalOriginProperty));
            Optional.ofNullable(getOutlineColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openOutlineColorProperty));
            Optional.ofNullable(getOutlineWidth()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openOutlineWidthProperty));
            Optional.ofNullable(getPixelOffset()).ifPresent(pixelOffsetProperty -> pixelOffsetProperty.dispatch(writer::openPixelOffsetProperty));
            Optional.ofNullable(getPixelOffsetScaleByDistance()).ifPresent(nearFarScalarProperty -> nearFarScalarProperty.dispatch(writer::openPixelOffsetScaleByDistanceProperty));
            Optional.ofNullable(getScale()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openScaleProperty));
            Optional.ofNullable(getScaleByDistance()).ifPresent(nearFarScalarProperty -> nearFarScalarProperty.dispatch(writer::openScaleByDistanceProperty));
            Optional.ofNullable(getShow()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openShowProperty));
            Optional.ofNullable(getShowBackground()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openShowBackgroundProperty));
            Optional.ofNullable(getStyle()).ifPresent(labelStyleProperty -> labelStyleProperty.dispatch(writer::openStyleProperty));
            Optional.ofNullable(getText()).ifPresent(stringProperty -> stringProperty.dispatch(writer::openTextProperty));
            Optional.ofNullable(getTranslucencyByDistance()).ifPresent(nearFarScalarProperty -> nearFarScalarProperty.dispatch(writer::openTranslucencyByDistanceProperty));
            Optional.ofNullable(getVerticalOrigin()).ifPresent(verticalOriginProperty -> verticalOriginProperty.dispatch(writer::openVerticalOriginProperty));
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
        }
    }

    @Override
    public ColorProperty getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(ColorProperty backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @Override
    public BackgroundPaddingProperty getBackgroundPadding() {
        return backgroundPadding;
    }

    public void setBackgroundPadding(BackgroundPaddingProperty backgroundPadding) {
        this.backgroundPadding = backgroundPadding;
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
    public EyeOffsetProperty getEyeOffset() {
        return eyeOffset;
    }

    public void setEyeOffset(EyeOffsetProperty eyeOffset) {
        this.eyeOffset = eyeOffset;
    }

    @Override
    public ColorProperty getFillColor() {
        return fillColor;
    }

    public void setFillColor(ColorProperty fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public FontProperty getFont() {
        return font;
    }

    public void setFont(FontProperty font) {
        this.font = font;
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
    public BooleanProperty getShowBackground() {
        return showBackground;
    }

    public void setShowBackground(BooleanProperty showBackground) {
        this.showBackground = showBackground;
    }

    @Override
    public LabelStyleProperty getStyle() {
        return style;
    }

    public void setStyle(LabelStyleProperty style) {
        this.style = style;
    }

    @Override
    public StringProperty getText() {
        return text;
    }

    public void setText(StringProperty text) {
        this.text = text;
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


    public static final class Builder {
        private ColorProperty backgroundColor;
        private BackgroundPaddingProperty backgroundPadding;
        private DoubleProperty disableDepthTestDistance;
        private DistanceDisplayConditionProperty distanceDisplayCondition;
        private EyeOffsetProperty eyeOffset;
        private ColorProperty fillColor;
        private FontProperty font;
        private HeightReferenceProperty heightReference;
        private HorizontalOriginProperty horizontalOrigin;
        private PixelOffsetProperty pixelOffset;
        private NearFarScalarProperty pixelOffsetScaleByDistance;
        private DoubleProperty scale;
        private NearFarScalarProperty scaleByDistance;
        protected BooleanProperty show;
        private BooleanProperty showBackground;
        private LabelStyleProperty style;
        private StringProperty text;
        private NearFarScalarProperty translucencyByDistance;
        private ColorProperty outlineColor;
        private DoubleProperty outlineWidth;
        private VerticalOriginProperty verticalOrigin;

        private TimeInterval interval;
        private List<LabelGraphics> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withBackgroundColor(ColorProperty backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }

        public Builder withBackgroundPadding(BackgroundPaddingProperty backgroundPadding) {
            this.backgroundPadding = backgroundPadding;
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

        public Builder withEyeOffset(EyeOffsetProperty eyeOffset) {
            this.eyeOffset = eyeOffset;
            return this;
        }

        public Builder withFillColor(ColorProperty fillColor) {
            this.fillColor = fillColor;
            return this;
        }

        public Builder withFont(FontProperty font) {
            this.font = font;
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

        public Builder withPixelOffset(PixelOffsetProperty pixelOffset) {
            this.pixelOffset = pixelOffset;
            return this;
        }

        public Builder withPixelOffsetScaleByDistance(NearFarScalarProperty pixelOffsetScaleByDistance) {
            this.pixelOffsetScaleByDistance = pixelOffsetScaleByDistance;
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

        public Builder withShowBackground(BooleanProperty showBackground) {
            this.showBackground = showBackground;
            return this;
        }

        public Builder withStyle(LabelStyleProperty style) {
            this.style = style;
            return this;
        }

        public Builder withText(StringProperty text) {
            this.text = text;
            return this;
        }

        public Builder withTranslucencyByDistance(NearFarScalarProperty translucencyByDistance) {
            this.translucencyByDistance = translucencyByDistance;
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

        public Builder withVerticalOrigin(VerticalOriginProperty verticalOrigin) {
            this.verticalOrigin = verticalOrigin;
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

        public Builder withIntervals(List<LabelGraphics> intervals) {
            this.intervals = intervals;
            return this;
        }

        public LabelGraphicsAdapter build() {
            LabelGraphicsAdapter labelGraphicsAdapter = new LabelGraphicsAdapter();
            labelGraphicsAdapter.setBackgroundColor(backgroundColor);
            labelGraphicsAdapter.setBackgroundPadding(backgroundPadding);
            labelGraphicsAdapter.setDisableDepthTestDistance(disableDepthTestDistance);
            labelGraphicsAdapter.setDistanceDisplayCondition(distanceDisplayCondition);
            labelGraphicsAdapter.setEyeOffset(eyeOffset);
            labelGraphicsAdapter.setFillColor(fillColor);
            labelGraphicsAdapter.setFont(font);
            labelGraphicsAdapter.setHeightReference(heightReference);
            labelGraphicsAdapter.setHorizontalOrigin(horizontalOrigin);
            labelGraphicsAdapter.setPixelOffset(pixelOffset);
            labelGraphicsAdapter.setPixelOffsetScaleByDistance(pixelOffsetScaleByDistance);
            labelGraphicsAdapter.setScale(scale);
            labelGraphicsAdapter.setScaleByDistance(scaleByDistance);
            labelGraphicsAdapter.setShowBackground(showBackground);
            labelGraphicsAdapter.setStyle(style);
            labelGraphicsAdapter.setText(text);
            labelGraphicsAdapter.setTranslucencyByDistance(translucencyByDistance);
            labelGraphicsAdapter.setOutlineColor(outlineColor);
            labelGraphicsAdapter.setOutlineWidth(outlineWidth);
            labelGraphicsAdapter.setVerticalOrigin(verticalOrigin);
            labelGraphicsAdapter.setShow(show);
            labelGraphicsAdapter.setInterval(interval);
            labelGraphicsAdapter.setIntervals(intervals);
            return labelGraphicsAdapter;
        }
    }
}
