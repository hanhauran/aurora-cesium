package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.element.property.DistanceDisplayConditionProperty;
import aurora.cesium.element.property.DoubleProperty;
import aurora.cesium.element.property.PolylineMaterialProperty;
import cesiumlanguagewriter.PathCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/22
 */
class PathGraphicsAdapter extends GraphicsAdapter<PathGraphics, PathCesiumWriter> implements PathGraphics {

    private DistanceDisplayConditionProperty distanceDisplayCondition;

    private DoubleProperty leadTime;

    private PolylineMaterialProperty material;

    private DoubleProperty resolution;

    private DoubleProperty trailTime;

    private DoubleProperty width;

    @Override
    public void dispatch(Supplier<PathCesiumWriter> supplier) {
        try (PathCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getDistanceDisplayCondition()).ifPresent(distanceDisplayConditionProperty -> distanceDisplayConditionProperty.dispatch(writer::openDistanceDisplayConditionProperty));
            Optional.ofNullable(getLeadTime()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openLeadTimeProperty));
            Optional.ofNullable(getMaterial()).ifPresent(polylineMaterialProperty -> polylineMaterialProperty.dispatch(writer::openMaterialProperty));
            Optional.ofNullable(getResolution()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openResolutionProperty));
            Optional.ofNullable(getShow()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openShowProperty));
            Optional.ofNullable(getTrailTime()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openTrailTimeProperty));
            Optional.ofNullable(getWidth()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openWidthProperty));
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
        }
    }

    @Override
    public DistanceDisplayConditionProperty getDistanceDisplayCondition() {
        return distanceDisplayCondition;
    }

    public void setDistanceDisplayCondition(DistanceDisplayConditionProperty distanceDisplayCondition) {
        this.distanceDisplayCondition = distanceDisplayCondition;
    }

    @Override
    public DoubleProperty getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(DoubleProperty leadTime) {
        this.leadTime = leadTime;
    }

    @Override
    public PolylineMaterialProperty getMaterial() {
        return material;
    }

    public void setMaterial(PolylineMaterialProperty material) {
        this.material = material;
    }

    @Override
    public DoubleProperty getResolution() {
        return resolution;
    }

    public void setResolution(DoubleProperty resolution) {
        this.resolution = resolution;
    }

    @Override
    public DoubleProperty getTrailTime() {
        return trailTime;
    }

    public void setTrailTime(DoubleProperty trailTime) {
        this.trailTime = trailTime;
    }

    @Override
    public DoubleProperty getWidth() {
        return width;
    }

    public void setWidth(DoubleProperty width) {
        this.width = width;
    }

    public static final class Builder {
        private DistanceDisplayConditionProperty distanceDisplayCondition;
        private DoubleProperty leadTime;
        private PolylineMaterialProperty material;
        private DoubleProperty trailTime;
        private DoubleProperty resolution;
        protected BooleanProperty show;
        private DoubleProperty width;

        private TimeInterval interval;
        private List<PathGraphics> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withDistanceDisplayCondition(DistanceDisplayConditionProperty distanceDisplayCondition) {
            this.distanceDisplayCondition = distanceDisplayCondition;
            return this;
        }

        public Builder withLeadTime(DoubleProperty leadTime) {
            this.leadTime = leadTime;
            return this;
        }

        public Builder withMaterial(PolylineMaterialProperty material) {
            this.material = material;
            return this;
        }

        public Builder withTrailTime(DoubleProperty trailTime) {
            this.trailTime = trailTime;
            return this;
        }

        public Builder withResolution(DoubleProperty resolution) {
            this.resolution = resolution;
            return this;
        }

        public Builder withWidth(DoubleProperty width) {
            this.width = width;
            return this;
        }

        public Builder withShow(BooleanProperty show) {
            this.show = show;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<PathGraphics> intervals) {
            this.intervals = intervals;
            return this;
        }

        public PathGraphicsAdapter build() {
            PathGraphicsAdapter pathGraphicsAdapter = new PathGraphicsAdapter();
            pathGraphicsAdapter.setDistanceDisplayCondition(distanceDisplayCondition);
            pathGraphicsAdapter.setLeadTime(leadTime);
            pathGraphicsAdapter.setMaterial(material);
            pathGraphicsAdapter.setTrailTime(trailTime);
            pathGraphicsAdapter.setResolution(resolution);
            pathGraphicsAdapter.setWidth(width);
            pathGraphicsAdapter.setShow(show);
            pathGraphicsAdapter.setInterval(interval);
            pathGraphicsAdapter.setIntervals(intervals);
            return pathGraphicsAdapter;
        }
    }
}
