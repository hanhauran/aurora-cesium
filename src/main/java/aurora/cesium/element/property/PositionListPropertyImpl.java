package aurora.cesium.element.property;

import cesiumlanguagewriter.*;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
class PositionListPropertyImpl extends PropertyAdapter<PositionListProperty> implements PositionListProperty {

    private Iterable<Cartesian> cartesians;

    private Iterable<Cartographic> cartographicDegrees;

    private Iterable<Cartographic> cartographicRadians;

    @Override
    public void dispatch(Supplier<PositionListCesiumWriter> supplier) {
        try (PositionListCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getCartesians()).ifPresent(writer::writeCartesian);
            Optional.ofNullable(getCartographicDegrees()).ifPresent(writer::writeCartographicDegrees);
            Optional.ofNullable(getCartographicRadians()).ifPresent(writer::writeCartographicRadians);

            dispatchDelete(writer);
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
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
    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
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
    public Iterable<Reference> getReferences() {
        return referenceList;
    }

    public void setReferences(Iterable<Reference> references) {
        this.referenceList = references;
    }

    public static final class Builder {
        private Iterable<Cartesian> cartesians;
        private Iterable<Cartographic> cartographicDegrees;
        private Iterable<Cartographic> cartographicRadians;

        private Boolean delete;
        private TimeInterval interval;
        private List<PositionListProperty> intervals;
        private Iterable<Reference> references;

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

        public Builder withDelete(Boolean delete) {
            this.delete = delete;
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

        public Builder withReferences(Iterable<Reference> references) {
            this.references = references;
            return this;
        }

        public PositionListPropertyImpl build() {
            PositionListPropertyImpl positionListPropertyImpl = new PositionListPropertyImpl();
            positionListPropertyImpl.setCartesians(cartesians);
            positionListPropertyImpl.setCartographicDegrees(cartographicDegrees);
            positionListPropertyImpl.setCartographicRadians(cartographicRadians);
            positionListPropertyImpl.setDelete(delete);
            positionListPropertyImpl.setInterval(interval);
            positionListPropertyImpl.setIntervals(intervals);
            positionListPropertyImpl.setReferences(references);
            return positionListPropertyImpl;
        }
    }
}
