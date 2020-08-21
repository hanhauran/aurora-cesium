package aurora.cesium.element;

import aurora.cesium.language.writer.PacketCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public class StartElementAdapter extends ElementAdapter implements StartElement {

    protected String version;

    @Override
    public void dispatchStartElement(PacketCesiumWriter writer) {

    }

    @Override
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
