package aurora.cesium.element.property;

import aurora.cesium.language.writer.FontCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.StringCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface StringProperty extends IntervalProperty<StringProperty>, ReferenceProperty {

    @Override
    TimeInterval getInterval();

    @Override
    List<StringProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(StringCesiumWriter writer);

    void dispatch(FontCesiumWriter writer);
}
