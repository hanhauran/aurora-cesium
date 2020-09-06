package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.*;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface LabelGraphics extends Graphics<LabelGraphics, LabelCesiumWriter> {

    static LabelGraphicsAdapter.Builder newBuilder() {
        return LabelGraphicsAdapter.Builder.newBuilder();
    }

    /**
     * Gets or sets the Property specifying the background {@link java.awt.Color}.
     */
    ColorProperty getBackgroundColor();

    /**
     * Gets or sets the {@link Rectangular} Property specifying the label's horizontal and vertical
     * background padding in pixels.
     */
    BackgroundPaddingProperty getBackgroundPadding();

    /**
     * Gets or sets the distance from the camera at which to disable the depth test to, for example, prevent clipping against terrain.
     * When set to zero, the depth test is always applied. When set to Number.POSITIVE_INFINITY, the depth test is never applied.
     */
    DoubleProperty getDisableDepthTestDistance();

    /**
     * Gets or sets the {@link Bounds} Property specifying at what distance from the camera that this label will be displayed.
     */
    DistanceDisplayConditionProperty getDistanceDisplayCondition();

    /**
     * Gets or sets the {@link Cartesian} Property specifying the label's offset in eye coordinates.
     * Eye coordinates is a left-handed coordinate system, where <code>x</code> points towards the viewer's
     * right, <code>y</code> points up, and <code>z</code> points into the screen.
     * <p>
     * An eye offset is commonly used to arrange multiple labels or objects at the same position, e.g., to
     * arrange a label above its corresponding 3D model.
     * </p>
     * Below, the label is positioned at the center of the Earth but an eye offset makes it always
     * appear on top of the Earth regardless of the viewer's or Earth's orientation.
     */
    EyeOffsetProperty getEyeOffset();

    /**
     * Gets or sets the Property specifying the fill {@link java.awt.Color}.
     */
    ColorProperty getFillColor();

    /**
     * Gets or sets the string Property specifying the font in CSS syntax.
     */
    FontProperty getFont();

    /**
     * Gets or sets the Property specifying the {@link CesiumHeightReference}.
     */
    HeightReferenceProperty getHeightReference();

    /**
     * Gets or sets the Property specifying the {@link CesiumHorizontalOrigin}.
     */
    HorizontalOriginProperty getHorizontalOrigin();

    /**
     * Gets or sets the Property specifying the outline {@link java.awt.Color}.
     */
    ColorProperty getOutlineColor();

    /**
     * Gets or sets the numeric Property specifying the outline width.
     */
    DoubleProperty getOutlineWidth();

    /**
     * Gets or sets the {@link Rectangular} Property specifying the label's pixel offset in screen space
     * from the origin of this label.  This is commonly used to align multiple labels and labels at
     * the same position, e.g., an image and text.  The screen space origin is the top, left corner of the
     * canvas; <code>x</code> increases from left to right, and <code>y</code> increases from top to bottom.
     */
    PixelOffsetProperty getPixelOffset();

    /**
     * Gets or sets {@link NearFarScalar} Property specifying the pixel offset of the label based on the distance from the camera.
     * A label's pixel offset will interpolate between the {@link NearFarScalar#getNearValue()} and
     * {@link NearFarScalar#getFarValue()} while the camera distance falls within the lower and upper bounds
     * of the specified {@link NearFarScalar#getNearDistance()} and {@link NearFarScalar#getFarDistance()}.
     * Outside of these ranges the label's pixel offset remains clamped to the nearest bound.
     */
    NearFarScalarProperty getPixelOffsetScaleByDistance();

    /**
     * Gets or sets the numeric Property specifying the uniform scale to apply to the image.
     * A scale greater than <code>1.0</code> enlarges the label while a scale less than <code>1.0</code> shrinks it.
     */
    DoubleProperty getScale();

    /**
     * Gets or sets near and far scaling properties of a Label based on the label's distance from the camera.
     * A label's scale will interpolate between the {@link NearFarScalar#getNearValue()} and
     * {@link NearFarScalar#getFarValue()} while the camera distance falls within the lower and upper bounds
     * of the specified {@link NearFarScalar#getNearDistance()} and {@link NearFarScalar#getFarDistance()}.
     * Outside of these ranges the label's scale remains clamped to the nearest bound.  If undefined,
     * scaleByDistance will be disabled.
     */
    NearFarScalarProperty getScaleByDistance();

    /**
     * Gets or sets the boolean Property specifying the visibility of the label.
     */
    @Override
    BooleanProperty getShow();

    /**
     * Gets or sets the boolean Property specifying the visibility of the background behind the label.
     */
    BooleanProperty getShowBackground();

    /**
     * Gets or sets the Property specifying the {@link CesiumLabelStyle}.
     */
    LabelStyleProperty getStyle();

    /**
     * Gets or sets the string Property specifying the text of the label.
     * Explicit newlines '\n' are supported.
     */
    StringProperty getText();

    /**
     * Gets or sets {@link NearFarScalar} Property specifying the translucency of the label based on the distance from the camera.
     * A label's translucency will interpolate between the {@link NearFarScalar#getNearValue()} and
     * {@link NearFarScalar#getFarValue()} while the camera distance falls within the lower and upper bounds
     * of the specified {@link NearFarScalar#getNearDistance()} and {@link NearFarScalar#getFarDistance()}.
     * Outside of these ranges the label's translucency remains clamped to the nearest bound.
     */
    NearFarScalarProperty getTranslucencyByDistance();

    /**
     * Gets or sets the Property specifying the {@link CesiumVerticalOrigin}.
     */
    VerticalOriginProperty getVerticalOrigin();

    @Override
    TimeInterval getInterval();

    @Override
    List<LabelGraphics> getIntervals();

    @Override
    void dispatch(Supplier<LabelCesiumWriter> supplier);
}
