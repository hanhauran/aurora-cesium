package aurora.cesium.element;

import aurora.cesium.element.graphics.*;
import aurora.cesium.element.property.*;
import cesiumlanguagewriter.PacketCesiumWriter;

import java.util.Optional;
import java.util.function.Supplier;

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

    private Boolean delete;

    private BillboardGraphics billboard;

    private BoxGraphics box;

    private ConicSensorGraphics conicSensor;

    private CorridorGraphics corridor;

    private CustomPatternSensorGraphics customPatternSensor;

    private CylinderGraphics cylinder;

    private EllipseGraphics ellipse;

    private EllipsoidGraphics ellipsoid;

    private FanGraphics fan;

    private LabelGraphics label;

    private ModelGraphics model;

    private PathGraphics path;

    private PointGraphics point;

    private PolygonGraphics polygon;

    private PolylineGraphics polyline;

    private RectangleGraphics rectangle;

    private RectangularSensorGraphics rectangularSensor;

    private TilesetGraphics tileset;

    private VectorGraphics vector;

    private WallGraphics wall;

    @Override
    public void dispatch(Supplier<PacketCesiumWriter> supplier) {
        try (PacketCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getId()).ifPresent(writer::writeId);
            Optional.ofNullable(getName()).ifPresent(writer::writeName);
            Optional.ofNullable(getParent()).flatMap(entity -> Optional.ofNullable(entity.getId())).ifPresent(writer::writeParent);
            Optional.ofNullable(getDescription()).ifPresent(stringProperty -> stringProperty.dispatch(writer::openDescriptionProperty));
            Optional.ofNullable(getAvailability()).ifPresent(availabilityProperty -> availabilityProperty.dispatchWithoutClose(writer));
            Optional.ofNullable(getOrientation()).ifPresent(orientationProperty -> orientationProperty.dispatch(writer::openOrientationProperty));
            Optional.ofNullable(getPosition()).ifPresent(positionProperty -> positionProperty.dispatch(writer::openPositionProperty));
            Optional.ofNullable(getViewFrom()).ifPresent(viewFromProperty -> viewFromProperty.dispatch(writer::openViewFromProperty));
            Optional.ofNullable(getDelete()).ifPresent(writer::writeDelete);

            Optional.ofNullable(getBillboard()).ifPresent(billboardGraphics -> billboardGraphics.dispatch(writer::openBillboardProperty));
            Optional.ofNullable(getBox()).ifPresent(boxGraphics -> boxGraphics.dispatch(writer::openBoxProperty));
            Optional.ofNullable(getConicSensor()).ifPresent(conicSensorGraphics -> conicSensorGraphics.dispatch(writer::openConicSensorProperty));
            Optional.ofNullable(getCorridor()).ifPresent(corridorGraphics -> corridorGraphics.dispatch(writer::openCorridorProperty));
            Optional.ofNullable(getCustomPatternSensor()).ifPresent(customPatternSensorGraphics -> customPatternSensorGraphics.dispatch(writer::openCustomPatternSensorProperty));
            Optional.ofNullable(getCylinder()).ifPresent(cylinderGraphics -> cylinderGraphics.dispatch(writer::openCylinderProperty));
            Optional.ofNullable(getEllipse()).ifPresent(ellipseGraphics -> ellipseGraphics.dispatch(writer::openEllipseProperty));
            Optional.ofNullable(getEllipsoid()).ifPresent(ellipsoidGraphics -> ellipsoidGraphics.dispatch(writer::openEllipsoidProperty));
            Optional.ofNullable(getFan()).ifPresent(fanGraphics -> fanGraphics.dispatch(writer::openFanProperty));
            Optional.ofNullable(getLabel()).ifPresent(labelGraphics -> labelGraphics.dispatch(writer::openLabelProperty));
            Optional.ofNullable(getModel()).ifPresent(modelGraphics -> modelGraphics.dispatch(writer::openModelProperty));
            Optional.ofNullable(getPath()).ifPresent(pathGraphics -> pathGraphics.dispatch(writer::openPathProperty));
            Optional.ofNullable(getPoint()).ifPresent(pointGraphics -> pointGraphics.dispatch(writer::openPointProperty));
            Optional.ofNullable(getPolygon()).ifPresent(polygonGraphics -> polygonGraphics.dispatch(writer::openPolygonProperty));
            Optional.ofNullable(getPolyline()).ifPresent(polylineGraphics -> polylineGraphics.dispatch(writer::openPolylineProperty));
            Optional.ofNullable(getRectangle()).ifPresent(rectangleGraphics -> rectangleGraphics.dispatch(writer::openRectangleProperty));
            Optional.ofNullable(getRectangularSensor()).ifPresent(rectangularSensorGraphics -> rectangularSensorGraphics.dispatch(writer::openRectangularSensorProperty));
            Optional.ofNullable(getTileset()).ifPresent(tilesetGraphics -> tilesetGraphics.dispatch(writer::openTilesetProperty));
            Optional.ofNullable(getVector()).ifPresent(vectorGraphics -> vectorGraphics.dispatch(writer::openVectorProperty));
            Optional.ofNullable(getWall()).ifPresent(wallGraphics -> wallGraphics.dispatch(writer::openWallProperty));
        }
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
    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
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
    public ConicSensorGraphics getConicSensor() {
        return conicSensor;
    }

    public void setConicSensor(ConicSensorGraphics conicSensor) {
        this.conicSensor = conicSensor;
    }

    @Override
    public CorridorGraphics getCorridor() {
        return corridor;
    }

    public void setCorridor(CorridorGraphics corridor) {
        this.corridor = corridor;
    }

    @Override
    public CustomPatternSensorGraphics getCustomPatternSensor() {
        return customPatternSensor;
    }

    public void setCustomPatternSensor(CustomPatternSensorGraphics customPatternSensor) {
        this.customPatternSensor = customPatternSensor;
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
    public FanGraphics getFan() {
        return fan;
    }

    public void setFan(FanGraphics fan) {
        this.fan = fan;
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
    public RectangleGraphics getRectangle() {
        return rectangle;
    }

    public void setRectangle(RectangleGraphics rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public RectangularSensorGraphics getRectangularSensor() {
        return rectangularSensor;
    }

    public void setRectangularSensor(RectangularSensorGraphics rectangularSensor) {
        this.rectangularSensor = rectangularSensor;
    }

    @Override
    public TilesetGraphics getTileset() {
        return tileset;
    }

    public void setTileset(TilesetGraphics tileset) {
        this.tileset = tileset;
    }

    @Override
    public VectorGraphics getVector() {
        return vector;
    }

    public void setVector(VectorGraphics vector) {
        this.vector = vector;
    }

    @Override
    public WallGraphics getWall() {
        return wall;
    }

    public void setWall(WallGraphics wall) {
        this.wall = wall;
    }

    public static final class Builder {
        private AvailabilityProperty availability;
        private Boolean delete;
        private StringProperty description;
        private String id;
        private String name;
        private OrientationProperty orientation;
        private Entity parent;
        private PositionProperty position;
        private ViewFromProperty viewFrom;

        private BillboardGraphics billboard;
        private BoxGraphics box;
        private ConicSensorGraphics conicSensor;
        private CorridorGraphics corridor;
        private CustomPatternSensorGraphics customPatternSensor;
        private CylinderGraphics cylinder;
        private EllipseGraphics ellipse;
        private EllipsoidGraphics ellipsoid;
        private FanGraphics fan;
        private LabelGraphics label;
        private ModelGraphics model;
        private PathGraphics path;
        private PointGraphics point;
        private PolygonGraphics polygon;
        private PolylineGraphics polyline;
        private RectangleGraphics rectangle;
        private RectangularSensorGraphics rectangularSensor;
        private TilesetGraphics tileset;
        private VectorGraphics vector;
        private WallGraphics wall;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withParent(Entity parent) {
            this.parent = parent;
            return this;
        }

        public Builder withDescription(StringProperty description) {
            this.description = description;
            return this;
        }

        public Builder withAvailability(AvailabilityProperty availability) {
            this.availability = availability;
            return this;
        }

        public Builder withOrientation(OrientationProperty orientation) {
            this.orientation = orientation;
            return this;
        }

        public Builder withPosition(PositionProperty position) {
            this.position = position;
            return this;
        }

        public Builder withViewFrom(ViewFromProperty viewFrom) {
            this.viewFrom = viewFrom;
            return this;
        }

        public Builder withDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }

        public Builder withBillboard(BillboardGraphics billboard) {
            this.billboard = billboard;
            return this;
        }

        public Builder withBox(BoxGraphics box) {
            this.box = box;
            return this;
        }

        public Builder withConicSensor(ConicSensorGraphics conicSensor) {
            this.conicSensor = conicSensor;
            return this;
        }

        public Builder withCorridor(CorridorGraphics corridor) {
            this.corridor = corridor;
            return this;
        }

        public Builder withCustomPatternSensor(CustomPatternSensorGraphics customPatternSensor) {
            this.customPatternSensor = customPatternSensor;
            return this;
        }

        public Builder withCylinder(CylinderGraphics cylinder) {
            this.cylinder = cylinder;
            return this;
        }

        public Builder withEllipse(EllipseGraphics ellipse) {
            this.ellipse = ellipse;
            return this;
        }

        public Builder withEllipsoid(EllipsoidGraphics ellipsoid) {
            this.ellipsoid = ellipsoid;
            return this;
        }

        public Builder withFan(FanGraphics fan) {
            this.fan = fan;
            return this;
        }

        public Builder withLabel(LabelGraphics label) {
            this.label = label;
            return this;
        }

        public Builder withModel(ModelGraphics model) {
            this.model = model;
            return this;
        }

        public Builder withPath(PathGraphics path) {
            this.path = path;
            return this;
        }

        public Builder withPoint(PointGraphics point) {
            this.point = point;
            return this;
        }

        public Builder withPolygon(PolygonGraphics polygon) {
            this.polygon = polygon;
            return this;
        }

        public Builder withPolyline(PolylineGraphics polyline) {
            this.polyline = polyline;
            return this;
        }

        public Builder withRectangle(RectangleGraphics rectangle) {
            this.rectangle = rectangle;
            return this;
        }

        public Builder withRectangularSensor(RectangularSensorGraphics rectangularSensor) {
            this.rectangularSensor = rectangularSensor;
            return this;
        }

        public Builder withTileset(TilesetGraphics tileset) {
            this.tileset = tileset;
            return this;
        }

        public Builder withVector(VectorGraphics vector) {
            this.vector = vector;
            return this;
        }

        public Builder withWall(WallGraphics wall) {
            this.wall = wall;
            return this;
        }

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public EntityAdapter build() {
            EntityAdapter entityAdapter = new EntityAdapter();
            entityAdapter.setAvailability(availability);
            entityAdapter.setDelete(delete);
            entityAdapter.setDescription(description);
            entityAdapter.setId(id);
            entityAdapter.setName(name);
            entityAdapter.setOrientation(orientation);
            entityAdapter.setParent(parent);
            entityAdapter.setPosition(position);
            entityAdapter.setViewFrom(viewFrom);
            entityAdapter.setBillboard(billboard);
            entityAdapter.setBox(box);
            entityAdapter.setConicSensor(conicSensor);
            entityAdapter.setCorridor(corridor);
            entityAdapter.setCustomPatternSensor(customPatternSensor);
            entityAdapter.setCylinder(cylinder);
            entityAdapter.setEllipse(ellipse);
            entityAdapter.setEllipsoid(ellipsoid);
            entityAdapter.setFan(fan);
            entityAdapter.setLabel(label);
            entityAdapter.setModel(model);
            entityAdapter.setPath(path);
            entityAdapter.setPoint(point);
            entityAdapter.setPolygon(polygon);
            entityAdapter.setPolyline(polyline);
            entityAdapter.setRectangle(rectangle);
            entityAdapter.setRectangularSensor(rectangularSensor);
            entityAdapter.setTileset(tileset);
            entityAdapter.setVector(vector);
            entityAdapter.setWall(wall);
            return entityAdapter;
        }
    }
}
