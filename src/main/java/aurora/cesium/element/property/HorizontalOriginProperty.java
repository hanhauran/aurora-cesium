package aurora.cesium.element.property;

import aurora.cesium.language.writer.HorizontalOriginCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface HorizontalOriginProperty extends IntervalProperty<HorizontalOriginProperty>, ReferenceProperty {

    @Override
    TimeInterval getInterval();

    @Override
    List<HorizontalOriginProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(HorizontalOriginCesiumWriter writer);
}
