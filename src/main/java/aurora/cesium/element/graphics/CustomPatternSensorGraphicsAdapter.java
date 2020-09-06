package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.CustomPatternSensorCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
class CustomPatternSensorGraphicsAdapter extends GraphicsAdapter<CustomPatternSensorGraphics, CustomPatternSensorCesiumWriter> {

    private DirectionListProperty directions;

    private MaterialProperty domeSurfaceMaterial;

    private MaterialProperty ellipsoidHorizonSurfaceMaterial;

    private MaterialProperty ellipsoidSurfaceMaterial;

    private BooleanProperty environmentConstraint;

    private ColorProperty environmentIntersectionColor;

    private DoubleProperty environmentIntersectionWidth;

    private MaterialProperty environmentOcclusionMaterial;

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

    @Override
    public void dispatch(Supplier<CustomPatternSensorCesiumWriter> supplier) {
        try (CustomPatternSensorCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getDirections()).ifPresent(directionListProperty -> directionListProperty.dispatch(writer::openDirectionsProperty));
            Optional.ofNullable(getDomeSurfaceMaterial()).ifPresent(materialProperty -> materialProperty.dispatch(writer::openDomeSurfaceMaterialProperty));
            Optional.ofNullable(getEllipsoidHorizonSurfaceMaterial()).ifPresent(materialProperty -> materialProperty.dispatch(writer::openEllipsoidHorizonSurfaceMaterialProperty));
            Optional.ofNullable(getEllipsoidSurfaceMaterial()).ifPresent(materialProperty -> materialProperty.dispatch(writer::openEllipsoidSurfaceMaterialProperty));
            Optional.ofNullable(getEnvironmentConstraint()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openEnvironmentConstraintProperty));
            Optional.ofNullable(getEnvironmentIntersectionColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openEnvironmentIntersectionColorProperty));
            Optional.ofNullable(getEnvironmentIntersectionWidth()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openEnvironmentIntersectionWidthProperty));
            Optional.ofNullable(getEnvironmentOcclusionMaterial()).ifPresent(materialProperty -> materialProperty.dispatch(writer::openEnvironmentOcclusionMaterialProperty));
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
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
        }
    }

    public DirectionListProperty getDirections() {
        return directions;
    }

    public void setDirections(DirectionListProperty directions) {
        this.directions = directions;
    }

    public MaterialProperty getDomeSurfaceMaterial() {
        return domeSurfaceMaterial;
    }

    public void setDomeSurfaceMaterial(MaterialProperty domeSurfaceMaterial) {
        this.domeSurfaceMaterial = domeSurfaceMaterial;
    }

    public MaterialProperty getEllipsoidHorizonSurfaceMaterial() {
        return ellipsoidHorizonSurfaceMaterial;
    }

    public void setEllipsoidHorizonSurfaceMaterial(MaterialProperty ellipsoidHorizonSurfaceMaterial) {
        this.ellipsoidHorizonSurfaceMaterial = ellipsoidHorizonSurfaceMaterial;
    }

    public MaterialProperty getEllipsoidSurfaceMaterial() {
        return ellipsoidSurfaceMaterial;
    }

    public void setEllipsoidSurfaceMaterial(MaterialProperty ellipsoidSurfaceMaterial) {
        this.ellipsoidSurfaceMaterial = ellipsoidSurfaceMaterial;
    }

    public BooleanProperty getEnvironmentConstraint() {
        return environmentConstraint;
    }

    public void setEnvironmentConstraint(BooleanProperty environmentConstraint) {
        this.environmentConstraint = environmentConstraint;
    }

    public ColorProperty getEnvironmentIntersectionColor() {
        return environmentIntersectionColor;
    }

    public void setEnvironmentIntersectionColor(ColorProperty environmentIntersectionColor) {
        this.environmentIntersectionColor = environmentIntersectionColor;
    }

    public DoubleProperty getEnvironmentIntersectionWidth() {
        return environmentIntersectionWidth;
    }

    public void setEnvironmentIntersectionWidth(DoubleProperty environmentIntersectionWidth) {
        this.environmentIntersectionWidth = environmentIntersectionWidth;
    }

    public MaterialProperty getEnvironmentOcclusionMaterial() {
        return environmentOcclusionMaterial;
    }

    public void setEnvironmentOcclusionMaterial(MaterialProperty environmentOcclusionMaterial) {
        this.environmentOcclusionMaterial = environmentOcclusionMaterial;
    }

    public ColorProperty getIntersectionColor() {
        return intersectionColor;
    }

    public void setIntersectionColor(ColorProperty intersectionColor) {
        this.intersectionColor = intersectionColor;
    }

    public DoubleProperty getIntersectionWidth() {
        return intersectionWidth;
    }

    public void setIntersectionWidth(DoubleProperty intersectionWidth) {
        this.intersectionWidth = intersectionWidth;
    }

    public MaterialProperty getLateralSurfaceMaterial() {
        return lateralSurfaceMaterial;
    }

    public void setLateralSurfaceMaterial(MaterialProperty lateralSurfaceMaterial) {
        this.lateralSurfaceMaterial = lateralSurfaceMaterial;
    }

    public SensorVolumePortionToDisplayProperty getPortionToDisplay() {
        return portionToDisplay;
    }

    public void setPortionToDisplay(SensorVolumePortionToDisplayProperty portionToDisplay) {
        this.portionToDisplay = portionToDisplay;
    }

    public DoubleProperty getRadius() {
        return radius;
    }

    public void setRadius(DoubleProperty radius) {
        this.radius = radius;
    }

    public BooleanProperty getShowDomeSurfaces() {
        return showDomeSurfaces;
    }

    public void setShowDomeSurfaces(BooleanProperty showDomeSurfaces) {
        this.showDomeSurfaces = showDomeSurfaces;
    }

    public BooleanProperty getShowEllipsoidHorizonSurfaces() {
        return showEllipsoidHorizonSurfaces;
    }

    public void setShowEllipsoidHorizonSurfaces(BooleanProperty showEllipsoidHorizonSurfaces) {
        this.showEllipsoidHorizonSurfaces = showEllipsoidHorizonSurfaces;
    }

    public BooleanProperty getShowEllipsoidSurfaces() {
        return showEllipsoidSurfaces;
    }

    public void setShowEllipsoidSurfaces(BooleanProperty showEllipsoidSurfaces) {
        this.showEllipsoidSurfaces = showEllipsoidSurfaces;
    }

    public BooleanProperty getShowEnvironmentIntersection() {
        return showEnvironmentIntersection;
    }

    public void setShowEnvironmentIntersection(BooleanProperty showEnvironmentIntersection) {
        this.showEnvironmentIntersection = showEnvironmentIntersection;
    }

    public BooleanProperty getShowEnvironmentOcclusion() {
        return showEnvironmentOcclusion;
    }

    public void setShowEnvironmentOcclusion(BooleanProperty showEnvironmentOcclusion) {
        this.showEnvironmentOcclusion = showEnvironmentOcclusion;
    }

    public BooleanProperty getShowIntersection() {
        return showIntersection;
    }

    public void setShowIntersection(BooleanProperty showIntersection) {
        this.showIntersection = showIntersection;
    }

    public BooleanProperty getShowLateralSurfaces() {
        return showLateralSurfaces;
    }

    public void setShowLateralSurfaces(BooleanProperty showLateralSurfaces) {
        this.showLateralSurfaces = showLateralSurfaces;
    }

    public BooleanProperty getShowThroughEllipsoid() {
        return showThroughEllipsoid;
    }

    public void setShowThroughEllipsoid(BooleanProperty showThroughEllipsoid) {
        this.showThroughEllipsoid = showThroughEllipsoid;
    }


    public static final class Builder {
        protected BooleanProperty show;
        private DirectionListProperty directions;
        private MaterialProperty domeSurfaceMaterial;
        private MaterialProperty ellipsoidHorizonSurfaceMaterial;
        private MaterialProperty ellipsoidSurfaceMaterial;
        private BooleanProperty environmentConstraint;
        private ColorProperty environmentIntersectionColor;
        private DoubleProperty environmentIntersectionWidth;
        private MaterialProperty environmentOcclusionMaterial;
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

        protected TimeInterval interval;
        protected List<CustomPatternSensorGraphics> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withDirections(DirectionListProperty directions) {
            this.directions = directions;
            return this;
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

        public Builder withEnvironmentOcclusionMaterial(MaterialProperty environmentOcclusionMaterial) {
            this.environmentOcclusionMaterial = environmentOcclusionMaterial;
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

        public Builder withShow(BooleanProperty show) {
            this.show = show;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<CustomPatternSensorGraphics> intervals) {
            this.intervals = intervals;
            return this;
        }

        public CustomPatternSensorGraphicsAdapter build() {
            CustomPatternSensorGraphicsAdapter customPatternSensorGraphicsAdapter = new CustomPatternSensorGraphicsAdapter();
            customPatternSensorGraphicsAdapter.setDirections(directions);
            customPatternSensorGraphicsAdapter.setDomeSurfaceMaterial(domeSurfaceMaterial);
            customPatternSensorGraphicsAdapter.setEllipsoidHorizonSurfaceMaterial(ellipsoidHorizonSurfaceMaterial);
            customPatternSensorGraphicsAdapter.setEllipsoidSurfaceMaterial(ellipsoidSurfaceMaterial);
            customPatternSensorGraphicsAdapter.setEnvironmentConstraint(environmentConstraint);
            customPatternSensorGraphicsAdapter.setEnvironmentIntersectionColor(environmentIntersectionColor);
            customPatternSensorGraphicsAdapter.setEnvironmentIntersectionWidth(environmentIntersectionWidth);
            customPatternSensorGraphicsAdapter.setEnvironmentOcclusionMaterial(environmentOcclusionMaterial);
            customPatternSensorGraphicsAdapter.setIntersectionColor(intersectionColor);
            customPatternSensorGraphicsAdapter.setIntersectionWidth(intersectionWidth);
            customPatternSensorGraphicsAdapter.setLateralSurfaceMaterial(lateralSurfaceMaterial);
            customPatternSensorGraphicsAdapter.setPortionToDisplay(portionToDisplay);
            customPatternSensorGraphicsAdapter.setRadius(radius);
            customPatternSensorGraphicsAdapter.setShowDomeSurfaces(showDomeSurfaces);
            customPatternSensorGraphicsAdapter.setShowEllipsoidHorizonSurfaces(showEllipsoidHorizonSurfaces);
            customPatternSensorGraphicsAdapter.setShowEllipsoidSurfaces(showEllipsoidSurfaces);
            customPatternSensorGraphicsAdapter.setShowEnvironmentIntersection(showEnvironmentIntersection);
            customPatternSensorGraphicsAdapter.setShowEnvironmentOcclusion(showEnvironmentOcclusion);
            customPatternSensorGraphicsAdapter.setShowIntersection(showIntersection);
            customPatternSensorGraphicsAdapter.setShowLateralSurfaces(showLateralSurfaces);
            customPatternSensorGraphicsAdapter.setShowThroughEllipsoid(showThroughEllipsoid);
            customPatternSensorGraphicsAdapter.setShow(show);
            customPatternSensorGraphicsAdapter.setInterval(interval);
            customPatternSensorGraphicsAdapter.setIntervals(intervals);
            return customPatternSensorGraphicsAdapter;
        }
    }
}
