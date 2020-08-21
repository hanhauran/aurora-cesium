package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.language.writer.CorridorCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface CorridorGraphics extends Graphics<CorridorCesiumWriter> {

    @Override
    BooleanProperty getShow();

    @Override
    void dispatch(CorridorCesiumWriter writer);
}
