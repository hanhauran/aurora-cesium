package aurora.cesium.element.property;

import cesiumlanguagewriter.PolylineArrowMaterialCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface PolylineArrowMaterialProperty extends Property<PolylineArrowMaterialCesiumWriter>, Intervalable<PolylineArrowMaterialProperty> {

    static PolylineArrowMaterialProperty from(ColorProperty color) {
        return newBuilder().withColor(color).build();
    }

    static PolylineArrowMaterialPropertyImpl.Builder newBuilder() {
        return PolylineArrowMaterialPropertyImpl.Builder.newBuilder();
    }

    ColorProperty getColor();

    @Override
    TimeInterval getInterval();

    @Override
    List<PolylineArrowMaterialProperty> getIntervals();

    @Override
    void dispatch(Supplier<PolylineArrowMaterialCesiumWriter> supplier);
}
