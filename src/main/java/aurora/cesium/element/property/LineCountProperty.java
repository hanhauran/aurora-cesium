package aurora.cesium.element.property;

import aurora.cesium.language.writer.LineCountCesiumWriter;
import aurora.cesium.language.writer.Reference;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface LineCountProperty extends Property, ReferenceProperty {

    RectangularProperty getRectangular();

    @Override
    Reference getReference();

    void dispatch(LineCountCesiumWriter writer);
}
