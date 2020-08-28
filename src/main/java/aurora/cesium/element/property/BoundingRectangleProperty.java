package aurora.cesium.element.property;

import aurora.cesium.language.writer.BoundingRectangleCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface BoundingRectangleProperty extends InterpolatableProperty, IntervalProperty<BoundingRectangleProperty>, ReferenceProperty {

    static DefaultBoundingRectangleProperty.Builder newBuilder() {
        return DefaultBoundingRectangleProperty.Builder.newBuilder();
    }

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<BoundingRectangleProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(BoundingRectangleCesiumWriter writer);
}
