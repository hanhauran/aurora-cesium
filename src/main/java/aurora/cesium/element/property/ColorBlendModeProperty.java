package aurora.cesium.element.property;

import cesiumlanguagewriter.CesiumColorBlendMode;
import cesiumlanguagewriter.ColorBlendModeCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface ColorBlendModeProperty extends Property<ColorBlendModeCesiumWriter>, Deletable, Intervalable<ColorBlendModeProperty>, Referenceable {

    static ColorBlendModeProperty from(CesiumColorBlendMode colorBlendMode) {
        return newBuilder().withValue(colorBlendMode).build();
    }

    static ColorBlendModeProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static ColorBlendModePropertyImpl.Builder newBuilder() {
        return ColorBlendModePropertyImpl.Builder.newBuilder();
    }

    @Override
    Boolean getDelete();

    @Override
    TimeInterval getInterval();

    @Override
    List<ColorBlendModeProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<ColorBlendModeCesiumWriter> supplier);
}
