package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.language.writer.PolylineCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PolylineGraphics extends Graphics<PolylineCesiumWriter> {

    @Override
    BooleanProperty getShow();

    @Override
    void dispatch(PolylineCesiumWriter writer);
}
