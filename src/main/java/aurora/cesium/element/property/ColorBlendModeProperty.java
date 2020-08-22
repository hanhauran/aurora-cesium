package aurora.cesium.element.property;

import aurora.cesium.language.writer.ColorBlendModeCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface ColorBlendModeProperty extends Property, ReferenceProperty {

    void dispatch(ColorBlendModeCesiumWriter writer);
}
