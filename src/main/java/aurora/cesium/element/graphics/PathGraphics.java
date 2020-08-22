package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.element.property.DistanceDisplayConditionProperty;
import aurora.cesium.element.property.DoubleProperty;
import aurora.cesium.element.property.PolylineMaterialProperty;
import aurora.cesium.language.writer.PathCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PathGraphics extends Graphics<PathCesiumWriter> {

    static PathGraphicsAdapter.Builder newBuilder() {
        return PathGraphicsAdapter.Builder.newBuilder();
    }

    DistanceDisplayConditionProperty getDistanceDisplayCondition();

    DoubleProperty getLeadTime();

    PolylineMaterialProperty getMaterial();

    DoubleProperty getTrailTime();

    DoubleProperty getResolution();

    @Override
    BooleanProperty getShow();

    DoubleProperty getWidth();

    @Override
    void dispatch(PathCesiumWriter writer);
}
