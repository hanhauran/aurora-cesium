package aurora.cesium.element.property;

import aurora.cesium.language.writer.BoundingRectangleCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface BoundingRectangleProperty extends InterpolatableProperty, MultiIntervalProperty<BoundingRectangleCesiumWriter, BoundingRectangleProperty>, ReferenceProperty {

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<BoundingRectangleProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(BoundingRectangleCesiumWriter writer);
}
