package aurora.cesium.element.property;

import cesiumlanguagewriter.ColorCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.awt.*;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface ColorProperty extends Property<ColorCesiumWriter>, Deletable, Interpolatable, Intervalable<ColorProperty>, Referenceable {

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
    Boolean getDelete();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<ColorProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<ColorCesiumWriter> supplier);
}
