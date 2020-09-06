package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.BoxCesiumWriter;
import cesiumlanguagewriter.Bounds;
import cesiumlanguagewriter.Cartesian;
import cesiumlanguagewriter.CesiumHeightReference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface BoxGraphics extends Graphics<BoxGraphics, BoxCesiumWriter> {

    static BoxGraphicsAdapter.Builder newBuilder() {
        return BoxGraphicsAdapter.Builder.newBuilder();
    }

    /**
     * Gets or sets {@link Cartesian} Property property specifying the length, width, and height of the box.
     */
    BoxDimensionsProperty getDimensions();

    /**
     * Gets or sets the {@link Bounds} Property specifying at what distance from the camera that this box will be displayed.
     */
    DistanceDisplayConditionProperty getDistanceDisplayCondition();

    /**
     * Gets or sets the boolean Property specifying whether the box is filled with the provided material.
     */
    BooleanProperty getFill();

    /**
     * Gets or sets the Property specifying the {@link CesiumHeightReference}.
     */
    HeightReferenceProperty getHeightReference();

    /**
     * Gets or sets the material used to fill the box.
     */
    MaterialProperty getMaterial();

    /**
     * Gets or sets the Property specifying whether the box is outlined.
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
     * Get or sets the enum Property specifying whether the box
     * casts or receives shadows from light sources.
     */
    ShadowModeProperty getShadows();

    /**
     * Gets or sets the boolean Property specifying the visibility of the box.
     */
    @Override
    BooleanProperty getShow();

    @Override
    TimeInterval getInterval();

    @Override
    List<BoxGraphics> getIntervals();

    @Override
    void dispatch(Supplier<BoxCesiumWriter> supplier);
}
