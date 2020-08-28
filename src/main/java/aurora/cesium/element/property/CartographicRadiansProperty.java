package aurora.cesium.element.property;

import aurora.cesium.language.writer.Cartographic;
import aurora.cesium.language.writer.PositionCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface CartographicRadiansProperty extends Property {

    static CartographicRadiansProperty from(Cartographic cartographic) {
        return newBuilder().withValue(cartographic).build();
    }

    static DefaultCartographicRadiansProperty.Builder newBuilder() {
        return DefaultCartographicRadiansProperty.Builder.newBuilder();
    }

    void dispatchCartographicRadians(PositionCesiumWriter writer);
}
