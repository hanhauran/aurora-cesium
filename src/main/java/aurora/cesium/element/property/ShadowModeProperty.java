package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumShadowMode;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.ShadowModeCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

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
