package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultAlignedAxisProperty extends PropertyAdapter implements AlignedAxisProperty {

    private UnitCartesianProperty unitCartesian;

    private UnitSphericalProperty unitSpherical;

    public DefaultAlignedAxisProperty() {
        super();
    }

    public DefaultAlignedAxisProperty(UnitCartesianProperty unitCartesian, Interpolations interpolations) {
        this(unitCartesian, interpolations, null);
    }

    public DefaultAlignedAxisProperty(UnitCartesianProperty unitCartesian, TimeInterval interval) {
        this(unitCartesian, null, interval);
    }

    public DefaultAlignedAxisProperty(UnitCartesianProperty unitCartesian, Interpolations interpolations, TimeInterval interval) {
        this.unitCartesian = unitCartesian;
        this.interpolations = interpolations;
        this.interval = interval;
    }

    public DefaultAlignedAxisProperty(UnitSphericalProperty unitSpherical, TimeInterval interval) {
        this(unitSpherical, null, interval);
    }

    public DefaultAlignedAxisProperty(UnitSphericalProperty unitSpherical, Interpolations interpolations) {
        this(unitSpherical, interpolations, null);
    }

    public DefaultAlignedAxisProperty(UnitSphericalProperty unitSpherical, Interpolations interpolations, TimeInterval interval) {
        this.unitSpherical = unitSpherical;
        this.interpolations = interpolations;
        this.interval = interval;
    }

    public DefaultAlignedAxisProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatchAlignedAxis(AlignedAxisCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getUnitCartesian()).ifPresent(unitCartesianProperty -> unitCartesianProperty.dispatchAlignedAxis(writer));
            Optional.ofNullable(getUnitSpherical()).ifPresent(unitSphericalProperty -> unitSphericalProperty.dispatchAlignedAxis(writer));
            dispatchInterpolations(writer);
            dispatchInterval(writer);
            dispatchReference(writer);
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

    @Override
    public Interpolations getInterpolations() {
        return interpolations;
    }

    public void setInterpolations(Interpolations interpolations) {
        this.interpolations = interpolations;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }
}
