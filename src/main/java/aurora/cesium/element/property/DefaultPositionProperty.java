package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumInterpolationAlgorithm;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultPositionProperty extends BaseIntervalProperty implements PositionProperty {

    private CesiumInterpolationAlgorithm interpolationAlgorithm;

    private Integer interpolationDegree;

    private CoordinateProperty coordinate;

    public DefaultPositionProperty() {
        super();
    }

    public DefaultPositionProperty(CesiumInterpolationAlgorithm interpolationAlgorithm, Integer interpolationDegree, CoordinateProperty coordinate) {
        this(interpolationAlgorithm, interpolationDegree, coordinate, null);
    }

    public DefaultPositionProperty(CesiumInterpolationAlgorithm interpolationAlgorithm, Integer interpolationDegree, CoordinateProperty coordinate, TimeInterval interval) {
        this.interpolationAlgorithm = interpolationAlgorithm;
        this.interpolationDegree = interpolationDegree;
        this.coordinate = coordinate;
        this.interval = interval;
    }

    @Override
    public CesiumInterpolationAlgorithm getInterpolationAlgorithm() {
        return interpolationAlgorithm;
    }

    public void setInterpolationAlgorithm(CesiumInterpolationAlgorithm interpolationAlgorithm) {
        this.interpolationAlgorithm = interpolationAlgorithm;
    }

    @Override
    public Integer getInterpolationDegree() {
        return interpolationDegree;
    }

    public void setInterpolationDegree(Integer interpolationDegree) {
        this.interpolationDegree = interpolationDegree;
    }

    @Override
    public CoordinateProperty getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(CoordinateProperty coordinate) {
        this.coordinate = coordinate;
    }
}
