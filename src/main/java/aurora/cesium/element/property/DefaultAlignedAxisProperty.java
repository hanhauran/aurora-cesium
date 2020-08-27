package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultAlignedAxisProperty extends PropertyAdapter<AlignedAxisProperty> implements AlignedAxisProperty {

    private UnitCartesianProperty unitCartesian;

    private UnitSphericalProperty unitSpherical;

    public DefaultAlignedAxisProperty(UnitCartesianProperty unitCartesian, Interpolations interpolations, TimeInterval interval) {
        this.unitCartesian = unitCartesian;
        this.interpolations = interpolations;
        this.interval = interval;
    }

    public DefaultAlignedAxisProperty(UnitSphericalProperty unitSpherical, Interpolations interpolations, TimeInterval interval) {
        this.unitSpherical = unitSpherical;
        this.interpolations = interpolations;
        this.interval = interval;
    }

    public DefaultAlignedAxisProperty(List<AlignedAxisProperty> intervals) {
        super(intervals);
    }

    public DefaultAlignedAxisProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(AlignedAxisCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getUnitCartesian()).ifPresent(unitCartesianProperty -> unitCartesianProperty.dispatchUnitCartesian(writer));
            Optional.ofNullable(getUnitSpherical()).ifPresent(unitSphericalProperty -> unitSphericalProperty.dispatchUnitSpherical(writer));
            dispatchInterpolations(writer);
            dispatchInterval(writer);
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
    public List<AlignedAxisProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<AlignedAxisProperty> intervals) {
        this.intervals = intervals;
    }

    @Override
    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }
}
