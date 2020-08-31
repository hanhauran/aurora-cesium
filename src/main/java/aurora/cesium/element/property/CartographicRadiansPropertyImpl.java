package aurora.cesium.element.property;

import aurora.cesium.language.writer.Cartographic;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.PositionCesiumWriter;
import aurora.cesium.language.writer.advanced.ICesiumCartographicRadiansValuePropertyWriter;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class CartographicRadiansPropertyImpl extends SingleTimeBasedPropertyAdapter<Cartographic, CartographicRadiansProperty> implements CartographicRadiansProperty {

    @Override
    public void dispatchWithoutClose(ICesiumCartographicRadiansValuePropertyWriter writer) {
        dispatchConsumer(writer::writeCartographicRadians, writer::writeCartographicRadians, writer::writeCartographicRadians);
    }

    public static final class Builder {
        protected List<JulianDate> dates;
        protected List<Cartographic> values;
        protected Integer startIndex;
        protected Integer length;
        protected Cartographic value;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
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

        public Builder withValue(Cartographic value) {
            this.value = value;
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
