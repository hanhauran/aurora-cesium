package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.language.writer.advanced.CesiumPropertyWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
interface Graphics<T extends CesiumPropertyWriter<T>> {

    BooleanProperty getShow();

    void dispatch(T writer);
}
