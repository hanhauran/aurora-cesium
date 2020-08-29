package aurora.cesium.element.property;

import aurora.cesium.language.writer.CheckerboardMaterialCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface CheckerboardMaterialProperty extends IntervalProperty<CheckerboardMaterialProperty> {

    static CheckerboardMaterialPropertyImpl.Builder newBuilder() {
        return CheckerboardMaterialPropertyImpl.Builder.newBuilder();
    }

    ColorProperty getEvenColor();

    ColorProperty getOddColor();

    RepeatProperty getRepeat();

    @Override
    TimeInterval getInterval();

    @Override
    List<CheckerboardMaterialProperty> getIntervals();

    void dispatch(CheckerboardMaterialCesiumWriter writer);
}
