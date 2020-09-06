package aurora.cesium.element.property;

import cesiumlanguagewriter.JulianDate;
import cesiumlanguagewriter.UnitSpherical;
import cesiumlanguagewriter.advanced.ICesiumUnitSphericalValuePropertyWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
class UnitSphericalPropertyImpl extends SingleTimeBasedPropertyAdapter<UnitSpherical, UnitSphericalProperty> implements UnitSphericalProperty {

    @Override
    public void dispatchWithoutClose(ICesiumUnitSphericalValuePropertyWriter writer) {
        dispatchConsumer(writer::writeUnitSpherical, writer::writeUnitSpherical, writer::writeUnitSpherical);
    }

    public static final class Builder {
        protected List<JulianDate> dates;
        protected List<UnitSpherical> values;
        protected Integer startIndex;
        protected Integer length;

        protected UnitSpherical value;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(UnitSpherical instance) {
            this.value = instance;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<UnitSpherical> instances) {
            this.dates = dates;
            this.values = instances;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<UnitSpherical> instances, Integer startIndex, Integer length) {
            this.dates = dates;
            this.values = instances;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public UnitSphericalPropertyImpl build() {
            UnitSphericalPropertyImpl unitSphericalPropertyImpl = new UnitSphericalPropertyImpl();
            unitSphericalPropertyImpl.setDates(dates);
            unitSphericalPropertyImpl.setValues(values);
            unitSphericalPropertyImpl.setStartIndex(startIndex);
            unitSphericalPropertyImpl.setLength(length);
            unitSphericalPropertyImpl.setValue(value);
            return unitSphericalPropertyImpl;
        }
    }
}
