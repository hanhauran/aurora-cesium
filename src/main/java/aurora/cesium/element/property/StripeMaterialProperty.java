package aurora.cesium.element.property;

import aurora.cesium.language.writer.StripeMaterialCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface StripeMaterialProperty extends IntervalProperty<StripeMaterialProperty> {

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

    void dispatch(StripeMaterialCesiumWriter writer);
}
