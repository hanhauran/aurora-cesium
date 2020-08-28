package aurora.cesium.element.property;

import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.ViewFromCesiumWriter;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public class DefaultViewFromProperty extends PropertyAdapter<ViewFromProperty> implements ViewFromProperty {

    protected CartesianProperty cartesian;

    @Override
    public void dispatch(ViewFromCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getCartesian()).ifPresent(cartesianProperty -> cartesianProperty.dispatchCartesian(writer));
            dispatchInterpolations(writer);
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
            dispatchReference(writer);
        }
    }

    @Override
    public CartesianProperty getCartesian() {
        return cartesian;
    }

    public void setCartesian(CartesianProperty cartesian) {
        this.cartesian = cartesian;
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
    public List<ViewFromProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<ViewFromProperty> intervals) {
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
        protected CartesianProperty cartesian;
        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<ViewFromProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder aDefaultViewFromProperty() {
            return new Builder();
        }

        public Builder withCartesian(CartesianProperty cartesian) {
            this.cartesian = cartesian;
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

        public Builder withIntervals(List<ViewFromProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public DefaultViewFromProperty build() {
            DefaultViewFromProperty defaultViewFromProperty = new DefaultViewFromProperty();
            defaultViewFromProperty.setCartesian(cartesian);
            defaultViewFromProperty.setInterpolations(interpolations);
            defaultViewFromProperty.setInterval(interval);
            defaultViewFromProperty.setIntervals(intervals);
            defaultViewFromProperty.setReference(reference);
            return defaultViewFromProperty;
        }
    }
}
