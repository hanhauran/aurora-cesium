package aurora.cesium.element.property;

import aurora.cesium.language.writer.Rectangular;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.RepeatCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface RepeatProperty extends InterpolatableProperty, IntervalProperty<RepeatProperty>, ReferenceProperty {

    static RepeatProperty from(Rectangular rectangular) {
        return from(RectangularProperty.from(rectangular));
    }

    static RepeatProperty from(RectangularProperty rectangularProperty) {
        return newBuilder().withRectangular(rectangularProperty).build();
    }

    static RepeatProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static RepeatPropertyImpl.Builder newBuilder() {
        return RepeatPropertyImpl.Builder.newBuilder();
    }

    RectangularProperty getRectangular();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<RepeatProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(RepeatCesiumWriter writer);
}
