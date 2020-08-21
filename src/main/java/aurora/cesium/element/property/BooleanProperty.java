package aurora.cesium.element.property;

import aurora.cesium.language.writer.BooleanCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface BooleanProperty extends IntervalProperty, ReferenceProperty {

    @Override
    TimeInterval getInterval();

    @Override
    Reference getReference();

    void dispatch(BooleanCesiumWriter writer);
}
