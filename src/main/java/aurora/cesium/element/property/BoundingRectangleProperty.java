package aurora.cesium.element.property;

import cesiumlanguagewriter.BoundingRectangle;
import cesiumlanguagewriter.BoundingRectangleCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface BoundingRectangleProperty extends Property<BoundingRectangleCesiumWriter>, Deletable, Interpolatable, Intervalable<BoundingRectangleProperty>, Referenceable {

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
    Boolean getDelete();

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
