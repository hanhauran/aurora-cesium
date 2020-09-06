package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.element.property.DistanceDisplayConditionProperty;
import aurora.cesium.element.property.DoubleProperty;
import aurora.cesium.element.property.PolylineMaterialProperty;
import cesiumlanguagewriter.Bounds;
import cesiumlanguagewriter.PathCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PathGraphics extends Graphics<PathGraphics, PathCesiumWriter> {

    static PathGraphicsAdapter.Builder newBuilder() {
        return PathGraphicsAdapter.Builder.newBuilder();
    }

    /**
     * Gets or sets the {@link Bounds} Property specifying at what distance from the camera that this path will be displayed.
     */
    DistanceDisplayConditionProperty getDistanceDisplayCondition();

    /**
     * Gets or sets the Property specifying the number of seconds in front of the object to show.
     */
    DoubleProperty getLeadTime();

    /**
     * Gets or sets the Property specifying the material used to draw the path.
     */
    PolylineMaterialProperty getMaterial();

    /**
     * Gets or sets the Property specifying the maximum number of seconds to step when sampling the position.
     */
    DoubleProperty getResolution();

    /**
     * Gets or sets the boolean Property specifying the visibility of the path.
     */
    @Override
    BooleanProperty getShow();

    /**
     * Gets or sets the Property specifying the number of seconds behind the object to show.
     */
    DoubleProperty getTrailTime();

    /**
     * Gets or sets the numeric Property specifying the width in pixels.
     */
    DoubleProperty getWidth();

    @Override
    TimeInterval getInterval();

    @Override
    List<PathGraphics> getIntervals();

    @Override
    void dispatch(Supplier<PathCesiumWriter> supplier);
}
