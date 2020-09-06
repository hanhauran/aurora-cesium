package aurora.cesium.element.property;

import cesiumlanguagewriter.PolylineMaterialCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
class PolylineMaterialPropertyImpl extends PropertyAdapter<PolylineMaterialProperty> implements PolylineMaterialProperty {

    private CheckerboardMaterialProperty checkerboardMaterial;

    private GridMaterialProperty gridMaterial;

    private ImageMaterialProperty imageMaterial;

    private PolylineArrowMaterialProperty polylineArrowMaterial;

    private PolylineDashMaterialProperty polylineDashMaterial;

    private PolylineGlowMaterialProperty polylineGlowMaterial;

    private PolylineOutlineMaterialProperty polylineOutlineMaterial;

    private SolidColorMaterialProperty solidColorMaterial;

    private StripeMaterialProperty stripeMaterial;

    @Override
    public void dispatch(Supplier<PolylineMaterialCesiumWriter> supplier) {
        try (PolylineMaterialCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getCheckerboardMaterial()).ifPresent(checkerboardMaterialProperty -> checkerboardMaterialProperty.dispatch(writer::openCheckerboardProperty));
            Optional.ofNullable(getGridMaterial()).ifPresent(gridMaterialProperty -> gridMaterialProperty.dispatch(writer::openGridProperty));
            Optional.ofNullable(getImageMaterial()).ifPresent(imageMaterialProperty -> imageMaterialProperty.dispatch(writer::openImageProperty));
            Optional.ofNullable(getPolylineArrowMaterial()).ifPresent(polylineArrowMaterialProperty -> polylineArrowMaterialProperty.dispatch(writer::openPolylineArrowProperty));
            Optional.ofNullable(getPolylineDashMaterial()).ifPresent(polylineDashMaterialProperty -> polylineDashMaterialProperty.dispatch(writer::openPolylineDashProperty));
            Optional.ofNullable(getPolylineGlowMaterial()).ifPresent(polylineGlowMaterialProperty -> polylineGlowMaterialProperty.dispatch(writer::openPolylineGlowProperty));
            Optional.ofNullable(getPolylineOutlineMaterial()).ifPresent(polylineOutlineMaterialProperty -> polylineOutlineMaterialProperty.dispatch(writer::openPolylineOutlineProperty));
            Optional.ofNullable(getSolidColorMaterial()).ifPresent(solidColorMaterialProperty -> solidColorMaterialProperty.dispatch(writer::openSolidColorProperty));
            Optional.ofNullable(getStripeMaterial()).ifPresent(stripeMaterialProperty -> stripeMaterialProperty.dispatch(writer::openStripeProperty));

            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
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
    public PolylineArrowMaterialProperty getPolylineArrowMaterial() {
        return polylineArrowMaterial;
    }

    public void setPolylineArrowMaterial(PolylineArrowMaterialProperty polylineArrowMaterial) {
        this.polylineArrowMaterial = polylineArrowMaterial;
    }

    @Override
    public PolylineDashMaterialProperty getPolylineDashMaterial() {
        return polylineDashMaterial;
    }

    public void setPolylineDashMaterial(PolylineDashMaterialProperty polylineDashMaterial) {
        this.polylineDashMaterial = polylineDashMaterial;
    }

    @Override
    public PolylineGlowMaterialProperty getPolylineGlowMaterial() {
        return polylineGlowMaterial;
    }

    public void setPolylineGlowMaterial(PolylineGlowMaterialProperty polylineGlowMaterial) {
        this.polylineGlowMaterial = polylineGlowMaterial;
    }

    @Override
    public PolylineOutlineMaterialProperty getPolylineOutlineMaterial() {
        return polylineOutlineMaterial;
    }

    public void setPolylineOutlineMaterial(PolylineOutlineMaterialProperty polylineOutlineMaterial) {
        this.polylineOutlineMaterial = polylineOutlineMaterial;
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
    public List<PolylineMaterialProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<PolylineMaterialProperty> intervals) {
        this.intervals = intervals;
    }

    public static final class Builder {
        private CheckerboardMaterialProperty checkerboardMaterial;
        private GridMaterialProperty gridMaterial;
        private ImageMaterialProperty imageMaterial;
        private PolylineArrowMaterialProperty polylineArrowMaterial;
        private PolylineDashMaterialProperty polylineDashMaterial;
        private PolylineGlowMaterialProperty polylineGlowMaterial;
        private PolylineOutlineMaterialProperty polylineOutlineMaterial;
        private SolidColorMaterialProperty solidColorMaterial;
        private StripeMaterialProperty stripeMaterial;

        protected TimeInterval interval;
        protected List<PolylineMaterialProperty> intervals;

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

        public Builder withPolylineArrowMaterial(PolylineArrowMaterialProperty polylineArrowMaterial) {
            this.polylineArrowMaterial = polylineArrowMaterial;
            return this;
        }

        public Builder withPolylineDashMaterial(PolylineDashMaterialProperty polylineDashMaterial) {
            this.polylineDashMaterial = polylineDashMaterial;
            return this;
        }

        public Builder withPolylineGlowMaterial(PolylineGlowMaterialProperty polylineGlowMaterial) {
            this.polylineGlowMaterial = polylineGlowMaterial;
            return this;
        }

        public Builder withPolylineOutlineMaterial(PolylineOutlineMaterialProperty polylineOutlineMaterial) {
            this.polylineOutlineMaterial = polylineOutlineMaterial;
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

        public Builder withIntervals(List<PolylineMaterialProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public PolylineMaterialPropertyImpl build() {
            PolylineMaterialPropertyImpl polylineMaterialPropertyImpl = new PolylineMaterialPropertyImpl();
            polylineMaterialPropertyImpl.setCheckerboardMaterial(checkerboardMaterial);
            polylineMaterialPropertyImpl.setGridMaterial(gridMaterial);
            polylineMaterialPropertyImpl.setImageMaterial(imageMaterial);
            polylineMaterialPropertyImpl.setPolylineArrowMaterial(polylineArrowMaterial);
            polylineMaterialPropertyImpl.setPolylineDashMaterial(polylineDashMaterial);
            polylineMaterialPropertyImpl.setPolylineGlowMaterial(polylineGlowMaterial);
            polylineMaterialPropertyImpl.setPolylineOutlineMaterial(polylineOutlineMaterial);
            polylineMaterialPropertyImpl.setSolidColorMaterial(solidColorMaterial);
            polylineMaterialPropertyImpl.setStripeMaterial(stripeMaterial);
            polylineMaterialPropertyImpl.setInterval(interval);
            polylineMaterialPropertyImpl.setIntervals(intervals);
            return polylineMaterialPropertyImpl;
        }
    }
}
