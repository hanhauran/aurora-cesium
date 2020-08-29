package aurora.cesium.element.property;

import aurora.cesium.language.writer.MaterialCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface MaterialProperty extends IntervalProperty<MaterialProperty> {

    static MaterialPropertyImpl.Builder newBuilder() {
        return MaterialPropertyImpl.Builder.newBuilder();
    }

    CheckerboardMaterialProperty getCheckerboardMaterial();

    GridMaterialProperty getGridMaterial();

    ImageMaterialProperty getImageMaterial();

    SolidColorMaterialProperty getSolidColorMaterial();

    StripeMaterialProperty getStripeMaterial();

    @Override
    TimeInterval getInterval();

    @Override
    List<MaterialProperty> getIntervals();

    void dispatch(MaterialCesiumWriter writer);
}
