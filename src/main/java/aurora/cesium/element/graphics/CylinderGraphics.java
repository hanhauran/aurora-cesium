package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.CesiumHeightReference;
import cesiumlanguagewriter.CylinderCesiumWriter;
import cesiumlanguagewriter.Bounds;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface CylinderGraphics extends Graphics<CylinderGraphics, CylinderCesiumWriter> {

    static CylinderGraphicsAdapter.Builder newBuilder() {
        return CylinderGraphicsAdapter.Builder.newBuilder();
    }

    /**
     * Gets or sets the numeric Property specifying the radius of the bottom of the cylinder.
     */
    DoubleProperty getBottomRadius();

    /**
     * Gets or sets the {@link Bounds} Property specifying at what distance from the camera that this cylinder will be displayed.
     */
    DistanceDisplayConditionProperty getDistanceDisplayCondition();

    /**
     * Gets or sets the boolean Property specifying whether the cylinder is filled with the provided material.
     */
    BooleanProperty getFill();

    /**
     * Gets or sets the Property specifying the {@link CesiumHeightReference}.
     */
    HeightReferenceProperty getHeightReference();

    /**
     * Gets or sets the numeric Property specifying the length of the cylinder.
     */
    DoubleProperty getLength();

    /**
     * Gets or sets the Property specifying the material used to fill the cylinder.
     */
    MaterialProperty getMaterial();

    /**
     * Gets or sets the Property specifying the number of vertical lines to draw along the perimeter for the outline.
     */
    IntegerProperty getNumberOfVerticalLines();

    /**
     * Gets or sets the boolean Property specifying whether the cylinder is outlined.
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
     * Get or sets the enum Property specifying whether the cylinder
     * casts or receives shadows from light sources.
     */
    ShadowModeProperty getShadows();

    /**
     * Gets or sets the boolean Property specifying the visibility of the cylinder.
     */
    @Override
    BooleanProperty getShow();

    /**
     * Gets or sets the Property specifying the number of edges around the perimeter of the cylinder.
     */
    IntegerProperty getSlices();

    /**
     * Gets or sets the numeric Property specifying the radius of the top of the cylinder.
     */
    DoubleProperty getTopRadius();

    @Override
    TimeInterval getInterval();

    @Override
    List<CylinderGraphics> getIntervals();

    @Override
    void dispatch(Supplier<CylinderCesiumWriter> supplier);
}
