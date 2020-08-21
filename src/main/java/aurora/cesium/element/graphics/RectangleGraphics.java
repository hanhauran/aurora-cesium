package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.language.writer.RectangleCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface RectangleGraphics extends Graphics<RectangleCesiumWriter> {

    @Override
    BooleanProperty getShow();

    @Override
    void dispatch(RectangleCesiumWriter writer);
}
