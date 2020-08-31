package aurora.cesium.element.property;

import aurora.cesium.language.writer.Cartographic;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.advanced.ICesiumCartographicDegreesValuePropertyWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class CartographicDegreesPropertyImpl extends SingleTimeBasedPropertyAdapter<Cartographic, CartographicDegreesProperty> implements CartographicDegreesProperty {

    @Override
    public void dispatchWithoutClose(ICesiumCartographicDegreesValuePropertyWriter writer) {
        dispatchConsumer(writer::writeCartographicDegrees, writer::writeCartographicDegrees, writer::writeCartographicDegrees);
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
