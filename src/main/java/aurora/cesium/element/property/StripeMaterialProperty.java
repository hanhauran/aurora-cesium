package aurora.cesium.element.property;

import cesiumlanguagewriter.StripeMaterialCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface StripeMaterialProperty extends Property<StripeMaterialCesiumWriter>, Intervalable<StripeMaterialProperty> {

    static StripeMaterialPropertyImpl.Builder newBuilder() {
        return StripeMaterialPropertyImpl.Builder.newBuilder();
    }

    StripeOrientationProperty getOrientation();

    ColorProperty getEvenColor();

    ColorProperty getOddColor();

    DoubleProperty getOffset();

    DoubleProperty getRepeat();

    @Override
    TimeInterval getInterval();

    @Override
    List<StripeMaterialProperty> getIntervals();

    @Override
    void dispatch(Supplier<StripeMaterialCesiumWriter> supplier);
}
