package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import aurora.cesium.language.writer.BoxCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface BoxGraphics extends Graphics<BoxCesiumWriter> {

    static BoxGraphicsAdapter.Builder newBuilder() {
        return BoxGraphicsAdapter.Builder.newBuilder();
    }

    BoxDimensionsProperty getDimensions();

    DistanceDisplayConditionProperty getDistanceDisplayCondition();

    BooleanProperty getFill();

    HeightReferenceProperty getHeightReference();

    MaterialProperty getMaterial();

    BooleanProperty getOutline();

    ColorProperty getOutlineColor();

    DoubleProperty getOutlineWidth();

    ShadowModeProperty getShadows();

    @Override
    BooleanProperty getShow();

    @Override
    void dispatch(BoxCesiumWriter writer);
}
