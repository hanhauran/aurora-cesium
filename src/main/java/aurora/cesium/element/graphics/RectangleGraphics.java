package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import aurora.cesium.language.writer.RectangleCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface RectangleGraphics extends Graphics<RectangleCesiumWriter> {

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

    DoubleProperty getStRotation();

    @Override
    BooleanProperty getShow();

    IntegerProperty getZIndex();

    @Override
    void dispatch(RectangleCesiumWriter writer);
}
