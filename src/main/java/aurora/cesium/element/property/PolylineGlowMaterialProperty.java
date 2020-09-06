package aurora.cesium.element.property;

import cesiumlanguagewriter.PolylineGlowMaterialCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface PolylineGlowMaterialProperty extends Property<PolylineGlowMaterialCesiumWriter>, Intervalable<PolylineGlowMaterialProperty> {

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

    @Override
    void dispatch(Supplier<PolylineGlowMaterialCesiumWriter> supplier);
}
