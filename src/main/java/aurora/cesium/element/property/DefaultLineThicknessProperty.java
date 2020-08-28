package aurora.cesium.element.property;

import aurora.cesium.language.writer.LineThicknessCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public class DefaultLineThicknessProperty extends PropertyAdapter<LineThicknessProperty> implements LineThicknessProperty {

    private RectangularProperty rectangular;

    @Override
    public void dispatch(LineThicknessCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getRectangular()).ifPresent(rectangularProperty -> rectangularProperty.dispatchWithoutClose(writer));
            dispatchInterpolations(writer);
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
            dispatchReference(writer);
        }
    }

    public RectangularProperty getRectangular() {
        return rectangular;
    }

    public void setRectangular(RectangularProperty rectangular) {
        this.rectangular = rectangular;
    }

    @Override
    public Interpolations getInterpolations() {
        return interpolations;
    }

    public void setInterpolations(Interpolations interpolations) {
        this.interpolations = interpolations;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<LineThicknessProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<LineThicknessProperty> intervals) {
        this.intervals = intervals;
    }

    @Override
    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }

    public static final class Builder {
        private RectangularProperty rectangular;

        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<LineThicknessProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withRectangular(RectangularProperty rectangular) {
            this.rectangular = rectangular;
            return this;
        }

        public Builder withInterpolations(Interpolations interpolations) {
            this.interpolations = interpolations;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<LineThicknessProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public DefaultLineThicknessProperty build() {
            DefaultLineThicknessProperty defaultLineThicknessProperty = new DefaultLineThicknessProperty();
            defaultLineThicknessProperty.setRectangular(rectangular);
            defaultLineThicknessProperty.setInterpolations(interpolations);
            defaultLineThicknessProperty.setInterval(interval);
            defaultLineThicknessProperty.setIntervals(intervals);
            defaultLineThicknessProperty.setReference(reference);
            return defaultLineThicknessProperty;
        }
    }
}
