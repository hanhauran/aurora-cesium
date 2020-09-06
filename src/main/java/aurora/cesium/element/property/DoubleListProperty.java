package aurora.cesium.element.property;

import cesiumlanguagewriter.DoubleListCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public interface DoubleListProperty extends Property<DoubleListCesiumWriter>, Deletable, Intervalable<DoubleListProperty>, ListReferenceable {

    static DoubleListProperty from(Iterable<Double> doubles) {
        return newBuilder().withValue(doubles).build();
    }

    static DoubleListPropertyImpl.Builder newBuilder() {
        return DoubleListPropertyImpl.Builder.newBuilder();
    }

    @Override
    Boolean getDelete();

    @Override
    TimeInterval getInterval();

    @Override
    List<DoubleListProperty> getIntervals();

    @Override
    Iterable<Reference> getReferences();

    @Override
    void dispatch(Supplier<DoubleListCesiumWriter> supplier);
}
