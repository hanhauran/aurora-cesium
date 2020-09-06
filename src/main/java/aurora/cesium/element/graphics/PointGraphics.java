package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.PointCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PointGraphics extends Graphics<PointGraphics, PointCesiumWriter> {

    static PointGraphicsAdapter.Builder newBuilder() {
        return PointGraphicsAdapter.Builder.newBuilder();
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
    void dispatch(Supplier<PointCesiumWriter> supplier);
}
