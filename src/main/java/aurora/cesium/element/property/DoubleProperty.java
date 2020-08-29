package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface DoubleProperty extends InterpolatableProperty, IntervalProperty<DoubleProperty>, ReferenceProperty {

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
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<DoubleProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(DoubleCesiumWriter writer);
}
