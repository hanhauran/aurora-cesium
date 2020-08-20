package aurora.cesium.element.property;

import aurora.cesium.language.writer.AlignedAxisCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.UnitSpherical;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultUnitSphericalProperty extends BaseSingleIntervalProperty<UnitSpherical> implements UnitSphericalProperty, IntervalProperty, Property {

    public DefaultUnitSphericalProperty() {
        super();
    }

    public DefaultUnitSphericalProperty(UnitSpherical instance) {
        super(instance);
    }

    public DefaultUnitSphericalProperty(UnitSpherical instance, TimeInterval interval) {
        super(instance, interval);
    }

    @Override
    public void dispatchAlignedAxis(AlignedAxisCesiumWriter writer, boolean close) {
        try {
            dispatchConsumer(writer::writeUnitSpherical);
        } finally {
            if (close) {
                writer.close();
            }
        }
    }

    public UnitSpherical getUnitSpherical() {
        return instance;
    }

    public void setUnitSpherical(UnitSpherical unitSpherical) {
        this.instance = unitSpherical;
    }
}
