package aurora.cesium.element.property;

import aurora.cesium.language.writer.ArticulationCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface ArticulationProperty extends InterpolatableProperty, IntervalProperty<ArticulationProperty>, ReferenceProperty {

    static ArticulationProperty from(String name, Double dbl) {
        return newBuilder(name).withValue(dbl).build();
    }

    static DefaultArticulationProperty.Builder newBuilder(String name) {
        return DefaultArticulationProperty.Builder.newBuilder(name);
    }

    String getName();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<ArticulationProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(ArticulationCesiumWriter writer);
}
