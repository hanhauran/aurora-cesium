package aurora.cesium.element.property;

import aurora.cesium.language.writer.ArticulationsCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface ArticulationsProperty extends IntervalProperty<ArticulationsProperty> {

    static DefaultArticulationsProperty.Builder newBuilder() {
        return DefaultArticulationsProperty.Builder.newBuilder();
    }

    List<ArticulationProperty> getArticulations();

    @Override
    TimeInterval getInterval();

    @Override
    List<ArticulationsProperty> getIntervals();

    void dispatch(ArticulationsCesiumWriter writer);
}
