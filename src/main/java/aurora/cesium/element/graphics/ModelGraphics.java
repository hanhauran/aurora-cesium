package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import aurora.cesium.language.writer.ModelCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface ModelGraphics extends Graphics<ModelCesiumWriter> {

    static ModelGraphicsAdapter.Builder newBuilder() {
        return ModelGraphicsAdapter.Builder.newBuilder();
    }

    ColorProperty getColor();

    ColorBlendModeProperty getColorBlendMode();

    DoubleProperty getColorBlendAmount();

    DistanceDisplayConditionProperty getDistanceDisplayCondition();

    UriProperty getGltf();

    HeightReferenceProperty getHeightReference();

    BooleanProperty getIncrementallyLoadTextures();

    DoubleProperty getMaximumScale();

    DoubleProperty getMinimumPixelSize();

    BooleanProperty getRunAnimations();

    DoubleProperty getScale();

    ColorProperty getSilhouetteColor();

    DoubleProperty getSilhouetteSize();

    ShadowModeProperty getShadowMode();

    @Override
    BooleanProperty getShow();

    @Override
    void dispatch(ModelCesiumWriter writer);
}
