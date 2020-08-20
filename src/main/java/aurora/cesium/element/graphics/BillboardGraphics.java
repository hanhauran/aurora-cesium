package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import aurora.cesium.language.writer.BillboardCesiumWriter;
import aurora.cesium.language.writer.Reference;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface BillboardGraphics extends Graphics {

    static BillboardGraphicsAdapter.Builder newBuilder() {
        return BillboardGraphicsAdapter.Builder.newBuilder();
    }

    AlignedAxisProperty getAlignedAxis();

    Reference getAlignedAxisRef();

    ColorProperty getColor();

    Reference getColorRef();

    DoubleProperty getDisabledDepthTestDistance();

    Reference getDisabledDepthTestDistanceRef();

    DistanceDisplayConditionProperty getDistanceDisplayCondition();

    Reference getDistanceDisplayConditionRef();

    EyeOffsetProperty getEyeOffset();

    Reference getEyeOffsetRef();

    DoubleProperty getHeight();

    Reference getHeightRef();

    HeightReferenceProperty getHeightReference();

    Reference getHeightReferenceRef();

    HorizontalOriginProperty getHorizontalOrigin();

    Reference getHorizontalOriginRef();

    ResourceProperty getImage();

    Reference getImageRef();

    BoundingRectangleProperty getImageSubRegion();

    Reference getImageSubRegionRef();

    PixelOffsetProperty getPixelOffset();

    Reference getPixelOffsetRef();

    NearFarScalarProperty getPixelOffsetScaleByDistance();

    Reference getPixelOffsetScaleByDistanceRef();

    DoubleProperty getRotation();

    Reference getRotationRef();

    DoubleProperty getScale();

    Reference getScaleRef();

    NearFarScalarProperty getScaleByDistance();

    Reference getScaleByDistanceRef();

    BooleanProperty getSizeInMeters();

    Reference getSizeInMetersRef();

    @Override
    BooleanProperty getShow();

    @Override
    Reference getShowRef();

    NearFarScalarProperty getTranslucencyByDistance();

    Reference getTranslucencyByDistanceRef();

    VerticalOriginProperty getVerticalOrigin();

    Reference getVerticalOriginRef();

    DoubleProperty getWidth();

    Reference getWidthRef();

    void dispatchBillboard(BillboardCesiumWriter writer);
}
