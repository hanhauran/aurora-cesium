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

    static LineThicknessProperty from(Rectangular rectangular) {
        return from(RectangularProperty.from(rectangular));
    }

    static LineThicknessProperty from(RectangularProperty rectangularProperty) {
        return newBuilder().withRectangular(rectangularProperty).build();
    }

    static LineThicknessProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static LineThicknessPropertyImpl.Builder newBuilder() {
        return LineThicknessPropertyImpl.Builder.newBuilder();
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
