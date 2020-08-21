package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import aurora.cesium.language.writer.BillboardCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface BillboardGraphics extends Graphics<BillboardCesiumWriter> {

    static BillboardGraphicsAdapter.Builder newBuilder() {
        return BillboardGraphicsAdapter.Builder.newBuilder();
    }

    AlignedAxisProperty getAlignedAxis();

    ColorProperty getColor();

    DoubleProperty getDisabledDepthTestDistance();

    DistanceDisplayConditionProperty getDistanceDisplayCondition();

    EyeOffsetProperty getEyeOffset();

    DoubleProperty getHeight();

    HeightReferenceProperty getHeightReference();

    HorizontalOriginProperty getHorizontalOrigin();

    ResourceProperty getImage();

    BoundingRectangleProperty getImageSubRegion();

    PixelOffsetProperty getPixelOffset();

    NearFarScalarProperty getPixelOffsetScaleByDistance();

    DoubleProperty getRotation();

    DoubleProperty getScale();

    NearFarScalarProperty getScaleByDistance();

    BooleanProperty getSizeInMeters();

    @Override
    BooleanProperty getShow();

    NearFarScalarProperty getTranslucencyByDistance();

    VerticalOriginProperty getVerticalOrigin();

    DoubleProperty getWidth();

    @Override
    void dispatch(BillboardCesiumWriter writer);
}
