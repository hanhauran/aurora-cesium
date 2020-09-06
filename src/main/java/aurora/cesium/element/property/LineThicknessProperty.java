package aurora.cesium.element.property;

import cesiumlanguagewriter.LineThicknessCesiumWriter;
import cesiumlanguagewriter.Rectangular;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface LineThicknessProperty extends Property<LineThicknessCesiumWriter>, Deletable, Interpolatable, Intervalable<LineThicknessProperty>, Referenceable {

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
    Boolean getDelete();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<LineThicknessProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<LineThicknessCesiumWriter> supplier);
}
