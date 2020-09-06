package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.ConicSensorCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public interface ConicSensorGraphics extends Graphics<ConicSensorGraphics, ConicSensorCesiumWriter> {

    static ConicSensorGraphicsAdapter.Builder newBuilder() {
        return ConicSensorGraphicsAdapter.Builder.newBuilder();
    }

    MaterialProperty getDomeSurfaceMaterial();

    MaterialProperty getEllipsoidHorizonSurfaceMaterial();

    MaterialProperty getEllipsoidSurfaceMaterial();

    BooleanProperty getEnvironmentConstraint();

    ColorProperty getEnvironmentIntersectionColor();

    DoubleProperty getEnvironmentIntersectionWidth();

    MaterialProperty getEnvironmentOcclusionMaterial();

    DoubleProperty getInnerHalfAngle();

    ColorProperty getIntersectionColor();

    DoubleProperty getIntersectionWidth();

    MaterialProperty getLateralSurfaceMaterial();

    DoubleProperty getMaximumClockAngle();

    DoubleProperty getMinimumClockAngle();

    DoubleProperty getOuterHalfAngle();

    SensorVolumePortionToDisplayProperty getPortionToDisplay();

    DoubleProperty getRadius();

    @Override
    BooleanProperty getShow();

    BooleanProperty getShowDomeSurfaces();

    BooleanProperty getShowEllipsoidHorizonSurfaces();

    BooleanProperty getShowEllipsoidSurfaces();

    BooleanProperty getShowEnvironmentIntersection();

    BooleanProperty getShowEnvironmentOcclusion();

    BooleanProperty getShowIntersection();

    BooleanProperty getShowLateralSurfaces();

    BooleanProperty getShowThroughEllipsoid();

    @Override
    TimeInterval getInterval();

    @Override
    List<ConicSensorGraphics> getIntervals();

    @Override
    void dispatch(Supplier<ConicSensorCesiumWriter> supplier);
}
