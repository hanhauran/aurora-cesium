package aurora.cesium.element.property;

import aurora.cesium.language.writer.PacketCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface AvailabilityProperty extends Property {

    void dispatchAvailability(PacketCesiumWriter writer);
}
