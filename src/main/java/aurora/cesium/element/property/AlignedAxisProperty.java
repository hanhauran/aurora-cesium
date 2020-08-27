package aurora.cesium.element.property;

import aurora.cesium.language.writer.AlignedAxisCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface AlignedAxisProperty extends InterpolatableProperty, MultiIntervalProperty<AlignedAxisProperty>, ReferenceProperty {

    static AlignedAxisProperty from(UnitCartesianProperty unitCartesian, Interpolations interpolations, TimeInterval interval) {
        return new DefaultAlignedAxisProperty(unitCartesian, interpolations, interval);
    }

    static AlignedAxisProperty from(UnitSphericalProperty unitSpherical, Interpolations interpolations, TimeInterval interval) {
        return new DefaultAlignedAxisProperty(unitSpherical, interpolations, interval);
    }

    static AlignedAxisProperty from(List<AlignedAxisProperty> intervals) {
        return new DefaultAlignedAxisProperty(intervals);
    }

    static AlignedAxisProperty from(Reference reference) {
        return new DefaultAlignedAxisProperty(reference);
    }

    UnitCartesianProperty getUnitCartesian();

    UnitSphericalProperty getUnitSpherical();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<AlignedAxisProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(AlignedAxisCesiumWriter writer);
}
