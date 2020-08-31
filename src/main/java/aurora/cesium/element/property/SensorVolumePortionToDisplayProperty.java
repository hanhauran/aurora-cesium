package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumSensorVolumePortionToDisplay;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.SensorVolumePortionToDisplayCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public interface SensorVolumePortionToDisplayProperty extends Property<SensorVolumePortionToDisplayCesiumWriter>, Intervalable<SensorVolumePortionToDisplayProperty>, Referenceable {

    static SensorVolumePortionToDisplayProperty from(CesiumSensorVolumePortionToDisplay cesiumSensorVolumePortionToDisplay) {
        return newBuilder().withValue(cesiumSensorVolumePortionToDisplay).build();
    }

    static SensorVolumePortionToDisplayPropertyImpl.Builder newBuilder() {
        return SensorVolumePortionToDisplayPropertyImpl.Builder.newBuilder();
    }

    @Override
    TimeInterval getInterval();

    @Override
    List<SensorVolumePortionToDisplayProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<SensorVolumePortionToDisplayCesiumWriter> supplier);
}
