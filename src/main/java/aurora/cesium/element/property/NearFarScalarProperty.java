package aurora.cesium.element.property;

import aurora.cesium.language.writer.NearFarScalarCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface NearFarScalarProperty extends InterpolatableProperty, MultiIntervalProperty<NearFarScalarProperty>, ReferenceProperty {

    static DefaultNearFarScalarProperty.Builder newBuilder() {
        return DefaultNearFarScalarProperty.Builder.newBuilder();
    }

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<NearFarScalarProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(NearFarScalarCesiumWriter writer);
}
