package aurora.cesium.element.property;

import aurora.cesium.language.writer.PolylineDashMaterialCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public class DefaultPolylineDashMaterialProperty extends PropertyAdapter<PolylineDashMaterialProperty> implements PolylineDashMaterialProperty {

    private ColorProperty color;

    private ColorProperty gapColor;

    private DoubleProperty dashLength;

    private IntegerProperty dashPattern;

    @Override
    public void dispatch(PolylineDashMaterialCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer.openColorProperty()));
            Optional.ofNullable(getGapColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer.openGapColorProperty()));
            Optional.ofNullable(getDashLength()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer.openDashLengthProperty()));
            Optional.ofNullable(getDashPattern()).ifPresent(integerProperty -> integerProperty.dispatch(writer.openDashPatternProperty()));
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
    public ColorProperty getGapColor() {
        return gapColor;
    }

    public void setGapColor(ColorProperty gapColor) {
        this.gapColor = gapColor;
    }

    @Override
    public DoubleProperty getDashLength() {
        return dashLength;
    }

    public void setDashLength(DoubleProperty dashLength) {
        this.dashLength = dashLength;
    }

    @Override
    public IntegerProperty getDashPattern() {
        return dashPattern;
    }

    public void setDashPattern(IntegerProperty dashPattern) {
        this.dashPattern = dashPattern;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<PolylineDashMaterialProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<PolylineDashMaterialProperty> intervals) {
        this.intervals = intervals;
    }

    public static final class Builder {
        private ColorProperty color;
        private ColorProperty gapColor;
        private DoubleProperty dashLength;
        private IntegerProperty dashPattern;

        protected TimeInterval interval;
        protected List<PolylineDashMaterialProperty> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withColor(ColorProperty color) {
            this.color = color;
            return this;
        }

        public Builder withGapColor(ColorProperty gapColor) {
            this.gapColor = gapColor;
            return this;
        }

        public Builder withDashLength(DoubleProperty dashLength) {
            this.dashLength = dashLength;
            return this;
        }

        public Builder withDashPattern(IntegerProperty dashPattern) {
            this.dashPattern = dashPattern;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<PolylineDashMaterialProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public DefaultPolylineDashMaterialProperty build() {
            DefaultPolylineDashMaterialProperty defaultPolylineDashMaterialProperty = new DefaultPolylineDashMaterialProperty();
            defaultPolylineDashMaterialProperty.setColor(color);
            defaultPolylineDashMaterialProperty.setGapColor(gapColor);
            defaultPolylineDashMaterialProperty.setDashLength(dashLength);
            defaultPolylineDashMaterialProperty.setDashPattern(dashPattern);
            defaultPolylineDashMaterialProperty.setInterval(interval);
            defaultPolylineDashMaterialProperty.setIntervals(intervals);
            return defaultPolylineDashMaterialProperty;
        }
    }
}
