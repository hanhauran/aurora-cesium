package aurora.cesium.element.property;

import cesiumlanguagewriter.*;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
class DirectionListPropertyImpl extends PropertyAdapter<DirectionListProperty> implements DirectionListProperty {

    private Iterable<Cartesian> cartesians;

    private Iterable<Spherical> sphericals;

    private Iterable<UnitCartesian> unitCartesians;

    private Iterable<UnitSpherical> unitSphericals;

    @Override
    public void dispatch(Supplier<DirectionListCesiumWriter> supplier) {
        try (DirectionListCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getCartesians()).ifPresent(writer::writeCartesian);
            Optional.ofNullable(getSphericals()).ifPresent(writer::writeSpherical);
            Optional.ofNullable(getUnitCartesians()).ifPresent(writer::writeUnitCartesian);
            Optional.ofNullable(getUnitSphericals()).ifPresent(writer::writeUnitSpherical);

            dispatchDelete(writer);
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
        }
    }

    @Override
    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    @Override
    public Iterable<Cartesian> getCartesians() {
        return cartesians;
    }

    public void setCartesians(Iterable<Cartesian> cartesians) {
        this.cartesians = cartesians;
    }

    @Override
    public Iterable<Spherical> getSphericals() {
        return sphericals;
    }

    public void setSphericals(Iterable<Spherical> sphericals) {
        this.sphericals = sphericals;
    }

    @Override
    public Iterable<UnitCartesian> getUnitCartesians() {
        return unitCartesians;
    }

    public void setUnitCartesians(Iterable<UnitCartesian> unitCartesians) {
        this.unitCartesians = unitCartesians;
    }

    @Override
    public Iterable<UnitSpherical> getUnitSphericals() {
        return unitSphericals;
    }

    public void setUnitSphericals(Iterable<UnitSpherical> unitSphericals) {
        this.unitSphericals = unitSphericals;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<DirectionListProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<DirectionListProperty> intervals) {
        this.intervals = intervals;
    }

    public static final class Builder {
        private Iterable<Cartesian> cartesians;
        private Iterable<Spherical> sphericals;
        private Iterable<UnitCartesian> unitCartesians;
        private Iterable<UnitSpherical> unitSphericals;

        private Boolean delete;
        protected TimeInterval interval;
        protected List<DirectionListProperty> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withCartesians(Iterable<Cartesian> cartesians) {
            this.cartesians = cartesians;
            return this;
        }

        public Builder withSphericals(Iterable<Spherical> sphericals) {
            this.sphericals = sphericals;
            return this;
        }

        public Builder withUnitCartesians(Iterable<UnitCartesian> unitCartesians) {
            this.unitCartesians = unitCartesians;
            return this;
        }

        public Builder withUnitSphericals(Iterable<UnitSpherical> unitSphericals) {
            this.unitSphericals = unitSphericals;
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

        public Builder withIntervals(List<DirectionListProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public DirectionListPropertyImpl build() {
            DirectionListPropertyImpl directionListPropertyImpl = new DirectionListPropertyImpl();
            directionListPropertyImpl.setCartesians(cartesians);
            directionListPropertyImpl.setSphericals(sphericals);
            directionListPropertyImpl.setUnitCartesians(unitCartesians);
            directionListPropertyImpl.setUnitSphericals(unitSphericals);
            directionListPropertyImpl.setDelete(delete);
            directionListPropertyImpl.setInterval(interval);
            directionListPropertyImpl.setIntervals(intervals);
            return directionListPropertyImpl;
        }
    }
}
