package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumHeightReference;
import aurora.cesium.language.writer.HeightReferenceCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface HeightReferenceProperty extends Property<HeightReferenceCesiumWriter>, Intervalable<HeightReferenceProperty>, Referenceable {

    static HeightReferenceProperty from(CesiumHeightReference value) {
        return newBuilder().withValue(value).build();
    }

    static HeightReferenceProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static HeightReferencePropertyImpl.Builder newBuilder() {
        return HeightReferencePropertyImpl.Builder.newBuilder();
    }

    @Override
    TimeInterval getInterval();

    @Override
    List<HeightReferenceProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<HeightReferenceCesiumWriter> supplier);
}
