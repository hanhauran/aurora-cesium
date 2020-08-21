package aurora.cesium.element.property;

import aurora.cesium.language.writer.ViewFromCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface ViewFromProperty extends InterpolatableProperty, IntervalProperty, ReferenceProperty {

    CartesianProperty getCartesian();

    void dispatch(ViewFromCesiumWriter writer);
}
