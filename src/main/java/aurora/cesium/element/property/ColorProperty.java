package aurora.cesium.element.property;

import aurora.cesium.language.writer.ColorCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface ColorProperty extends IntervalProperty, InterpolatableProperty {

    void dispatchColor(ColorCesiumWriter writer);
}
