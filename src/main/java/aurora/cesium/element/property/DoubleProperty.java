package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface DoubleProperty extends InterpolatableProperty, MultiIntervalProperty<DoubleProperty>, ReferenceProperty {

    static DefaultDoubleProperty.Builder newBuilder() {
        return DefaultDoubleProperty.Builder.newBuilder();
    }

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<DoubleProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(DoubleCesiumWriter writer);
}
