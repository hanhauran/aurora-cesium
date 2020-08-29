package aurora.cesium.element.property;

import aurora.cesium.language.writer.BackgroundPaddingCesiumWriter;
import aurora.cesium.language.writer.Rectangular;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface BackgroundPaddingProperty extends IntervalProperty<BackgroundPaddingProperty>, ReferenceProperty {

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
    TimeInterval getInterval();

    @Override
    List<BackgroundPaddingProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(BackgroundPaddingCesiumWriter writer);
}
