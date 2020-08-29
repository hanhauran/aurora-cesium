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

    static CartographicRadiansPropertyImpl.Builder newBuilder() {
        return CartographicRadiansPropertyImpl.Builder.newBuilder();
    }

    void dispatchCartographicRadians(PositionCesiumWriter writer);
}
