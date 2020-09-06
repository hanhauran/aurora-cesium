package aurora.cesium.element.property;

import cesiumlanguagewriter.Rectangular;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.RepeatCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface RepeatProperty extends Property<RepeatCesiumWriter>, Deletable, Interpolatable, Intervalable<RepeatProperty>, Referenceable {

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
    Boolean getDelete();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<RepeatProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<RepeatCesiumWriter> supplier);
}
