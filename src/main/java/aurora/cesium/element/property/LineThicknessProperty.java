package aurora.cesium.element.property;

import aurora.cesium.language.writer.LineThicknessCesiumWriter;
import aurora.cesium.language.writer.Rectangular;
import aurora.cesium.language.writer.Reference;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface LineThicknessProperty extends Property, ReferenceProperty {

    Rectangular getRectangular();

    @Override
    Reference getReference();

    void dispatch(LineThicknessCesiumWriter writer);
}
