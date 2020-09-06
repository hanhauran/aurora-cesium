package aurora.cesium.element.property;

import cesiumlanguagewriter.ArticulationCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface ArticulationProperty extends Property<ArticulationCesiumWriter>, Deletable, Interpolatable, Intervalable<ArticulationProperty>, Referenceable {

    static ArticulationProperty from(String name, Double dbl) {
        return newBuilder(name).withValue(dbl).build();
    }

    static ArticulationProperty from(String name, Reference reference) {
        return newBuilder(name).withReference(reference).build();
    }

    static ArticulationPropertyImpl.Builder newBuilder(String name) {
        return ArticulationPropertyImpl.Builder.newBuilder(name);
    }

    String getName();

    @Override
    Boolean getDelete();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<ArticulationProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<ArticulationCesiumWriter> supplier);
}
