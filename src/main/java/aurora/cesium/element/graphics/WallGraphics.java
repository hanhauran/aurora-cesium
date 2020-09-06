package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.TimeInterval;
import cesiumlanguagewriter.WallCesiumWriter;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface WallGraphics extends Graphics<WallGraphics, WallCesiumWriter> {

    static WallGraphicsAdapter.Builder newBuilder() {
        return WallGraphicsAdapter.Builder.newBuilder();
    }

    DistanceDisplayConditionProperty getDistanceDisplayCondition();

    BooleanProperty getFill();

    DoubleProperty getGranularity();

    MaterialProperty getMaterial();

    DoubleListProperty getMaximumHeights();

    DoubleListProperty getMinimumHeights();

    BooleanProperty getOutline();

    ColorProperty getOutlineColor();

    DoubleProperty getOutlineWidth();

    PositionListProperty getPositions();

    ShadowModeProperty getShadows();

    @Override
    BooleanProperty getShow();

    @Override
    TimeInterval getInterval();

    @Override
    List<WallGraphics> getIntervals();

    @Override
    void dispatch(Supplier<WallCesiumWriter> supplier);
}
