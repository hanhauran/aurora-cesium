package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.*;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface BillboardGraphics extends Graphics<BillboardGraphics, BillboardCesiumWriter> {

    static BillboardGraphicsAdapter.Builder newBuilder() {
        return BillboardGraphicsAdapter.Builder.newBuilder();
    }

    /**
     * Gets or sets the {@link Cartesian} Property specifying the unit vector axis of rotation
     * in the fixed frame. When set to Cartesian3.ZERO the rotation is from the top of the screen.
     */
    AlignedAxisProperty getAlignedAxis();

    /**
     * Gets or sets the Property specifying the {@link java.awt.Color} that is multiplied with the <code>image</code>.
     * This has two common use cases.  First, the same white texture may be used by many different billboards,
     * each with a different color, to create colored billboards. Second, the color's alpha component can be
     * used to make the billboard translucent as shown below. An alpha of <code>0.0</code> makes the billboard
     * transparent, and <code>1.0</code> makes the billboard opaque.
     */
    ColorProperty getColor();

    /**
     * Gets or sets the distance from the camera at which to disable the depth test to, for example, prevent clipping against terrain.
     * When set to zero, the depth test is always applied. When set to Number.POSITIVE_INFINITY, the depth test is never applied.
     */
    DoubleProperty getDisabledDepthTestDistance();

    /**
     * Gets or sets the {@link Bounds} Property specifying at what distance from the camera that this billboard will be displayed.
     */
    DistanceDisplayConditionProperty getDistanceDisplayCondition();

    /**
     * Gets or sets the {@link Cartesian} Property specifying the billboard's offset in eye coordinates.
     * Eye coordinates is a left-handed coordinate system, where <code>x</code> points towards the viewer's
     * right, <code>y</code> points up, and <code>z</code> points into the screen.
     * <p>
     * An eye offset is commonly used to arrange multiple billboards or objects at the same position, e.g., to
     * arrange a billboard above its corresponding 3D model.
     * </p>
     * Below, the billboard is positioned at the center of the Earth but an eye offset makes it always
     * appear on top of the Earth regardless of the viewer's or Earth's orientation.
     */
    EyeOffsetProperty getEyeOffset();

    /**
     * Gets or sets the numeric Property specifying the height of the billboard in pixels.
     * When undefined, the native height is used.
     */
    DoubleProperty getHeight();

    /**
     * Gets or sets the Property specifying the {@link CesiumHeightReference}.
     */
    HeightReferenceProperty getHeightReference();

    /**
     * Gets or sets the Property specifying the {@link CesiumHorizontalOrigin}.
     */
    HorizontalOriginProperty getHorizontalOrigin();

    /**
     * Gets or sets the Property specifying the Image, URI, or Canvas to use for the billboard.
     */
    UriProperty getImage();

    /**
     * Gets or sets the Property specifying a {@link BoundingRectangle} that defines a
     * sub-region of the <code>image</code> to use for the billboard, rather than the entire image,
     * measured in pixels from the bottom-left.
     */
    BoundingRectangleProperty getImageSubRegion();

    /**
     * Gets or sets the {@link Rectangular} Property specifying the billboard's pixel offset in screen space
     * from the origin of this billboard.  This is commonly used to align multiple billboards and labels at
     * the same position, e.g., an image and text.  The screen space origin is the top, left corner of the
     * canvas; <code>x</code> increases from left to right, and <code>y</code> increases from top to bottom.
     */
    PixelOffsetProperty getPixelOffset();

    /**
     * Gets or sets {@link NearFarScalar} Property specifying the pixel offset of the billboard based on the distance from the camera.
     * A billboard's pixel offset will interpolate between the {@link NearFarScalar#getNearValue()} and
     * {@link NearFarScalar#getFarValue()} while the camera distance falls within the lower and upper bounds
     * of the specified {@link NearFarScalar#getNearDistance()} and {@link NearFarScalar#getFarDistance()}.
     * Outside of these ranges the billboard's pixel offset remains clamped to the nearest bound.
     */
    NearFarScalarProperty getPixelOffsetScaleByDistance();

    /**
     * Gets or sets the numeric Property specifying the rotation of the image
     * counter clockwise from the {@link AlignedAxisProperty}.
     */
    DoubleProperty getRotation();

    /**
     * Gets or sets the numeric Property specifying the uniform scale to apply to the image.
     * A scale greater than <code>1.0</code> enlarges the billboard while a scale less than <code>1.0</code> shrinks it.
     */
    DoubleProperty getScale();

    /**
     * Gets or sets {@link NearFarScalar} Property specifying the scale of the billboard based on the distance from the camera.
     * A billboard's scale will interpolate between the {@link NearFarScalar#getNearValue()} and
     * {@link NearFarScalar#getFarValue()} while the camera distance falls within the lower and upper bounds
     * of the specified {@link NearFarScalar#getNearDistance()} and {@link NearFarScalar#getFarDistance()}.
     * Outside of these ranges the billboard's scale remains clamped to the nearest bound.
     */
    NearFarScalarProperty getScaleByDistance();

    /**
     * Gets or sets the boolean Property specifying the visibility of the billboard.
     */
    @Override
    BooleanProperty getShow();

    /**
     * Gets or sets the boolean Property specifying if this billboard's size will be measured in meters.
     */
    BooleanProperty getSizeInMeters();

    /**
     * Gets or sets {@link NearFarScalar} Property specifying the translucency of the billboard based on the distance from the camera.
     * A billboard's translucency will interpolate between the {@link NearFarScalar#getNearValue()} and
     * {@link NearFarScalar#getFarValue()} while the camera distance falls within the lower and upper bounds
     * of the specified {@link NearFarScalar#getNearDistance()} and {@link NearFarScalar#getFarDistance()}.
     * Outside of these ranges the billboard's translucency remains clamped to the nearest bound.
     */
    NearFarScalarProperty getTranslucencyByDistance();

    /**
     * Gets or sets the Property specifying the {@link CesiumVerticalOrigin}.
     */
    VerticalOriginProperty getVerticalOrigin();

    /**
     * Gets or sets the numeric Property specifying the width of the billboard in pixels.
     * When undefined, the native width is used.
     */
    DoubleProperty getWidth();

    @Override
    TimeInterval getInterval();

    @Override
    List<BillboardGraphics> getIntervals();

    @Override
    void dispatch(Supplier<BillboardCesiumWriter> supplier);
}
