package aurora.cesium.element.property;

import aurora.cesium.language.writer.Cartesian;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.TranslationCesiumWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface TranslationProperty extends InterpolatableProperty, IntervalProperty<TranslationProperty>, ReferenceProperty {

    static TranslationProperty from(Cartesian cartesian) {
        return newBuilder().withCartesian(CartesianProperty.from(cartesian)).build();
    }

    static DefaultTranslationProperty.Builder newBuilder() {
        return DefaultTranslationProperty.Builder.newBuilder();
    }

    CartesianProperty getCartesian();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<TranslationProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(TranslationCesiumWriter writer);
}
