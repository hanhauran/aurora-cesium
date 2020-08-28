package aurora.cesium.element.property;

import aurora.cesium.language.writer.PolylineMaterialCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PolylineMaterialProperty extends MultiIntervalProperty<PolylineMaterialProperty> {

    static DefaultPolylineMaterialProperty.Builder newBuilder() {
        return DefaultPolylineMaterialProperty.Builder.newBuilder();
    }

    SolidColorMaterialProperty getSolidColor();

    @Override
    TimeInterval getInterval();

    @Override
    List<PolylineMaterialProperty> getIntervals();

    void dispatch(PolylineMaterialCesiumWriter writer);
}
