package aurora.cesium.element.property;

import aurora.cesium.language.writer.PolylineGlowMaterialCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface PolylineGlowMaterialProperty extends IntervalProperty<PolylineGlowMaterialProperty> {

    static PolylineGlowMaterialPropertyImpl.Builder newBuilder() {
        return PolylineGlowMaterialPropertyImpl.Builder.newBuilder();
    }

    ColorProperty getColor();

    DoubleProperty getGlowPower();

    DoubleProperty getTaperPower();

    @Override
    TimeInterval getInterval();

    @Override
    List<PolylineGlowMaterialProperty> getIntervals();

    void dispatch(PolylineGlowMaterialCesiumWriter writer);
}
