package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import aurora.cesium.language.writer.CylinderCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface CylinderGraphics extends Graphics<CylinderCesiumWriter> {

    static CylinderGraphicsAdapter.Builder newBuilder() {
        return CylinderGraphicsAdapter.Builder.newBuilder();
    }

    DoubleProperty getBottomRadius();

    DistanceDisplayConditionProperty getDistanceDisplayCondition();

    BooleanProperty getFill();

    HeightReferenceProperty getHeightReference();

    DoubleProperty getLength();

    MaterialProperty getMaterial();

    IntegerProperty getNumberOfVerticalLines();

    BooleanProperty getOutline();

    ColorProperty getOutlineColor();

    DoubleProperty getOutlineWidth();

    ShadowModeProperty getShadows();

    @Override
    BooleanProperty getShow();

    IntegerProperty getSlices();

    DoubleProperty getTopRadius();

    @Override
    void dispatch(CylinderCesiumWriter writer);
}
