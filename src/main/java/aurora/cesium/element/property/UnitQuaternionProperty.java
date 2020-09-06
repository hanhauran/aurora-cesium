package aurora.cesium.element.property;

import cesiumlanguagewriter.UnitQuaternion;
import cesiumlanguagewriter.advanced.ICesiumUnitQuaternionValuePropertyWriter;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface UnitQuaternionProperty extends Property<ICesiumUnitQuaternionValuePropertyWriter> {

    static UnitQuaternionProperty from(UnitQuaternion unitQuaternion) {
        return newBuilder().withValue(unitQuaternion).build();
    }

    static UnitQuaternionPropertyImpl.Builder newBuilder() {
        return UnitQuaternionPropertyImpl.Builder.newBuilder();
    }

    @Override
    void dispatchWithoutClose(ICesiumUnitQuaternionValuePropertyWriter writer);
}
