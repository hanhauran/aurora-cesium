package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.language.writer.EllipseCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface EllipseGraphics extends Graphics<EllipseCesiumWriter> {

    @Override
    BooleanProperty getShow();

    @Override
    void dispatch(EllipseCesiumWriter writer);
}
