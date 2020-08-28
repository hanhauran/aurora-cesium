package aurora.cesium.element.property;

import aurora.cesium.language.writer.AlignedAxisCesiumWriter;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.UnitCartesian;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultUnitCartesianProperty extends SingleTimeBasedPropertyAdapter<UnitCartesian, UnitCartesianProperty> implements UnitCartesianProperty {

    @Override
    public void dispatchUnitCartesian(AlignedAxisCesiumWriter writer) {
        dispatchConsumer(writer::writeUnitCartesian, writer::writeUnitCartesian, writer::writeUnitCartesian);
    }


    public static final class Builder {
        protected List<JulianDate> dates;
        protected List<UnitCartesian> instances;
        protected Integer startIndex;
        protected Integer length;
        protected UnitCartesian instance;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder with(List<JulianDate> dates, List<UnitCartesian> instances) {
            this.dates = dates;
            this.instances = instances;
            return this;
        }

        public Builder with(List<JulianDate> dates, List<UnitCartesian> instances, Integer startIndex, Integer length) {
            this.dates = dates;
            this.instances = instances;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public Builder with(UnitCartesian instance) {
            this.instance = instance;
            return this;
        }

        public DefaultUnitCartesianProperty build() {
            DefaultUnitCartesianProperty defaultUnitCartesianProperty = new DefaultUnitCartesianProperty();
            defaultUnitCartesianProperty.setDates(dates);
            defaultUnitCartesianProperty.setInstances(instances);
            defaultUnitCartesianProperty.setStartIndex(startIndex);
            defaultUnitCartesianProperty.setLength(length);
            defaultUnitCartesianProperty.setInstance(instance);
            return defaultUnitCartesianProperty;
        }
    }
}
