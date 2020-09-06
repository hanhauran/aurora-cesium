package aurora.cesium.element.property;

import cesiumlanguagewriter.LineOffsetCesiumWriter;
import cesiumlanguagewriter.Rectangular;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface LineOffsetProperty extends Property<LineOffsetCesiumWriter>, Deletable, Interpolatable, Intervalable<LineOffsetProperty>, Referenceable {

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
    Boolean getDelete();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<LineOffsetProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<LineOffsetCesiumWriter> supplier);
}
