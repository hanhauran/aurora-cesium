package aurora.cesium.element.property;

import cesiumlanguagewriter.JulianDate;
import cesiumlanguagewriter.UnitQuaternion;
import cesiumlanguagewriter.advanced.ICesiumUnitQuaternionValuePropertyWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
class UnitQuaternionPropertyImpl extends SingleTimeBasedPropertyAdapter<UnitQuaternion, UnitQuaternionProperty> implements UnitQuaternionProperty {

    @Override
    public void dispatchWithoutClose(ICesiumUnitQuaternionValuePropertyWriter writer) {
        dispatchConsumer(writer::writeUnitQuaternion, writer::writeUnitQuaternion, writer::writeUnitQuaternion);
    }

    public static final class Builder {
        protected List<JulianDate> dates;
        protected List<UnitQuaternion> values;
        protected Integer startIndex;
        protected Integer length;

        protected UnitQuaternion value;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(UnitQuaternion value) {
            this.value = value;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<UnitQuaternion> values) {
            this.dates = dates;
            this.values = values;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<UnitQuaternion> values, Integer startIndex, Integer length) {
            this.dates = dates;
            this.values = values;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public UnitQuaternionPropertyImpl build() {
            UnitQuaternionPropertyImpl unitQuaternionPropertyImpl = new UnitQuaternionPropertyImpl();
            unitQuaternionPropertyImpl.setDates(dates);
            unitQuaternionPropertyImpl.setValues(values);
            unitQuaternionPropertyImpl.setStartIndex(startIndex);
            unitQuaternionPropertyImpl.setLength(length);
            unitQuaternionPropertyImpl.setValue(value);
            return unitQuaternionPropertyImpl;
        }
    }
}
