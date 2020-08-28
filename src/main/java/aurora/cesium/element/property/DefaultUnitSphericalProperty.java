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
        protected List<UnitSpherical> instances;
        protected Integer startIndex;
        protected Integer length;
        protected UnitSpherical instance;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder with(List<JulianDate> dates, List<UnitSpherical> instances) {
            this.dates = dates;
            this.instances = instances;
            return this;
        }

        public Builder with(List<JulianDate> dates, List<UnitSpherical> instances, Integer startIndex, Integer length) {
            this.dates = dates;
            this.instances = instances;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public Builder with(UnitSpherical instance) {
            this.instance = instance;
            return this;
        }

        public DefaultUnitSphericalProperty build() {
            DefaultUnitSphericalProperty defaultUnitSphericalProperty = new DefaultUnitSphericalProperty();
            defaultUnitSphericalProperty.setDates(dates);
            defaultUnitSphericalProperty.setInstances(instances);
            defaultUnitSphericalProperty.setStartIndex(startIndex);
            defaultUnitSphericalProperty.setLength(length);
            defaultUnitSphericalProperty.setInstance(instance);
            return defaultUnitSphericalProperty;
        }
    }
}
