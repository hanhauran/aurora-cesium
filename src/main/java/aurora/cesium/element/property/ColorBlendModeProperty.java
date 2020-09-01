package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumColorBlendMode;
import aurora.cesium.language.writer.ColorBlendModeCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

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
