package aurora.cesium.element.graphics;

import aurora.cesium.element.property.*;
import cesiumlanguagewriter.PolylineCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PolylineGraphics extends Graphics<PolylineGraphics, PolylineCesiumWriter> {

    static PolylineGraphicsAdapter.Builder newBuilder() {
        return PolylineGraphicsAdapter.Builder.newBuilder();
    }

    ArcTypeProperty getArcType();

    BooleanProperty getClampToGround();

    ClassificationTypeProperty getClassificationType();

    /**
     * Gets or sets the Property specifying the material used to draw the polyline when it fails the depth test.
     * <p>
     * Requires the EXT_frag_depth WebGL extension to render properly. If the extension is not supported,
     * there may be artifacts.
     * </p>
     */
    PolylineMaterialProperty getDepthFailMaterial();

    DistanceDisplayConditionProperty getDistanceDisplayCondition();

    /**
     * The {@code followSurface} property defines whether or not the positions are connected as great arcs (the default) or as straight lines.
     * This property has been superseded by {@code arcType}, which should be used instead. If not specified, the default value is {@code true}.
     */
    BooleanProperty getFollowSurface();

    /**
     * Gets or sets the numeric Property specifying the angular distance between each latitude and longitude if arcType is not ArcType.NONE and clampToGround
     * is false.
     */
    DoubleProperty getGranularity();

    PolylineMaterialProperty getMaterial();

    PositionListProperty getPositions();

    ShadowModeProperty getShadows();

    @Override
    BooleanProperty getShow();

    DoubleProperty getWidth();

    IntegerProperty getZIndex();

    @Override
    TimeInterval getInterval();

    @Override
    List<PolylineGraphics> getIntervals();

    @Override
    void dispatch(Supplier<PolylineCesiumWriter> supplier);
}
