package aurora.cesium.element.property;

import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.Rectangular;
import aurora.cesium.language.writer.advanced.ICesiumCartesian2ValuePropertyWriter;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public class RectangularPropertyImpl extends SingleTimeBasedPropertyAdapter<Rectangular, RectangularProperty> implements RectangularProperty {

    @Override
    public void dispatchWithoutClose(ICesiumCartesian2ValuePropertyWriter writer) {
        dispatchConsumer(writer::writeCartesian2, writer::writeCartesian2, writer::writeCartesian2);
    }

    public static final class Builder {
        protected List<JulianDate> dates;
        protected List<Rectangular> values;
        protected Integer startIndex;
        protected Integer length;

        protected Rectangular value;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValues(List<JulianDate> dates, List<Rectangular> instances) {
            this.dates = dates;
            this.values = instances;
            return this;
        }

        public Builder withValues(List<JulianDate> dates, List<Rectangular> instances, Integer startIndex, Integer length) {
            this.dates = dates;
            this.values = instances;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public Builder withValue(Rectangular instance) {
            this.value = instance;
            return this;
        }

        public RectangularPropertyImpl build() {
            RectangularPropertyImpl rectangularPropertyImpl = new RectangularPropertyImpl();
            rectangularPropertyImpl.setDates(dates);
            rectangularPropertyImpl.setValues(values);
            rectangularPropertyImpl.setStartIndex(startIndex);
            rectangularPropertyImpl.setLength(length);
            rectangularPropertyImpl.setValue(value);
            return rectangularPropertyImpl;
        }
    }
}
