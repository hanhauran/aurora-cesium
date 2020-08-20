package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.language.writer.Reference;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
abstract class GraphicsAdapter implements Graphics {

    protected BooleanProperty show;

    protected Reference showRef;

    @Override
    public BooleanProperty getShow() {
        return show;
    }

    public void setShow(BooleanProperty show) {
        this.show = show;
    }

    @Override
    public Reference getShowRef() {
        return showRef;
    }

    public void setShowRef(Reference showRef) {
        this.showRef = showRef;
    }
}
