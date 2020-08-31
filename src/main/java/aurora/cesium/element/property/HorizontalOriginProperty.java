package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumHorizontalOrigin;
import aurora.cesium.language.writer.HorizontalOriginCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface HorizontalOriginProperty extends Property<HorizontalOriginCesiumWriter>, Intervalable<HorizontalOriginProperty>, Referenceable {

    static HorizontalOriginProperty from(CesiumHorizontalOrigin value) {
        return newBuilder().withValue(value).build();
    }

    static HorizontalOriginProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static HorizontalOriginPropertyImpl.Builder newBuilder() {
        return HorizontalOriginPropertyImpl.Builder.newBuilder();
    }

    @Override
    TimeInterval getInterval();

    @Override
    List<HorizontalOriginProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<HorizontalOriginCesiumWriter> supplier);
}
