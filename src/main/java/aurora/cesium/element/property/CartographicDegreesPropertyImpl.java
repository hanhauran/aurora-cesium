package aurora.cesium.element.property;

import cesiumlanguagewriter.Cartographic;
import cesiumlanguagewriter.JulianDate;
import cesiumlanguagewriter.advanced.ICesiumCartographicDegreesValuePropertyWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
class CartographicDegreesPropertyImpl extends SingleTimeBasedPropertyAdapter<Cartographic, CartographicDegreesProperty> implements CartographicDegreesProperty {

    @Override
    public void dispatchWithoutClose(ICesiumCartographicDegreesValuePropertyWriter writer) {
        dispatchConsumer(writer::writeCartographicDegrees, writer::writeCartographicDegrees, writer::writeCartographicDegrees);
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

        public CartographicDegreesPropertyImpl build() {
            CartographicDegreesPropertyImpl cartographicDegreesPropertyImpl = new CartographicDegreesPropertyImpl();
            cartographicDegreesPropertyImpl.setDates(dates);
            cartographicDegreesPropertyImpl.setValues(values);
            cartographicDegreesPropertyImpl.setStartIndex(startIndex);
            cartographicDegreesPropertyImpl.setLength(length);
            cartographicDegreesPropertyImpl.setValue(value);
            return cartographicDegreesPropertyImpl;
        }
    }
}
