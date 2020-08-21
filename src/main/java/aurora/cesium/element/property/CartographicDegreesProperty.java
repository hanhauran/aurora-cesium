package aurora.cesium.element.property;

import aurora.cesium.language.writer.PositionCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface CartographicDegreesProperty extends Property {

    void dispatchPosition(PositionCesiumWriter writer);
}
