package aurora.cesium.element.property;

import aurora.cesium.language.writer.PolylineMaterialCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultPolylineMaterialProperty extends PropertyAdapter<PolylineMaterialProperty> implements PolylineMaterialProperty {

    private SolidColorMaterialProperty solidColor;

    @Override
    public void dispatch(PolylineMaterialCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getSolidColor()).ifPresent(solidColorMaterialProperty -> solidColorMaterialProperty.dispatch(writer.openSolidColorProperty()));
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
        }
    }

    @Override
    public SolidColorMaterialProperty getSolidColor() {
        return solidColor;
    }

    public void setSolidColor(SolidColorMaterialProperty solidColor) {
        this.solidColor = solidColor;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<PolylineMaterialProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<PolylineMaterialProperty> intervals) {
        this.intervals = intervals;
    }

    public static final class Builder {
        protected TimeInterval interval;
        protected List<PolylineMaterialProperty> intervals;
        private SolidColorMaterialProperty solidColor;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withSolidColor(SolidColorMaterialProperty solidColor) {
            this.solidColor = solidColor;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<PolylineMaterialProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public DefaultPolylineMaterialProperty build() {
            DefaultPolylineMaterialProperty defaultPolylineMaterialProperty = new DefaultPolylineMaterialProperty();
            defaultPolylineMaterialProperty.setSolidColor(solidColor);
            defaultPolylineMaterialProperty.setInterval(interval);
            defaultPolylineMaterialProperty.setIntervals(intervals);
            return defaultPolylineMaterialProperty;
        }
    }
}
