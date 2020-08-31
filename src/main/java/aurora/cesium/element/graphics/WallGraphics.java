package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.element.property.DoubleProperty;
import aurora.cesium.element.property.PositionListProperty;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.WallCesiumWriter;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface WallGraphics extends Graphics<WallGraphics, WallCesiumWriter> {

    DoubleProperty getMaximumHeights();

    PositionListProperty getPositions();

    @Override
    BooleanProperty getShow();

    @Override
    TimeInterval getInterval();

    @Override
    List<WallGraphics> getIntervals();

    @Override
    void dispatch(Supplier<WallCesiumWriter> supplier);
}
