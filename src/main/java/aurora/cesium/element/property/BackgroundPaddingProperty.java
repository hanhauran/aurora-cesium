package aurora.cesium.element.property;

import aurora.cesium.language.writer.BackgroundPaddingCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface BackgroundPaddingProperty extends IntervalProperty, ReferenceProperty {

    RectangularProperty getRectangular();

    void dispatch(BackgroundPaddingCesiumWriter writer);
}
