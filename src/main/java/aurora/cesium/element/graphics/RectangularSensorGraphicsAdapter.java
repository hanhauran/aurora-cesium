package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.RectangularSensorCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
class RectangularSensorGraphicsAdapter extends GraphicsAdapter<RectangularSensorGraphics, RectangularSensorCesiumWriter> implements RectangularSensorGraphics {

    private MaterialProperty domeSurfaceMaterial;

    private MaterialProperty ellipsoidHorizonSurfaceMaterial;

    private MaterialProperty ellipsoidSurfaceMaterial;

    private BooleanProperty environmentConstraint;

    private ColorProperty environmentIntersectionColor;

    private DoubleProperty environmentIntersectionWidth;

    private MaterialProperty ellipsoidOcclusionMaterial;

    private ColorProperty intersectionColor;

    private DoubleProperty intersectionWidth;

    private MaterialProperty lateralSurfaceMaterial;

    private SensorVolumePortionToDisplayProperty portionToDisplay;

    private DoubleProperty radius;

    private BooleanProperty showDomeSurfaces;

    private BooleanProperty showEllipsoidHorizonSurfaces;

    private BooleanProperty showEllipsoidSurfaces;

    private BooleanProperty showEnvironmentIntersection;

    private BooleanProperty showEnvironmentOcclusion;

    private BooleanProperty showIntersection;

    private BooleanProperty showLateralSurfaces;

    private BooleanProperty showThroughEllipsoid;

    private DoubleProperty xHalfAngle;

    private DoubleProperty yHalfAngle;

    @Override
    public void dispatch(Supplier<RectangularSensorCesiumWriter> supplier) {
        try (RectangularSensorCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getDomeSurfaceMaterial()).ifPresent(materialProperty -> materialProperty.dispatch(writer::openDomeSurfaceMaterialProperty));
            Optional.ofNullable(getEllipsoidHorizonSurfaceMaterial()).ifPresent(materialProperty -> materialProperty.dispatch(writer::openEllipsoidHorizonSurfaceMaterialProperty));
            Optional.ofNullable(getEllipsoidSurfaceMaterial()).ifPresent(materialProperty -> materialProperty.dispatch(writer::openEllipsoidSurfaceMaterialProperty));
            Optional.ofNullable(getEnvironmentConstraint()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openEnvironmentConstraintProperty));
            Optional.ofNullable(getEnvironmentIntersectionColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openEnvironmentIntersectionColorProperty));
            Optional.ofNullable(getEnvironmentIntersectionWidth()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openEnvironmentIntersectionWidthProperty));
            Optional.ofNullable(getEllipsoidOcclusionMaterial()).ifPresent(materialProperty -> materialProperty.dispatch(writer::openEnvironmentOcclusionMaterialProperty));
            Optional.ofNullable(getIntersectionColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openIntersectionColorProperty));
            Optional.ofNullable(getIntersectionWidth()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openIntersectionWidthProperty));
            Optional.ofNullable(getLateralSurfaceMaterial()).ifPresent(materialProperty -> materialProperty.dispatch(writer::openLateralSurfaceMaterialProperty));
            Optional.ofNullable(getPortionToDisplay()).ifPresent(sensorVolumePortionToDisplayProperty -> sensorVolumePortionToDisplayProperty.dispatch(writer::openPortionToDisplayProperty));
            Optional.ofNullable(getRadius()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openRadiusProperty));
            Optional.ofNullable(getShow()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openShowProperty));
            Optional.ofNullable(getShowDomeSurfaces()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openShowDomeSurfacesProperty));
            Optional.ofNullable(getShowEllipsoidHorizonSurfaces()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openShowEllipsoidHorizonSurfacesProperty));
            Optional.ofNullable(getShowEllipsoidSurfaces()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openShowEllipsoidSurfacesProperty));
            Optional.ofNullable(getShowEnvironmentIntersection()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openShowEnvironmentIntersectionProperty));
            Optional.ofNullable(getShowEnvironmentOcclusion()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openShowEnvironmentOcclusionProperty));
            Optional.ofNullable(getShowIntersection()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openShowIntersectionProperty));
            Optional.ofNullable(getShowLateralSurfaces()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openShowLateralSurfacesProperty));
            Optional.ofNullable(getShowThroughEllipsoid()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openShowThroughEllipsoidProperty));
            Optional.ofNullable(getXHalfAngle()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openXHalfAngleProperty));
            Optional.ofNullable(getYHalfAngle()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openYHalfAngleProperty));
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
        }
    }

    @Override
    public MaterialProperty getDomeSurfaceMaterial() {
        return domeSurfaceMaterial;
    }

    public void setDomeSurfaceMaterial(MaterialProperty domeSurfaceMaterial) {
        this.domeSurfaceMaterial = domeSurfaceMaterial;
    }

    @Override
    public MaterialProperty getEllipsoidHorizonSurfaceMaterial() {
        return ellipsoidHorizonSurfaceMaterial;
    }

    public void setEllipsoidHorizonSurfaceMaterial(MaterialProperty ellipsoidHorizonSurfaceMaterial) {
        this.ellipsoidHorizonSurfaceMaterial = ellipsoidHorizonSurfaceMaterial;
    }

    @Override
    public MaterialProperty getEllipsoidSurfaceMaterial() {
        return ellipsoidSurfaceMaterial;
    }

    public void setEllipsoidSurfaceMaterial(MaterialProperty ellipsoidSurfaceMaterial) {
        this.ellipsoidSurfaceMaterial = ellipsoidSurfaceMaterial;
    }

    @Override
    public BooleanProperty getEnvironmentConstraint() {
        return environmentConstraint;
    }

    public void setEnvironmentConstraint(BooleanProperty environmentConstraint) {
        this.environmentConstraint = environmentConstraint;
    }

    @Override
    public ColorProperty getEnvironmentIntersectionColor() {
        return environmentIntersectionColor;
    }

    public void setEnvironmentIntersectionColor(ColorProperty environmentIntersectionColor) {
        this.environmentIntersectionColor = environmentIntersectionColor;
    }

    @Override
    public DoubleProperty getEnvironmentIntersectionWidth() {
        return environmentIntersectionWidth;
    }

    public void setEnvironmentIntersectionWidth(DoubleProperty environmentIntersectionWidth) {
        this.environmentIntersectionWidth = environmentIntersectionWidth;
    }

    @Override
    public MaterialProperty getEllipsoidOcclusionMaterial() {
        return ellipsoidOcclusionMaterial;
    }

    public void setEllipsoidOcclusionMaterial(MaterialProperty ellipsoidOcclusionMaterial) {
        this.ellipsoidOcclusionMaterial = ellipsoidOcclusionMaterial;
    }

    @Override
    public ColorProperty getIntersectionColor() {
        return intersectionColor;
    }

    public void setIntersectionColor(ColorProperty intersectionColor) {
        this.intersectionColor = intersectionColor;
    }

    @Override
    public DoubleProperty getIntersectionWidth() {
        return intersectionWidth;
    }

    public void setIntersectionWidth(DoubleProperty intersectionWidth) {
        this.intersectionWidth = intersectionWidth;
    }

    @Override
    public MaterialProperty getLateralSurfaceMaterial() {
        return lateralSurfaceMaterial;
    }

    public void setLateralSurfaceMaterial(MaterialProperty lateralSurfaceMaterial) {
        this.lateralSurfaceMaterial = lateralSurfaceMaterial;
    }

    @Override
    public SensorVolumePortionToDisplayProperty getPortionToDisplay() {
        return portionToDisplay;
    }

    public void setPortionToDisplay(SensorVolumePortionToDisplayProperty portionToDisplay) {
        this.portionToDisplay = portionToDisplay;
    }

    @Override
    public DoubleProperty getRadius() {
        return radius;
    }

    public void setRadius(DoubleProperty radius) {
        this.radius = radius;
    }

    @Override
    public BooleanProperty getShowDomeSurfaces() {
        return showDomeSurfaces;
    }

    public void setShowDomeSurfaces(BooleanProperty showDomeSurfaces) {
        this.showDomeSurfaces = showDomeSurfaces;
    }

    @Override
    public BooleanProperty getShowEllipsoidHorizonSurfaces() {
        return showEllipsoidHorizonSurfaces;
    }

    public void setShowEllipsoidHorizonSurfaces(BooleanProperty showEllipsoidHorizonSurfaces) {
        this.showEllipsoidHorizonSurfaces = showEllipsoidHorizonSurfaces;
    }

    @Override
    public BooleanProperty getShowEllipsoidSurfaces() {
        return showEllipsoidSurfaces;
    }

    public void setShowEllipsoidSurfaces(BooleanProperty showEllipsoidSurfaces) {
        this.showEllipsoidSurfaces = showEllipsoidSurfaces;
    }

    @Override
    public BooleanProperty getShowEnvironmentIntersection() {
        return showEnvironmentIntersection;
    }

    public void setShowEnvironmentIntersection(BooleanProperty showEnvironmentIntersection) {
        this.showEnvironmentIntersection = showEnvironmentIntersection;
    }

    @Override
    public BooleanProperty getShowEnvironmentOcclusion() {
        return showEnvironmentOcclusion;
    }

    public void setShowEnvironmentOcclusion(BooleanProperty showEnvironmentOcclusion) {
        this.showEnvironmentOcclusion = showEnvironmentOcclusion;
    }

    @Override
    public BooleanProperty getShowIntersection() {
        return showIntersection;
    }

    public void setShowIntersection(BooleanProperty showIntersection) {
        this.showIntersection = showIntersection;
    }

    @Override
    public BooleanProperty getShowLateralSurfaces() {
        return showLateralSurfaces;
    }

    public void setShowLateralSurfaces(BooleanProperty showLateralSurfaces) {
        this.showLateralSurfaces = showLateralSurfaces;
    }

    @Override
    public BooleanProperty getShowThroughEllipsoid() {
        return showThroughEllipsoid;
    }

    public void setShowThroughEllipsoid(BooleanProperty showThroughEllipsoid) {
        this.showThroughEllipsoid = showThroughEllipsoid;
    }

    public DoubleProperty getXHalfAngle() {
        return xHalfAngle;
    }

    public void setXHalfAngle(DoubleProperty xHalfAngle) {
        this.xHalfAngle = xHalfAngle;
    }

    public DoubleProperty getYHalfAngle() {
        return yHalfAngle;
    }

    public void setYHalfAngle(DoubleProperty yHalfAngle) {
        this.yHalfAngle = yHalfAngle;
    }

    public static final class Builder {
        protected BooleanProperty show;
        private MaterialProperty domeSurfaceMaterial;
        private MaterialProperty ellipsoidHorizonSurfaceMaterial;
        private MaterialProperty ellipsoidSurfaceMaterial;
        private BooleanProperty environmentConstraint;
        private ColorProperty environmentIntersectionColor;
        private DoubleProperty environmentIntersectionWidth;
        private MaterialProperty ellipsoidOcclusionMaterial;
        private ColorProperty intersectionColor;
        private DoubleProperty intersectionWidth;
        private MaterialProperty lateralSurfaceMaterial;
        private SensorVolumePortionToDisplayProperty portionToDisplay;
        private DoubleProperty radius;
        private BooleanProperty showDomeSurfaces;
        private BooleanProperty showEllipsoidHorizonSurfaces;
        private BooleanProperty showEllipsoidSurfaces;
        private BooleanProperty showEnvironmentIntersection;
        private BooleanProperty showEnvironmentOcclusion;
        private BooleanProperty showIntersection;
        private BooleanProperty showLateralSurfaces;
        private BooleanProperty showThroughEllipsoid;
        private DoubleProperty xHalfAngle;
        private DoubleProperty yHalfAngle;

        protected TimeInterval interval;
        protected List<RectangularSensorGraphics> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withDomeSurfaceMaterial(MaterialProperty domeSurfaceMaterial) {
            this.domeSurfaceMaterial = domeSurfaceMaterial;
            return this;
        }

        public Builder withEllipsoidHorizonSurfaceMaterial(MaterialProperty ellipsoidHorizonSurfaceMaterial) {
            this.ellipsoidHorizonSurfaceMaterial = ellipsoidHorizonSurfaceMaterial;
            return this;
        }

        public Builder withEllipsoidSurfaceMaterial(MaterialProperty ellipsoidSurfaceMaterial) {
            this.ellipsoidSurfaceMaterial = ellipsoidSurfaceMaterial;
            return this;
        }

        public Builder withEnvironmentConstraint(BooleanProperty environmentConstraint) {
            this.environmentConstraint = environmentConstraint;
            return this;
        }

        public Builder withEnvironmentIntersectionColor(ColorProperty environmentIntersectionColor) {
            this.environmentIntersectionColor = environmentIntersectionColor;
            return this;
        }

        public Builder withEnvironmentIntersectionWidth(DoubleProperty environmentIntersectionWidth) {
            this.environmentIntersectionWidth = environmentIntersectionWidth;
            return this;
        }

        public Builder withEllipsoidOcclusionMaterial(MaterialProperty ellipsoidOcclusionMaterial) {
            this.ellipsoidOcclusionMaterial = ellipsoidOcclusionMaterial;
            return this;
        }

        public Builder withIntersectionColor(ColorProperty intersectionColor) {
            this.intersectionColor = intersectionColor;
            return this;
        }

        public Builder withIntersectionWidth(DoubleProperty intersectionWidth) {
            this.intersectionWidth = intersectionWidth;
            return this;
        }

        public Builder withLateralSurfaceMaterial(MaterialProperty lateralSurfaceMaterial) {
            this.lateralSurfaceMaterial = lateralSurfaceMaterial;
            return this;
        }

        public Builder withPortionToDisplay(SensorVolumePortionToDisplayProperty portionToDisplay) {
            this.portionToDisplay = portionToDisplay;
            return this;
        }

        public Builder withRadius(DoubleProperty radius) {
            this.radius = radius;
            return this;
        }

        public Builder withShowDomeSurfaces(BooleanProperty showDomeSurfaces) {
            this.showDomeSurfaces = showDomeSurfaces;
            return this;
        }

        public Builder withShowEllipsoidHorizonSurfaces(BooleanProperty showEllipsoidHorizonSurfaces) {
            this.showEllipsoidHorizonSurfaces = showEllipsoidHorizonSurfaces;
            return this;
        }

        public Builder withShowEllipsoidSurfaces(BooleanProperty showEllipsoidSurfaces) {
            this.showEllipsoidSurfaces = showEllipsoidSurfaces;
            return this;
        }

        public Builder withShowEnvironmentIntersection(BooleanProperty showEnvironmentIntersection) {
            this.showEnvironmentIntersection = showEnvironmentIntersection;
            return this;
        }

        public Builder withShowEnvironmentOcclusion(BooleanProperty showEnvironmentOcclusion) {
            this.showEnvironmentOcclusion = showEnvironmentOcclusion;
            return this;
        }

        public Builder withShowIntersection(BooleanProperty showIntersection) {
            this.showIntersection = showIntersection;
            return this;
        }

        public Builder withShowLateralSurfaces(BooleanProperty showLateralSurfaces) {
            this.showLateralSurfaces = showLateralSurfaces;
            return this;
        }

        public Builder withShowThroughEllipsoid(BooleanProperty showThroughEllipsoid) {
            this.showThroughEllipsoid = showThroughEllipsoid;
            return this;
        }

        public Builder withXHalfAngle(DoubleProperty xHalfAngle) {
            this.xHalfAngle = xHalfAngle;
            return this;
        }

        public Builder withYHalfAngle(DoubleProperty yHalfAngle) {
            this.yHalfAngle = yHalfAngle;
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

        public Builder withIntervals(List<RectangularSensorGraphics> intervals) {
            this.intervals = intervals;
            return this;
        }

        public RectangularSensorGraphicsAdapter build() {
            RectangularSensorGraphicsAdapter rectangularSensorGraphicsAdapter = new RectangularSensorGraphicsAdapter();
            rectangularSensorGraphicsAdapter.setDomeSurfaceMaterial(domeSurfaceMaterial);
            rectangularSensorGraphicsAdapter.setEllipsoidHorizonSurfaceMaterial(ellipsoidHorizonSurfaceMaterial);
            rectangularSensorGraphicsAdapter.setEllipsoidSurfaceMaterial(ellipsoidSurfaceMaterial);
            rectangularSensorGraphicsAdapter.setEnvironmentConstraint(environmentConstraint);
            rectangularSensorGraphicsAdapter.setEnvironmentIntersectionColor(environmentIntersectionColor);
            rectangularSensorGraphicsAdapter.setEnvironmentIntersectionWidth(environmentIntersectionWidth);
            rectangularSensorGraphicsAdapter.setEllipsoidOcclusionMaterial(ellipsoidOcclusionMaterial);
            rectangularSensorGraphicsAdapter.setIntersectionColor(intersectionColor);
            rectangularSensorGraphicsAdapter.setIntersectionWidth(intersectionWidth);
            rectangularSensorGraphicsAdapter.setLateralSurfaceMaterial(lateralSurfaceMaterial);
            rectangularSensorGraphicsAdapter.setPortionToDisplay(portionToDisplay);
            rectangularSensorGraphicsAdapter.setRadius(radius);
            rectangularSensorGraphicsAdapter.setShowDomeSurfaces(showDomeSurfaces);
            rectangularSensorGraphicsAdapter.setShowEllipsoidHorizonSurfaces(showEllipsoidHorizonSurfaces);
            rectangularSensorGraphicsAdapter.setShowEllipsoidSurfaces(showEllipsoidSurfaces);
            rectangularSensorGraphicsAdapter.setShowEnvironmentIntersection(showEnvironmentIntersection);
            rectangularSensorGraphicsAdapter.setShowEnvironmentOcclusion(showEnvironmentOcclusion);
            rectangularSensorGraphicsAdapter.setShowIntersection(showIntersection);
            rectangularSensorGraphicsAdapter.setShowLateralSurfaces(showLateralSurfaces);
            rectangularSensorGraphicsAdapter.setShowThroughEllipsoid(showThroughEllipsoid);
            rectangularSensorGraphicsAdapter.setXHalfAngle(xHalfAngle);
            rectangularSensorGraphicsAdapter.setYHalfAngle(yHalfAngle);
            rectangularSensorGraphicsAdapter.setShow(show);
            rectangularSensorGraphicsAdapter.setInterval(interval);
            rectangularSensorGraphicsAdapter.setIntervals(intervals);
            return rectangularSensorGraphicsAdapter;
        }
    }
}
