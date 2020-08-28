package aurora.cesium.element.property;

import aurora.cesium.language.writer.CheckerboardMaterialCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface CheckerboardMaterialProperty extends IntervalProperty<CheckerboardMaterialProperty> {

    static DefaultCheckerboardMaterialProperty.Builder newBuilder() {
        return DefaultCheckerboardMaterialProperty.Builder.newBuilder();
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
