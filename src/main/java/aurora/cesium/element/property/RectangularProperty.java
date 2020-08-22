package aurora.cesium.element.property;

import aurora.cesium.language.writer.BackgroundPaddingCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface RectangularProperty extends Property {

    void dispatchRectangular(BackgroundPaddingCesiumWriter writer);
}
