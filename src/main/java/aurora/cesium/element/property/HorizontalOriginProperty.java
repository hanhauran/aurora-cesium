package aurora.cesium.element.property;

import aurora.cesium.language.writer.HorizontalOriginCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface HorizontalOriginProperty extends IntervalProperty {

    void dispatchHorizontalOrigin(HorizontalOriginCesiumWriter writer);
}
