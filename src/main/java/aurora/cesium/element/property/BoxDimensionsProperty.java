package aurora.cesium.element.property;

import aurora.cesium.language.writer.BoxDimensionsCesiumWriter;
import aurora.cesium.language.writer.Cartesian;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface BoxDimensionsProperty extends IntervalProperty<BoxDimensionsProperty>, ReferenceProperty {

    static BoxDimensionsProperty from(Cartesian cartesian) {
        return newBuilder().withCartesian(CartesianProperty.from(cartesian)).build();
    }

    static DefaultBoxDimensionsProperty.Builder newBuilder() {
        return DefaultBoxDimensionsProperty.Builder.newBuilder();
    }

    CartesianProperty getCartesian();

    @Override
    TimeInterval getInterval();

    @Override
    Reference getReference();

    void dispatch(BoxDimensionsCesiumWriter writer);
}
