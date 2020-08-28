package aurora.cesium.element.property;

import aurora.cesium.language.writer.PolylineDashMaterialCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface PolylineDashMaterialProperty extends IntervalProperty<PolylineDashMaterialProperty> {

    static DefaultPolylineDashMaterialProperty.Builder newBuilder() {
        return DefaultPolylineDashMaterialProperty.Builder.newBuilder();
    }

    ColorProperty getColor();

    ColorProperty getGapColor();

    DoubleProperty getDashLength();

    IntegerProperty getDashPattern();

    @Override
    TimeInterval getInterval();

    @Override
    List<PolylineDashMaterialProperty> getIntervals();

    void dispatch(PolylineDashMaterialCesiumWriter writer);
}
