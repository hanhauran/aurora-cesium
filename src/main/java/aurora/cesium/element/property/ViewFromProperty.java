package aurora.cesium.element.property;

import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.ViewFromCesiumWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface ViewFromProperty extends InterpolatableProperty, IntervalProperty<ViewFromProperty>, ReferenceProperty {

    static DefaultViewFromProperty.Builder newBuilder() {
        return DefaultViewFromProperty.Builder.newBuilder();
    }

    CartesianProperty getCartesian();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<ViewFromProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(ViewFromCesiumWriter writer);
}
