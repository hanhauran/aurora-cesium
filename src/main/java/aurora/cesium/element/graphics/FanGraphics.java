package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.FanCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public interface FanGraphics extends Graphics<FanGraphics, FanCesiumWriter> {

    static FanGraphicsAdapter.Builder newBuilder() {
        return FanGraphicsAdapter.Builder.newBuilder();
    }

    DirectionListProperty getDirections();

    BooleanProperty getFill();

    IntegerProperty getNumberOfRings();

    MaterialProperty getMaterial();

    BooleanProperty getOutline();

    ColorProperty getOutlineColor();

    DoubleProperty getOutlineWidth();

    BooleanProperty getPerDirectionRadius();

    DoubleProperty getRadius();

    @Override
    BooleanProperty getShow();

    @Override
    TimeInterval getInterval();

    @Override
    List<FanGraphics> getIntervals();

    @Override
    void dispatch(Supplier<FanCesiumWriter> supplier);
}
