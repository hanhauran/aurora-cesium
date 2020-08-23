package aurora.cesium.element.property;

import aurora.cesium.language.writer.LineOffsetCesiumWriter;
import aurora.cesium.language.writer.Reference;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface LineOffsetProperty extends Property, ReferenceProperty {

    RectangularProperty getRectangular();

    @Override
    Reference getReference();

    void dispatch(LineOffsetCesiumWriter writer);
}
