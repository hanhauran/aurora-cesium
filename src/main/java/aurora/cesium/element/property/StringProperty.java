package aurora.cesium.element.property;

import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.StringCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface StringProperty extends Property<StringCesiumWriter>, Deletable, Intervalable<StringProperty>, Referenceable {

    static StringProperty from(String string) {
        return newBuilder().withValue(string).build();
    }

    static StringProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static StringPropertyImpl.Builder newBuilder() {
        return StringPropertyImpl.Builder.newBuilder();
    }

    @Override
    Boolean getDelete();

    @Override
    TimeInterval getInterval();

    @Override
    List<StringProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<StringCesiumWriter> supplier);
}
