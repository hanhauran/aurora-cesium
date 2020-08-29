package aurora.cesium.element.property;

import aurora.cesium.language.writer.RectangleCoordinatesCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public interface RectangleCoordinatesProperty extends InterpolatableProperty, IntervalProperty<RectangleCoordinatesProperty>, ReferenceProperty {

    static RectangleCoordinatesProperty fromWsen(CartographicExtentProperty extentProperty) {
        return newBuilder().withWsen(extentProperty).build();
    }

    static RectangleCoordinatesProperty fromWsenDegrees(CartographicExtentProperty extentProperty) {
        return newBuilder().withWsenDegrees(extentProperty).build();
    }

    static RectangleCoordinatesProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static RectangleCoordinatesPropertyImpl.Builder newBuilder() {
        return RectangleCoordinatesPropertyImpl.Builder.newBuilder();
    }

    CartographicExtentProperty getWsen();

    CartographicExtentProperty getWsenDegrees();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<RectangleCoordinatesProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(RectangleCoordinatesCesiumWriter writer);
}
