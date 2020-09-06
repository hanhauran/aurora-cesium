package aurora.cesium.element.property;

import cesiumlanguagewriter.Cartographic;
import cesiumlanguagewriter.advanced.ICesiumCartographicRadiansValuePropertyWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface CartographicRadiansProperty extends Property<ICesiumCartographicRadiansValuePropertyWriter> {

    static CartographicRadiansProperty from(Cartographic cartographic) {
        return newBuilder().withValue(cartographic).build();
    }

    static CartographicRadiansPropertyImpl.Builder newBuilder() {
        return CartographicRadiansPropertyImpl.Builder.newBuilder();
    }

    @Override
    void dispatchWithoutClose(ICesiumCartographicRadiansValuePropertyWriter writer);
}
