package aurora.cesium.element.property;

import aurora.cesium.language.writer.BoxDimensionsCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface BoxDimensionsProperty extends MultiIntervalProperty<BoxDimensionsCesiumWriter, BoxDimensionsProperty>, ReferenceProperty {

    CartesianProperty getCartesian();

    @Override
    TimeInterval getInterval();

    @Override
    Reference getReference();

    @Override
    void dispatch(BoxDimensionsCesiumWriter writer);
}
