package aurora.cesium.element.property;

import cesiumlanguagewriter.CartographicExtent;
import cesiumlanguagewriter.JulianDate;
import cesiumlanguagewriter.advanced.ICesiumCartographicRectangleRadiansValuePropertyWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
class CartographicRectangleRadiansPropertyImpl extends SingleTimeBasedPropertyAdapter<CartographicExtent, CartographicRectangleRadiansProperty> implements CartographicRectangleRadiansProperty {

    @Override
    public void dispatchWithoutClose(ICesiumCartographicRectangleRadiansValuePropertyWriter writer) {
        dispatchConsumer(writer::writeWsen, writer::writeWsen, writer::writeWsen);
    }

    public static final class Builder {
        private List<JulianDate> dates;
        private List<CartographicExtent> values;
        private Integer startIndex;
        private Integer length;

        private CartographicExtent value;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CartographicExtent value) {
            this.value = value;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<CartographicExtent> values) {
            this.dates = dates;
            this.values = values;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<CartographicExtent> values, Integer startIndex, Integer length) {
            this.dates = dates;
            this.values = values;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public CartographicRectangleRadiansPropertyImpl build() {
            CartographicRectangleRadiansPropertyImpl cartographicRectangleRadiansPropertyImpl = new CartographicRectangleRadiansPropertyImpl();
            cartographicRectangleRadiansPropertyImpl.setDates(dates);
            cartographicRectangleRadiansPropertyImpl.setValues(values);
            cartographicRectangleRadiansPropertyImpl.setStartIndex(startIndex);
            cartographicRectangleRadiansPropertyImpl.setLength(length);
            cartographicRectangleRadiansPropertyImpl.setValue(value);
            return cartographicRectangleRadiansPropertyImpl;
        }
    }
}
