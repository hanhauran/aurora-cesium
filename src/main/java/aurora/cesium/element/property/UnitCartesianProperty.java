package aurora.cesium.element.property;

import aurora.cesium.language.writer.UnitCartesian;
import aurora.cesium.language.writer.advanced.ICesiumUnitCartesian3ValuePropertyWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface UnitCartesianProperty extends Property {

    static UnitCartesianProperty from(UnitCartesian unitCartesian) {
        return newBuilder().withValue(unitCartesian).build();
    }

    static DefaultUnitCartesianProperty.Builder newBuilder() {
        return DefaultUnitCartesianProperty.Builder.newBuilder();
    }

    void dispatchWithoutClose(ICesiumUnitCartesian3ValuePropertyWriter writer);
}
