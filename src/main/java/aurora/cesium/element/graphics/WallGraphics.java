package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.language.writer.WallCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface WallGraphics extends Graphics<WallCesiumWriter> {

    @Override
    BooleanProperty getShow();

    @Override
    void dispatch(WallCesiumWriter writer);
}
