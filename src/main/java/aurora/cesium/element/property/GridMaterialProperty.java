package aurora.cesium.element.property;

import aurora.cesium.language.writer.GridMaterialCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface GridMaterialProperty extends IntervalProperty<GridMaterialProperty> {

    static GridMaterialPropertyImpl.Builder newBuilder() {
        return GridMaterialPropertyImpl.Builder.newBuilder();
    }

    DoubleProperty getCellAlpha();

    ColorProperty getColor();

    LineCountProperty getLineCount();

    LineOffsetProperty getLineOffset();

    LineThicknessProperty getLineThickness();

    @Override
    TimeInterval getInterval();

    @Override
    List<GridMaterialProperty> getIntervals();

    void dispatch(GridMaterialCesiumWriter writer);
}
