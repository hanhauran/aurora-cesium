package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumStripeOrientation;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.StripeOrientationCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface StripeOrientationProperty extends IntervalProperty<StripeOrientationProperty>, ReferenceProperty {

    static StripeOrientationProperty from(CesiumStripeOrientation value) {
        return newBuilder().withValue(value).build();
    }

    static DefaultStripeOrientationProperty.Builder newBuilder() {
        return DefaultStripeOrientationProperty.Builder.newBuilder();
    }

    @Override
    TimeInterval getInterval();

    @Override
    List<StripeOrientationProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(StripeOrientationCesiumWriter writer);
}
