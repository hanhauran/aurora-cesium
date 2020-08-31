package aurora.cesium.element.property;

import aurora.cesium.language.writer.CartographicExtent;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.advanced.ICesiumCartographicRectangleDegreesValuePropertyWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public class CartographicRectangleDegreesPropertyImpl extends SingleTimeBasedPropertyAdapter<CartographicExtent, CartographicRectangleDegreesProperty> implements CartographicRectangleDegreesProperty {

    @Override
    public void dispatchWithoutClose(ICesiumCartographicRectangleDegreesValuePropertyWriter writer) {
        dispatchConsumer(writer::writeWsenDegrees, writer::writeWsenDegrees, writer::writeWsenDegrees);
    }

    public static final class Builder {
        protected List<JulianDate> dates;
        protected List<CartographicExtent> values;
        protected Integer startIndex;
        protected Integer length;
        protected CartographicExtent value;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
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

        public Builder withValue(CartographicExtent value) {
            this.value = value;
            return this;
        }

        public CartographicRectangleDegreesPropertyImpl build() {
            CartographicRectangleDegreesPropertyImpl cartographicRectangleDegreesPropertyImpl = new CartographicRectangleDegreesPropertyImpl();
            cartographicRectangleDegreesPropertyImpl.setDates(dates);
            cartographicRectangleDegreesPropertyImpl.setValues(values);
            cartographicRectangleDegreesPropertyImpl.setStartIndex(startIndex);
            cartographicRectangleDegreesPropertyImpl.setLength(length);
            cartographicRectangleDegreesPropertyImpl.setValue(value);
            return cartographicRectangleDegreesPropertyImpl;
        }
    }
}