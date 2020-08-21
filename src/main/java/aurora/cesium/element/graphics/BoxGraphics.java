package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.language.writer.BoxCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface BoxGraphics extends Graphics<BoxCesiumWriter> {

    @Override
    BooleanProperty getShow();

    @Override
    void dispatch(BoxCesiumWriter writer);
}
