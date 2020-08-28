package aurora.cesium.element.property;

import aurora.cesium.language.writer.GridMaterialCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface GridMaterialProperty extends IntervalProperty<GridMaterialProperty> {

    DoubleProperty getCellAlpha();

    ColorProperty getColor();

    LineCountProperty getLineCount();

    LineOffsetProperty getLineOffset();

    LineThicknessProperty getLineThickness();

    void dispatch(GridMaterialCesiumWriter writer);
}
