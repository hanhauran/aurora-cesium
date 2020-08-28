package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.element.property.IntervalProperty;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.advanced.CesiumPropertyWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
interface Graphics<G extends Graphics<G, T>, T extends CesiumPropertyWriter<T>> extends IntervalProperty<G> {

    BooleanProperty getShow();

    @Override
    TimeInterval getInterval();

    @Override
    List<G> getIntervals();

    void dispatch(T writer);
}
