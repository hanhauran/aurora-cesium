package aurora.cesium.element.property;

import aurora.cesium.language.writer.VerticalOriginCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface VerticalOriginProperty extends IntervalProperty {

    void dispatchVerticalOrigin(VerticalOriginCesiumWriter writer);
}
