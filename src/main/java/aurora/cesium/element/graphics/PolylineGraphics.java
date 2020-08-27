package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import aurora.cesium.language.writer.PolylineCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PolylineGraphics extends Graphics<PolylineCesiumWriter> {

    static PolylineGraphicsAdapter.Builder newBuilder() {
        return PolylineGraphicsAdapter.Builder.newBuilder();
    }

    ArcTypeProperty getArcType();

    BooleanProperty getClampToGround();

    ClassificationTypeProperty getClassificationType();

    PolylineMaterialProperty getDepthFailMaterial();

    DistanceDisplayConditionProperty getDistanceDisplayCondition();

    DoubleProperty getGranularity();

    PolylineMaterialProperty getMaterial();

    PositionListProperty getPositions();

    ShadowModeProperty getShadows();

    @Override
    BooleanProperty getShow();

    DoubleProperty getWidth();

    IntegerProperty getZIndex();

    @Override
    void dispatch(PolylineCesiumWriter writer);
}
