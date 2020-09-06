package aurora.cesium.element.property;

import cesiumlanguagewriter.CheckerboardMaterialCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface CheckerboardMaterialProperty extends Property<CheckerboardMaterialCesiumWriter>, Intervalable<CheckerboardMaterialProperty> {

    static CheckerboardMaterialPropertyImpl.Builder newBuilder() {
        return CheckerboardMaterialPropertyImpl.Builder.newBuilder();
    }

    ColorProperty getEvenColor();

    ColorProperty getOddColor();

    RepeatProperty getRepeat();

    @Override
    TimeInterval getInterval();

    @Override
    List<CheckerboardMaterialProperty> getIntervals();

    @Override
    void dispatch(Supplier<CheckerboardMaterialCesiumWriter> supplier);
}
