package aurora.cesium.element.property;

import aurora.cesium.language.writer.AlignedAxisCesiumWriter;
import aurora.cesium.language.writer.UnitCartesian;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultUnitCartesianProperty extends SinglePropertyAdapter<UnitCartesian> implements UnitCartesianProperty {

    public DefaultUnitCartesianProperty() {
        super();
    }

    public DefaultUnitCartesianProperty(UnitCartesian instance) {
        super(instance);
    }

    @Override
    public void dispatchUnitCartesian(AlignedAxisCesiumWriter writer) {
        dispatchConsumer(writer::writeUnitCartesian);
    }

    public UnitCartesian getUnitCartesian() {
        return instance;
    }

    public void setUnitCartesian(UnitCartesian unitCartesian) {
        this.instance = unitCartesian;
    }
}
