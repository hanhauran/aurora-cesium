package aurora.cesium.element.property;

import aurora.cesium.language.writer.AlignedAxisCesiumWriter;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.UnitSpherical;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultUnitSphericalProperty extends SingleTimeBasedPropertyAdapter<UnitSpherical, UnitSphericalProperty> implements UnitSphericalProperty {

    @Override
    public void dispatchUnitSpherical(AlignedAxisCesiumWriter writer) {
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

        public Builder withValue(UnitSpherical instance) {
            this.value = instance;
            return this;
        }

        public DefaultUnitSphericalProperty build() {
            DefaultUnitSphericalProperty defaultUnitSphericalProperty = new DefaultUnitSphericalProperty();
            defaultUnitSphericalProperty.setDates(dates);
            defaultUnitSphericalProperty.setValues(values);
            defaultUnitSphericalProperty.setStartIndex(startIndex);
            defaultUnitSphericalProperty.setLength(length);
            defaultUnitSphericalProperty.setValue(value);
            return defaultUnitSphericalProperty;
        }
    }
}
