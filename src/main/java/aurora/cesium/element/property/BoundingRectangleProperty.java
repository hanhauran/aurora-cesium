package aurora.cesium.element.property;

import aurora.cesium.language.writer.BoundingRectangleCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface BoundingRectangleProperty extends IntervalProperty, InterpolatableProperty, ReferenceProperty {

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    Reference getReference();

    void dispatch(BoundingRectangleCesiumWriter writer);
}
