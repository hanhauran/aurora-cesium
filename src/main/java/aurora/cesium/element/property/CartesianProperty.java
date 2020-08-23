package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface CartesianProperty extends Property {

    void dispatchCartesian(BoxDimensionsCesiumWriter writer);

    void dispatchCartesian(EllipsoidRadiiCesiumWriter writer);

    void dispatchCartesian(EyeOffsetCesiumWriter writer);

    void dispatchCartesian(PositionCesiumWriter writer);

    void dispatchCartesian(ViewFromCesiumWriter writer);
}
