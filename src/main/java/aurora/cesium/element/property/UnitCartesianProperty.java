package aurora.cesium.element.property;

import aurora.cesium.language.writer.UnitCartesian;
import aurora.cesium.language.writer.advanced.ICesiumUnitCartesian3ValuePropertyWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface UnitCartesianProperty extends Property<ICesiumUnitCartesian3ValuePropertyWriter> {

    static UnitCartesianProperty from(UnitCartesian unitCartesian) {
        return newBuilder().withValue(unitCartesian).build();
    }

    static UnitCartesianPropertyImpl.Builder newBuilder() {
        return UnitCartesianPropertyImpl.Builder.newBuilder();
    }

    @Override
    void dispatchWithoutClose(ICesiumUnitCartesian3ValuePropertyWriter writer);
}
