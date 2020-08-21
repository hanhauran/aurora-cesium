package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.language.writer.ModelCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface ModelGraphics extends Graphics<ModelCesiumWriter> {

    @Override
    BooleanProperty getShow();

    @Override
    void dispatch(ModelCesiumWriter writer);
}
