package aurora.cesium.element;

import aurora.cesium.element.graphics.*;
import aurora.cesium.element.property.*;
import aurora.cesium.language.writer.PacketCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface Entity extends Element {

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

    CorridorGraphics getCorridor();

    CylinderGraphics getCylinder();

    EllipseGraphics getEllipse();

    EllipsoidGraphics getEllipsoid();

    LabelGraphics getLabel();

    ModelGraphics getModel();

    PathGraphics getPath();

    PlaneGraphics getPlane();

    PointGraphics getPoint();

    PolygonGraphics getPolygon();

    PolylineGraphics getPolyline();

    PolylineVolumeGraphics getPolylineVolume();

    RectangleGraphics getRectangle();

    TilesetGraphics getTileset();

    WallGraphics getWall();

    void dispatchEntity(PacketCesiumWriter writer);
}
