package aurora.cesium.element.property;

import aurora.cesium.language.writer.Cartographic;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.PositionCesiumWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultCartographicRadiansProperty extends SingleTimeBasedPropertyAdapter<Cartographic, CartographicRadiansProperty> implements CartographicRadiansProperty {

    @Override
    public void dispatchCartographicRadians(PositionCesiumWriter writer) {
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

        public DefaultCartographicRadiansProperty build() {
            DefaultCartographicRadiansProperty defaultCartographicRadiansProperty = new DefaultCartographicRadiansProperty();
            defaultCartographicRadiansProperty.setDates(dates);
            defaultCartographicRadiansProperty.setValues(values);
            defaultCartographicRadiansProperty.setStartIndex(startIndex);
            defaultCartographicRadiansProperty.setLength(length);
            defaultCartographicRadiansProperty.setValue(value);
            return defaultCartographicRadiansProperty;
        }
    }
}
