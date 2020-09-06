package aurora.cesium.element.property;

import cesiumlanguagewriter.CesiumStripeOrientation;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.StripeOrientationCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface StripeOrientationProperty extends Property<StripeOrientationCesiumWriter>, Deletable, Intervalable<StripeOrientationProperty>, Referenceable {

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
    Boolean getDelete();

    @Override
    TimeInterval getInterval();

    @Override
    List<StripeOrientationProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<StripeOrientationCesiumWriter> supplier);
}
