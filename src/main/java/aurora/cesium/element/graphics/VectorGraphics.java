package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.element.property.ColorProperty;
import aurora.cesium.element.property.DirectionProperty;
import aurora.cesium.element.property.DoubleProperty;
import cesiumlanguagewriter.TimeInterval;
import cesiumlanguagewriter.VectorCesiumWriter;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public interface VectorGraphics extends Graphics<VectorGraphics, VectorCesiumWriter> {

    static VectorGraphicsAdapter.Builder newBuilder() {
        return VectorGraphicsAdapter.Builder.newBuilder();
    }

    ColorProperty getColor();

    DirectionProperty getDirection();

    DoubleProperty getLength();

    DoubleProperty getMinimumLengthInPixels();

    @Override
    BooleanProperty getShow();

    @Override
    TimeInterval getInterval();

    @Override
    List<VectorGraphics> getIntervals();

    @Override
    void dispatch(Supplier<VectorCesiumWriter> supplier);
}
