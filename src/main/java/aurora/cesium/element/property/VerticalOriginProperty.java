package aurora.cesium.element.property;

import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.VerticalOriginCesiumWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface VerticalOriginProperty extends MultiIntervalProperty<VerticalOriginProperty>, ReferenceProperty {

    @Override
    TimeInterval getInterval();

    @Override
    List<VerticalOriginProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(VerticalOriginCesiumWriter writer);
}
