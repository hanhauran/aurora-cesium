package aurora.cesium.element.property;

import aurora.cesium.language.writer.SolidColorMaterialCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface SolidColorMaterialProperty extends IntervalProperty<SolidColorMaterialProperty> {

    static SolidColorMaterialProperty from(ColorProperty colorProperty) {
        return newBuilder().withColor(colorProperty).build();
    }

    static SolidColorMaterialPropertyImpl.Builder newBuilder() {
        return SolidColorMaterialPropertyImpl.Builder.newBuilder();
    }

    ColorProperty getColor();

    @Override
    TimeInterval getInterval();

    @Override
    List<SolidColorMaterialProperty> getIntervals();

    void dispatch(SolidColorMaterialCesiumWriter writer);
}
