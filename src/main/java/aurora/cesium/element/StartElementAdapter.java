package aurora.cesium.element;

import aurora.cesium.element.property.ClockProperty;
import aurora.cesium.language.writer.PacketCesiumWriter;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public class StartElementAdapter extends ElementAdapter implements StartElement {

    private String version;

    private ClockProperty clock;

    @Override
    public void dispatch(PacketCesiumWriter writer) {
        Optional.ofNullable(getId()).ifPresent(writer::writeId);
        Optional.ofNullable(getName()).ifPresent(writer::writeName);
        Optional.ofNullable(getVersion()).ifPresent(writer::writeVersion);
        Optional.ofNullable(getClock()).ifPresent(clockProperty -> clockProperty.dispatch(writer.openClockProperty()));
    }

    @Override
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public ClockProperty getClock() {
        return clock;
    }

    public void setClock(ClockProperty clock) {
        this.clock = clock;
    }
}
