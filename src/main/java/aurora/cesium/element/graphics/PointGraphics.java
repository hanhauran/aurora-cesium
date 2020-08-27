package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import aurora.cesium.language.writer.PointCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PointGraphics extends Graphics<PointCesiumWriter> {

    static PathGraphicsAdapter.Builder newBuilder() {
        return PathGraphicsAdapter.Builder.newBuilder();
    }

    ColorProperty getColor();

    DoubleProperty getDisableDepthTestDistance();

    DistanceDisplayConditionProperty getDistanceDisplayCondition();

    HeightReferenceProperty getHeightReference();

    ColorProperty getOutlineColor();

    DoubleProperty getOutlineWidth();

    DoubleProperty getPixelSize();

    NearFarScalarProperty getScaleByDistance();

    @Override
    BooleanProperty getShow();

    NearFarScalarProperty getTranslucencyByDistance();

    @Override
    void dispatch(PointCesiumWriter writer);
}
