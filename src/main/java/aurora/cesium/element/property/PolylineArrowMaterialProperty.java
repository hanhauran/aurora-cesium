package aurora.cesium.element.property;

import aurora.cesium.language.writer.PolylineArrowMaterialCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface PolylineArrowMaterialProperty extends IntervalProperty<PolylineArrowMaterialProperty> {

    static PolylineArrowMaterialProperty from(ColorProperty color) {
        return newBuilder().withColor(color).build();
    }

    static DefaultPolylineArrowMaterialProperty.Builder newBuilder() {
        return DefaultPolylineArrowMaterialProperty.Builder.newBuilder();
    }

    ColorProperty getColor();

    @Override
    TimeInterval getInterval();

    @Override
    List<PolylineArrowMaterialProperty> getIntervals();

    void dispatch(PolylineArrowMaterialCesiumWriter writer);
}
