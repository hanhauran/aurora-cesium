package aurora.cesium.element.property;

import aurora.cesium.language.writer.LineThicknessCesiumWriter;
import aurora.cesium.language.writer.Rectangular;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface LineThicknessProperty extends InterpolatableProperty, IntervalProperty<LineThicknessProperty>, ReferenceProperty {

    static LineThicknessProperty from(Rectangular value) {
        return newBuilder().withRectangular(RectangularProperty.from(value)).build();
    }

    static DefaultLineThicknessProperty.Builder newBuilder() {
        return DefaultLineThicknessProperty.Builder.newBuilder();
    }

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<LineThicknessProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(LineThicknessCesiumWriter writer);
}
