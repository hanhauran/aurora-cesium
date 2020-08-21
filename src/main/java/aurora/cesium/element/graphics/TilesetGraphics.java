package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.language.writer.TilesetCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface TilesetGraphics extends Graphics<TilesetCesiumWriter> {

    @Override
    BooleanProperty getShow();

    @Override
    void dispatch(TilesetCesiumWriter writer);
}
