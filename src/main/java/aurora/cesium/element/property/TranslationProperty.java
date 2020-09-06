package aurora.cesium.element.property;

import cesiumlanguagewriter.Cartesian;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;
import cesiumlanguagewriter.TranslationCesiumWriter;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface TranslationProperty extends Property<TranslationCesiumWriter>, Deletable, Interpolatable, Intervalable<TranslationProperty>, Referenceable {

    static TranslationProperty from(Cartesian cartesian) {
        return from(CartesianProperty.from(cartesian));
    }

    static TranslationProperty from(CartesianProperty cartesianProperty) {
        return newBuilder().withCartesian(cartesianProperty).build();
    }

    static TranslationProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static TranslationPropertyImpl.Builder newBuilder() {
        return TranslationPropertyImpl.Builder.newBuilder();
    }

    CartesianProperty getCartesian();

    @Override
    Boolean getDelete();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<TranslationProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<TranslationCesiumWriter> supplier);
}
