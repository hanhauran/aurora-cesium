package aurora.cesium.element.property;

import aurora.cesium.language.writer.PixelOffsetCesiumWriter;
import aurora.cesium.language.writer.Rectangular;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PixelOffsetProperty extends InterpolatableProperty, IntervalProperty<PixelOffsetProperty>, ReferenceProperty {

    static PixelOffsetProperty from(Rectangular value) {
        return newBuilder().withValue(value).build();
    }

    static DefaultPixelOffsetProperty.Builder newBuilder() {
        return DefaultPixelOffsetProperty.Builder.newBuilder();
    }

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<PixelOffsetProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(PixelOffsetCesiumWriter writer);
}
