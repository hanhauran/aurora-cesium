package aurora.cesium.element.property;

import cesiumlanguagewriter.PolylineDashMaterialCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface PolylineDashMaterialProperty extends Property<PolylineDashMaterialCesiumWriter>, Intervalable<PolylineDashMaterialProperty> {

    static PolylineDashMaterialPropertyImpl.Builder newBuilder() {
        return PolylineDashMaterialPropertyImpl.Builder.newBuilder();
    }

    ColorProperty getColor();

    ColorProperty getGapColor();

    DoubleProperty getDashLength();

    IntegerProperty getDashPattern();

    @Override
    TimeInterval getInterval();

    @Override
    List<PolylineDashMaterialProperty> getIntervals();

    @Override
    void dispatch(Supplier<PolylineDashMaterialCesiumWriter> supplier);
}
