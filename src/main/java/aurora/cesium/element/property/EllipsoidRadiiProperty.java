package aurora.cesium.element.property;

import aurora.cesium.language.writer.Cartesian;
import aurora.cesium.language.writer.EllipsoidRadiiCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface EllipsoidRadiiProperty extends InterpolatableProperty, IntervalProperty<EllipsoidRadiiProperty>, ReferenceProperty {

    static EllipsoidRadiiProperty from(Cartesian cartesian) {
        return newBuilder().withCartesian(CartesianProperty.from(cartesian)).build();
    }

    static EllipsoidRadiiProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static EllipsoidRadiiPropertyImpl.Builder newBuilder() {
        return EllipsoidRadiiPropertyImpl.Builder.newBuilder();
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
