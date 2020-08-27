package aurora.cesium.element.property;

import aurora.cesium.language.writer.BooleanCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface BooleanProperty extends MultiIntervalProperty<BooleanCesiumWriter, BooleanProperty>, ReferenceProperty {

    @Override
    TimeInterval getInterval();

    @Override
    List<BooleanProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(BooleanCesiumWriter writer);
}
