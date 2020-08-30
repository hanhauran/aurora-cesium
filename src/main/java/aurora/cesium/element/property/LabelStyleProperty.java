package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumLabelStyle;
import aurora.cesium.language.writer.LabelStyleCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface LabelStyleProperty extends IntervalProperty<LabelStyleProperty>, ReferenceProperty {

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
    TimeInterval getInterval();

    @Override
    List<LabelStyleProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(LabelStyleCesiumWriter writer);
}
