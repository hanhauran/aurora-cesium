package aurora.cesium.element.property;

import cesiumlanguagewriter.SolidColorMaterialCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface SolidColorMaterialProperty extends Property<SolidColorMaterialCesiumWriter>, Intervalable<SolidColorMaterialProperty> {

    static SolidColorMaterialProperty from(ColorProperty colorProperty) {
        return newBuilder().withColor(colorProperty).build();
    }

    static SolidColorMaterialPropertyImpl.Builder newBuilder() {
        return SolidColorMaterialPropertyImpl.Builder.newBuilder();
    }

    ColorProperty getColor();

    @Override
    TimeInterval getInterval();

    @Override
    List<SolidColorMaterialProperty> getIntervals();

    @Override
    void dispatch(Supplier<SolidColorMaterialCesiumWriter> supplier);
}
