package aurora.cesium.element.property;

import cesiumlanguagewriter.DoubleCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface DoubleProperty extends Property<DoubleCesiumWriter>, Deletable, Interpolatable, Intervalable<DoubleProperty>, Referenceable {

    static DoubleProperty from(Double value) {
        return newBuilder().withValue(value).build();
    }

    static DoubleProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static DoublePropertyImpl.Builder newBuilder() {
        return DoublePropertyImpl.Builder.newBuilder();
    }

    @Override
    Boolean getDelete();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<DoubleProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<DoubleCesiumWriter> supplier);
}
