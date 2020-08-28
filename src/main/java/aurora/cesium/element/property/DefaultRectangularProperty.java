package aurora.cesium.element.property;

import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.Rectangular;
import aurora.cesium.language.writer.advanced.ICesiumCartesian2ValuePropertyWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public class DefaultRectangularProperty extends SingleTimeBasedPropertyAdapter<Rectangular, RectangularProperty> implements RectangularProperty {

    @Override
    public void dispatch(ICesiumCartesian2ValuePropertyWriter writer) {
        dispatchConsumer(writer::writeCartesian2, writer::writeCartesian2, writer::writeCartesian2);
    }

    public static final class Builder {
        protected List<JulianDate> dates;
        protected List<Rectangular> instances;
        protected Integer startIndex;
        protected Integer length;
        protected Rectangular instance;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder with(List<JulianDate> dates, List<Rectangular> instances) {
            this.dates = dates;
            this.instances = instances;
            return this;
        }

        public Builder with(List<JulianDate> dates, List<Rectangular> instances, Integer startIndex, Integer length) {
            this.dates = dates;
            this.instances = instances;
            this.startIndex = startIndex;
            this.length = length;
            return this;
        }

        public Builder with(Rectangular instance) {
            this.instance = instance;
            return this;
        }

        public DefaultRectangularProperty build() {
            DefaultRectangularProperty defaultRectangularProperty = new DefaultRectangularProperty();
            defaultRectangularProperty.setDates(dates);
            defaultRectangularProperty.setInstances(instances);
            defaultRectangularProperty.setStartIndex(startIndex);
            defaultRectangularProperty.setLength(length);
            defaultRectangularProperty.setInstance(instance);
            return defaultRectangularProperty;
        }
    }
}
