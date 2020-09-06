package aurora.cesium.element.property;

import cesiumlanguagewriter.BooleanCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface BooleanProperty extends Property<BooleanCesiumWriter>, Deletable, Intervalable<BooleanProperty>, Referenceable {

    static BooleanProperty from(Boolean value) {
        return newBuilder().withValue(value).build();
    }

    static BooleanProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static BooleanPropertyImpl.Builder newBuilder() {
        return BooleanPropertyImpl.Builder.newBuilder();
    }

    @Override
    Boolean getDelete();

    @Override
    TimeInterval getInterval();

    @Override
    List<BooleanProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<BooleanCesiumWriter> supplier);
}
