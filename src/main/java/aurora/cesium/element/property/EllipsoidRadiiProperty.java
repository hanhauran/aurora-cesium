package aurora.cesium.element.property;

import aurora.cesium.language.writer.EllipsoidRadiiCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface EllipsoidRadiiProperty extends InterpolatableProperty, MultiIntervalProperty<EllipsoidRadiiProperty>, ReferenceProperty {

    static DefaultEllipsoidRadiiProperty.Builder newBuilder() {
        return DefaultEllipsoidRadiiProperty.Builder.newBuilder();
    }

    CartesianProperty getCartesian();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<EllipsoidRadiiProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(EllipsoidRadiiCesiumWriter writer);
}
