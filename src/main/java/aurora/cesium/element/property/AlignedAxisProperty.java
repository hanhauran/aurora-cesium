package aurora.cesium.element.property;

import aurora.cesium.language.writer.AlignedAxisCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface AlignedAxisProperty extends InterpolatableProperty, IntervalProperty<AlignedAxisProperty>, ReferenceProperty {

    static DefaultAlignedAxisProperty.Builder newBuilder() {
        return DefaultAlignedAxisProperty.Builder.newBuilder();
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
