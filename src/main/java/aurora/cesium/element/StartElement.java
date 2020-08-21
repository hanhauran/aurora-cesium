package aurora.cesium.element;

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

    void dispatchStartElement(PacketCesiumWriter writer);
}
