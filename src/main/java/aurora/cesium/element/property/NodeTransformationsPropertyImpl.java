package aurora.cesium.element.property;

import aurora.cesium.language.writer.NodeTransformationsCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public class NodeTransformationsPropertyImpl extends PropertyAdapter<NodeTransformationsProperty> implements NodeTransformationsProperty {

    private List<NodeTransformationProperty> nodeTransformations;

    @Override
    public void dispatch(NodeTransformationsCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getNodeTransformations()).ifPresent(properties -> properties.forEach(property -> property.dispatch(writer.openNodeTransformationProperty(property.getName()))));
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
        }
    }

    @Override
    public List<NodeTransformationProperty> getNodeTransformations() {
        return nodeTransformations;
    }

    public void setNodeTransformations(List<NodeTransformationProperty> nodeTransformations) {
        this.nodeTransformations = nodeTransformations;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<NodeTransformationsProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<NodeTransformationsProperty> intervals) {
        this.intervals = intervals;
    }

    public static final class Builder {
        private List<NodeTransformationProperty> nodeTransformations;

        protected TimeInterval interval;
        protected List<NodeTransformationsProperty> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withNodeTransformations(List<NodeTransformationProperty> nodeTransformations) {
            this.nodeTransformations = nodeTransformations;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<NodeTransformationsProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public NodeTransformationsPropertyImpl build() {
            NodeTransformationsPropertyImpl nodeTransformationsPropertyImpl = new NodeTransformationsPropertyImpl();
            nodeTransformationsPropertyImpl.setNodeTransformations(nodeTransformations);
            nodeTransformationsPropertyImpl.setInterval(interval);
            nodeTransformationsPropertyImpl.setIntervals(intervals);
            return nodeTransformationsPropertyImpl;
        }
    }
}
