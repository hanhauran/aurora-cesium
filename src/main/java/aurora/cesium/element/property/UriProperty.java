package aurora.cesium.element.property;

import cesiumlanguagewriter.CesiumResource;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;
import cesiumlanguagewriter.UriCesiumWriter;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface UriProperty extends Property<UriCesiumWriter>, Deletable, Intervalable<UriProperty>, Referenceable {

    static UriProperty from(CesiumResource resource) {
        return newBuilder().withValue(resource).build();
    }

    static UriProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static UriPropertyImpl.Builder newBuilder() {
        return UriPropertyImpl.Builder.newBuilder();
    }

    @Override
    Boolean getDelete();

    @Override
    TimeInterval getInterval();

    @Override
    List<UriProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<UriCesiumWriter> supplier);
}
