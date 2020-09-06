package aurora.cesium.element.property;

import cesiumlanguagewriter.CesiumShadowMode;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.ShadowModeCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/22
 */
public interface ShadowModeProperty extends Property<ShadowModeCesiumWriter>, Deletable, Intervalable<ShadowModeProperty>, Referenceable {

    static ShadowModeProperty from(CesiumShadowMode shadowMode) {
        return newBuilder().withValue(shadowMode).build();
    }

    static ShadowModeProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static ShadowModePropertyImpl.Builder newBuilder() {
        return ShadowModePropertyImpl.Builder.newBuilder();
    }

    @Override
    Boolean getDelete();

    @Override
    TimeInterval getInterval();

    @Override
    List<ShadowModeProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<ShadowModeCesiumWriter> supplier);
}
