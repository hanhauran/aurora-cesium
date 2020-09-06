package aurora.cesium.element.property;

import cesiumlanguagewriter.CesiumSensorVolumePortionToDisplay;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.SensorVolumePortionToDisplayCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public interface SensorVolumePortionToDisplayProperty extends Property<SensorVolumePortionToDisplayCesiumWriter>, Deletable, Intervalable<SensorVolumePortionToDisplayProperty>, Referenceable {

    static SensorVolumePortionToDisplayProperty from(CesiumSensorVolumePortionToDisplay cesiumSensorVolumePortionToDisplay) {
        return newBuilder().withValue(cesiumSensorVolumePortionToDisplay).build();
    }

    static SensorVolumePortionToDisplayPropertyImpl.Builder newBuilder() {
        return SensorVolumePortionToDisplayPropertyImpl.Builder.newBuilder();
    }

    @Override
    Boolean getDelete();

    @Override
    TimeInterval getInterval();

    @Override
    List<SensorVolumePortionToDisplayProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<SensorVolumePortionToDisplayCesiumWriter> supplier);
}
