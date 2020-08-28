package aurora.cesium.element.property;

import aurora.cesium.language.writer.ColorCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.awt.*;
import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface ColorProperty extends InterpolatableProperty, IntervalProperty<ColorProperty>, ReferenceProperty {

    static ColorProperty fromRgba(Color value) {
        return newRgbaBuilder().withValue(value).build();
    }

    static ColorProperty fromRgbaf(Color value) {
        return newRgbafBuilder().withValue(value).build();
    }

    static DefaultRgbaColorProperty.Builder newRgbaBuilder() {
        return DefaultRgbaColorProperty.Builder.newBuilder();
    }

    static DefaultRgbafColorProperty.Builder newRgbafBuilder() {
        return DefaultRgbafColorProperty.Builder.newBuilder();
    }

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
