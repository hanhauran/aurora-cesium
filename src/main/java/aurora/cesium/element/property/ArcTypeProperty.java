package aurora.cesium.element.property;

import aurora.cesium.language.writer.ArcTypeCesiumWriter;
import aurora.cesium.language.writer.CesiumArcType;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public interface ArcTypeProperty extends IntervalProperty<ArcTypeProperty>, ReferenceProperty {

    static ArcTypeProperty from(CesiumArcType arcType) {
        return newBuilder().withValue(arcType).build();
    }

    static ArcTypeProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static ArcTypePropertyImpl.Builder newBuilder() {
        return ArcTypePropertyImpl.Builder.newBuilder();
    }

    @Override
    TimeInterval getInterval();

    @Override
    List<ArcTypeProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(ArcTypeCesiumWriter writer);
}
