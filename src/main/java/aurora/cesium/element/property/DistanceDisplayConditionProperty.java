package aurora.cesium.element.property;

import cesiumlanguagewriter.Bounds;
import cesiumlanguagewriter.DistanceDisplayConditionCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface DistanceDisplayConditionProperty extends Property<DistanceDisplayConditionCesiumWriter>, Deletable, Interpolatable, Intervalable<DistanceDisplayConditionProperty>, Referenceable {

    static DistanceDisplayConditionProperty from(Bounds value) {
        return newBuilder().withValue(value).build();
    }

    static DistanceDisplayConditionProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static DistanceDisplayConditionPropertyImpl.Builder newBuilder() {
        return DistanceDisplayConditionPropertyImpl.Builder.newBuilder();
    }

    @Override
    Boolean getDelete();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<DistanceDisplayConditionProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<DistanceDisplayConditionCesiumWriter> supplier);
}
