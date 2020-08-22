package aurora.cesium.element.property;

import aurora.cesium.language.writer.BackgroundPaddingCesiumWriter;
import aurora.cesium.language.writer.Rectangular;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public class DefaultRectangularProperty extends SinglePropertyAdapter<Rectangular> implements RectangularProperty {

    public DefaultRectangularProperty() {
        super();
    }

    public DefaultRectangularProperty(Rectangular instance) {
        super(instance);
    }

    @Override
    public void dispatchRectangular(BackgroundPaddingCesiumWriter writer) {
        dispatchConsumer(writer::writeCartesian2);
    }

    public Rectangular getRectangular() {
        return instance;
    }

    public void setRectangular(Rectangular rectangular) {
        this.instance = rectangular;
    }
}
