package aurora.cesium.element.property;

import aurora.cesium.language.writer.AlignedAxisCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultAlignedAxisProperty extends BaseInterpolatableIntervalProperty implements AlignedAxisProperty, InterpolatableProperty, IntervalProperty, Property {

    private UnitCartesianProperty unitCartesian;

    private UnitSphericalProperty unitSpherical;

    public DefaultAlignedAxisProperty() {
        super();
    }

    public DefaultAlignedAxisProperty(TimeInterval interval) {
        super(interval);
    }

    @Override
    public void dispatchAlignedAxis(AlignedAxisCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            Optional.ofNullable(getUnitCartesian()).ifPresent(unitCartesianProperty -> unitCartesianProperty.dispatchAlignedAxis(writer, false));
            Optional.ofNullable(getUnitSpherical()).ifPresent(unitSphericalProperty -> unitSphericalProperty.dispatchAlignedAxis(writer, false));
            dispatchInterpolatableProperty(writer);
        }
    }

    @Override
    public UnitCartesianProperty getUnitCartesian() {
        return unitCartesian;
    }

    public void setUnitCartesian(UnitCartesianProperty unitCartesian) {
        this.unitCartesian = unitCartesian;
    }

    @Override
    public UnitSphericalProperty getUnitSpherical() {
        return unitSpherical;
    }

    public void setUnitSpherical(UnitSphericalProperty unitSpherical) {
        this.unitSpherical = unitSpherical;
    }
}
