package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.ConicSensorCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
class ConicSensorGraphicsAdapter extends GraphicsAdapter<ConicSensorGraphics, ConicSensorCesiumWriter> implements ConicSensorGraphics {

    private MaterialProperty domeSurfaceMaterial;

    private MaterialProperty ellipsoidHorizonSurfaceMaterial;

    private MaterialProperty ellipsoidSurfaceMaterial;

    private BooleanProperty environmentConstraint;

    private ColorProperty environmentIntersectionColor;

    private DoubleProperty environmentIntersectionWidth;

    private MaterialProperty environmentOcclusionMaterial;

    private DoubleProperty innerHalfAngle;

    private ColorProperty intersectionColor;

    private DoubleProperty intersectionWidth;

    private MaterialProperty lateralSurfaceMaterial;

    private DoubleProperty maximumClockAngle;

    private DoubleProperty minimumClockAngle;

    private DoubleProperty outerHalfAngle;

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
    public void dispatch(Supplier<ConicSensorCesiumWriter> supplier) {
        try (ConicSensorCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getDomeSurfaceMaterial()).ifPresent(materialProperty -> materialProperty.dispatch(writer::openDomeSurfaceMaterialProperty));
            Optional.ofNullable(getEllipsoidHorizonSurfaceMaterial()).ifPresent(materialProperty -> materialProperty.dispatch(writer::openEllipsoidHorizonSurfaceMaterialProperty));
            Optional.ofNullable(getEllipsoidSurfaceMaterial()).ifPresent(materialProperty -> materialProperty.dispatch(writer::openEllipsoidSurfaceMaterialProperty));
            Optional.ofNullable(getEnvironmentConstraint()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openEnvironmentConstraintProperty));
            Optional.ofNullable(getEnvironmentIntersectionColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openEnvironmentIntersectionColorProperty));
            Optional.ofNullable(getEnvironmentIntersectionWidth()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openEnvironmentIntersectionWidthProperty));
            Optional.ofNullable(getEnvironmentOcclusionMaterial()).ifPresent(materialProperty -> materialProperty.dispatch(writer::openEnvironmentOcclusionMaterialProperty));
            Optional.ofNullable(getInnerHalfAngle()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openInnerHalfAngleProperty));
            Optional.ofNullable(getIntersectionColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openIntersectionColorProperty));
            Optional.ofNullable(getIntersectionWidth()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openIntersectionWidthProperty));
            Optional.ofNullable(getLateralSurfaceMaterial()).ifPresent(materialProperty -> materialProperty.dispatch(writer::openLateralSurfaceMaterialProperty));
            Optional.ofNullable(getMaximumClockAngle()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openMaximumClockAngleProperty));
            Optional.ofNullable(getMinimumClockAngle()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openMinimumClockAngleProperty));
            Optional.ofNullable(getOuterHalfAngle()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openOuterHalfAngleProperty));
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

    public DoubleProperty getInnerHalfAngle() {
        return innerHalfAngle;
    }

    public void setInnerHalfAngle(DoubleProperty innerHalfAngle) {
        this.innerHalfAngle = innerHalfAngle;
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

    public DoubleProperty getMaximumClockAngle() {
        return maximumClockAngle;
    }

    public void setMaximumClockAngle(DoubleProperty maximumClockAngle) {
        this.maximumClockAngle = maximumClockAngle;
    }

    public DoubleProperty getMinimumClockAngle() {
        return minimumClockAngle;
    }

    public void setMinimumClockAngle(DoubleProperty minimumClockAngle) {
        this.minimumClockAngle = minimumClockAngle;
    }

    @Override
    public DoubleProperty getOuterHalfAngle() {
        return outerHalfAngle;
    }

    public void setOuterHalfAngle(DoubleProperty outerHalfAngle) {
        this.outerHalfAngle = outerHalfAngle;
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
        private MaterialProperty domeSurfaceMaterial;
        private MaterialProperty ellipsoidHorizonSurfaceMaterial;
        private MaterialProperty ellipsoidSurfaceMaterial;
        private BooleanProperty environmentConstraint;
        private ColorProperty environmentIntersectionColor;
        private DoubleProperty environmentIntersectionWidth;
        private MaterialProperty environmentOcclusionMaterial;
        private DoubleProperty innerHalfAngle;
        private ColorProperty intersectionColor;
        private DoubleProperty intersectionWidth;
        private MaterialProperty lateralSurfaceMaterial;
        private DoubleProperty maximumClockAngle;
        private DoubleProperty minimumClockAngle;
        private DoubleProperty outerHalfAngle;
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
        protected List<ConicSensorGraphics> intervals;

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

        public Builder withEnvironmentOcclusionMaterial(MaterialProperty environmentOcclusionMaterial) {
            this.environmentOcclusionMaterial = environmentOcclusionMaterial;
            return this;
        }

        public Builder withInnerHalfAngle(DoubleProperty innerHalfAngle) {
            this.innerHalfAngle = innerHalfAngle;
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

        public Builder withMaximumClockAngle(DoubleProperty maximumClockAngle) {
            this.maximumClockAngle = maximumClockAngle;
            return this;
        }

        public Builder withMinimumClockAngle(DoubleProperty minimumClockAngle) {
            this.minimumClockAngle = minimumClockAngle;
            return this;
        }

        public Builder withOuterHalfAngle(DoubleProperty outerHalfAngle) {
            this.outerHalfAngle = outerHalfAngle;
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

        public Builder withIntervals(List<ConicSensorGraphics> intervals) {
            this.intervals = intervals;
            return this;
        }

        public ConicSensorGraphicsAdapter build() {
            ConicSensorGraphicsAdapter conicSensorGraphicsAdapter = new ConicSensorGraphicsAdapter();
            conicSensorGraphicsAdapter.setDomeSurfaceMaterial(domeSurfaceMaterial);
            conicSensorGraphicsAdapter.setEllipsoidHorizonSurfaceMaterial(ellipsoidHorizonSurfaceMaterial);
            conicSensorGraphicsAdapter.setEllipsoidSurfaceMaterial(ellipsoidSurfaceMaterial);
            conicSensorGraphicsAdapter.setEnvironmentConstraint(environmentConstraint);
            conicSensorGraphicsAdapter.setEnvironmentIntersectionColor(environmentIntersectionColor);
            conicSensorGraphicsAdapter.setEnvironmentIntersectionWidth(environmentIntersectionWidth);
            conicSensorGraphicsAdapter.setEnvironmentOcclusionMaterial(environmentOcclusionMaterial);
            conicSensorGraphicsAdapter.setInnerHalfAngle(innerHalfAngle);
            conicSensorGraphicsAdapter.setIntersectionColor(intersectionColor);
            conicSensorGraphicsAdapter.setIntersectionWidth(intersectionWidth);
            conicSensorGraphicsAdapter.setLateralSurfaceMaterial(lateralSurfaceMaterial);
            conicSensorGraphicsAdapter.setMaximumClockAngle(maximumClockAngle);
            conicSensorGraphicsAdapter.setMinimumClockAngle(minimumClockAngle);
            conicSensorGraphicsAdapter.setOuterHalfAngle(outerHalfAngle);
            conicSensorGraphicsAdapter.setPortionToDisplay(portionToDisplay);
            conicSensorGraphicsAdapter.setRadius(radius);
            conicSensorGraphicsAdapter.setShowDomeSurfaces(showDomeSurfaces);
            conicSensorGraphicsAdapter.setShowEllipsoidHorizonSurfaces(showEllipsoidHorizonSurfaces);
            conicSensorGraphicsAdapter.setShowEllipsoidSurfaces(showEllipsoidSurfaces);
            conicSensorGraphicsAdapter.setShowEnvironmentIntersection(showEnvironmentIntersection);
            conicSensorGraphicsAdapter.setShowEnvironmentOcclusion(showEnvironmentOcclusion);
            conicSensorGraphicsAdapter.setShowIntersection(showIntersection);
            conicSensorGraphicsAdapter.setShowLateralSurfaces(showLateralSurfaces);
            conicSensorGraphicsAdapter.setShowThroughEllipsoid(showThroughEllipsoid);
            conicSensorGraphicsAdapter.setShow(show);
            conicSensorGraphicsAdapter.setInterval(interval);
            conicSensorGraphicsAdapter.setIntervals(intervals);
            return conicSensorGraphicsAdapter;
        }
    }
}
