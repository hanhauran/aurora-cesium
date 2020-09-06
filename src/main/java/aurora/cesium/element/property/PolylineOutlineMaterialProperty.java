package aurora.cesium.element.property;

import cesiumlanguagewriter.PolylineOutlineMaterialCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface PolylineOutlineMaterialProperty extends Property<PolylineOutlineMaterialCesiumWriter>, Intervalable<PolylineOutlineMaterialProperty> {

    static PolylineOutlineMaterialPropertyImpl.Builder newBuilder() {
        return PolylineOutlineMaterialPropertyImpl.Builder.newBuilder();
    }

    ColorProperty getColor();

    ColorProperty getOutlineColor();

    DoubleProperty getOutlineWidth();

    @Override
    TimeInterval getInterval();

    @Override
    List<PolylineOutlineMaterialProperty> getIntervals();

    @Override
    void dispatch(Supplier<PolylineOutlineMaterialCesiumWriter> supplier);
}
