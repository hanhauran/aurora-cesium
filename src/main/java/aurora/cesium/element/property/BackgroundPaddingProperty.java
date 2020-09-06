package aurora.cesium.element.property;

import cesiumlanguagewriter.BackgroundPaddingCesiumWriter;
import cesiumlanguagewriter.Rectangular;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface BackgroundPaddingProperty extends Property<BackgroundPaddingCesiumWriter>, Deletable, Intervalable<BackgroundPaddingProperty>, Referenceable {

    static BackgroundPaddingProperty from(Rectangular rectangular) {
        return from(RectangularProperty.from(rectangular));
    }

    static BackgroundPaddingProperty from(RectangularProperty rectangularProperty) {
        return newBuilder().withRectangular(rectangularProperty).build();
    }

    static BackgroundPaddingProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static BackgroundPaddingPropertyImpl.Builder newBuilder() {
        return BackgroundPaddingPropertyImpl.Builder.newBuilder();
    }

    RectangularProperty getRectangular();

    @Override
    Boolean getDelete();

    @Override
    TimeInterval getInterval();

    @Override
    List<BackgroundPaddingProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<BackgroundPaddingCesiumWriter> supplier);
}
