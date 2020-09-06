package aurora.cesium.element.property;

import cesiumlanguagewriter.CesiumVerticalOrigin;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;
import cesiumlanguagewriter.VerticalOriginCesiumWriter;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface VerticalOriginProperty extends Property<VerticalOriginCesiumWriter>, Deletable, Intervalable<VerticalOriginProperty>, Referenceable {

    static VerticalOriginProperty from(CesiumVerticalOrigin verticalOrigin) {
        return newBuilder().withValue(verticalOrigin).build();
    }

    static VerticalOriginProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static VerticalOriginPropertyImpl.Builder newBuilder() {
        return VerticalOriginPropertyImpl.Builder.newBuilder();
    }

    @Override
    Boolean getDelete();

    @Override
    TimeInterval getInterval();

    @Override
    List<VerticalOriginProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<VerticalOriginCesiumWriter> supplier);
}
