package aurora.cesium.element.property;

import aurora.cesium.language.writer.EyeOffsetCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface EyeOffsetProperty extends InterpolatableProperty, IntervalProperty<EyeOffsetProperty>, ReferenceProperty {

    static DefaultEyeOffsetProperty.Builder newBuilder() {
        return DefaultEyeOffsetProperty.Builder.newBuilder();
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
