package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import aurora.cesium.language.writer.LabelCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface LabelGraphics extends Graphics<LabelCesiumWriter> {

    ColorProperty getFillColor();

    StringProperty getFont();

    HorizontalOriginProperty getHorizontalOrigin();

    ColorProperty getOutlineColor();

    DoubleProperty getOutlineWidth();

    @Override
    BooleanProperty getShow();

    @Override
    void dispatch(LabelCesiumWriter writer);
}
