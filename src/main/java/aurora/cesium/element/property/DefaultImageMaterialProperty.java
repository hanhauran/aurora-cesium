package aurora.cesium.element.property;

import aurora.cesium.language.writer.ImageMaterialCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public class DefaultImageMaterialProperty extends PropertyAdapter<ImageMaterialProperty> implements ImageMaterialProperty {

    private ColorProperty color;

    private UriProperty image;

    private RepeatProperty repeat;

    private BooleanProperty transparent;

    @Override
    public void dispatch(ImageMaterialCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer.openColorProperty()));
            Optional.ofNullable(getImage()).ifPresent(uriProperty -> uriProperty.dispatch(writer.openImageProperty()));
            Optional.ofNullable(getRepeat()).ifPresent(repeatProperty -> repeatProperty.dispatch(writer.openRepeatProperty()));
            Optional.ofNullable(getTransparent()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer.openTransparentProperty()));
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

        public DefaultImageMaterialProperty build() {
            DefaultImageMaterialProperty defaultImageMaterialProperty = new DefaultImageMaterialProperty();
            defaultImageMaterialProperty.setColor(color);
            defaultImageMaterialProperty.setImage(image);
            defaultImageMaterialProperty.setRepeat(repeat);
            defaultImageMaterialProperty.setTransparent(transparent);
            defaultImageMaterialProperty.setInterval(interval);
            defaultImageMaterialProperty.setIntervals(intervals);
            return defaultImageMaterialProperty;
        }
    }
}
