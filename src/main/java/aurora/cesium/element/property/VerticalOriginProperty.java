package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumVerticalOrigin;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.VerticalOriginCesiumWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface VerticalOriginProperty extends IntervalProperty<VerticalOriginProperty>, ReferenceProperty {

    static VerticalOriginProperty from(CesiumVerticalOrigin origin) {
        return newBuilder().withValue(origin).build();
    }

    static DefaultVerticalOriginProperty.Builder newBuilder() {
        return DefaultVerticalOriginProperty.Builder.newBuilder();
    }

    @Override
    TimeInterval getInterval();

    @Override
    List<VerticalOriginProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(VerticalOriginCesiumWriter writer);
}
