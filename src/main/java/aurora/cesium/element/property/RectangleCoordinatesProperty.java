package aurora.cesium.element.property;

import aurora.cesium.language.writer.RectangleCoordinatesCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public interface RectangleCoordinatesProperty extends Property<RectangleCoordinatesCesiumWriter>, Interpolatable, Intervalable<RectangleCoordinatesProperty>, Referenceable {

    static RectangleCoordinatesProperty from(CartographicRectangleRadiansProperty extentProperty) {
        return newBuilder().withWsen(extentProperty).build();
    }

    static RectangleCoordinatesProperty from(CartographicRectangleDegreesProperty extentProperty) {
        return newBuilder().withWsenDegrees(extentProperty).build();
    }

    static RectangleCoordinatesProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static RectangleCoordinatesPropertyImpl.Builder newBuilder() {
        return RectangleCoordinatesPropertyImpl.Builder.newBuilder();
    }

    CartographicRectangleRadiansProperty getWsen();

    CartographicRectangleDegreesProperty getWsenDegrees();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<RectangleCoordinatesProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<RectangleCoordinatesCesiumWriter> supplier);
}
