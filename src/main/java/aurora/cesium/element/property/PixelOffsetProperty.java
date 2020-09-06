package aurora.cesium.element.property;

import cesiumlanguagewriter.PixelOffsetCesiumWriter;
import cesiumlanguagewriter.Rectangular;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PixelOffsetProperty extends Property<PixelOffsetCesiumWriter>, Deletable, Interpolatable, Intervalable<PixelOffsetProperty>, Referenceable {

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
    Boolean getDelete();

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
