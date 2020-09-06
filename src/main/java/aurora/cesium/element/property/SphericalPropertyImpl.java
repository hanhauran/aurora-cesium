package aurora.cesium.element.property;

import cesiumlanguagewriter.JulianDate;
import cesiumlanguagewriter.Spherical;
import cesiumlanguagewriter.advanced.ICesiumSphericalValuePropertyWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
class SphericalPropertyImpl extends SingleTimeBasedPropertyAdapter<Spherical, SphericalProperty> implements SphericalProperty {

    @Override
    public void dispatchWithoutClose(ICesiumSphericalValuePropertyWriter writer) {
        dispatchConsumer(writer::writeSpherical, writer::writeSpherical, writer::writeSpherical);
    }

    public static final class Builder {
        protected List<JulianDate> dates;
        protected List<Spherical> values;
        protected Integer startIndex;
        protected Integer length;

        protected Spherical value;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(Spherical instance) {
            this.value = instance;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<Spherical> instances) {
            this.dates = dates;
            this.values = instances;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<Spherical> instances, Integer startIndex, Integer length) {
            this.dates = dates;
            this.values = instances;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }



        public SphericalPropertyImpl build() {
            SphericalPropertyImpl sphericalPropertyImpl = new SphericalPropertyImpl();
            sphericalPropertyImpl.setDates(dates);
            sphericalPropertyImpl.setValues(values);
            sphericalPropertyImpl.setStartIndex(startIndex);
            sphericalPropertyImpl.setLength(length);
            sphericalPropertyImpl.setValue(value);
            return sphericalPropertyImpl;
        }
    }
}
