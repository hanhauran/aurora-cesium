package aurora.cesium.element.property;

import cesiumlanguagewriter.CesiumLabelStyle;
import cesiumlanguagewriter.LabelStyleCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface LabelStyleProperty extends Property<LabelStyleCesiumWriter>, Deletable, Intervalable<LabelStyleProperty>, Referenceable {

    static LabelStyleProperty from(CesiumLabelStyle value) {
        return newBuilder().withValue(value).build();
    }

    static LabelStyleProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static LabelStylePropertyImpl.Builder newBuilder() {
        return LabelStylePropertyImpl.Builder.newBuilder();
    }

    @Override
    Boolean getDelete();

    @Override
    TimeInterval getInterval();

    @Override
    List<LabelStyleProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<LabelStyleCesiumWriter> supplier);
}
