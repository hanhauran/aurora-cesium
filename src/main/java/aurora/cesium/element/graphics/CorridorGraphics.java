package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.CorridorCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface CorridorGraphics extends Graphics<CorridorGraphics, CorridorCesiumWriter> {

    static CorridorGraphicsAdapter.Builder newBuilder() {
        return CorridorGraphicsAdapter.Builder.newBuilder();
    }

    ClassificationTypeProperty getClassificationType();

    CornerTypeProperty getCornerType();

    DistanceDisplayConditionProperty getDistanceDisplayCondition();

    DoubleProperty getExtrudedHeight();

    HeightReferenceProperty getExtrudedHeightReference();

    BooleanProperty getFill();

    DoubleProperty getGranularity();

    DoubleProperty getHeight();

    HeightReferenceProperty getHeightReference();

    MaterialProperty getMaterial();

    BooleanProperty getOutline();

    ColorProperty getOutlineColor();

    DoubleProperty getOutlineWidth();

    PositionListProperty getPositions();

    ShadowModeProperty getShadows();

    @Override
    BooleanProperty getShow();

    DoubleProperty getWidth();

    IntegerProperty getZIndex();

    @Override
    TimeInterval getInterval();

    @Override
    List<CorridorGraphics> getIntervals();

    @Override
    void dispatch(Supplier<CorridorCesiumWriter> supplier);
}
