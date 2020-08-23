package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import aurora.cesium.language.writer.EllipseCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface EllipseGraphics extends Graphics<EllipseCesiumWriter> {

    static EllipseGraphicsAdapter.Builder newBuilder() {
        return EllipseGraphicsAdapter.Builder.newBuilder();
    }

    ClassificationTypeProperty getClassificationType();

    DistanceDisplayConditionProperty getDistanceDisplayCondition();

    DoubleProperty getExtrudedHeight();

    HeightReferenceProperty getExtrudedHeightReference();

    BooleanProperty getFill();

    DoubleProperty getGranularity();

    DoubleProperty getHeight();

    HeightReferenceProperty getHeightReference();

    MaterialProperty getMaterial();

    IntegerProperty getNumberOfVerticalLines();

    BooleanProperty getOutline();

    ColorProperty getOutlineColor();

    DoubleProperty getOutlineWidth();

    DoubleProperty getRotation();

    DoubleProperty getSemiMajorAxis();

    DoubleProperty getSemiMinorAxis();

    ShadowModeProperty getShadows();

    DoubleProperty getStRotation();

    @Override
    BooleanProperty getShow();

    IntegerProperty getZIndex();

    @Override
    void dispatch(EllipseCesiumWriter writer);
}
