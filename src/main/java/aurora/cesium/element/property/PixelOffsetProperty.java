package aurora.cesium.element.property;

import aurora.cesium.language.writer.PixelOffsetCesiumWriter;
import aurora.cesium.language.writer.Rectangular;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PixelOffsetProperty extends Property<PixelOffsetCesiumWriter>, Interpolatable, Intervalable<PixelOffsetProperty>, Referenceable {

    static PixelOffsetProperty from(Rectangular rectangular) {
        return newBuilder().withValue(rectangular).build();
    }

    static PixelOffsetProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static PixelOffsetPropertyImpl.Builder newBuilder() {
        return PixelOffsetPropertyImpl.Builder.newBuilder();
    }

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<PixelOffsetProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<PixelOffsetCesiumWriter> supplier);
}
