package aurora.cesium.element.property;

import aurora.cesium.language.writer.UnitQuaternion;
import aurora.cesium.language.writer.advanced.ICesiumUnitQuaternionValuePropertyWriter;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface UnitQuaternionProperty extends Property {

    static UnitQuaternionProperty from(UnitQuaternion value) {
        return newBuilder().withValue(value).build();
    }

    static DefaultUnitQuaternionProperty.Builder newBuilder() {
        return DefaultUnitQuaternionProperty.Builder.newBuilder();
    }

    void dispatchWithoutClose(ICesiumUnitQuaternionValuePropertyWriter writer);
}
