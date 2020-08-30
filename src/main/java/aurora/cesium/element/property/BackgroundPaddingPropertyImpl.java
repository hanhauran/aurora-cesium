package aurora.cesium.element.property;

import aurora.cesium.language.writer.BackgroundPaddingCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public class BackgroundPaddingPropertyImpl extends PropertyAdapter<BackgroundPaddingProperty> implements BackgroundPaddingProperty {

    private RectangularProperty rectangular;

    @Override
    public void dispatch(BackgroundPaddingCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getRectangular()).ifPresent(rectangularProperty -> rectangularProperty.dispatchWithoutClose(writer));
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
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<BackgroundPaddingProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<BackgroundPaddingProperty> intervals) {
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
        protected TimeInterval interval;
        protected List<BackgroundPaddingProperty> intervals;
        protected Reference reference;
        private RectangularProperty rectangular;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withRectangular(RectangularProperty rectangular) {
            this.rectangular = rectangular;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<BackgroundPaddingProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public BackgroundPaddingPropertyImpl build() {
            BackgroundPaddingPropertyImpl backgroundPaddingPropertyImpl = new BackgroundPaddingPropertyImpl();
            backgroundPaddingPropertyImpl.setRectangular(rectangular);
            backgroundPaddingPropertyImpl.setInterval(interval);
            backgroundPaddingPropertyImpl.setIntervals(intervals);
            backgroundPaddingPropertyImpl.setReference(reference);
            return backgroundPaddingPropertyImpl;
        }
    }
}
