package aurora.cesium.element.property;

import aurora.cesium.language.writer.HeightReferenceCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface HeightReferenceProperty extends IntervalProperty, ReferenceProperty {

    void dispatchHeightReference(HeightReferenceCesiumWriter writer);
}
