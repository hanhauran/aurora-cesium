package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
abstract class GraphicsAdapter implements Graphics {

    protected BooleanProperty show;

    @Override
    public BooleanProperty getShow() {
        return show;
    }

    public void setShow(BooleanProperty show) {
        this.show = show;
    }
}
