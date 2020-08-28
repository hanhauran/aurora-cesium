package aurora.cesium.element.property;

import aurora.cesium.language.writer.LabelStyleCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface LabelStyleProperty extends IntervalProperty<LabelStyleProperty>, ReferenceProperty {

    static DefaultLabelStyleProperty.Builder newBuilder() {
        return DefaultLabelStyleProperty.Builder.newBuilder();
    }

    @Override
    TimeInterval getInterval();

    @Override
    List<LabelStyleProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(LabelStyleCesiumWriter writer);
}
