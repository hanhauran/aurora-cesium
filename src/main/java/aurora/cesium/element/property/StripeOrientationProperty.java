package aurora.cesium.element.property;

import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.StripeOrientationCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface StripeOrientationProperty extends IntervalProperty<StripeOrientationProperty>, ReferenceProperty {

    @Override
    TimeInterval getInterval();

    @Override
    List<StripeOrientationProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(StripeOrientationCesiumWriter writer);
}
