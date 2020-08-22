package aurora.cesium.element.property;

import aurora.cesium.language.writer.ShadowModeCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/22
 */
public interface ShadowModeProperty extends Property, ReferenceProperty {

    void dispatch(ShadowModeCesiumWriter writer);
}
