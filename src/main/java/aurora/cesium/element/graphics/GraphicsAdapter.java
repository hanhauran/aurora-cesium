package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.language.writer.advanced.CesiumPropertyWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
abstract class GraphicsAdapter<T extends CesiumPropertyWriter<T>> implements Graphics<T> {

    protected BooleanProperty show;

    @Override
    public BooleanProperty getShow() {
        return show;
    }

    public void setShow(BooleanProperty show) {
        this.show = show;
    }
}
