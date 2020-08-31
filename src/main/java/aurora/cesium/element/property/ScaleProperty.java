package aurora.cesium.element.property;

import aurora.cesium.language.writer.Cartesian;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.ScaleCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface ScaleProperty extends Property<ScaleCesiumWriter>, Interpolatable, Intervalable<ScaleProperty>, Referenceable {

    static ScaleProperty from(Cartesian cartesian) {
        return from(CartesianProperty.from(cartesian));
    }

    static ScaleProperty from(CartesianProperty cartesianProperty) {
        return newBuilder().withCartesian(cartesianProperty).build();
    }

    static ScalePropertyImpl.Builder newBuilder() {
        return ScalePropertyImpl.Builder.newBuilder();
    }

    CartesianProperty getCartesian();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<ScaleProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<ScaleCesiumWriter> supplier);
}
