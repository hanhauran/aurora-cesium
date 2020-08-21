package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.language.writer.PathCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PathGraphics extends Graphics<PathCesiumWriter> {

    @Override
    BooleanProperty getShow();

    @Override
    void dispatch(PathCesiumWriter writer);
}
