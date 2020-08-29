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

    static ColorProperty fromRgba(Color color) {
        return newRgbaBuilder().withValue(color).build();
    }

    static ColorProperty fromRgbaf(Color color) {
        return newRgbafBuilder().withValue(color).build();
    }

    static ColorProperty from(Reference reference) {
        return newRgbaBuilder().withReference(reference).build();
    }

    static RgbaColorPropertyImpl.Builder newRgbaBuilder() {
        return RgbaColorPropertyImpl.Builder.newBuilder();
    }

    static RgbafColorPropertyImpl.Builder newRgbafBuilder() {
        return RgbafColorPropertyImpl.Builder.newBuilder();
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
