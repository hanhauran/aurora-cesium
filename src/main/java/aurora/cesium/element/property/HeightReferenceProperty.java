package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumHeightReference;
import aurora.cesium.language.writer.HeightReferenceCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface HeightReferenceProperty extends IntervalProperty<HeightReferenceProperty>, ReferenceProperty {

    static HeightReferenceProperty from(CesiumHeightReference value) {
        return newBuilder().withValue(value).build();
    }

    static DefaultHeightReferenceProperty.Builder newBuilder() {
        return DefaultHeightReferenceProperty.Builder.newBuilder();
    }

    @Override
    TimeInterval getInterval();

    @Override
    List<HeightReferenceProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(HeightReferenceCesiumWriter writer);
}
