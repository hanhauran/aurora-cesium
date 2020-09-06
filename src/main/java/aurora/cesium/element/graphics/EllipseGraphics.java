package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.*;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface EllipseGraphics extends Graphics<EllipseGraphics, EllipseCesiumWriter> {

    static EllipseGraphicsAdapter.Builder newBuilder() {
        return EllipseGraphicsAdapter.Builder.newBuilder();
    }

    /**
     * Gets or sets the {@link CesiumClassificationType} Property specifying whether this ellipse will classify terrain, 3D
     * Tiles, or both when on the ground.
     */
    ClassificationTypeProperty getClassificationType();

    /**
     * Gets or sets the {@link Bounds} Property specifying at what distance from the camera that this ellipse will be displayed.
     */
    DistanceDisplayConditionProperty getDistanceDisplayCondition();

    /**
     * Gets or sets the numeric Property specifying the altitude of the ellipse extrusion.
     * Setting this property creates volume starting at height and ending at this altitude.
     */
    DoubleProperty getExtrudedHeight();

    /**
     * Gets or sets the Property specifying the extruded {@link CesiumHeightReference}.
     */
    HeightReferenceProperty getExtrudedHeightReference();

    /**
     * Gets or sets the boolean Property specifying whether the ellipse is filled with the provided material.
     */
    BooleanProperty getFill();

    /**
     * Gets or sets the numeric Property specifying the angular distance between points on the ellipse.
     */
    DoubleProperty getGranularity();

    /**
     * Gets or sets the numeric Property specifying the altitude of the ellipse.
     */
    DoubleProperty getHeight();

    /**
     * Gets or sets the Property specifying the {@link CesiumHeightReference}.
     */
    HeightReferenceProperty getHeightReference();

    /**
     * Gets or sets the Property specifying the material used to fill the ellipse.
     */
    MaterialProperty getMaterial();

    /**
     * Gets or sets the numeric Property specifying the number of vertical lines to draw along the perimeter for the outline.
     */
    IntegerProperty getNumberOfVerticalLines();

    /**
     * Gets or sets the Property specifying whether the ellipse is outlined.
     */
    BooleanProperty getOutline();

    /**
     * Gets or sets the Property specifying the {@link java.awt.Color} of the outline.
     */
    ColorProperty getOutlineColor();

    /**
     * Gets or sets the numeric Property specifying the width of the outline.
     */
    DoubleProperty getOutlineWidth();

    /**
     * Gets or sets the numeric property specifying the rotation of the ellipse clockwise from north.
     */
    DoubleProperty getRotation();

    /**
     * Gets or sets the numeric Property specifying the semi-major axis.
     */
    DoubleProperty getSemiMajorAxis();

    /**
     * Gets or sets the numeric Property specifying the semi-minor axis.
     */
    DoubleProperty getSemiMinorAxis();

    /**
     * Get or sets the enum Property specifying whether the ellipse
     * casts or receives shadows from light sources.
     */
    ShadowModeProperty getShadows();

    /**
     * Gets or sets the boolean Property specifying the visibility of the ellipse.
     */
    @Override
    BooleanProperty getShow();

    /**
     * Gets or sets the numeric property specifying the rotation of the ellipse texture counter-clockwise from north.
     */
    DoubleProperty getStRotation();

    /**
     * Gets or sets the zIndex Property specifying the ellipse ordering.  Only has an effect if the ellipse is constant and neither height or extrudedHeight
     * are specified
     */
    IntegerProperty getZIndex();

    @Override
    TimeInterval getInterval();

    @Override
    List<EllipseGraphics> getIntervals();

    @Override
    void dispatch(Supplier<EllipseCesiumWriter> supplier);
}
