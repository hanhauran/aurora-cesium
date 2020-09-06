package aurora.cesium.element.property;

import cesiumlanguagewriter.ArticulationsCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface ArticulationsProperty extends Property<ArticulationsCesiumWriter>, Intervalable<ArticulationsProperty> {

    static ArticulationsProperty from(List<ArticulationProperty> articulations) {
        return newBuilder().withArticulations(articulations).build();
    }

    static ArticulationsPropertyImpl.Builder newBuilder() {
        return ArticulationsPropertyImpl.Builder.newBuilder();
    }

    List<ArticulationProperty> getArticulations();

    @Override
    TimeInterval getInterval();

    @Override
    List<ArticulationsProperty> getIntervals();

    @Override
    void dispatch(Supplier<ArticulationsCesiumWriter> supplier);
}
