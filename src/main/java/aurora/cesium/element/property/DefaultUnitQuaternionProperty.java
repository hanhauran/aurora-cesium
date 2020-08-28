package aurora.cesium.element.property;

import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.UnitQuaternion;
import aurora.cesium.language.writer.advanced.ICesiumUnitQuaternionValuePropertyWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public class DefaultUnitQuaternionProperty extends SingleTimeBasedPropertyAdapter<UnitQuaternion, UnitQuaternionProperty> implements UnitQuaternionProperty {

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

        public Builder withValue(UnitQuaternion value) {
            this.value = value;
            return this;
        }

        public DefaultUnitQuaternionProperty build() {
            DefaultUnitQuaternionProperty defaultUnitQuaternionProperty = new DefaultUnitQuaternionProperty();
            defaultUnitQuaternionProperty.setDates(dates);
            defaultUnitQuaternionProperty.setValues(values);
            defaultUnitQuaternionProperty.setStartIndex(startIndex);
            defaultUnitQuaternionProperty.setLength(length);
            defaultUnitQuaternionProperty.setValue(value);
            return defaultUnitQuaternionProperty;
        }
    }
}
