package aurora.cesium.element.property;

import aurora.cesium.language.writer.Cartographic;
import aurora.cesium.language.writer.advanced.ICesiumCartographicDegreesValuePropertyWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface CartographicDegreesProperty extends Property<ICesiumCartographicDegreesValuePropertyWriter> {

    static CartographicDegreesProperty from(Cartographic cartographic) {
        return newBuilder().withValue(cartographic).build();
    }

    static CartographicDegreesPropertyImpl.Builder newBuilder() {
        return CartographicDegreesPropertyImpl.Builder.newBuilder();
    }

    @Override
    void dispatchWithoutClose(ICesiumCartographicDegreesValuePropertyWriter writer);
}
