package aurora.cesium.element.property;

import cesiumlanguagewriter.JulianDate;
import cesiumlanguagewriter.UnitCartesian;
import cesiumlanguagewriter.advanced.ICesiumUnitCartesian3ValuePropertyWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
class UnitCartesianPropertyImpl extends SingleTimeBasedPropertyAdapter<UnitCartesian, UnitCartesianProperty> implements UnitCartesianProperty {

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

        public Builder withValue(UnitCartesian instance) {
            this.value = instance;
            return this;
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

        public UnitCartesianPropertyImpl build() {
            UnitCartesianPropertyImpl unitCartesianPropertyImpl = new UnitCartesianPropertyImpl();
            unitCartesianPropertyImpl.setDates(dates);
            unitCartesianPropertyImpl.setValues(values);
            unitCartesianPropertyImpl.setStartIndex(startIndex);
            unitCartesianPropertyImpl.setLength(length);
            unitCartesianPropertyImpl.setValue(value);
            return unitCartesianPropertyImpl;
        }
    }
}
