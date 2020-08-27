package aurora.cesium.element.property;

import aurora.cesium.language.writer.ColorCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface ColorProperty extends InterpolatableProperty, MultiIntervalProperty<ColorProperty>, ReferenceProperty {

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<ColorProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(ColorCesiumWriter writer);
}
