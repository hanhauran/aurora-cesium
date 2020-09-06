package aurora.cesium.element.property;

import cesiumlanguagewriter.Cartesian;
import cesiumlanguagewriter.advanced.ICesiumCartesian3ValuePropertyWriter;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface CartesianProperty extends Property<ICesiumCartesian3ValuePropertyWriter> {

    static CartesianProperty from(Cartesian cartesian) {
        return newBuilder().withValue(cartesian).build();
    }

    static CartesianPropertyImpl.Builder newBuilder() {
        return CartesianPropertyImpl.Builder.newBuilder();
    }

    @Override
    void dispatchWithoutClose(ICesiumCartesian3ValuePropertyWriter writer);
}
