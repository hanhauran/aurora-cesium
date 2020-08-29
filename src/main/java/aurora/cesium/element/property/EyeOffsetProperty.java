package aurora.cesium.element.property;

import aurora.cesium.language.writer.Cartesian;
import aurora.cesium.language.writer.EyeOffsetCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface EyeOffsetProperty extends InterpolatableProperty, IntervalProperty<EyeOffsetProperty>, ReferenceProperty {

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
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<EyeOffsetProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(EyeOffsetCesiumWriter writer);
}
