package aurora.cesium.element;

import aurora.cesium.element.property.ClockProperty;
import aurora.cesium.language.writer.PacketCesiumWriter;

import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface StartElement extends Element {

    static StartElement defaultStartElement() {
        return newBuilder().withId("document").withName("CZML").withVersion("1.0").build();
    }

    static StartElementAdapter.Builder newBuilder() {
        return StartElementAdapter.Builder.newBuilder();
    }

    @Override
    String getId();

    @Override
    String getName();

    String getVersion();

    ClockProperty getClock();

    void dispatch(Supplier<PacketCesiumWriter> supplier);
}
