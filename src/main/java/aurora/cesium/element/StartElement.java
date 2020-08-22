package aurora.cesium.element;

import aurora.cesium.element.property.ClockProperty;
import aurora.cesium.language.writer.PacketCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface StartElement extends Element {

    @Override
    String getId();

    @Override
    String getName();

    String getVersion();

    ClockProperty getClock();

    void dispatch(PacketCesiumWriter writer);
}
