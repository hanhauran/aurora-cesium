package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.CesiumHeightReference;
import cesiumlanguagewriter.ModelCesiumWriter;
import cesiumlanguagewriter.Bounds;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface ModelGraphics extends Graphics<ModelGraphics, ModelCesiumWriter> {

    static ModelGraphicsAdapter.Builder newBuilder() {

        return ModelGraphicsAdapter.Builder.newBuilder();
    }
    /**
     * Gets or sets the set of articulation values to apply to this model.  This is represented as an PropertyBag, where keys are
     * composed as the name of the articulation, a single space, and the name of the stage.
     */
    ArticulationsProperty getArticulations();

    /**
     * Gets or sets the Property specifying the {@link java.awt.Color} that blends with the model's rendered color.
     */
    ColorProperty getColor();

    /**
     * A numeric Property specifying the color strength when the <code>colorBlendMode</code> is MIX.
     * A value of 0.0 results in the model's rendered color while a value of 1.0 results in a solid color, with
     * any value in-between resulting in a mix of the two.
     */
    DoubleProperty getColorBlendAmount();

    /**
     * Gets or sets the enum Property specifying how the color blends with the model.
     */
    ColorBlendModeProperty getColorBlendMode();

    /**
     * Gets or sets the {@link Bounds} Property specifying at what distance from the camera that this model will be displayed.
     */
    DistanceDisplayConditionProperty getDistanceDisplayCondition();

    /**
     * Gets or sets the string Property specifying the URI of the glTF asset.
     */
    UriProperty getGltf();

    /**
     * Gets or sets the Property specifying the {@link CesiumHeightReference}.
     */
    HeightReferenceProperty getHeightReference();

    /**
     * Get or sets the boolean Property specifying whether textures
     * may continue to stream in after the model is loaded.
     */
    BooleanProperty getIncrementallyLoadTextures();

    /**
     * Gets or sets the numeric Property specifying the maximum scale
     * size of a model. This property is used as an upper limit for
     * {@link ModelGraphics#getMinimumPixelSize()}.
     */
    DoubleProperty getMaximumScale();

    /**
     * Gets or sets the numeric Property specifying the approximate minimum
     * pixel size of the model regardless of zoom. This can be used to ensure that
     * a model is visible even when the viewer zooms out.  When <code>0.0</code>,
     * no minimum size is enforced.
     */
    DoubleProperty getMinimumPixelSize();

    NodeTransformationsProperty getNodeTransformations();

    /**
     * Gets or sets the boolean Property specifying if glTF animations should be run.
     */
    BooleanProperty getRunAnimations();

    /**
     * Gets or sets the numeric Property specifying a uniform linear scale
     * for this model. Values greater than 1.0 increase the size of the model while
     * values less than 1.0 decrease it.
     */
    DoubleProperty getScale();

    /**
     * Get or sets the enum Property specifying whether the model
     * casts or receives shadows from light sources.
     */
    ShadowModeProperty getShadows();

    /**
     * Gets or sets the boolean Property specifying the visibility of the model.
     */
    @Override
    BooleanProperty getShow();

    /**
     * Gets or sets the Property specifying the {@link java.awt.Color} of the silhouette.
     */
    ColorProperty getSilhouetteColor();

    /**
     * Gets or sets the numeric Property specifying the size of the silhouette in pixels.
     */
    DoubleProperty getSilhouetteSize();

    @Override
    TimeInterval getInterval();

    @Override
    List<ModelGraphics> getIntervals();

    @Override
    void dispatch(Supplier<ModelCesiumWriter> supplier);
}
