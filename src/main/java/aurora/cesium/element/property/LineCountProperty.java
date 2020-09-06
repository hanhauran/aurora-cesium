package aurora.cesium.element.property;

import cesiumlanguagewriter.LineCountCesiumWriter;
import cesiumlanguagewriter.Rectangular;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface LineCountProperty extends Property<LineCountCesiumWriter>, Deletable, Interpolatable, Intervalable<LineCountProperty>, Referenceable {

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
    Boolean getDelete();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<LineCountProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<LineCountCesiumWriter> supplier);
}
