package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.element.property.Intervalable;
import cesiumlanguagewriter.TimeInterval;
import cesiumlanguagewriter.advanced.CesiumPropertyWriter;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
interface Graphics<G extends Graphics<G, T>, T extends CesiumPropertyWriter<T>> extends Intervalable<G> {

    BooleanProperty getShow();

    @Override
    TimeInterval getInterval();

    @Override
    List<G> getIntervals();

    void dispatch(Supplier<T> supplier);
}
