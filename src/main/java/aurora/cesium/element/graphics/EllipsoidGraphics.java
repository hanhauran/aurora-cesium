package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.*;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface EllipsoidGraphics extends Graphics<EllipsoidGraphics, EllipsoidCesiumWriter> {

    static EllipseGraphicsAdapter.Builder newBuilder() {
        return EllipseGraphicsAdapter.Builder.newBuilder();
    }

    /**
     * Gets or sets the {@link Bounds} Property specifying at what distance from the camera that this ellipsoid will be displayed.
     */
    DistanceDisplayConditionProperty getDistanceDisplayCondition();

    /**
     * Gets or sets the boolean Property specifying whether the ellipsoid is filled with the provided material.
     */
    BooleanProperty getFill();

    /**
     * Gets or sets the Property specifying the {@link CesiumHeightReference}.
     */
    HeightReferenceProperty getHeightReference();

    /**
     * Gets or sets the {@link Cartesian} specifying the inner radii of the ellipsoid.
     */
    EllipsoidRadiiProperty getInnerRadii();

    /**
     * Gets or sets the Property specifying the material used to fill the ellipsoid.
     */
    MaterialProperty getMaterial();

    /**
     * Gets or sets the Property specifying the maximum clock angle of the ellipsoid.
     */
    DoubleProperty getMaximumClock();

    /**
     * Gets or sets the Property specifying the maximum cone angle of the ellipsoid.
     */
    DoubleProperty getMaximumCone();

    /**
     * Gets or sets the Property specifying the minimum clock angle of the ellipsoid.
     */
    DoubleProperty getMinimumClock();

    /**
     * Gets or sets the Property specifying the minimum cone angle of the ellipsoid.
     */
    DoubleProperty getMinimumCone();

    /**
     * Gets or sets the Property specifying whether the ellipsoid is outlined.
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
     * Gets or sets the {@link Cartesian} specifying the radii of the ellipsoid.
     */
    EllipsoidRadiiProperty getRadii();

    /**
     * Get or sets the enum Property specifying whether the ellipsoid
     * casts or receives shadows from light sources.
     */
    ShadowModeProperty getShadows();

    /**
     * Gets or sets the boolean Property specifying the visibility of the ellipsoid.
     */
    @Override
    BooleanProperty getShow();

    /**
     * Gets or sets the Property specifying the number of radial slices per 360 degrees.
     */
    IntegerProperty getSlicePartitions();

    /**
     * Gets or sets the Property specifying the number of stacks.
     */
    IntegerProperty getStackPartitions();

    /**
     * Gets or sets the Property specifying the number of samples per outline ring, determining the granularity of the curvature.
     */
    IntegerProperty getSubDivisions();

    @Override
    TimeInterval getInterval();

    @Override
    List<EllipsoidGraphics> getIntervals();

    @Override
    void dispatch(Supplier<EllipsoidCesiumWriter> supplier);
}
