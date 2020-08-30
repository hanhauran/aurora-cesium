package aurora.cesium.element.property;

import aurora.cesium.language.writer.UnitQuaternion;
import aurora.cesium.language.writer.advanced.ICesiumUnitQuaternionValuePropertyWriter;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface UnitQuaternionProperty extends Property {

    static UnitQuaternionProperty from(UnitQuaternion unitQuaternion) {
        return newBuilder().withValue(unitQuaternion).build();
    }

    static UnitQuaternionPropertyImpl.Builder newBuilder() {
        return UnitQuaternionPropertyImpl.Builder.newBuilder();
    }

    void dispatchWithoutClose(ICesiumUnitQuaternionValuePropertyWriter writer);
}
