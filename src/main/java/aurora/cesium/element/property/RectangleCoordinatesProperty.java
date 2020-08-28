package aurora.cesium.element.property;

import aurora.cesium.language.writer.RectangleCoordinatesCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public interface RectangleCoordinatesProperty extends InterpolatableProperty, IntervalProperty<RectangleCoordinatesProperty>,
        ReferenceProperty {

    CartographicExtentProperty getWsen();

    CartographicExtentProperty getWsenDegrees();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<RectangleCoordinatesProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(RectangleCoordinatesCesiumWriter writer);
}
