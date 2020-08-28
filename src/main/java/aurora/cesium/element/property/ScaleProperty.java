package aurora.cesium.element.property;

import aurora.cesium.language.writer.Cartesian;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.ScaleCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface ScaleProperty extends InterpolatableProperty, IntervalProperty<ScaleProperty>, ReferenceProperty {

    static ScaleProperty from(Cartesian cartesian) {
        return newBuilder().withCartesian(CartesianProperty.from(cartesian)).build();
    }

    static DefaultScaleProperty.Builder newBuilder() {
        return DefaultScaleProperty.Builder.newBuilder();
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

    void dispatch(ScaleCesiumWriter writer);
}
