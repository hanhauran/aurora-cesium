package aurora.cesium.element.property;

import aurora.cesium.language.writer.CartographicExtent;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.RectangleCoordinatesCesiumWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public class DefaultCartographicExtentProperty extends SingleTimeBasedPropertyAdapter<CartographicExtent, CartographicExtentProperty> implements CartographicExtentProperty {

    @Override
    public void dispatchWsen(RectangleCoordinatesCesiumWriter writer) {
        dispatchConsumer(writer::writeWsen, writer::writeWsen, writer::writeWsen);
    }

    @Override
    public void dispatchWsenDegrees(RectangleCoordinatesCesiumWriter writer) {
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

        public DefaultCartographicExtentProperty build() {
            DefaultCartographicExtentProperty defaultCartographicExtentProperty = new DefaultCartographicExtentProperty();
            defaultCartographicExtentProperty.setDates(dates);
            defaultCartographicExtentProperty.setValues(values);
            defaultCartographicExtentProperty.setStartIndex(startIndex);
            defaultCartographicExtentProperty.setLength(length);
            defaultCartographicExtentProperty.setValue(value);
            return defaultCartographicExtentProperty;
        }
    }
}
