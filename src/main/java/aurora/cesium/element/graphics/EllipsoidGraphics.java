package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import aurora.cesium.language.writer.EllipsoidCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface EllipsoidGraphics extends Graphics<EllipsoidCesiumWriter> {

    static EllipseGraphicsAdapter.Builder newBuilder() {
        return EllipseGraphicsAdapter.Builder.newBuilder();
    }

    DistanceDisplayConditionProperty getDistanceDisplayCondition();

    BooleanProperty getFill();

    HeightReferenceProperty getHeightReference();

    MaterialProperty getMaterial();

    EllipsoidRadiiProperty getInnerRadii();

    DoubleProperty getMaximumClock();

    DoubleProperty getMaximumCone();

    DoubleProperty getMinimumClock();

    DoubleProperty getMinimumCone();

    BooleanProperty getOutline();

    ColorProperty getOutlineColor();

    DoubleProperty getOutlineWidth();

    EllipsoidRadiiProperty getRadii();

    ShadowModeProperty getShadows();

    @Override
    BooleanProperty getShow();

    IntegerProperty getSlicePartitions();

    IntegerProperty getStackPartitions();

    IntegerProperty getSubDivisions();

    @Override
    void dispatch(EllipsoidCesiumWriter writer);
}
