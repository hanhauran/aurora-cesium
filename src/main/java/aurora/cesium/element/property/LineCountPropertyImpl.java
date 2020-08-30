package aurora.cesium.element.property;

import aurora.cesium.language.writer.LineCountCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public class LineCountPropertyImpl extends PropertyAdapter<LineCountProperty> implements LineCountProperty {

    private RectangularProperty rectangular;

    @Override
    public void dispatch(LineCountCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getRectangular()).ifPresent(rectangularProperty -> rectangularProperty.dispatchWithoutClose(writer));
            dispatchInterpolations(writer);
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
            dispatchReference(writer);
        }
    }

    @Override
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
    public List<LineCountProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<LineCountProperty> intervals) {
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
        protected List<LineCountProperty> intervals;
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

        public Builder withIntervals(List<LineCountProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public LineCountPropertyImpl build() {
            LineCountPropertyImpl lineCountPropertyImpl = new LineCountPropertyImpl();
            lineCountPropertyImpl.setRectangular(rectangular);
            lineCountPropertyImpl.setInterpolations(interpolations);
            lineCountPropertyImpl.setInterval(interval);
            lineCountPropertyImpl.setIntervals(intervals);
            lineCountPropertyImpl.setReference(reference);
            return lineCountPropertyImpl;
        }
    }
}
