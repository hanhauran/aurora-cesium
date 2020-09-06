package aurora.cesium.element.property;

import cesiumlanguagewriter.NearFarScalar;
import cesiumlanguagewriter.NearFarScalarCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface NearFarScalarProperty extends Property<NearFarScalarCesiumWriter>, Deletable, Interpolatable, Intervalable<NearFarScalarProperty>, Referenceable {

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
    Boolean getDelete();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<NearFarScalarProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<NearFarScalarCesiumWriter> supplier);
}
