package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.language.writer.PolygonCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PolygonGraphics extends Graphics<PolygonCesiumWriter> {

    @Override
    BooleanProperty getShow();

    @Override
    void dispatch(PolygonCesiumWriter writer);
}
