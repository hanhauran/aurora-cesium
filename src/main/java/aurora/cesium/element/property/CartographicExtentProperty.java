package aurora.cesium.element.property;

import aurora.cesium.language.writer.RectangleCoordinatesCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public interface CartographicExtentProperty extends Property {

    void dispatchWsen(RectangleCoordinatesCesiumWriter writer);

    void dispatchWsenDegrees(RectangleCoordinatesCesiumWriter writer);
}
