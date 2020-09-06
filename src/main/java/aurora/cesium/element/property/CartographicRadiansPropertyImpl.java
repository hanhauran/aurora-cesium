package aurora.cesium.element.property;

import cesiumlanguagewriter.Cartographic;
import cesiumlanguagewriter.JulianDate;
import cesiumlanguagewriter.advanced.ICesiumCartographicRadiansValuePropertyWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
class CartographicRadiansPropertyImpl extends SingleTimeBasedPropertyAdapter<Cartographic, CartographicRadiansProperty> implements CartographicRadiansProperty {

    @Override
    public void dispatchWithoutClose(ICesiumCartographicRadiansValuePropertyWriter writer) {
        dispatchConsumer(writer::writeCartographicRadians, writer::writeCartographicRadians, writer::writeCartographicRadians);
    }

    public static final class Builder {
        private List<JulianDate> dates;
        private List<Cartographic> values;
        private Integer startIndex;
        private Integer length;

        private Cartographic value;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(Cartographic value) {
            this.value = value;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<Cartographic> values) {
            this.dates = dates;
            this.values = values;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<Cartographic> values, Integer startIndex, Integer length) {
            this.dates = dates;
            this.values = values;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public CartographicRadiansPropertyImpl build() {
            CartographicRadiansPropertyImpl cartographicRadiansPropertyImpl = new CartographicRadiansPropertyImpl();
            cartographicRadiansPropertyImpl.setDates(dates);
            cartographicRadiansPropertyImpl.setValues(values);
            cartographicRadiansPropertyImpl.setStartIndex(startIndex);
            cartographicRadiansPropertyImpl.setLength(length);
            cartographicRadiansPropertyImpl.setValue(value);
            return cartographicRadiansPropertyImpl;
        }
    }
}
