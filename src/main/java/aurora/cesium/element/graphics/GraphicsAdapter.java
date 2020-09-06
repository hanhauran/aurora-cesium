package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import cesiumlanguagewriter.TimeInterval;
import cesiumlanguagewriter.advanced.CesiumPropertyWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
abstract class GraphicsAdapter<G extends Graphics<G, T>, T extends CesiumPropertyWriter<T>> implements Graphics<G, T> {

    protected BooleanProperty show;

    protected TimeInterval interval;

    protected List<G> intervals;

    @Override
    public BooleanProperty getShow() {
        return show;
    }

    public void setShow(BooleanProperty show) {
        this.show = show;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<G> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<G> intervals) {
        this.intervals = intervals;
    }
}
