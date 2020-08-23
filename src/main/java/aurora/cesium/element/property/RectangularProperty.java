package aurora.cesium.element.property;

import aurora.cesium.language.writer.BackgroundPaddingCesiumWriter;
import aurora.cesium.language.writer.RepeatCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface RectangularProperty extends Property {

    void dispatchRectangular(BackgroundPaddingCesiumWriter writer);

    void dispatchRectangular(RepeatCesiumWriter writer);
}
