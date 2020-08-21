package aurora.cesium.element;

import aurora.cesium.element.graphics.*;
import aurora.cesium.element.property.*;
import aurora.cesium.language.writer.PacketCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public class EntityAdapter extends ElementAdapter implements Entity {

    private Entity parent;

    private StringProperty description;

    private AvailabilityProperty availability;

    private OrientationProperty orientation;

    private PositionProperty position;

    private ViewFromProperty viewFrom;

    private BillboardGraphics billboard;

    private BoxGraphics box;

    private CorridorGraphics corridor;

    private CylinderGraphics cylinder;

    private EllipseGraphics ellipse;

    private EllipsoidGraphics ellipsoid;

    private LabelGraphics label;

    private ModelGraphics model;

    private PathGraphics path;

    private PlaneGraphics plane;

    private PointGraphics point;

    private PolygonGraphics polygon;

    private PolylineGraphics polyline;

    private PolylineVolumeGraphics polylineVolume;

    private RectangleGraphics rectangle;

    private TilesetGraphics tileset;

    private WallGraphics wall;

    @Override
    public void dispatchEntity(PacketCesiumWriter writer) {

    }

    @Override
    public Entity getParent() {
        return parent;
    }

    public void setParent(Entity parent) {
        this.parent = parent;
    }

    @Override
    public StringProperty getDescription() {
        return description;
    }

    public void setDescription(StringProperty description) {
        this.description = description;
    }

    @Override
    public AvailabilityProperty getAvailability() {
        return availability;
    }

    public void setAvailability(AvailabilityProperty availability) {
        this.availability = availability;
    }

    @Override
    public OrientationProperty getOrientation() {
        return orientation;
    }

    public void setOrientation(OrientationProperty orientation) {
        this.orientation = orientation;
    }

    @Override
    public PositionProperty getPosition() {
        return position;
    }

    public void setPosition(PositionProperty position) {
        this.position = position;
    }

    @Override
    public ViewFromProperty getViewFrom() {
        return viewFrom;
    }

    public void setViewFrom(ViewFromProperty viewFrom) {
        this.viewFrom = viewFrom;
    }

    @Override
    public BillboardGraphics getBillboard() {
        return billboard;
    }

    public void setBillboard(BillboardGraphics billboard) {
        this.billboard = billboard;
    }

    @Override
    public BoxGraphics getBox() {
        return box;
    }

    public void setBox(BoxGraphics box) {
        this.box = box;
    }

    @Override
    public CorridorGraphics getCorridor() {
        return corridor;
    }

    public void setCorridor(CorridorGraphics corridor) {
        this.corridor = corridor;
    }

    @Override
    public CylinderGraphics getCylinder() {
        return cylinder;
    }

    public void setCylinder(CylinderGraphics cylinder) {
        this.cylinder = cylinder;
    }

    @Override
    public EllipseGraphics getEllipse() {
        return ellipse;
    }

    public void setEllipse(EllipseGraphics ellipse) {
        this.ellipse = ellipse;
    }

    @Override
    public EllipsoidGraphics getEllipsoid() {
        return ellipsoid;
    }

    public void setEllipsoid(EllipsoidGraphics ellipsoid) {
        this.ellipsoid = ellipsoid;
    }

    @Override
    public LabelGraphics getLabel() {
        return label;
    }

    public void setLabel(LabelGraphics label) {
        this.label = label;
    }

    @Override
    public ModelGraphics getModel() {
        return model;
    }

    public void setModel(ModelGraphics model) {
        this.model = model;
    }

    @Override
    public PathGraphics getPath() {
        return path;
    }

    public void setPath(PathGraphics path) {
        this.path = path;
    }

    @Override
    public PlaneGraphics getPlane() {
        return plane;
    }

    public void setPlane(PlaneGraphics plane) {
        this.plane = plane;
    }

    @Override
    public PointGraphics getPoint() {
        return point;
    }

    public void setPoint(PointGraphics point) {
        this.point = point;
    }

    @Override
    public PolygonGraphics getPolygon() {
        return polygon;
    }

    public void setPolygon(PolygonGraphics polygon) {
        this.polygon = polygon;
    }

    @Override
    public PolylineGraphics getPolyline() {
        return polyline;
    }

    public void setPolyline(PolylineGraphics polyline) {
        this.polyline = polyline;
    }

    @Override
    public PolylineVolumeGraphics getPolylineVolume() {
        return polylineVolume;
    }

    public void setPolylineVolume(PolylineVolumeGraphics polylineVolume) {
        this.polylineVolume = polylineVolume;
    }

    @Override
    public RectangleGraphics getRectangle() {
        return rectangle;
    }

    public void setRectangle(RectangleGraphics rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public TilesetGraphics getTileset() {
        return tileset;
    }

    public void setTileset(TilesetGraphics tileset) {
        this.tileset = tileset;
    }

    @Override
    public WallGraphics getWall() {
        return wall;
    }

    public void setWall(WallGraphics wall) {
        this.wall = wall;
    }
}
