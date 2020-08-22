package aurora.cesium.element.property;

import aurora.cesium.language.writer.FontCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.StringCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface StringProperty extends IntervalProperty, ReferenceProperty {

    @Override
    TimeInterval getInterval();

    @Override
    Reference getReference();

    void dispatch(StringCesiumWriter writer);

    /**
     * actually this is a StringCesiumWriter, so close it.
     * @param writer writer
     */
    void dispatch(FontCesiumWriter writer);
}
