package aurora.cesium.element.property;

import aurora.cesium.language.writer.AlignedAxisCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface UnitCartesianProperty extends Property {

    static DefaultUnitCartesianProperty.Builder newBuilder() {
        return DefaultUnitCartesianProperty.Builder.newBuilder();
    }

    void dispatchUnitCartesian(AlignedAxisCesiumWriter writer);
}
