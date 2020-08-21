package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.language.writer.CylinderCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface CylinderGraphics extends Graphics<CylinderCesiumWriter> {

    @Override
    BooleanProperty getShow();

    @Override
    void dispatch(CylinderCesiumWriter writer);
}
