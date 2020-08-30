package aurora.cesium.element.property;

import aurora.cesium.language.writer.NearFarScalar;
import aurora.cesium.language.writer.NearFarScalarCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface NearFarScalarProperty extends InterpolatableProperty, IntervalProperty<NearFarScalarProperty>, ReferenceProperty {

    static NearFarScalarProperty from(NearFarScalar nearFarScalar) {
        return newBuilder().withValue(nearFarScalar).build();
    }

    static NearFarScalarProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static NearFarScalarPropertyImpl.Builder newBuilder() {
        return NearFarScalarPropertyImpl.Builder.newBuilder();
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
