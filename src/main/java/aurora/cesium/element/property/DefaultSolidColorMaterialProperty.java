package aurora.cesium.element.property;

import aurora.cesium.language.writer.SolidColorMaterialCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultSolidColorMaterialProperty extends PropertyAdapter<SolidColorMaterialProperty> implements SolidColorMaterialProperty {

    private ColorProperty color;

    @Override
    public void dispatch(SolidColorMaterialCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer.openColorProperty()));
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
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<SolidColorMaterialProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<SolidColorMaterialProperty> intervals) {
        this.intervals = intervals;
    }


    public static final class Builder {
        protected TimeInterval interval;
        protected List<SolidColorMaterialProperty> intervals;
        private ColorProperty color;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withColor(ColorProperty color) {
            this.color = color;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<SolidColorMaterialProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public DefaultSolidColorMaterialProperty build() {
            DefaultSolidColorMaterialProperty defaultSolidColorMaterialProperty = new DefaultSolidColorMaterialProperty();
            defaultSolidColorMaterialProperty.setColor(color);
            defaultSolidColorMaterialProperty.setInterval(interval);
            defaultSolidColorMaterialProperty.setIntervals(intervals);
            return defaultSolidColorMaterialProperty;
        }
    }
}
