package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.CustomPatternSensorCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public interface CustomPatternSensorGraphics extends Graphics<CustomPatternSensorGraphics, CustomPatternSensorCesiumWriter> {

    static CustomPatternSensorGraphicsAdapter.Builder newBuilder() {
        return CustomPatternSensorGraphicsAdapter.Builder.newBuilder();
    }

    DirectionListProperty getDirections();

    MaterialProperty getDomeSurfaceMaterial();

    MaterialProperty getEllipsoidHorizonSurfaceMaterial();

    MaterialProperty getEllipsoidSurfaceMaterial();

    BooleanProperty getEnvironmentConstraint();

    ColorProperty getEnvironmentIntersectionColor();

    DoubleProperty getEnvironmentIntersectionWidth();

    MaterialProperty getEnvironmentOcclusionMaterial();

    ColorProperty getIntersectionColor();

    DoubleProperty getIntersectionWidth();

    MaterialProperty getLateralSurfaceMaterial();

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
    List<CustomPatternSensorGraphics> getIntervals();

    @Override
    void dispatch(Supplier<CustomPatternSensorCesiumWriter> supplier);
}
