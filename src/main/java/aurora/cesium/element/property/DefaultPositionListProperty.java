package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public class DefaultPositionListProperty extends PropertyAdapter<PositionListProperty> implements PositionListProperty {

    private Iterable<Cartesian> cartesians;

    private Iterable<Cartographic> cartographicDegrees;

    private Iterable<Cartographic> cartographicRadians;

    @Override
    public void dispatch(PositionListCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getCartesians()).ifPresent(writer::writeCartesian);
            Optional.ofNullable(getCartographicDegrees()).ifPresent(writer::writeCartographicDegrees);
            Optional.ofNullable(getCartographicRadians()).ifPresent(writer::writeCartographicRadians);
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
            dispatchReferences(writer);
        }
    }

    @Override
    public Iterable<Cartesian> getCartesians() {
        return cartesians;
    }

    public void setCartesians(Iterable<Cartesian> cartesians) {
        this.cartesians = cartesians;
    }

    @Override
    public Iterable<Cartographic> getCartographicDegrees() {
        return cartographicDegrees;
    }

    public void setCartographicDegrees(Iterable<Cartographic> cartographicDegrees) {
        this.cartographicDegrees = cartographicDegrees;
    }

    @Override
    public Iterable<Cartographic> getCartographicRadians() {
        return cartographicRadians;
    }

    public void setCartographicRadians(Iterable<Cartographic> cartographicRadians) {
        this.cartographicRadians = cartographicRadians;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<PositionListProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<PositionListProperty> intervals) {
        this.intervals = intervals;
    }

    @Override
    public List<Reference> getReferences() {
        return references;
    }

    public void setReferences(List<Reference> references) {
        this.references = references;
    }

    public static final class Builder {
        protected TimeInterval interval;
        protected List<PositionListProperty> intervals;
        protected List<Reference> references;
        private Iterable<Cartesian> cartesians;
        private Iterable<Cartographic> cartographicDegrees;
        private Iterable<Cartographic> cartographicRadians;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withCartesians(Iterable<Cartesian> cartesians) {
            this.cartesians = cartesians;
            return this;
        }

        public Builder withCartographicDegrees(Iterable<Cartographic> cartographicDegrees) {
            this.cartographicDegrees = cartographicDegrees;
            return this;
        }

        public Builder withCartographicRadians(Iterable<Cartographic> cartographicRadians) {
            this.cartographicRadians = cartographicRadians;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<PositionListProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReferences(List<Reference> references) {
            this.references = references;
            return this;
        }

        public DefaultPositionListProperty build() {
            DefaultPositionListProperty defaultPositionListProperty = new DefaultPositionListProperty();
            defaultPositionListProperty.setCartesians(cartesians);
            defaultPositionListProperty.setCartographicDegrees(cartographicDegrees);
            defaultPositionListProperty.setCartographicRadians(cartographicRadians);
            defaultPositionListProperty.setInterval(interval);
            defaultPositionListProperty.setIntervals(intervals);
            defaultPositionListProperty.setReferences(references);
            return defaultPositionListProperty;
        }
    }
}
