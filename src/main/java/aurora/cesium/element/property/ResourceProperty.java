package aurora.cesium.element.property;

import aurora.cesium.language.writer.UriCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface ResourceProperty extends IntervalProperty {

    void dispatchUri(UriCesiumWriter writer);
}
