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

    static LineOffsetProperty from(Rectangular value) {
        return newBuilder().withRectangular(RectangularProperty.from(value)).build();
    }

    static DefaultLineOffsetProperty.Builder newBuilder() {
        return DefaultLineOffsetProperty.Builder.newBuilder();
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
