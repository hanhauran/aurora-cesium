package aurora.cesium.element.property;

import aurora.cesium.language.writer.LineCountCesiumWriter;
import aurora.cesium.language.writer.Rectangular;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface LineCountProperty extends InterpolatableProperty, IntervalProperty<LineCountProperty>, ReferenceProperty {

    static LineCountProperty from(Rectangular rectangular) {
        return from(RectangularProperty.from(rectangular));
    }

    static LineCountProperty from(RectangularProperty rectangularProperty) {
        return newBuilder().withRectangular(rectangularProperty).build();
    }

    static LineCountProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static LineCountPropertyImpl.Builder newBuilder() {
        return LineCountPropertyImpl.Builder.newBuilder();
    }

    RectangularProperty getRectangular();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<LineCountProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(LineCountCesiumWriter writer);
}
