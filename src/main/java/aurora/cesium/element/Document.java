package aurora.cesium.element;

import aurora.cesium.element.property.ClockProperty;
import cesiumlanguagewriter.PacketCesiumWriter;

import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface Document extends Element {

    static Document defaultDocument() {
        return defaultDocument("CZML");
    }

    static Document defaultDocument(String name) {
        return newBuilder().withId("document").withName(name).withVersion("1.0").build();
    }

    static DocumentAdapter.Builder newBuilder() {
        return DocumentAdapter.Builder.newBuilder();
    }

    @Override
    String getId();

    @Override
    String getName();

    String getVersion();

    ClockProperty getClock();

    void dispatch(Supplier<PacketCesiumWriter> supplier);
}
