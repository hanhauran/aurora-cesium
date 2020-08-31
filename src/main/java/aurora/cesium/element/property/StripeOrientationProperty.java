package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumStripeOrientation;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.StripeOrientationCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface StripeOrientationProperty extends Property<StripeOrientationCesiumWriter>, Intervalable<StripeOrientationProperty>, Referenceable {

    static StripeOrientationProperty from(CesiumStripeOrientation stripeOrientation) {
        return newBuilder().withValue(stripeOrientation).build();
    }

    static StripeOrientationProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static StripeOrientationPropertyImpl.Builder newBuilder() {
        return StripeOrientationPropertyImpl.Builder.newBuilder();
    }

    @Override
    TimeInterval getInterval();

    @Override
    List<StripeOrientationProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<StripeOrientationCesiumWriter> supplier);
}
