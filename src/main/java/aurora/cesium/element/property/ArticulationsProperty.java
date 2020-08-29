package aurora.cesium.element.property;

import aurora.cesium.language.writer.ArticulationsCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface ArticulationsProperty extends IntervalProperty<ArticulationsProperty> {

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

    void dispatch(ArticulationsCesiumWriter writer);
}
