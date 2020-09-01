package aurora.cesium.element.property;

import aurora.cesium.language.writer.FontCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public interface FontProperty extends Property<FontCesiumWriter>, Deletable, Intervalable<FontProperty>, Referenceable {

    static FontProperty from(String string) {
        return newBuilder().withValue(string).build();
    }

    static FontProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static FontPropertyImpl.Builder newBuilder() {
        return FontPropertyImpl.Builder.newBuilder();
    }

    @Override
    Boolean getDelete();

    @Override
    TimeInterval getInterval();

    @Override
    List<FontProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<FontCesiumWriter> supplier);
}
