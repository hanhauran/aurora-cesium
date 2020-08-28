package aurora.cesium.element.property;

import aurora.cesium.language.writer.Cartographic;
import aurora.cesium.language.writer.PositionCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface CartographicDegreesProperty extends Property {

    static CartographicDegreesProperty from(Cartographic cartographic) {
        return newBuilder().withValue(cartographic).build();
    }

    static DefaultCartographicDegreesProperty.Builder newBuilder() {
        return DefaultCartographicDegreesProperty.Builder.newBuilder();
    }

    void dispatchCartographicDegrees(PositionCesiumWriter writer);
}
