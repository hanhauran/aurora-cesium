package aurora.cesium.element.property;

import aurora.cesium.language.writer.EyeOffsetCesiumWriter;
import aurora.cesium.language.writer.PositionCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface CartesianProperty extends Property {

    void dispatchEyeOffset(EyeOffsetCesiumWriter writer);

    void dispatchPosition(PositionCesiumWriter writer);
}
