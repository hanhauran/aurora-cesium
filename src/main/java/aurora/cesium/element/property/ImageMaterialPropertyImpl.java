package aurora.cesium.element.property;

import cesiumlanguagewriter.ImageMaterialCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
class ImageMaterialPropertyImpl extends PropertyAdapter<ImageMaterialProperty> implements ImageMaterialProperty {

    private ColorProperty color;

    private UriProperty image;

    private RepeatProperty repeat;

    private BooleanProperty transparent;

    @Override
    public void dispatch(Supplier<ImageMaterialCesiumWriter> supplier) {
        try (ImageMaterialCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openColorProperty));
            Optional.ofNullable(getImage()).ifPresent(uriProperty -> uriProperty.dispatch(writer::openImageProperty));
            Optional.ofNullable(getRepeat()).ifPresent(repeatProperty -> repeatProperty.dispatch(writer::openRepeatProperty));
            Optional.ofNullable(getTransparent()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openTransparentProperty));
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
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
    public UriProperty getImage() {
        return image;
    }

    public void setImage(UriProperty image) {
        this.image = image;
    }

    @Override
    public RepeatProperty getRepeat() {
        return repeat;
    }

    public void setRepeat(RepeatProperty repeat) {
        this.repeat = repeat;
    }

    @Override
    public BooleanProperty getTransparent() {
        return transparent;
    }

    public void setTransparent(BooleanProperty transparent) {
        this.transparent = transparent;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<ImageMaterialProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<ImageMaterialProperty> intervals) {
        this.intervals = intervals;
    }

    public static final class Builder {
        private ColorProperty color;
        private UriProperty image;
        private RepeatProperty repeat;
        private BooleanProperty transparent;

        protected TimeInterval interval;
        protected List<ImageMaterialProperty> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withColor(ColorProperty color) {
            this.color = color;
            return this;
        }

        public Builder withImage(UriProperty image) {
            this.image = image;
            return this;
        }

        public Builder withRepeat(RepeatProperty repeat) {
            this.repeat = repeat;
            return this;
        }

        public Builder withTransparent(BooleanProperty transparent) {
            this.transparent = transparent;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<ImageMaterialProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public ImageMaterialPropertyImpl build() {
            ImageMaterialPropertyImpl imageMaterialPropertyImpl = new ImageMaterialPropertyImpl();
            imageMaterialPropertyImpl.setColor(color);
            imageMaterialPropertyImpl.setImage(image);
            imageMaterialPropertyImpl.setRepeat(repeat);
            imageMaterialPropertyImpl.setTransparent(transparent);
            imageMaterialPropertyImpl.setInterval(interval);
            imageMaterialPropertyImpl.setIntervals(intervals);
            return imageMaterialPropertyImpl;
        }
    }
}
