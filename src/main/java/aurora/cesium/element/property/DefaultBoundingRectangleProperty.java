package aurora.cesium.element.property;

import aurora.cesium.language.writer.BoundingRectangle;
import aurora.cesium.language.writer.BoundingRectangleCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultBoundingRectangleProperty extends BaseSingleInterpolatableIntervalProperty<BoundingRectangle> implements BoundingRectangleProperty {

    public DefaultBoundingRectangleProperty() {
        super();
    }

    public DefaultBoundingRectangleProperty(BoundingRectangle instance) {
        super(instance);
    }

    public DefaultBoundingRectangleProperty(BoundingRectangle instance, TimeInterval interval) {
        super(instance, interval);
    }

    @Override
    public void dispatchBoundingRectangle(BoundingRectangleCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeBoundingRectangle);
            dispatchInterpolatableProperty(writer);
        }
    }

    public BoundingRectangle getBoundingRectangle() {
        return instance;
    }

    public void setBoundingRectangle(BoundingRectangle boundingRectangle) {
        this.instance = boundingRectangle;
    }
}
