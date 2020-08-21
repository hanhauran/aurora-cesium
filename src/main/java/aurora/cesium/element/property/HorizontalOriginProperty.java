package aurora.cesium.element.property;

import aurora.cesium.language.writer.HorizontalOriginCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface HorizontalOriginProperty extends IntervalProperty, ReferenceProperty {

    void dispatch(HorizontalOriginCesiumWriter writer);
}
