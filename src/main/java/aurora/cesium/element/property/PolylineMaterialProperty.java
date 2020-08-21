package aurora.cesium.element.property;

import aurora.cesium.language.writer.PolylineMaterialCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PolylineMaterialProperty extends IntervalProperty {

    SolidColorMaterialProperty getSolidColor();

    @Override
    TimeInterval getInterval();

    void dispatch(PolylineMaterialCesiumWriter writer);
}
