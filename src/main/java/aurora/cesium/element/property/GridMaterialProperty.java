package aurora.cesium.element.property;

import cesiumlanguagewriter.GridMaterialCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface GridMaterialProperty extends Property<GridMaterialCesiumWriter>, Intervalable<GridMaterialProperty> {

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

    @Override
    void dispatch(Supplier<GridMaterialCesiumWriter> supplier);
}
