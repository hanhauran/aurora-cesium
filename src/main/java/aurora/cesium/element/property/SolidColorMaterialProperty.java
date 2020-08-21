package aurora.cesium.element.property;

import aurora.cesium.language.writer.SolidColorMaterialCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface SolidColorMaterialProperty extends IntervalProperty {

    ColorProperty getColor();

    @Override
    TimeInterval getInterval();

    void dispatch(SolidColorMaterialCesiumWriter writer);
}
