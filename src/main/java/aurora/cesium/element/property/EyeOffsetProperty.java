package aurora.cesium.element.property;

import cesiumlanguagewriter.Cartesian;
import cesiumlanguagewriter.EyeOffsetCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface EyeOffsetProperty extends Property<EyeOffsetCesiumWriter>, Deletable, Interpolatable, Intervalable<EyeOffsetProperty>, Referenceable {

    static EyeOffsetProperty from(Cartesian cartesian) {
        return newBuilder().withCartesian(CartesianProperty.from(cartesian)).build();
    }

    static EyeOffsetProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static EyeOffsetPropertyImpl.Builder newBuilder() {
        return EyeOffsetPropertyImpl.Builder.newBuilder();
    }

    CartesianProperty getCartesian();

    @Override
    Boolean getDelete();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<EyeOffsetProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<EyeOffsetCesiumWriter> supplier);
}
