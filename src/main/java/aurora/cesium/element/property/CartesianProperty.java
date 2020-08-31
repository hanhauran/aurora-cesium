package aurora.cesium.element.property;

import aurora.cesium.language.writer.Cartesian;
import aurora.cesium.language.writer.advanced.ICesiumCartesian3ValuePropertyWriter;

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
