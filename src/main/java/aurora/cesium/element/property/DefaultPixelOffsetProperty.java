package aurora.cesium.element.property;

import aurora.cesium.language.writer.PixelOffsetCesiumWriter;
import aurora.cesium.language.writer.Rectangular;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultPixelOffsetProperty extends BaseSingleInterpolatableIntervalProperty<Rectangular> implements PixelOffsetProperty, InterpolatableProperty, IntervalProperty, Property {

    public DefaultPixelOffsetProperty() {
        super();
    }

    public DefaultPixelOffsetProperty(Rectangular instance) {
        super(instance);
    }

    public DefaultPixelOffsetProperty(Rectangular instance, TimeInterval interval) {
        super(instance, interval);
    }

    @Override
    public void dispatchPixelOffset(PixelOffsetCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeCartesian2);
            dispatchInterpolatableProperty(writer);
        }
    }

    public Rectangular getRectangular() {
        return instance;
    }

    public void setRectangular(Rectangular rectangular) {
        this.instance = rectangular;
    }
}
