package aurora.cesium.element.property;

import cesiumlanguagewriter.NodeTransformationCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
class NodeTransformationPropertyImpl extends PropertyAdapter<NodeTransformationProperty> implements NodeTransformationProperty {

    private String name;

    private RotationProperty rotation;

    private ScaleProperty scale;

    private TranslationProperty translation;

    @Override
    public void dispatch(Supplier<NodeTransformationCesiumWriter> supplier) {
        try (NodeTransformationCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getRotation()).ifPresent(rotationProperty -> rotationProperty.dispatch(writer::openRotationProperty));
            Optional.ofNullable(getScale()).ifPresent(scaleProperty -> scaleProperty.dispatch(writer::openScaleProperty));
            Optional.ofNullable(getTranslation()).ifPresent(translationProperty -> translationProperty.dispatch(writer::openTranslationProperty));

            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
        }
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public RotationProperty getRotation() {
        return rotation;
    }

    public void setRotation(RotationProperty rotation) {
        this.rotation = rotation;
    }

    @Override
    public ScaleProperty getScale() {
        return scale;
    }

    public void setScale(ScaleProperty scale) {
        this.scale = scale;
    }

    @Override
    public TranslationProperty getTranslation() {
        return translation;
    }

    public void setTranslation(TranslationProperty translation) {
        this.translation = translation;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<NodeTransformationProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<NodeTransformationProperty> intervals) {
        this.intervals = intervals;
    }

    public static final class Builder {
        private final String name;
        private RotationProperty rotation;
        private ScaleProperty scale;
        private TranslationProperty translation;

        private TimeInterval interval;
        private List<NodeTransformationProperty> intervals;

        private Builder(String name) {
            this.name = name;
        }

        public static Builder newBuilder(String name) {
            return new Builder(name);
        }

        public Builder withRotation(RotationProperty rotation) {
            this.rotation = rotation;
            return this;
        }

        public Builder withScale(ScaleProperty scale) {
            this.scale = scale;
            return this;
        }

        public Builder withTranslation(TranslationProperty translation) {
            this.translation = translation;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<NodeTransformationProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public NodeTransformationPropertyImpl build() {
            NodeTransformationPropertyImpl nodeTransformationPropertyImpl = new NodeTransformationPropertyImpl();
            nodeTransformationPropertyImpl.setName(name);
            nodeTransformationPropertyImpl.setRotation(rotation);
            nodeTransformationPropertyImpl.setScale(scale);
            nodeTransformationPropertyImpl.setTranslation(translation);
            nodeTransformationPropertyImpl.setInterval(interval);
            nodeTransformationPropertyImpl.setIntervals(intervals);
            return nodeTransformationPropertyImpl;
        }
    }
}
