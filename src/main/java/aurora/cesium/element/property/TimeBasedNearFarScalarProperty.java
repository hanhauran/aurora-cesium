package aurora.cesium.element.property;

import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.NearFarScalar;
import aurora.cesium.language.writer.NearFarScalarCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedNearFarScalarProperty extends BaseSingleInterpolatableTimeBasedIntervalProperty<NearFarScalar> implements NearFarScalarProperty, InterpolatableProperty, IntervalProperty, Property {

    public TimeBasedNearFarScalarProperty() {
        super();
    }

    public TimeBasedNearFarScalarProperty(List<JulianDate> dates, List<NearFarScalar> instance) {
        super(dates, instance);
    }

    public TimeBasedNearFarScalarProperty(List<JulianDate> dates, List<NearFarScalar> instance, TimeInterval interval) {
        super(dates, instance, interval);
    }

    public TimeBasedNearFarScalarProperty(List<JulianDate> dates, List<NearFarScalar> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public TimeBasedNearFarScalarProperty(List<JulianDate> dates, List<NearFarScalar> instance, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instance, startIndex, length, interval);
    }

    @Override
    public void dispatchNearFarScalar(NearFarScalarCesiumWriter writer) {
        try (writer) {
            dispatchInterval(writer);
            dispatchConsumer(writer::writeNearFarScalar, writer::writeNearFarScalar);
            dispatchInterpolations(writer);
        }
    }

    public List<NearFarScalar> getNearFarScalars() {
        return instance;
    }

    public void setNearFarScalars(List<NearFarScalar> nearFarScalars) {
        this.instance = nearFarScalars;
    }
}
