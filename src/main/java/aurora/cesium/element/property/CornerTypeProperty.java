package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumCornerType;
import aurora.cesium.language.writer.CornerTypeCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public interface CornerTypeProperty extends Property<CornerTypeCesiumWriter>, Deletable, Intervalable<CornerTypeProperty>, Referenceable {

    static CornerTypeProperty from(CesiumCornerType cornerType) {
        return newBuilder().withValue(cornerType).build();
    }

    static CornerTypePropertyImpl.Builder newBuilder() {
        return CornerTypePropertyImpl.Builder.newBuilder();
    }

    @Override
    Boolean getDelete();

    @Override
    TimeInterval getInterval();

    @Override
    List<CornerTypeProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<CornerTypeCesiumWriter> supplier);
}
