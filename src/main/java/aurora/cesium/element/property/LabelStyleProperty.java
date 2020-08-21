package aurora.cesium.element.property;

import aurora.cesium.language.writer.LabelStyleCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface LabelStyleProperty extends IntervalProperty, ReferenceProperty {

    @Override
    TimeInterval getInterval();

    @Override
    Reference getReference();

    void dispatch(LabelStyleCesiumWriter writer);
}
