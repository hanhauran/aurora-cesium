package aurora.cesium.element.property;

import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.UnitCartesian;
import aurora.cesium.language.writer.advanced.ICesiumUnitCartesian3ValuePropertyWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultUnitCartesianProperty extends SingleTimeBasedPropertyAdapter<UnitCartesian, UnitCartesianProperty> implements UnitCartesianProperty {

    @Override
    public void dispatchWithoutClose(ICesiumUnitCartesian3ValuePropertyWriter writer) {
        dispatchConsumer(writer::writeUnitCartesian, writer::writeUnitCartesian, writer::writeUnitCartesian);
    }

    public static final class Builder {
        protected List<JulianDate> dates;
        protected List<UnitCartesian> values;
        protected Integer startIndex;
        protected Integer length;

        protected UnitCartesian value;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValues(List<JulianDate> dates, List<UnitCartesian> instances) {
            this.dates = dates;
            this.values = instances;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<UnitCartesian> instances, Integer startIndex, Integer length) {
            this.dates = dates;
            this.values = instances;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public Builder withValue(UnitCartesian instance) {
            this.value = instance;
            return this;
        }

        public DefaultUnitCartesianProperty build() {
            DefaultUnitCartesianProperty defaultUnitCartesianProperty = new DefaultUnitCartesianProperty();
            defaultUnitCartesianProperty.setDates(dates);
            defaultUnitCartesianProperty.setValues(values);
            defaultUnitCartesianProperty.setStartIndex(startIndex);
            defaultUnitCartesianProperty.setLength(length);
            defaultUnitCartesianProperty.setValue(value);
            return defaultUnitCartesianProperty;
        }
    }
}
