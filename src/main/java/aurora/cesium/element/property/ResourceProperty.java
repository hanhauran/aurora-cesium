package aurora.cesium.element.property;

import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.UriCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface ResourceProperty extends IntervalProperty, ReferenceProperty {

    @Override
    TimeInterval getInterval();

    @Override
    Reference getReference();

    void dispatchUri(UriCesiumWriter writer);
}
