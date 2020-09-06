package aurora.cesium.element.property;

import cesiumlanguagewriter.*;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
class PositionListOfListsPropertyImpl extends PropertyAdapter<PositionListOfListsProperty> implements PositionListOfListsProperty {

    private Iterable<? extends Iterable<Cartesian>> cartesians;

    private Iterable<? extends Iterable<Cartographic>> cartographicDegrees;

    private Iterable<? extends Iterable<Cartographic>> cartographicRadians;

    @Override
    public void dispatch(Supplier<PositionListOfListsCesiumWriter> supplier) {
        try (PositionListOfListsCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getCartesians()).ifPresent(writer::writeCartesian);
            Optional.ofNullable(getCartographicDegrees()).ifPresent(writer::writeCartographicDegrees);
            Optional.ofNullable(getCartographicRadians()).ifPresent(writer::writeCartographicRadians);

            dispatchDelete(writer);
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
            dispatchReferenceListOfLists(writer);
        }
    }

    @Override
    public Iterable<? extends Iterable<Cartesian>> getCartesians() {
        return cartesians;
    }

    public void setCartesians(Iterable<? extends Iterable<Cartesian>> cartesians) {
        this.cartesians = cartesians;
    }

    @Override
    public Iterable<? extends Iterable<Cartographic>> getCartographicDegrees() {
        return cartographicDegrees;
    }

    public void setCartographicDegrees(Iterable<? extends Iterable<Cartographic>> cartographicDegrees) {
        this.cartographicDegrees = cartographicDegrees;
    }

    @Override
    public Iterable<? extends Iterable<Cartographic>> getCartographicRadians() {
        return cartographicRadians;
    }

    public void setCartographicRadians(Iterable<? extends Iterable<Cartographic>> cartographicRadians) {
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
    public List<PositionListOfListsProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<PositionListOfListsProperty> intervals) {
        this.intervals = intervals;
    }

    @Override
    public Iterable<? extends Iterable<? extends Reference>> getReferences() {
        return referenceListOfLists;
    }

    public void setReferences(Iterable<? extends Iterable<? extends Reference>> referenceListOfLists) {
        this.referenceListOfLists = referenceListOfLists;
    }

    public static final class Builder {
        private Iterable<? extends Iterable<Cartesian>> cartesians;
        private Iterable<? extends Iterable<Cartographic>> cartographicDegrees;
        private Iterable<? extends Iterable<Cartographic>> cartographicRadians;

        private Boolean delete;
        private TimeInterval interval;
        private List<PositionListOfListsProperty> intervals;
        private Iterable<? extends Iterable<? extends Reference>> referenceListOfLists;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withCartesians(Iterable<? extends Iterable<Cartesian>> cartesians) {
            this.cartesians = cartesians;
            return this;
        }

        public Builder withCartographicDegrees(Iterable<? extends Iterable<Cartographic>> cartographicDegrees) {
            this.cartographicDegrees = cartographicDegrees;
            return this;
        }

        public Builder withCartographicRadians(Iterable<? extends Iterable<Cartographic>> cartographicRadians) {
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

        public Builder withIntervals(List<PositionListOfListsProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReferenceListOfLists(Iterable<? extends Iterable<? extends Reference>> referenceListOfLists) {
            this.referenceListOfLists = referenceListOfLists;
            return this;
        }

        public PositionListOfListsPropertyImpl build() {
            PositionListOfListsPropertyImpl positionListOfListsPropertyImpl = new PositionListOfListsPropertyImpl();
            positionListOfListsPropertyImpl.setCartesians(cartesians);
            positionListOfListsPropertyImpl.setCartographicDegrees(cartographicDegrees);
            positionListOfListsPropertyImpl.setCartographicRadians(cartographicRadians);
            positionListOfListsPropertyImpl.setDelete(delete);
            positionListOfListsPropertyImpl.setInterval(interval);
            positionListOfListsPropertyImpl.setIntervals(intervals);
            positionListOfListsPropertyImpl.setReferences(referenceListOfLists);
            return positionListOfListsPropertyImpl;
        }
    }
}
