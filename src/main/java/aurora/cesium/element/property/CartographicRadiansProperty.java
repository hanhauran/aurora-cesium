package aurora.cesium.element.property;

import aurora.cesium.language.writer.PositionCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface CartographicRadiansProperty extends Property {

    static DefaultCartographicRadiansProperty.Builder newBuilder() {
        return DefaultCartographicRadiansProperty.Builder.newBuilder();
    }

    void dispatchCartographicRadians(PositionCesiumWriter writer);
}
