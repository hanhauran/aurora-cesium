package aurora.cesium.element.property;

import cesiumlanguagewriter.Cartesian;
import cesiumlanguagewriter.JulianDate;
import cesiumlanguagewriter.advanced.ICesiumCartesian3ValuePropertyWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
class CartesianPropertyImpl extends SingleTimeBasedPropertyAdapter<Cartesian, CartesianProperty> implements CartesianProperty {

    @Override
    public void dispatchWithoutClose(ICesiumCartesian3ValuePropertyWriter writer) {
        dispatchConsumer(writer::writeCartesian, writer::writeCartesian, writer::writeCartesian);
    }

    public static final class Builder {
        private List<JulianDate> dates;
        private List<Cartesian> values;
        private Integer startIndex;
        private Integer length;

        private Cartesian value;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(Cartesian value) {
            this.value = value;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<Cartesian> values) {
            this.dates = dates;
            this.values = values;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<Cartesian> values, Integer startIndex, Integer length) {
            this.dates = dates;
            this.values = values;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public CartesianPropertyImpl build() {
            CartesianPropertyImpl cartesianPropertyImpl = new CartesianPropertyImpl();
            cartesianPropertyImpl.setDates(dates);
            cartesianPropertyImpl.setValues(values);
            cartesianPropertyImpl.setStartIndex(startIndex);
            cartesianPropertyImpl.setLength(length);
            cartesianPropertyImpl.setValue(value);
            return cartesianPropertyImpl;
        }
    }
}
