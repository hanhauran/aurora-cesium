package aurora.cesium.element.property;

import aurora.cesium.language.writer.LineOffsetCesiumWriter;
import aurora.cesium.language.writer.Rectangular;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface LineOffsetProperty extends InterpolatableProperty, IntervalProperty<LineOffsetProperty>, ReferenceProperty {

    static LineOffsetProperty from(Rectangular rectangular) {
        return from(RectangularProperty.from(rectangular));
    }

    static LineOffsetProperty from(RectangularProperty rectangularProperty) {
        return newBuilder().withRectangular(rectangularProperty).build();
    }

    static LineOffsetProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static LineOffsetPropertyImpl.Builder newBuilder() {
        return LineOffsetPropertyImpl.Builder.newBuilder();
    }

    RectangularProperty getRectangular();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<LineOffsetProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(LineOffsetCesiumWriter writer);
}
