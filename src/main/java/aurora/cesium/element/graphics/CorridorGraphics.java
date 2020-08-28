package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.language.writer.CorridorCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface CorridorGraphics extends Graphics<CorridorGraphics, CorridorCesiumWriter> {

    @Override
    BooleanProperty getShow();

    @Override
    TimeInterval getInterval();

    @Override
    List<CorridorGraphics> getIntervals();

    @Override
    void dispatch(CorridorCesiumWriter writer);
}
