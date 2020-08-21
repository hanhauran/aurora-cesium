package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.language.writer.PointCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PointGraphics extends Graphics<PointCesiumWriter> {

    @Override
    BooleanProperty getShow();

    @Override
    void dispatch(PointCesiumWriter writer);
}
