package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.RectangleCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface RectangleGraphics extends Graphics<RectangleGraphics, RectangleCesiumWriter> {

    static RectangleGraphicsAdapter.Builder newBuilder() {
        return RectangleGraphicsAdapter.Builder.newBuilder();
    }

    ClassificationTypeProperty getClassificationType();

    RectangleCoordinatesProperty getCoordinates();

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

    DoubleProperty getRotation();

    ShadowModeProperty getShadows();

    @Override
    BooleanProperty getShow();

    DoubleProperty getStRotation();

    IntegerProperty getZIndex();

    @Override
    TimeInterval getInterval();

    @Override
    List<RectangleGraphics> getIntervals();

    @Override
    void dispatch(Supplier<RectangleCesiumWriter> supplier);
}
