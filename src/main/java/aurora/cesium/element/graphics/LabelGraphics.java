package aurora.cesium.element.graphics;

import aurora.cesium.element.property.ColorProperty;
import aurora.cesium.element.property.DoubleProperty;
import aurora.cesium.element.property.HorizontalOriginProperty;
import aurora.cesium.element.property.StringProperty;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface LabelGraphics extends Graphics {

    ColorProperty getFillColor();

    StringProperty getFont();

    HorizontalOriginProperty getHorizontalOrigin();

    ColorProperty getOutlineColor();

    DoubleProperty getOutlineWidth();
}
