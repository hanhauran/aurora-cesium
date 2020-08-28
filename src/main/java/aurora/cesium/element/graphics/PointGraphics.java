package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import aurora.cesium.language.writer.PointCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PointGraphics extends Graphics<PointGraphics, PointCesiumWriter> {

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
    TimeInterval getInterval();

    @Override
    List<PointGraphics> getIntervals();

    @Override
    void dispatch(PointCesiumWriter writer);
}
