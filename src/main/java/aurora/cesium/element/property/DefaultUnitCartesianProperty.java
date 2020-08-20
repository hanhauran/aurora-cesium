package aurora.cesium.element.property;

import aurora.cesium.language.writer.AlignedAxisCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.UnitCartesian;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class DefaultUnitCartesianProperty extends BaseSingleIntervalProperty<UnitCartesian> implements UnitCartesianProperty {

    public DefaultUnitCartesianProperty() {
        super();
    }

    public DefaultUnitCartesianProperty(UnitCartesian instance) {
        super(instance);
    }

    public DefaultUnitCartesianProperty(UnitCartesian instance, TimeInterval interval) {
        super(instance, interval);
    }

    @Override
    public void dispatchAlignedAxis(AlignedAxisCesiumWriter writer, boolean close) {
        try {
            dispatchConsumer(writer::writeUnitCartesian);
        } finally {
            if (close) {
                writer.close();
            }
        }
    }

    public UnitCartesian getUnitCartesian() {
        return instance;
    }

    public void setUnitCartesian(UnitCartesian unitCartesian) {
        this.instance = unitCartesian;
    }
}
