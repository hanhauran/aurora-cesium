package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.language.writer.EllipsoidCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface EllipsoidGraphics extends Graphics<EllipsoidCesiumWriter> {

    @Override
    BooleanProperty getShow();

    @Override
    void dispatch(EllipsoidCesiumWriter writer);
}
