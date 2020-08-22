package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import aurora.cesium.language.writer.LabelCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface LabelGraphics extends Graphics<LabelCesiumWriter> {

    static LabelGraphicsAdapter.Builder newBuilder() {
        return LabelGraphicsAdapter.Builder.newBuilder();
    }

    ColorProperty getBackgroundColor();

    BackgroundPaddingProperty getBackgroundPadding();

    DoubleProperty getDisableDepthTestDistance();

    DistanceDisplayConditionProperty getDistanceDisplayCondition();

    EyeOffsetProperty getEyeOffset();

    ColorProperty getFillColor();

    StringProperty getFont();

    HeightReferenceProperty getHeightReference();

    HorizontalOriginProperty getHorizontalOrigin();

    PixelOffsetProperty getPixelOffset();

    NearFarScalarProperty getPixelOffsetScaleByDistance();

    DoubleProperty getScale();

    NearFarScalarProperty getScaleByDistance();

    @Override
    BooleanProperty getShow();

    BooleanProperty getShowBackground();

    LabelStyleProperty getStyle();

    StringProperty getText();

    NearFarScalarProperty getTranslucencyByDistance();

    ColorProperty getOutlineColor();

    DoubleProperty getOutlineWidth();

    VerticalOriginProperty getVerticalOrigin();

    @Override
    void dispatch(LabelCesiumWriter writer);
}
