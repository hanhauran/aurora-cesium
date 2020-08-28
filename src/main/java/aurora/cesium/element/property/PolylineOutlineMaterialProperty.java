package aurora.cesium.element.property;

import aurora.cesium.language.writer.PolylineOutlineMaterialCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface PolylineOutlineMaterialProperty extends IntervalProperty<PolylineOutlineMaterialProperty> {

    static DefaultPolylineOutlineMaterialProperty.Builder newBuilder() {
        return DefaultPolylineOutlineMaterialProperty.Builder.newBuilder();
    }

    ColorProperty getColor();

    ColorProperty getOutlineColor();

    DoubleProperty getOutlineWidth();

    @Override
    TimeInterval getInterval();

    @Override
    List<PolylineOutlineMaterialProperty> getIntervals();

    void dispatch(PolylineOutlineMaterialCesiumWriter writer);
}
