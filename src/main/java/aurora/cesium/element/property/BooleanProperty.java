package aurora.cesium.element.property;

import aurora.cesium.language.writer.BooleanCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface BooleanProperty extends IntervalProperty {

    void dispatchBoolean(BooleanCesiumWriter writer);
}
