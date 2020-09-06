package aurora.cesium.element;

import aurora.cesium.element.graphics.*;
import aurora.cesium.element.property.*;
import cesiumlanguagewriter.PacketCesiumWriter;

import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface Entity extends Element, Deletable {

    static EntityAdapter.Builder newBuilder() {
        return EntityAdapter.Builder.newBuilder();
    }

    @Override
    String getId();

    @Override
    String getName();

    Entity getParent();

    StringProperty getDescription();

    AvailabilityProperty getAvailability();

    OrientationProperty getOrientation();

    PositionProperty getPosition();

    ViewFromProperty getViewFrom();

    BillboardGraphics getBillboard();

    BoxGraphics getBox();

    ConicSensorGraphics getConicSensor();

    CorridorGraphics getCorridor();

    CustomPatternSensorGraphics getCustomPatternSensor();

    CylinderGraphics getCylinder();

    EllipseGraphics getEllipse();

    EllipsoidGraphics getEllipsoid();

    FanGraphics getFan();

    LabelGraphics getLabel();

    ModelGraphics getModel();

    PathGraphics getPath();

    PointGraphics getPoint();

    PolygonGraphics getPolygon();

    PolylineGraphics getPolyline();

    RectangleGraphics getRectangle();

    RectangularSensorGraphics getRectangularSensor();

    TilesetGraphics getTileset();

    VectorGraphics getVector();

    WallGraphics getWall();

    @Override
    Boolean getDelete();

    void dispatch(Supplier<PacketCesiumWriter> writer);
}
