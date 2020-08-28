package aurora.cesium.element.property;

import aurora.cesium.language.writer.IntegerCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface IntegerProperty extends InterpolatableProperty, IntervalProperty<IntegerProperty>, ReferenceProperty {

    static IntegerProperty from(Integer value) {
        return newBuilder().withValue(value).build();
    }

    static DefaultIntegerProperty.Builder newBuilder() {
        return DefaultIntegerProperty.Builder.newBuilder();
    }

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<IntegerProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(IntegerCesiumWriter writer);
}
