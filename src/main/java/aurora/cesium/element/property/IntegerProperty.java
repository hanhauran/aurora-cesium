package aurora.cesium.element.property;

import aurora.cesium.language.writer.IntegerCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface IntegerProperty extends Property<IntegerCesiumWriter>, Interpolatable, Intervalable<IntegerProperty>, Referenceable {

    static IntegerProperty from(Integer value) {
        return newBuilder().withValue(value).build();
    }

    static IntegerProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static IntegerPropertyImpl.Builder newBuilder() {
        return IntegerPropertyImpl.Builder.newBuilder();
    }

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<IntegerProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<IntegerCesiumWriter> supplier);
}
