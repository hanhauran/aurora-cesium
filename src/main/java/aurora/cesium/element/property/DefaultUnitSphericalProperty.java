package aurora.cesium.element.property;

import aurora.cesium.language.writer.AlignedAxisCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.UnitSpherical;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultUnitSphericalProperty extends SinglePropertyAdapter<UnitSpherical> implements UnitSphericalProperty {

    public DefaultUnitSphericalProperty() {
        super();
    }

    public DefaultUnitSphericalProperty(UnitSpherical instance) {
        super(instance);
    }

    @Override
    public void dispatchAlignedAxis(AlignedAxisCesiumWriter writer) {
        dispatchConsumer(writer::writeUnitSpherical);
    }

    public UnitSpherical getUnitSpherical() {
        return instance;
    }

    public void setUnitSpherical(UnitSpherical unitSpherical) {
        this.instance = unitSpherical;
    }
}
