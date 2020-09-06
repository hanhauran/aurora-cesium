package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.RectangularSensorCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public interface RectangularSensorGraphics extends Graphics<RectangularSensorGraphics, RectangularSensorCesiumWriter> {

    static RectangularSensorGraphicsAdapter.Builder newBuilder() {
        return RectangularSensorGraphicsAdapter.Builder.newBuilder();
    }

    MaterialProperty getDomeSurfaceMaterial();

    MaterialProperty getEllipsoidHorizonSurfaceMaterial();

    MaterialProperty getEllipsoidSurfaceMaterial();

    BooleanProperty getEnvironmentConstraint();

    ColorProperty getEnvironmentIntersectionColor();

    DoubleProperty getEnvironmentIntersectionWidth();

    MaterialProperty getEllipsoidOcclusionMaterial();

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

    DoubleProperty getXHalfAngle();

    DoubleProperty getYHalfAngle();

    @Override
    TimeInterval getInterval();

    @Override
    List<RectangularSensorGraphics> getIntervals();

    @Override
    void dispatch(Supplier<RectangularSensorCesiumWriter> supplier);
}
