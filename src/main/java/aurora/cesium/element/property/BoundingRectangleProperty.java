package aurora.cesium.element.property;

import aurora.cesium.language.writer.BoundingRectangle;
import aurora.cesium.language.writer.BoundingRectangleCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface BoundingRectangleProperty extends Property<BoundingRectangleCesiumWriter>, Interpolatable, Intervalable<BoundingRectangleProperty>, Referenceable {

    static BoundingRectangleProperty from(BoundingRectangle boundingRectangle) {
        return newBuilder().withValue(boundingRectangle).build();
    }

    static BoundingRectangleProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static BoundingRectanglePropertyImpl.Builder newBuilder() {
        return BoundingRectanglePropertyImpl.Builder.newBuilder();
    }

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<BoundingRectangleProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<BoundingRectangleCesiumWriter> supplier);
}
