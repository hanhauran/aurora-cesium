package aurora.cesium.element.property;

import aurora.cesium.language.writer.AlignedAxisCesiumWriter;
import aurora.cesium.language.writer.UnitSpherical;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface UnitSphericalProperty extends Property {

    static UnitSphericalProperty from(UnitSpherical unitSpherical) {
        return newBuilder().withValue(unitSpherical).build();
    }

    static UnitSphericalPropertyImpl.Builder newBuilder() {
        return UnitSphericalPropertyImpl.Builder.newBuilder();
    }

    void dispatchUnitSpherical(AlignedAxisCesiumWriter writer);
}
