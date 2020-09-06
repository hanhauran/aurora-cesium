package aurora.cesium.element.property;

import cesiumlanguagewriter.ArticulationsCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
class ArticulationsPropertyImpl extends PropertyAdapter<ArticulationsProperty> implements ArticulationsProperty {

    private List<ArticulationProperty> articulations;

    @Override
    public void dispatch(Supplier<ArticulationsCesiumWriter> supplier) {
        try (ArticulationsCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getArticulations()).ifPresent(properties -> properties.forEach(property -> property.dispatch(() -> writer.openArticulationProperty(property.getName()))));

            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
        }
    }

    @Override
    public List<ArticulationProperty> getArticulations() {
        return articulations;
    }

    public void setArticulations(List<ArticulationProperty> articulations) {
        this.articulations = articulations;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<ArticulationsProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<ArticulationsProperty> intervals) {
        this.intervals = intervals;
    }


    public static final class Builder {
        private List<ArticulationProperty> articulations;

        protected TimeInterval interval;
        protected List<ArticulationsProperty> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withArticulations(List<ArticulationProperty> articulations) {
            this.articulations = articulations;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<ArticulationsProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public ArticulationsPropertyImpl build() {
            ArticulationsPropertyImpl articulationsPropertyImpl = new ArticulationsPropertyImpl();
            articulationsPropertyImpl.setArticulations(articulations);
            articulationsPropertyImpl.setInterval(interval);
            articulationsPropertyImpl.setIntervals(intervals);
            return articulationsPropertyImpl;
        }
    }
}
