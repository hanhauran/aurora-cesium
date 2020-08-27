package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import aurora.cesium.language.writer.PolygonCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PolygonGraphics extends Graphics<PolygonCesiumWriter> {

    static PolygonGraphicsAdapter.Builder newBuilder() {
        return PolygonGraphicsAdapter.Builder.newBuilder();
    }

    ArcTypeProperty getArcType();

    BooleanProperty getCloseTop();

    BooleanProperty getCloseBottom();

    ClassificationTypeProperty getClassificationType();

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

    BooleanProperty getPerPositionHeight();

    ShadowModeProperty getShadows();

    @Override
    BooleanProperty getShow();

    DoubleProperty getStRotation();

    IntegerProperty getZIndex();

    @Override
    void dispatch(PolygonCesiumWriter writer);
}
