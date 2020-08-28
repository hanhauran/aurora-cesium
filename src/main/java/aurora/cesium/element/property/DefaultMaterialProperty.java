package aurora.cesium.element.property;

import aurora.cesium.language.writer.MaterialCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public class DefaultMaterialProperty extends PropertyAdapter<MaterialProperty> implements MaterialProperty {

    private CheckerboardMaterialProperty checkerboardMaterial;

    private GridMaterialProperty gridMaterial;

    private ImageMaterialProperty imageMaterial;

    private SolidColorMaterialProperty solidColorMaterial;

    private StripeMaterialProperty stripeMaterial;

    @Override
    public void dispatch(MaterialCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getCheckerboardMaterial()).ifPresent(checkerboardMaterialProperty -> checkerboardMaterialProperty.dispatch(writer.openCheckerboardProperty()));
            Optional.ofNullable(getGridMaterial()).ifPresent(gridMaterialProperty -> gridMaterialProperty.dispatch(writer.openGridProperty()));
            Optional.ofNullable(getImageMaterial()).ifPresent(imageMaterialProperty -> imageMaterialProperty.dispatch(writer.openImageProperty()));
            Optional.ofNullable(getSolidColorMaterial()).ifPresent(solidColorMaterialProperty -> solidColorMaterialProperty.dispatch(writer.openSolidColorProperty()));
            Optional.ofNullable(getStripeMaterial()).ifPresent(stripeMaterialProperty -> stripeMaterialProperty.dispatch(writer.openStripeProperty()));
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
        }
    }

    @Override
    public CheckerboardMaterialProperty getCheckerboardMaterial() {
        return checkerboardMaterial;
    }

    public void setCheckerboardMaterial(CheckerboardMaterialProperty checkerboardMaterial) {
        this.checkerboardMaterial = checkerboardMaterial;
    }

    @Override
    public GridMaterialProperty getGridMaterial() {
        return gridMaterial;
    }

    public void setGridMaterial(GridMaterialProperty gridMaterial) {
        this.gridMaterial = gridMaterial;
    }

    @Override
    public ImageMaterialProperty getImageMaterial() {
        return imageMaterial;
    }

    public void setImageMaterial(ImageMaterialProperty imageMaterial) {
        this.imageMaterial = imageMaterial;
    }

    @Override
    public SolidColorMaterialProperty getSolidColorMaterial() {
        return solidColorMaterial;
    }

    public void setSolidColorMaterial(SolidColorMaterialProperty solidColorMaterial) {
        this.solidColorMaterial = solidColorMaterial;
    }

    @Override
    public StripeMaterialProperty getStripeMaterial() {
        return stripeMaterial;
    }

    public void setStripeMaterial(StripeMaterialProperty stripeMaterial) {
        this.stripeMaterial = stripeMaterial;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<MaterialProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<MaterialProperty> intervals) {
        this.intervals = intervals;
    }

    public static final class Builder {
        private CheckerboardMaterialProperty checkerboardMaterial;
        private GridMaterialProperty gridMaterial;
        private ImageMaterialProperty imageMaterial;
        private SolidColorMaterialProperty solidColorMaterial;
        private StripeMaterialProperty stripeMaterial;

        protected TimeInterval interval;
        protected List<MaterialProperty> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withCheckerboardMaterial(CheckerboardMaterialProperty checkerboardMaterial) {
            this.checkerboardMaterial = checkerboardMaterial;
            return this;
        }

        public Builder withGridMaterial(GridMaterialProperty gridMaterial) {
            this.gridMaterial = gridMaterial;
            return this;
        }

        public Builder withImageMaterial(ImageMaterialProperty imageMaterial) {
            this.imageMaterial = imageMaterial;
            return this;
        }

        public Builder withSolidColorMaterial(SolidColorMaterialProperty solidColorMaterial) {
            this.solidColorMaterial = solidColorMaterial;
            return this;
        }

        public Builder withStripeMaterial(StripeMaterialProperty stripeMaterial) {
            this.stripeMaterial = stripeMaterial;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<MaterialProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public DefaultMaterialProperty build() {
            DefaultMaterialProperty defaultMaterialProperty = new DefaultMaterialProperty();
            defaultMaterialProperty.setCheckerboardMaterial(checkerboardMaterial);
            defaultMaterialProperty.setGridMaterial(gridMaterial);
            defaultMaterialProperty.setImageMaterial(imageMaterial);
            defaultMaterialProperty.setSolidColorMaterial(solidColorMaterial);
            defaultMaterialProperty.setStripeMaterial(stripeMaterial);
            defaultMaterialProperty.setInterval(interval);
            defaultMaterialProperty.setIntervals(intervals);
            return defaultMaterialProperty;
        }
    }
}
